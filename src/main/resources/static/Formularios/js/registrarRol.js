
async function registrarRol() {

    let datos = {};

    datos.nombre = document.getElementById('txtNombre').value;
    datos.funcion = document.getElementById('txtFuncion').value;

    console.log(datos);
    
    const request = await fetch('http://localhost:8080/roles/registrar', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });


}