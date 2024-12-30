function solution(n) {
    const answer = Array.from({ length: n }, (v, i) => i + 1)
        .filter((num) => !(n % num));
    
    return answer;
}