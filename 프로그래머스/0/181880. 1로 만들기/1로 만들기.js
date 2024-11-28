function solution(num_list) {
    const answer = num_list.reduce((acc, cur) => acc += numDivision(cur), 0);
    
    return answer;
}

function numDivision(num) {
    let cnt = 0;
    
    while(num > 1){
        if (!(num % 2)) {
            num = num / 2;
        } else {
            num = (num - 1) / 2;
        }
        
        cnt++;
    }
        
    return cnt;
}