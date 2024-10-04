function solution(my_string, overwrite_string, s) {
    let frontStr = my_string.slice(0, s);
    let backStr = my_string.slice(s + overwrite_string.length);
    
    let answer = frontStr + overwrite_string + backStr;
    
    return answer;
}