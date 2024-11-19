function solution(numbers, n) {
    const answer = numbers.reduce((acc, cur) => {
        if(acc > n){
            cur = 0;
        }
        
        return acc += cur;    
    }, 0);
    
    return answer;
}