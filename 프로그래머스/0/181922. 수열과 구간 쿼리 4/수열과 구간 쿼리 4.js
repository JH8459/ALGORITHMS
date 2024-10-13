function solution(arr, queries) {
    queries.map((query) => {
        const s = query[0];
        const e = query[1];
        const k = query[2];
        
        for(let i = s; i <= e; i++){
            if(!(i % k)){
                arr[i] += 1;
            }
        }
    });
    
    return arr;
}