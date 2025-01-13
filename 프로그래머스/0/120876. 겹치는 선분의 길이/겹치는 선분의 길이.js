function solution(lines) {
    // 좌표의 최소값과 최대값 계산
    const minCoord = Math.min(...lines.map(line => line[0]));
    const maxCoord = Math.max(...lines.map(line => line[1]));
    
    // 좌표를 담을 배열 생성 (모든 범위를 0으로 초기화)
    const coordCounts = new Array(maxCoord - minCoord).fill(0);
    
    // 각 선분의 범위를 좌표 리스트에 반영
    lines.forEach(([start, end]) => {
        for (let i = start; i < end; i++) {
            coordCounts[i - minCoord]++;
        }
    });

    // 두 개 이상의 선분이 겹친 부분의 길이를 계산
    const overlapLength = coordCounts.filter(count => count > 1).length;
    
    return overlapLength;
}