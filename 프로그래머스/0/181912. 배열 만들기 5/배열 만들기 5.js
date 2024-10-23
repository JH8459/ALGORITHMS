function solution(intStrs, k, s, l) {
    const answer = [];
    
    intStrs.forEach((str) => {
        const num = Number(str.slice(s, s + l));
        
        if(num > k){
            answer.push(num);
        }
    })
    
    return answer;
}