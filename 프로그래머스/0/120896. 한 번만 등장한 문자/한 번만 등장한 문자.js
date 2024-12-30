function solution(s) {
    const frequency = [...s].reduce((map, char) => map.set(char, (map.get(char) || 0) + 1), new Map());
    
    return [...frequency]
        .filter(([char, count]) => count === 1)
        .map(([char]) => char)
        .sort()
        .join('');
}