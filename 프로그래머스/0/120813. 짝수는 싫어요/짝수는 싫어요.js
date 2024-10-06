function solution(n) {
    const oddList = [];
    
    for(let i = 1; i <= n; i++){
        if(i % 2 === 1){
            oddList.push(i);
        }
    }
    
    return oddList;
}