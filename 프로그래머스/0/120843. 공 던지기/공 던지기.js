function solution(numbers, k) {
    const targetIndex = ((k - 1) * 2) % numbers.length;
    
    return numbers[targetIndex];
}