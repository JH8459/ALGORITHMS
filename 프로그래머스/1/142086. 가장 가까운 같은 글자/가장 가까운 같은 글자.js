function solution(s) {
    // 알파벳 위치를 저장하는 배열 (초기값 -1)
    const lastIndex = new Array(26).fill(-1);

    // 문자열을 순회하며 각 문자의 최근 등장 위치와의 거리 계산
    return [...s].map((char, idx) => {
        const ascii = char.charCodeAt() - 97; // 'a'의 ASCII 코드(97)를 기준으로 0~25의 인덱스로 변환
        const distance = lastIndex[ascii] === -1 ? -1 : idx - lastIndex[ascii]; // 이전 등장 위치와의 거리 계산
        lastIndex[ascii] = idx; // 현재 문자의 위치 저장
        
        return distance;
    });
}