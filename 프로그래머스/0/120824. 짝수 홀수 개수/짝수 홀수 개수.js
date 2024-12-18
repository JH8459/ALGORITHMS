function solution(num_list) {
    const answer = num_list.reduce((acc, cur) => {
        if(cur % 2){
            acc[1] += 1;
        } else {
            acc[0] += 1;
        }
        
        return acc;
    }, [0, 0]);
    
    return answer;
}