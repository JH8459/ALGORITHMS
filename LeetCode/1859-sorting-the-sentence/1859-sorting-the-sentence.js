/**
 * @param {string} s
 * @return {string}
 */
var sortSentence = function(s) {
    return s
        .split(' ')
        .sort((a, b) => a.match(/\d+/)[0] - b.match(/\d+/)[0]) // 숫자 기준 정렬
        .map(word => word.slice(0, -1)) // 마지막 문자(숫자) 제거
        .join(' '); // 다시 문자열로 합치기
};