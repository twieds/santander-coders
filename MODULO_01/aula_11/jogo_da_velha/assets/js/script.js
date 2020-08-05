var rodada = 1;
var matriz_jogo = Array(3);

matriz_jogo['a'] = Array(3);
matriz_jogo['b'] = Array(3);
matriz_jogo['c'] = Array(3);

matriz_jogo['a'][1] = 0; 
matriz_jogo['a'][2] = 0; 
matriz_jogo['a'][3] = 0; 

matriz_jogo['b'][1] = 0;
matriz_jogo['b'][2] = 0;
matriz_jogo['b'][3] = 0;

matriz_jogo['c'][1] = 0;
matriz_jogo['c'][2] = 0;
matriz_jogo['c'][3] = 0;

$(document).ready(function () {
    $('#palco_jogo').hide();

    $('#btn_iniciar_jogo').click(function () {
        
        // valida a entrada do nome dos jodadores
        if($('#entrada_apelido_jogador_1').val() == ''){
            alert('Apelido do jogador 1 não foi preenchido');
            return false;
        }

        if($('#entrada_apelido_jogador_2').val() == ''){
            alert('Apelido do jogador 2 não foi preenchido');
            return false;
        }

        //exibir od apelidos, cirar os spans
        $('#nome_jogador_1').html($('#entrada_apelido_jogador_1').val());
        $('#nome_jogador_2').html($('#entrada_apelido_jogador_2').val());

        //controlar a visualização das divs
        $('#pagina_inicial').hide();
        $('#palco_jogo').show();
    });
    

    $('.jogada').click(function () {
        //cria id em cada div do jogo
        var id_campo_clicado = this.id;
        $("#"+id_campo_clicado).off(); //desabilita todos os eventos para esse elemento
        jogada(id_campo_clicado)
    });

    function jogada(id) {
        // criar variavel rodada
        var icone = '';
        var ponto = 0;

        //verifica que jogador esta jogando
        if (rodada % 2 == 1) {
            icone = 'url("assets/images/marcacao_1.png")';
            ponto = -1;
        } else {
            icone = 'url("assets/images/marcacao_2.png")';
            ponto = 1;
        }

        rodada++;
        $('#'+id).css('background-image', icone);

        var linha_coluna = id.split('-');
        matriz_jogo[linha_coluna[0]][linha_coluna[1]] = ponto;

        //verifica se houve vencedor
        verifica_combinacao()
    };

    function verifica_combinacao() {
        //--------------- verifica linhas---------------
        console.log(3);
        // verifica a linha A
        var pontos = 0;
        for (let i = 1; i <= 3; i++) {
            pontos += matriz_jogo['a'][i];
        }
        ganhador(pontos);

        // verifica a linha B
        var pontos = 0;
        for (let i = 1; i <= 3; i++) {
            pontos += matriz_jogo['b'][i];
        }
        ganhador(pontos);

        // verifica a linha C
        var pontos = 0;
        for (let i = 1; i <= 3; i++) {
            pontos += matriz_jogo['c'][i];
        }
        ganhador(pontos);

        //--------------- verifica colunas---------------        
        for (let i = 1; i <= 3; i++) {
            var pontos = 0;
            pontos += matriz_jogo['a'][i];
            pontos += matriz_jogo['b'][i];
            pontos += matriz_jogo['c'][i];
            ganhador(pontos);
        }
        
        //--------------- verifica diagonais---------------        
        var pontos = 0;
        pontos = matriz_jogo['a'][1] + matriz_jogo['b'][2] + matriz_jogo['c'][3];
        ganhador(pontos);

        var pontos = 0;
        pontos = matriz_jogo['a'][3] + matriz_jogo['b'][2] + matriz_jogo['c'][1];
        ganhador(pontos);
    }

    function ganhador(pontos) {
        if (pontos == 3){
            var jogada_1 = $("#entrada_apelido_jogador_1").val();
            alert(jogada_1 + ' é o vencedor');
            $(".jogada").off();
        } 
        else if (pontos == -3){
            var jogada_1 = $("#entrada_apelido_jogador_2").val();
            alert(jogada_1 + ' é o vencedor');
            $(".jogada").off();
        }
    }
})