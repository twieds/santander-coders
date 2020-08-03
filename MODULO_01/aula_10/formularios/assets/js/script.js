function envio() {
    var id = document.getElementById('id').value;
    var name = document.getElementById('name').value;
    var location = document.getElementById('location').value;
    alert(id + " " + name + " " + location);
    $.ajax({
        method: "POST",
        url: "http://localhost:3000/users",
        data: {
            "id": id,
            "name": name,
            "location": location
        }
    })
}

function buscar() {
    $.get("http://localhost:3000/users/2", function (data) {
        document.getElementById('id').value = data.id;
        document.getElementById('name').value = data.name;
        document.getElementById('location').value = data.location;
    });
}
