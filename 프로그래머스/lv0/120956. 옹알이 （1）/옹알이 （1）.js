function solution(babbling) {
    let answer = 0;

    // babbling map 순회
    babbling.map((word) => {
        // 연속된 같은 발음이 있다면 다음 단어 수행
        if (/(aya|ye|woo|ma)\1+/g.test(word)) return;
        // 발음할 수 있는 단어만 있다면 answer을 1 증가.
        if (/^(aya|ye|woo|ma)+$/g.test(word)) {
          answer++;
        }
    });

    return answer;
}