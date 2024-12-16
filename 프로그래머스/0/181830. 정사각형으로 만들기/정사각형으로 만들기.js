function solution(arr) {
    const arrLength = arr.length;
    const maxLength = Math.max(...arr.map(innerArray => innerArray.length));
    
    while (arr.length < maxLength) {
        arr.push(new Array(maxLength).fill(0));
    }
    
    const answer = arr.map((innerArray) => {
        while (innerArray.length < arr.length) {
            innerArray.push(0);
        }
        
        return innerArray;
    })
    
    return answer;
}