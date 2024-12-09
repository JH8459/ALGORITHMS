function solution(myString) {
    return [...myString].map((char) => {
        if(char.charCodeAt() < 108){
            return 'l';
        } else {
            return char;
        }
    }).join('');
}