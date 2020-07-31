function calcular(){
    var operacao = document.getElementById('operacao').value;

    //alert(operacao);
    var num1 = document.getElementById('num1').value;
    var num2 = document.getElementById('num2').value;

    //testa se os campos estao vazios  
    if (num1 == '' || num1 == null) {
        alert('Favor digitar um número válido para operação (num1)');
        return false;
    }

    if (num2 == '' || num2 == null) {
        alert('Favor digitar um número válido para operação (num2)');
        return false;
    }

    //forçando o tipo de variável
    num1 = parseFloat(num1);
    num2 = parseFloat(num2);

    var resultado = null;

    switch (operacao){
        case '1': // Subtração
            resultado = num1 - num2;
            break;

        case '2': // Adição
            resultado = num1 + num2;
            break;

        case '3': // Multiplicação
            resultado = num1 * num2;
            break;

        case '4': // Divisão
            resultado = num1 / num2;
            break;

        default:
            alert('A opção selecionada é inválida');
            return false;
    }

    document.getElementById('resultado').value = resultado;

}