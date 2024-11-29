function solution(myString) {
    const answer = myString.toLowerCase().replace(new RegExp('a', 'g'), 'A');
    
    return answer;
}