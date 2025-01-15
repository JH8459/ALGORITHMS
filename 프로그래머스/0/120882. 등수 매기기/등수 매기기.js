function solution(score) {
    // 평균 점수와 원래 인덱스를 함께 저장
    const avgScoreWithIndex = score.map((scores, index) => ({
        avg: (scores[0] + scores[1]) / 2,
        index,
    }));

    // 평균 점수를 기준으로 내림차순 정렬
    avgScoreWithIndex.sort((a, b) => b.avg - a.avg);

    // 정렬된 순위에 따라 순위 계산
    const ranks = Array(score.length);
    let currentRank = 1;

    for (let i = 0; i < avgScoreWithIndex.length; i++) {
        if (i > 0 && avgScoreWithIndex[i].avg < avgScoreWithIndex[i - 1].avg) {
            currentRank = i + 1; // 현재 순위 업데이트
        }
        
        ranks[avgScoreWithIndex[i].index] = currentRank;
    }

    return ranks;
}