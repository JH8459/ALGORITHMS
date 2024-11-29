function solution(myString, pat) {
    const answer = (myString.toLowerCase()).includes(pat.toLowerCase());
    
    return Number(answer);
}