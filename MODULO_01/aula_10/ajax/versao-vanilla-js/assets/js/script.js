var httpRequest; // guarda o objeto XML Http REquest

function fazerRequisicao(url, destino) {
    document.getElementById(destino).innerHTML = "<center><img src='assets/gif/loader.gif'></center>";

    if (window.XMLHttpRequest) { //versoes atuais de browser
        httpRequest = new XMLHttpRequest();
    } else if (window.ActiveXObject) { // IE 4, 5, 6
        try {
            httpRequest = new ActiveXObject("Msxm12.XMLHTTP");
        } catch (e) {
            try {
                httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
            } catch (e) {
                alert("Impossível instanciar o objeto XMLHttpRequest para este navegador/versão");
            }
        }
        
        if (!httpRequest) {
            alert("Erro ao tentar criar uma instancia do HttpRequest");
            return false;
        }
    }

    // toda vez que o estado for modificado
    httpRequest.onreadystatechange = situacaoRequisicao;
    httpRequest.open("GET", url);
    httpRequest.send();
}

function situacaoRequisicao(){
    if (httpRequest.readyState == 4) {
        if (httpRequest.status == 200) {
            document.getElementById('div-conteudo').innerHTML = httpRequest.responseText;
        }
    }
}