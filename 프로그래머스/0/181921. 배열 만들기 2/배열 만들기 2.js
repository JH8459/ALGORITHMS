function solution(l, r) {
    const answer = [];
    const regex = /^[0,5]*$/;
    
    for(let i = l; i <= r; i ++){
        if(regex.test(i)){
            answer.push(i);    
        }
    }
    
    answer.sort((a, b) => a - b);
    
    return answer.length ? answer : [-1];
}