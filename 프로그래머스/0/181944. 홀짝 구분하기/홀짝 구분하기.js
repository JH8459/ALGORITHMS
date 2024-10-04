const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];
let isEven = '';

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    n = Number(input[0]);
    
    if(n % 2){
        isEven = 'odd';
    } else {
        isEven = 'even';
    }
    
    console.log(n + " is " + isEven);
});