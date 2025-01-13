function solution(a, b) {
    // 최대 공약수를 구한다
    const gcd = getGCD(a, b);
    
    // 기약분수의 분모가 2와 5로만 나누어떨어지는지 확인
    return hasOnlyFactors(b / gcd) ? 1 : 2;
}

// 최대 공약수를 구하는 함수
function getGCD(a, b) {
	return b === 0 ? a : getGCD(b, a % b);
};

// 주어진 숫자가 2와 5의 소인수들로만 이루어졌는지 확인하는 함수
function hasOnlyFactors(num) {
    for (const factor of [2, 5]) {
        while (num % factor === 0) {
            num /= factor;
        }
    }
    
    return num === 1; // 나머지가 1이면 모든 소인수가 조건을 만족
}
