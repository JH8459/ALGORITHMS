function solution(num_list, n) {
    const a = num_list.slice(n);
    const b = num_list.slice(0, n);
    
    return [...a, ...b];
}