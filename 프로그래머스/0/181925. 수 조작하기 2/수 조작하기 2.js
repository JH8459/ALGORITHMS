function solution(numLog) {
    let str = "";
    
    for(let i = 1; i < numLog.length; i++){
        const gap = numLog[i] - numLog[i - 1];
        
        if(gap === 1){
            str += "w";
        } else if(gap === -1){
            str += "s";
        } else if(gap === 10){
            str += "d";
        } else {
            str += "a";
        }
    }
    
    return str;
}