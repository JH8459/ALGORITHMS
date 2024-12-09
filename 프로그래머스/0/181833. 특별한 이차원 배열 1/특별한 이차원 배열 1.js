function solution(n) {
    return Array.from({ length: n }, (_, i) => 
        Array.from({ length: n }, (__, j) => (i === j ? 1 : 0))
    );
}