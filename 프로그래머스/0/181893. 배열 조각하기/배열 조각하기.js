function solution(arr, query) {
    query.forEach((num, idx) => {
        if(idx % 2){
            arr = arr.slice(num);
        } else {
            arr = arr.slice(0, num + 1);
        }
    })
    
    return arr;
}