cargarUsuarios();

async function cargarUsuarios() {
    const request = await fetch('http://localhost:8080/usuarios/listar', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });
    const usuarios = await request.json();

    const requestRoles = await fetch('http://localhost:8080/roles/listar', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });
    const roles = await requestRoles.json();
 
    let funcion = '';
    let listadoHtml = "";
        for (let usuario of usuarios) {
        let botonEliminar = '<a href="#" onclick="eliminarUsuario('+usuario.id+')" class="more">Eliminar</a>';

        roles.forEach(element => {
            if (usuario.rol == element.nombre){
                funcion = element.funcion;
            }
        });

        let usuarioHtml = ' <tr>' +
            '<td>' + usuario.id + '</td>' +
            '<td>' + usuario.nombre + '</td>' +
            '<td>' + usuario.nickName + '</td>' +
            '<td>' +
            usuario.rol +
            '<small class="d-block">'+funcion+'</small>' +
            '</td>' +
            '<td><a href="#" class="more">Editar</a> <br> '+botonEliminar+'</td>' +
            '</tr>';
        listadoHtml += usuarioHtml;
    }


    document.querySelector('#usuarios tbody').outerHTML = listadoHtml;
}

async function eliminarUsuario (id){
    const request = await fetch('http://localhost:8080/usuarios/eliminar/'+id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });

    location.reload();
}