function solution(numbers, direction) {
    const answer = numbers.map((number, idx) => {
        if(direction === "left"){
            const targetIdx = (idx + 1) % numbers.length;
            return numbers[targetIdx];
        } else {
            const targetIdx = (idx - 1 >= 0) ? idx - 1 : numbers.length - 1;
            return numbers[targetIdx];
        }
    })
    
    return answer;
}