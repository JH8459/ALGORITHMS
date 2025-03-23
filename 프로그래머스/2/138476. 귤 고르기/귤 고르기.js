function solution(k, tangerine) {
    const sizeCountMap = new Map();

    // 각 귤 크기별 개수를 센다
    for (const size of tangerine) {
        sizeCountMap.set(size, (sizeCountMap.get(size) || 0) + 1);
    }

    // 개수 기준으로 내림차순 정렬
    const sortedByCount = [...sizeCountMap.entries()].sort(([, a], [, b]) => b - a);

    let total = 0;
    let types = 0;

    for (const [size, count] of sortedByCount) {
        total += count;
        types++;
        
        if (total >= k) break;
    }

    return types;
}