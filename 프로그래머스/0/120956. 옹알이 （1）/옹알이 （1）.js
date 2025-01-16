function solution(babbling) {
    // 조카가 발음할 수 있는 기본 발음 리스트
    const validSounds = ["aya", "ye", "woo", "ma"];

    // 발음 가능한 단어 개수를 카운트
    let count = 0;

    // 배열의 각 단어를 검사
    for (let word of babbling) {
        let originalWord = word;

        // 발음 가능한 단어인지 확인하기 위해 반복적으로 발음 제거
        for (let sound of validSounds) {
            word = word.replace(new RegExp(sound, "g"), " ");
        }

        // 남은 문자열이 전부 제거되었는지 확인
        if (word.trim() === "") {
            count++;
        }
    }

    return count;
}
