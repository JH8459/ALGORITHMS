function solution(numbers) {
    return numbers
        .map(String) // 숫자를 문자열로 변환
        .sort((a, b) => (b + a) - (a + b)) // 두 문자열을 결합하여 비교
        .join('') // 정렬된 배열을 문자열로 합침
        .replace(/^0+/, '0'); // 000 같은 경우 0으로 변환
}