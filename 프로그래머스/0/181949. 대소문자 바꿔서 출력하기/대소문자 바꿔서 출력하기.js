const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];
let result = '';

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    
    for(let i = 0; i < str.length; i++){
        if(str.charAt(i).charCodeAt() >= 97){
            result += str.charAt(i).toUpperCase();
        } else {
            result += str.charAt(i).toLowerCase();
        }
    }
    
    console.log(result);
});