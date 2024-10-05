function solution(numer1, denom1, numer2, denom2) {
    const getGcd = (a, b) => {
        while (b != 0) {
            const r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    };
    
    const numerator = numer1 * denom2 + numer2 * denom1;
    const denominator = denom1 * denom2;
    const gcd = getGcd(numerator, denominator);
    
    return [numerator / gcd, denominator / gcd];
}