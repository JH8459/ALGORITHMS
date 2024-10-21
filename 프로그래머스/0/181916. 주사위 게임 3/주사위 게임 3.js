function solution(a, b, c, d) {
    const dice = [a, b, c, d];
    const frequency = {}
    
    for(let i = 0; i < 4; i++){
        const num = dice[i];
        frequency[num] = (frequency[num] || 0) + 1;
    }
    
    const count = Math.max(...Object.values(frequency));
    const entries = Object.entries(frequency).sort((a,b) => a[1] - b[1]);
    
    let answer = 0;
    
    switch(count){
        case 4:
            answer = 1111 * a;
            break;
        case 3:
            answer = (10 * Number(entries[1][0]) + Number(entries[0][0])) ** 2;
            break;
        case 2:
            if(entries.length === 2){
                answer = (Number(entries[1][0]) + Number(entries[0][0])) * Math.abs(Number(entries[1][0]) - Number(entries[0][0]));
            } else if(entries.length === 3){
                const newEntries = entries.filter((el) => el[1] === 1);
                answer = Number(newEntries[1][0]) * Number(newEntries[0][0]);
            }
            break;
        case 1:
            answer = Math.min(...dice);
            break;
    }
    
    return answer;
}