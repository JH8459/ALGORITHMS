function solution(name) {
    let answer = 0;
    const length = name.length;

    // 알파벳 변경 횟수 계산 함수
    const getUpDownCnt = (char) => {
        const upCnt = char.charCodeAt(0) - 'A'.charCodeAt(0);
        const downCnt = 'Z'.charCodeAt(0) - char.charCodeAt(0) + 1;
        return Math.min(upCnt, downCnt);
    };

    // ▲, ▼ 알파벳 변경 횟수 계산
    for (let i = 0; i < length; i++) {
        answer += getUpDownCnt(name[i]);
    }

    let minMove = length - 1;
    
    // ◀, ▶ 커서 이동 최소 거리 계산
    for (let i = 0; i < length; i++) {
        let next = i + 1;
        
        while (next < length && name[next] === 'A') {
            next++;
        }
        
        const move = Math.min(i * 2 + length - next, (length - next) * 2 + i);
        minMove = Math.min(minMove, move);
    }

    return answer + minMove;
}