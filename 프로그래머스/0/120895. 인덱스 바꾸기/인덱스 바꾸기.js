function solution(my_string, num1, num2) {
    let temp = '';
    const answer = [...my_string];
    
    temp = answer[num1];
    answer[num1] = answer[num2];
    answer[num2] = temp;
    
    return answer.join('');
}