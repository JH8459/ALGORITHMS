function solution(a, d, included) {
    return included.reduce((answer, temp, idx) => temp ? answer + (a + (idx * d)) : answer, 0);
}