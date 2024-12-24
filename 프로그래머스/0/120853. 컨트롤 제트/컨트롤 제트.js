function solution(s) {
    const sArr = s.split(' ');
    const answer = sArr.reduce((acc, cur, idx) => {
        if(cur !== 'Z') return acc += Number(cur);
        else return acc -= sArr[idx - 1];
    }, 0);
    
    return answer;
}