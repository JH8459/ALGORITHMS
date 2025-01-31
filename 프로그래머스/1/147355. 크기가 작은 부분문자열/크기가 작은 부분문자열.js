function solution(t, p) {
    const partStrLength = p.length;
    const pNum = Number(p);
    let answer = 0;

    // 주어진 문자열 t에서 길이가 partStrLength인 부분 문자열을 순차적으로 확인
    for (let i = 0; i <= t.length - partStrLength; i++) {
        // 현재 인덱스에서 partStrLength 길이만큼의 부분 문자열을 추출
        const partNum = Number(t.slice(i, i + partStrLength));
        
        // 부분 문자열이 p 이하인지 확인하고 개수를 증가
        if (partNum <= pNum) {
            answer++;
        }
    }

    return answer;
}