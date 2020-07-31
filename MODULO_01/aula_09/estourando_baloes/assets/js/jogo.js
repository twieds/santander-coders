function iniciaJogo() {
    var url = window.location.search;
    var nivel_jogo = url.replace("?", "");
    var tempo_segundos = 0;

    if (nivel_jogo == 1) { //1 fácil -> 120segundos
		tempo_segundos = 120;
	}

	if (nivel_jogo == 2) { //2 normal -> 60segundos
		tempo_segundos = 60;
	}
	
	if (nivel_jogo == 3) { //3 difícil -> 30segundos
		tempo_segundos = 30;
	}

    // inserindo o valor no span
    document.getElementById('cronometro').innerHTML = tempo_segundos;

    // quantidade de baloes
    var qtde_baloes = 20;
    criaBaloes(qtde_baloes);

    //imprimir qtde de baloes inteiros
    document.getElementById('baloes_inteiros').innerHTML = qtde_baloes;
    document.getElementById('baloes_estourados').innerHTML = 0;

    contagemTempo(tempo_segundos + 1);
}

function criaBaloes(qtde_baloes) {
    for (let i = 1; i <= qtde_baloes; i++) {
        var balao = document.createElement("img");
        balao.src = 'assets/imagens/balao_azul_pequeno.png';
        balao.style.margin = '10px';
        balao.id = 'b' + i;
        balao.onclick = function() { estourar(this); };

        document.getElementById('cenario').appendChild(balao);
    }
}

function contagemTempo(segundos) {
    segundos = segundos - 1;

    if (segundos == -1) {
        clearTimeout(timerId); //para a execução da função do settimeout
        gameOver();
        return false;
    }

    document.getElementById('cronometro').innerHTML = segundos;
    timerId = setTimeout("contagemTempo(" + segundos + ")", 1000);
}

function gameOver() {
    removeEventosBaloes();
    alert('Fim de jogo, você não conseguiu estourar todos os balões a tempo');
}

function estourar(e) {
    var id_balao = e.id;
    document.getElementById(id_balao).setAttribute("onclick", "");
    document.getElementById(id_balao).src = 'assets/imagens/balao_azul_pequeno_estourado.png';
    pontuacao(-1);
}

function pontuacao(acao) {
    var baloes_inteiros = document.getElementById('baloes_inteiros').innerHTML;
    var baloes_estourados = document.getElementById('baloes_estourados').innerHTML;

    baloes_inteiros = parseInt(baloes_inteiros);
    baloes_estourados = parseInt(baloes_estourados);

    baloes_inteiros = baloes_inteiros + acao;
    baloes_estourados = baloes_estourados - acao;

    document.getElementById('baloes_inteiros').innerHTML = baloes_inteiros;
    document.getElementById('baloes_estourados').innerHTML = baloes_estourados;

    situacaoJogo(baloes_inteiros);
}

function situacaoJogo(baloesInteiros) {
    if (baloesInteiros == 0) {
        alert('Parabéns, você conseguiu estourar todos os balões a tempo');
        pararJogo();
    }
}

function pararJogo() {
    clearTimeout(timerId);
}

function removeEventosBaloes() {
    var i = 1;    
    while (document.getElementById('b'+ i)) {
        document.getElementById('b'+ i).onclick = '';
        i++;
    }
}



