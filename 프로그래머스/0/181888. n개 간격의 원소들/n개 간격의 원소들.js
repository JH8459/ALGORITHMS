function solution(num_list, n) {
    const answer = num_list.filter((num, idx) => {
        if(!(idx % n)) return num;
    });
    
    return answer;
}