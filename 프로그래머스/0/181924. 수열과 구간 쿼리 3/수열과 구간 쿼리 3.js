function solution(arr, queries) {
    queries.map((query) => {
        const temp1 = arr[query[0]];
        const temp2 = arr[query[1]];
        
        arr[query[0]] = temp2;
        arr[query[1]] = temp1;
    })
    
    return arr;
}