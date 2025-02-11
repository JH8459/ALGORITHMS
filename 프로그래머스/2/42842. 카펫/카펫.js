function solution(brown, yellow) {
    const totalTiles = brown + yellow; // 전체 격자의 수

    // 가로 길이(width)가 세로 길이(height)보다 크거나 같으므로
    for (let width = Math.floor(totalTiles / 2); width >= 1; width--) {
        if (totalTiles % width === 0) {
            const height = totalTiles / width; // 세로 길이 계산
            
            // 갈색 격자의 개수가 조건을 만족하는지 확인
            const brownCount = 2 * (width + height) - 4; 
            const yellowCount = (width - 2) * (height - 2);

            if (brownCount === brown && yellowCount === yellow) {
                return [width, height];
            }
        }
    }
}