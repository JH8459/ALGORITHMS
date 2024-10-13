function solution(arr, queries) {
    const answer = queries.map((query) => {
        const s = query[0];
        const e = query[1];
        const k = query[2];
        
        let min = Number.MAX_SAFE_INTEGER;
        
        for(let i = s; i <= e; i++){
            if(arr[i] > k){
                min = Math.min(arr[i], min);
            }
        }
        
        if(min === Number.MAX_SAFE_INTEGER){
            min = -1;
        }
        
        return min;
    })
    
    return answer;
}