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

    fields.forEach(field => {
        if (document.getElementById(field[0]).value == '' || document.getElementById(field[0]).value == null) {
            alert('O campo ' + field[1] + ' é obrigatório.')
        }
    });
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