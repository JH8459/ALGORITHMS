function solution(age) {
    const answer = [...age.toString()].map((num) => String.fromCharCode(97 + Number(num))).join('');
    
    return answer;
}