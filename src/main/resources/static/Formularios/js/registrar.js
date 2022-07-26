listarRoles();
async function listarRoles (){
    const requestRoles = await fetch('http://localhost:8080/roles/listar', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });
    const roles = await requestRoles.json();
    let listOpciones = '';
    
    for(let rol of roles){
        let opcionesHtml = '<option>'+rol.nombre+'</option>';
        listOpciones += opcionesHtml;
    }
    
    console.log(listOpciones);
    document.querySelector('#slcRol option').outerHTML = listOpciones;

}



async function registrarUsuraio() {
    
    let datos = {};

    datos.id = document.getElementById('txtId').value;
    datos.nombre = document.getElementById('txtNombre').value;
    datos.nickName = document.getElementById('txtNickname').value;
    datos.rol = document.getElementById('slcRol').value;

    console.log(datos);

    const request = await fetch('http://localhost:8080/usuarios/registrar', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });

}