
$(document).ready(function () {
    $('.btn-carrega-conteudo').click(function () {
        var carrega_url = this.id;
        carrega_url = carrega_url + "_conteudo.html";

        $.ajax({
            url: carrega_url,
            //data
            success: function (data) {
                $('#div-conteudo').html(data);
            },

            beforeSend: function () {
                $('#loader').css({ display: "block" });
            },

            complete: function () {
                $('#loader').css({ display: "none" });
            }
        });
    });
});
