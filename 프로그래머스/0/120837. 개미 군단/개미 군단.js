function solution(hp) {
    const generalCnt = Math.floor(hp / 5);
    const soldierCnt = Math.floor((hp - 5 * generalCnt) / 3);
    const workerCnt = hp - 5 * generalCnt - 3 * soldierCnt;
    
    return generalCnt + soldierCnt + workerCnt;
}