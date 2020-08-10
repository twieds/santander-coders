var turn = 1;
var scoreP1 = 0;
var scoreP2 = 0;
var gameBoard = Array(3).fill(0).map(()=>Array(3).fill(0));

$(document).ready(function () {
    // page starts with the game board hidden
    $('#game-board').hide();

    // on button start click
    $('#start-game').click(function () {
        setPlayerName();
        
        // hides the first page and shows the game board
        $('#info').hide();
        $('#game-board').show();
    });

    $('.table-cell').click(selectedCell);
    $('#restart').click(restartGame);
    $('#reset').click(resetScore);

});

// cleans the game board, empty all cells and rebind click function
function restartGame() {
    turn = 1;
    gameBoard = Array(3).fill(0).map(()=>Array(3).fill(0));

    $('.table-cell').off(); 
    $('.table-cell').click(selectedCell);
    $(".table-cell").empty();
} 

// bind function to cell click
function selectedCell() {
    // disable all events for this cell
    $("#" + this.id).off(); 
    player_turn(this.id);
}

//Sets player names according to user input
//If input is blank, sets standard text instead.
function setPlayerName() {

    if($('#player-one-name').val() == ''){
        $('#score-name-player-one').text("Player 1");
    } else {
        $('#score-name-player-one').html($('#player-one-name').val());
    }

    if($('#player-two-name').val() == ''){
        $('#score-name-player-two').text("Player 2");
    } else {
        $('#score-name-player-two').html($('#player-two-name').val());
    }
}   

// draws crosses or dashes on the board
function player_turn (cellId) {
    var points = 0;
    var image = '';

    if (turn % 2 == 1) {
        image = '<img src="assets/images/cross.png" alt="cross"/>';
        points = -1;
    } else {
        
        image = '<img src="assets/images/circle.png" alt="cross"/>'
        points = 1;
    }

    console.log(image);
    // draws icon on screen
    $('#' + cellId).append(image);

    // stores move on the board matrix
    var lin_col = cellId.split('-');
    gameBoard[lin_col[0]][lin_col[1]] = points;

    //checks if theres a winner move
    move();
    turn++;
}

function move() {
    var horizontal = 0;
    var vertical = 0;
    var diagonal = 0;
    var noWinners = 0;

    // checks rows and columns
    for (let i = 0; i < 3; i++) {
        horizontal = 0;
        vertical = 0;

        for (let j = 0; j < 3; j++) {
            horizontal += gameBoard[i][j];
            vertical += gameBoard[j][i];
            
            // checks if the matrix is full
            if (gameBoard[i][j] == 0) {
                noWinners++;
            }
        }
        weHaveAWinner(horizontal);
        weHaveAWinner(vertical);
    }

    if (noWinners == 0) {
        $(".table-cell").off();
        setTimeout( () => {
            alert("There are no winners for this round :(");
            updateScore();
            restartGame();
        }, 200);
        return;
    }

    //checks downward diagonal
    for (let i = 0; i < 3; i++) {
        diagonal += gameBoard[i][i]
    }
    weHaveAWinner(diagonal);

    //checks upward diagonal
    diagonal = 0;
    for (let i = 0; i < 3; i++) {
        diagonal += gameBoard[i][2-i]
    }
    weHaveAWinner(diagonal);

}

function weHaveAWinner(points) {
    var winner = false;

    if (points == -3) {
        var player = $("#score-name-player-one").text();
        var winner = true;
        scoreP1 ++;

    } else if (points == 3){
        var player = $("#score-name-player-two").text();
        var winner = true;
        scoreP2 ++;
    }

    if (winner) {
        $(".table-cell").off();
        setTimeout( () => {
            alert(player + ' is the winner!!!');
            updateScore();
            restartGame();
        }, 200);
    }
}

function updateScore() {
    $("#score-player-one").text(scoreP1);
    $("#score-player-two").text(scoreP2);
}

function resetScore() {
    scoreP1 = 0;
    scoreP2 = 0;
    restartGame();
    updateScore();
}
