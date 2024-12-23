function solution(progresses, speeds) {
    const result = [];
    
    while (progresses.length > 0) {
        progresses = progresses.map((progress, idx) => progress + speeds[idx]);

        let count = 0;
        
        while (progresses.length > 0 && progresses[0] >= 100) {
            progresses.shift();
            speeds.shift();
            count++;
        }
        
        if (count > 0) {
            result.push(count);
        }
    }
    
    return result;
}