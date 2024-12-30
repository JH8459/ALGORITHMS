function solution(array, n) {
    const answer = array.sort((a, b) => {
        if(Math.abs(a - n) === Math.abs(b - n)){
            return a - b;
        } else {
            return Math.abs(a - n) - Math.abs(b - n);
        }
    });
    
    return answer[0];
}