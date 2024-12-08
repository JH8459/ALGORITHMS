function solution(a, b) {
    const answer = getScore(a, b);
    
    return answer;
}

const getScore = (a, b) => {
    let score = 0;
    
    if(a % 2 && b % 2){
        score = Math.pow(a, 2) + Math.pow(b, 2);
    } else if(a % 2 || b % 2){
        score = 2 * (a + b);
    } else {
        score = Math.abs(a - b);
    }
    
    return score;
} 