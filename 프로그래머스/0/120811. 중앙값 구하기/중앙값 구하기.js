function solution(array) {
    const answer = array.sort((a, b) => a - b);
    
    return answer[Math.floor(answer.length / 2)];
}