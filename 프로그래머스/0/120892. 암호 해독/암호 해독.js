function solution(cipher, code) {
    const answer = [...cipher].filter((char, idx) => !((idx + 1) % code)).join('');
    
    return answer;
}