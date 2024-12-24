function solution(n) {
    const answer = [];
    
    for(let i = 2; i <= n; i++){
         if(isPrime(i) && n % i === 0) answer.push(i);
    }
    
    return answer;
}

function isPrime(n) {
    if (n <= 1) return false;
    if (n === 2) return true;
    if (n % 2 === 0) return false;

    const sqrt = Math.sqrt(n);
    for (let i = 3; i <= sqrt; i += 2) {
        if (n % i === 0) return false;
    }

    return true;
}