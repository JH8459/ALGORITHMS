function solution(strArr) {
    const lengthMap = new Map();

    strArr.forEach(str => {
        const len = str.length;
        
        lengthMap.set(len, (lengthMap.get(len) || 0) + 1);    
    })

    return Math.max(...lengthMap.values());
}