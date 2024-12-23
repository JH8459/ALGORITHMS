function solution(my_string) {
    const regexp = /^[0-9]*$/;
    const answer = [...my_string].filter((char) => regexp.test(char))
        .map((char) => Number(char))
        .sort((a, b) => a - b);
    
    return answer;
}