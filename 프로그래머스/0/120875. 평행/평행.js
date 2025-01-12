function solution(dots) {
    // 두 점을 선택하여 기울기를 계산하는 함수
    const getSlope = ([x1, y1], [x2, y2]) => (y2 - y1) / (x2 - x1);
    // 네 점 중 두 점을 선택하는 모든 조합
    const pairs = [
        [dots[0], dots[1], dots[2], dots[3]],
        [dots[0], dots[2], dots[1], dots[3]],
        [dots[0], dots[3], dots[1], dots[2]]
    ];
    
    for (const [p1, p2, p3, p4] of pairs) {
        const slope1 = getSlope(p1, p2);
        const slope2 = getSlope(p3, p4);
        
        // 두 직선의 기울기가 같으면 평행
        if (slope1 === slope2) {
            return 1;
        }
    }
    
    return 0;
}