function solution(arr, n) {
    const answer = arr.map((num, idx) => {
        if(!(arr.length % 2)){
            return idx % 2 ? num + n : num;
        } else {
            return idx % 2 ? num : num + n;
        }
    });
    
    return answer;
}