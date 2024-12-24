function solution(my_string) {
    const regexp = /^[0-9]*$/;
    const answer = [...my_string].filter((char) => regexp.test(char))
        .reduce((acc, cur) => acc += Number(cur), 0);
    
    return answer;
}