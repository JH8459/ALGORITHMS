function solution(my_str, n) {
    return Array.from({ length: Math.ceil(my_str.length / n) }, (v, idx) =>
        my_str.slice(idx * n, idx * n + n)
    );
}