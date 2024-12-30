function solution(my_string) {
    const answer = [...my_string].map((char) => {
        if(char.charCodeAt() >= 97){
            return char.toUpperCase();   
        } else {
            return char.toLowerCase();
        }
    }).join('');
    
    return answer;
}