function fieldValidation() {
    allFieldsAreFilled();
    validatePasswords();
    getFullName();
}

function allFieldsAreFilled() {
    fields = [
        ['name', 'nome'],
        ['lastname', 'sobrenome'],
        ['email', 'email'],
        ['password', 'senha'],
        ['password-confirmation', 'confirmação da senha']
    ];

    for (let i = 0; i < fields.length; i++) {
        if (document.getElementById(fields[i][0]).value == '' || document.getElementById(fields[i][0]).value == null) {
            alert('O campo ' + fields[i][1]  + ' é obrigatório.');
            return false;
        }
    }
}

function validatePasswords() {
    password = document.getElementById('password').value;
    cpassword = document.getElementById('password-confirmation').value;
    
    if (password != cpassword) {
        alert('As senhas não conferem.')
        return false;
    }
}

function getFullName() {
    name = document.getElementById('name').value;
    lastname = document.getElementById('lastname').value;

    var fullname = name + " " + lastname;
    console.log(fullname);
}

$("#formulario").submit(function(event){
    event.preventDefault();
});


document.getElementById('gender').addEventListener("change", function() {
    var gender = document.getElementById('gender').value;

    switch (gender) {
        case 'F':
            document.body.style.backgroundColor = 'pink';
            break;
        case 'M':
            document.body.style.backgroundColor = 'lightblue';
            break;
        case 'O':
            document.body.style.backgroundColor = 'lightyellow';
            break;
        case 'NA':
            document.body.style.backgroundColor = 'white';
            break;
        default:
            break;
    }
});