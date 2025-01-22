function solution(num, total) {
    // 연속된 숫자의 합이 total이 되는 시작점을 계산
    const start = Math.floor(total / num - (num - 1) / 2);

    // 연속된 숫자 배열 생성
    return Array.from({ length: num }, (_, i) => start + i);
}