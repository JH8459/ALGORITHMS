function solution(number, n, m) {
    const nMod = number % n;
    const mMod = number % m;
    
    return nMod + mMod > 0 ? 0 : 1;
}