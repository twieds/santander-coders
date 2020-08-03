var fundo = 1;

function cumprimentar() {
    alert('Olá! :)')
}

function alterarFundoBtn() {
    if (fundo % 2 == 0) {
        document.body.style.backgroundColor = "white";
    } else {
        document.body.style.backgroundColor = "green";
    }
    fundo++;
}

document.getElementById("KellyKey").addEventListener("click", function(event){
    console.log("estou clicando na imagem, x: " + event.clientX + " y: " + event.clientY);
});

document.addEventListener("click", alterarFundoBody);
function alterarFundoBody() {
    document.body.style.backgroundColor = "red";
}
document.removeEventListener("click", alterarFundoBody);

document.getElementById('Formulario').addEventListener('submit', function(event){
    event.preventDefault();
    alert('Não é possível enviar.')
})


// ------------- TIMERS -------------
setInterval(function() {alert("Hora do intervalo");}, 5000);
setTimeout(function() { alert("Tempo esgotado!");}, 10000);