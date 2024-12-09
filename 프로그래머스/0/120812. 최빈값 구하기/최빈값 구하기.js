function solution(array) {
    const map = new Map();
    
    array.forEach((num) => {
        if(map.get(num) > 0){
            map.set(num, +map.get(num) + 1);    
        } else {
            map.set(num, 1);
        }
    });
    
    const frequencySortedArr = [...map].sort((a, b) => b[1] - a[1]);
    
    const maxFreq = frequencySortedArr[0][1];
    const maxFreqArr = frequencySortedArr.filter((el) => el[1] === maxFreq);
    
    return maxFreqArr.length > 1 ? -1 : maxFreqArr[0][0];
}