function solution(my_string) {
    const answer = new Array(52).fill(0);
    
    for(let i = 0; i < my_string.length; i++) {
        const code = my_string.charAt(i).charCodeAt();
        
        if(code >= 97 && code <= 122){
            answer[code - 97 + 26]++;
        } else {
            answer[code - 65]++;
        }
    };
    
    return answer;
}