function solution(n) {
    const arr = Array.from({ length: n }, (v, i) => i + 1);
    const answer = arr.reduce((acc, cur) => {
        if(!(n % cur)) acc += 1;
        return acc;
    }, 0);
    
    return answer;
}