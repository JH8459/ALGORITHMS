function solution(s1, s2) {
    const map = new Map();
    let answer = 0;

    const updateMapAndCount = (str) => {
        for (const char of str) {
            if (map.has(char)) {
                answer++;
            } else {
                map.set(char, true);
            }
        }
    };

    updateMapAndCount(s1);
    updateMapAndCount(s2);

    return answer;
}