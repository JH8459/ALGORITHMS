function solution(myString, pat) {
    const index = myString.lastIndexOf(pat);
    const result = myString.slice(0, index + pat.length);
    
    return result;
}