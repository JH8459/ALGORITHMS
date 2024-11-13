function solution(my_string, indices) {
    const answer = [...my_string].filter((str,index) => !indices.includes(index) ).join('');
    
    return answer;
}