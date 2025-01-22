function solution(players, callings) {
    // 선수와 인덱스를 매핑한 Map 생성
    const playerIndexMap = new Map();
    
    players.forEach((player, index) => {
        playerIndexMap.set(player, index);
    });

    callings.forEach((overtakingPlayer) => {
        // 추월한 선수의 현재 IDX
        const overTakeIdx = playerIndexMap.get(overtakingPlayer);
        // 추월을 당한 선수의 현재 IDX
        const overTakenIdx = overTakeIdx - 1;
        // 추월당한 선수의 이름
        const overTakenPlayer = players[overTakenIdx];

        // 순위 변경
        [players[overTakenIdx], players[overTakeIdx]] = [players[overTakeIdx], players[overTakenIdx]];

        // Map의 인덱스 업데이트
        playerIndexMap.set(overtakingPlayer, overTakenIdx);
        playerIndexMap.set(overTakenPlayer, overTakeIdx);
    });

    return players;
}