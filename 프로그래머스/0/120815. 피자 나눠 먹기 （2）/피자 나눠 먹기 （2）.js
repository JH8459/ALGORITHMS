function solution(n) {
    const answer = getLCM(n, 6);
    
    return answer / 6;
}

const getGCD = (a, b) => (b === 0 ? a : getGCD(b, a % b));

const getLCM = (a, b) => {
    return (a * b) / getGCD(a, b);
};