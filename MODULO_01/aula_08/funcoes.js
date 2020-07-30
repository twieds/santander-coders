function dizerOi(nome) {
    console.log("Olá " + nome + "!");
}

function dizerTchau(nome, sobrenome) {
    console.log(nome + " " + sobrenome + " foi embora.");
}

dizerOi("Thaís");
dizerTchau("Thaís", "Wiwiwiwi");

// ------------------------------------------------------
function parOuImpar(numero){
    if (numero%2 == 0){
        console.log(numero + " é par.");
    } 
    else {
        console.log(numero + " é ímpar.");
    }
}

parOuImpar(16);
parOuImpar(15);

// ------------------------------------------------------
// FUNÇÃO ANONIMA
var dizerOla = function(nome) {
    return ("Olá " + nome);
}

console.log(dizerOla("Rafa"));

// ------------------------------------------------------
// FUNÇÃO ANINHADA
function circunferencia (raio) {
    function diametro() {
        return 2 * raio; //raio é uma variável da função pai
    }
    
    return Math.PI * diametro(); //invocamos a função filho
}

console.log(circunferencia(2));

// ------------------------------------------------------
function a(callback){
    setTimeout( function() {
        console.log('a vem primeiro');
        callback();
    }, 3000);
}

function b() {
    console.log('b vem depois');
}

a(b);

// ------------------------------------------------------
dizerOi.call({}, "Arya"); //null
dizerOi.apply({}, ["Maria"]); //null

// ------------------------------------------------------
// FUNÇÃO AUTOEXECUTÁVEL
(function() {
    var a = 1;
    console.log(a);
})();

// ------------------------------------------------------
// DECLARAÇÃO DE OBJETOS
var obj = {
    nome: "Jon",
    sobrenome: "Snow",
    idade: 16,
    apresentar: apresentacao
};

function apresentacao() {
    console.log("Olá eu sou " + this.nome + ' ' + this.sobrenome + '.');
}

console.log(obj.sobrenome);
obj.apresentar();


// ------------------------------------------------------
// PROTOTYPE - adiciona método
String.prototype.apagar = function() {
    return "";
}

console.log("oi".apagar())

// ------------------------------------------------------
// DATAS 
var data = new Date();
console.log(data);

// ------------------------------------------------------
// ARRAY
var array = "Ned Jon Robb Bran Rickon".split(' ');
console.log(array.toString()); // converte em string separado por vírgula
console.log(array.join(', ')); // converte em string separando pela vírgula e espaço

array.push("Sansa"); // adiciona elemento no final do vetor
array.unshift("Arya"); // adiciona elemento no começo do vetor
console.log(array);

var elemento = array.pop(); // retira o último elemento 
var elemento1 = array.shift(); // retira o primeiro elemento
console.log(elemento, elemento1, array)

array[1] = "Jon Snow"; // substitui valor

var slice = array.slice(3,5); // extrai elementos do vetor
console.log(slice);

// retirar e inserir elemento, qual elemento, quantidade a ser retirado e inclusão
var splice = array.splice(1, 1, "Arya", "Sansa");
console.log(splice);
console.log(array);

// FOR EACH
var array = [1, 5, 7];

array.forEach(function(value, index) {
    console.log("No índide: " + index + " está o valor: " + value);
});

//MAP
array.map(function(numero) {
    console.log(numero * 2);
});

//FILTER
console.log(array.filter(function(numero) {
    return numero >= 5;
}));

//REDUCE
console.log(array.reduce(function(total, numero) {
    return total + numero;
}));