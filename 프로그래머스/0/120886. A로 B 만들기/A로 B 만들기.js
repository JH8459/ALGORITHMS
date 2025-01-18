function solution(before, after) {
    const sortedBefore = [...before].sort().join('');
    const sortedAfter = [...after].sort().join('');
    
    return sortedBefore === sortedAfter ? 1 : 0;
}