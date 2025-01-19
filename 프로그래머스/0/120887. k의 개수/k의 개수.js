function solution(i, j, k) {
    let answer = 0;
    
    for(let num = i; num <= j; num++){
        for(const char of [...num.toString()]){
            if(char.toString().includes(k.toString())) answer++;    
        }
        
    }
    
    return answer;
}