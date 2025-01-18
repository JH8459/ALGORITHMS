function solution(bin1, bin2) {
    // 이진수 문자열을 정수로 변환하여 더한 후 다시 이진수로 변환
    const sum = parseInt(bin1, 2) + parseInt(bin2, 2);
    return sum.toString(2); // 결과를 이진수 문자열로 변환
}