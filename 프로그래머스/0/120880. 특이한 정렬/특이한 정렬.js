function solution(numlist, n) {
    return numlist
        .sort((a, b) => {
            const gapA = Math.abs(n - a);
            const gapB = Math.abs(n - b);
        
            return gapA === gapB ? b - a : gapA - gapB;
        });
}