function solution(array) {
    const map = {};
    
    for (let i = 0; i < array.length; i++) {
        let num = array[i];
        
        if (!map[num]) {
            map[num] = 1;
        } else {
            map[num]++;
        }
    }
    
    let maxFrequency = 0;
    let mode = -1;
    let isDuplicate = false;
    
    for (let key in map) {
        if (map[key] > maxFrequency) {
            maxFrequency = map[key];
            mode = Number(key);
            isDuplicate = false;
        } else if (map[key] === maxFrequency) {
            isDuplicate = true;
        }
    }
    
    return isDuplicate ? -1 : mode;
}