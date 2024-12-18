function solution(n, k) {
    const a = 12000, b = 2000;
    
    return a * n + b * (k - Math.floor(n / 10));
}