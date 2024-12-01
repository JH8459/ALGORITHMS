function solution(myString) {
    const answer = myString.split("x").filter((str) => str.length).sort();
    
    return answer;
}