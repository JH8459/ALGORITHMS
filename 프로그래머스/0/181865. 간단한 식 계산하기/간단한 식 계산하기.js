function solution(binomial) {
    const arr = binomial.split(" ");
    
    const a = Number(arr[0]);
    const b = Number(arr[2]);
    const op = arr[1];
    
    if(op === '+') {
        return a + b;
    } else if(op === '-') {
        return a - b;
    } else {
        return a * b;
    }
}