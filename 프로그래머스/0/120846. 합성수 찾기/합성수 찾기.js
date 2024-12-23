function solution(n) {
    return Array.from({ length: n }, (v, i) => i + 1).filter(num => getDividerCnt(num) >= 3).length;
}

function getDividerCnt(num) {
    return Array.from({ length: num }, (v, i) => i + 1).filter(i => num % i === 0).length;
}