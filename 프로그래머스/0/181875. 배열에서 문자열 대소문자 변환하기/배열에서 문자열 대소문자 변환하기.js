function solution(strArr) {
    const answer = strArr.map((str, idx) => {
        if(!(idx % 2)) {
           return str.toLowerCase();
        } else {
           return str.toUpperCase();
        }
    });
    
    return answer;
}