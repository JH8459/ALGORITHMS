function solution(num_list) {
    const evenList = num_list.filter((num, idx) => {
        if(idx % 2) return num
    });
    const oddList = num_list.filter((num, idx) => {
        if(!(idx % 2)) return num
    });
    
    const evenSum = evenList.reduce((acc, cur) => acc + cur, 0);
    const oddSum = oddList.reduce((acc, cur) => acc + cur, 0);
    
    return Math.max(evenSum, oddSum);
}