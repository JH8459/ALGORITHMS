function solution(my_string, alp) {
    const answer = my_string.replace(new RegExp(alp, 'g'), alp.toUpperCase());
    
    return answer;
}