function solution(n) {
    // 이진수의 1의 개수를 세는 문제
    return n.toString(2).split('1').length - 1;
}