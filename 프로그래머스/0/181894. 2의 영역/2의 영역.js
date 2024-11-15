function solution(arr) {
    const startIdx = arr.indexOf(2);
    
    if(startIdx === -1){
        return [-1];
    }
    
    const endIdx = arr.reverse().indexOf(2);
    
    if(endIdx === -1){
        return arr[startIdx];
    }
    
    return arr.reverse().slice(startIdx, arr.length  - endIdx);
}