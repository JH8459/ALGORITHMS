function solution(arr, queries) {
    const answer = arr.map((num, index) => {
        queries.forEach((query) => {
            if(index >= query[0] && index <= query[1]) num += 1;
        })
        
        return num;
    });
    
    return answer;
}