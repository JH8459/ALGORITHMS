function solution(arr) {
    const answer = arr.map((num) => {
        if(!(num % 2) && num >= 50){
            return  num / 2;
        } else if(num % 2 && num < 50){
            return num * 2;
        } else {
            return num;
        }
    });
    
    return answer;
}