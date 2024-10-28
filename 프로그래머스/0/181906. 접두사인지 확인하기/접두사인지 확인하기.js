function solution(my_string, is_prefix) {
    const answer = [];
    
    for(let i = 0; i < my_string.length; i++){
        answer.push(my_string.slice(0, i + 1));
    }
    
    return answer.indexOf(is_prefix) >= 0 ? 1 : 0;
}