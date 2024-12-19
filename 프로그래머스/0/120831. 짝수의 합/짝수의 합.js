function solution(n) {
    const arr = Array.from({ length: n }, (v, i) => i + 1); 
    const answer = arr.reduce((acc, cur) => {
        if(!(cur % 2)) acc += cur;  
        return acc;
    }, 0);
    
    return answer;
}