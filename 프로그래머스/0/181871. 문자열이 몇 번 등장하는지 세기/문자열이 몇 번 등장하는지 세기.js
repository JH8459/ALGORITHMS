function solution(myString, pat) {
    let answer = 0;
    
    [...myString].forEach((str, idx) => {
        const temp = myString.slice(idx, idx + pat.length);
        
        if(temp === pat) answer++;
    });
    
    return answer;
}