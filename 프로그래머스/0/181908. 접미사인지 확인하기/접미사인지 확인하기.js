function solution(my_string, is_suffix) {
    const answer = [];
    
    for(let i = 0; i < my_string.length; i++){
        answer.push(my_string.slice(i));
    }
    
    console.log(answer);
    
    return answer.indexOf(is_suffix) >= 0 ? 1 : 0;
}