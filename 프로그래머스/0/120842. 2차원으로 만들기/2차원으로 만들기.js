function solution(num_list, n) {
    const answer = [];
    let temp = [];
    
    num_list.forEach((num, idx) => {
        temp.push(num);
        
        if((idx + 1) % n === 0){
            answer.push(temp);
            temp = [];
        }
    });
    
    return answer;
}