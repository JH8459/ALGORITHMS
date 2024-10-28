function solution(my_string, m, c) {
    const strArr = [];
    let answer = '';
    
    for(let i = 0; i < my_string.length / m; i++){
        strArr.push(my_string.slice(i * m, (i * m) + m));
    }
    
    for(let i = 0; i < strArr.length; i++){
        answer += strArr[i].charAt(c - 1);
    }
    
    return answer;
}