function solution(myString) {
    const answer = myString.split("x").map((str) => str.length);
    
    return answer;
}