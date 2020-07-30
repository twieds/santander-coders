//----------------------------------------------------------------------------
// 1 - Crie uma função que recebe um número e verifica se ele é par ou ímpar.
function parOuImpar(numero) {
    return numero % 2 == 0 ? (numero + " é par.") : (numero + " é impar.")
}

console.log(parOuImpar(5));
console.log(parOuImpar(6));

//----------------------------------------------------------------------------
// 2 - Crie uma arrow function que receba um número e verifique se é primo.
let ehNroPrimo = numero => {
    if (numero <= 1) {
        return numero + " não é primo.";
    }

    for (let i = 2; i < numero; i++) {
        if (numero % i === 0) {
            return numero + " não é primo.";
        }
    }

    return numero + " é primo.";
}

console.log(ehNroPrimo(7));
console.log(ehNroPrimo(4));

//----------------------------------------------------------------------------
// 3 - Crie uma função que imprime de 10 até 1 e depois imprime na tela “feliz ano novo” através de uma callback
function felicitacoes() {
    console.log("Feliz ano novo!!!");
}

function countDownAnoNovo(callback) {
    for (let i = 10; i > 0; i--) {
        console.log(i + "..."); 
    }
    callback();
}

countDownAnoNovo(felicitacoes);

//----------------------------------------------------------------------------
// 4 - Faça o mesmo utilizando Promise com concatenação de then
const felicitacoes_promises = new Promise((resolve, reject) => {
    if (resolve) {
        resolve("Feliz ano novo!!!");
    }
    else {
        reject("quebrou 2!");
    }
});

const countDownAnoNovo_promises = new Promise((resolve, reject) => {
    var contador = '';
    for (let i = 10; i > 0; i--) {
        contador += (i + "...\n"); 
    }
    
    if (resolve) {
        resolve(contador);
    } 
    else {
        reject("quebrou 1!");
    }  
    
});

countDownAnoNovo_promises.then(function(resolve) {return console.log(resolve)})
                .then(function() {return felicitacoes_promises})
                .then(function(resolve) {return console.log(resolve)});

//----------------------------------------------------------------------------
// 5 - Agora repita a função utilizando o método async/await
const anoNovo = async () => {
    try {
        const countdown = () => {
            for (let i = 10; i > 0; i--) {
                console.log(i + "..."); 
            }
        }

        const felicitacoes = () => {
            countdown();
            return ("Feliz ano novo!!!");
        }
        
        resolve = await felicitacoes();
        console.log(resolve);
    } catch (err) {
        console.log(err)
    }
}

anoNovo();

//----------------------------------------------------------------------------
// 6 - Crie um array com as seguintes notas [5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0],
// construa uma função para imprimir apenas as notas acima de 7
notas = [5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];

function acimaDeSete(numero) {
    return numero > 7;
}

console.log(notas.filter(acimaDeSete));

//----------------------------------------------------------------------------
// 7 - Crie um array de objetos onde cada objeto será um produto de supermercado e terá o nome do produto e o seu respectivo
// preço, agora construa uma função que some todos os valores e te devolva o total.
var produtos_mercado = [
    {nome: 'chocolate', preco: 3.00 }, 
    {nome: 'aveia', preco: 3.50 }, 
    {nome: 'leite', preco: 3.50 }
];

function somaPrecoProdutos(total, produto) {
    return total + produto.preco;
};

console.log(produtos_mercado.reduce(somaPrecoProdutos, 0));

//----------------------------------------------------------------------------
// 8 - Em uma escola ficou definido que os alunos do 8º ano terão aulas de história 
// e os alunos do 9º terão aulas de física às quartas-feiras. 
// Você deve criar uma função que receba um array de objetos contendo nome e série de cada aluno e 
// atribua a sua respectiva disciplina da quarta-feira. 
// (O array de alunos deve ser criado como você desejar contanto que contenha pelo menos 5 alunos).
var alunos = [
    {aluno: "Maria", serie: 8, disciplina: ''},
    {aluno: "João", serie: 5, disciplina: ''},
    {aluno: "Pedro", serie: 9, disciplina: ''},
    {aluno: "Ana", serie: 7, disciplina: ''},
    {aluno: "Carol", serie: 8, disciplina: ''},
    {aluno: "Olivia", serie: 8, disciplina: ''},
    {aluno: "Lucas", serie: 9, disciplina: ''},
    {aluno: "Guilherme", serie: 9, disciplina: ''}
];

function defineDisciplina(alunos) {
    alunos.forEach(aluno => {
        if (aluno.serie == 8) {
            aluno.disciplina = 'história'
        }
        else if (aluno.serie == 9) {
            aluno.disciplina = 'educação fisica'
        }
        else {
            aluno.disciplina = 'outro'
        }
    });

    return alunos;
}

console.log(defineDisciplina(alunos));