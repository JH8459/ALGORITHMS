function solution(num, n) {
    let answer;
    
    if(num % n){
        answer = 0;
    } else {
        answer = 1;
    }
    
    return answer;
}