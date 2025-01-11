function solution(board) {
    const markDangerZone = (i, j) => {
        const directions = [
            [0, -1], [0, 1],    // 좌우
            [-1, 0], [1, 0],    // 상하
            [-1, -1], [-1, 1],  // 좌상, 우상
            [1, -1], [1, 1]     // 좌하, 우하
        ];

        for (const [dx, dy] of directions) {
            const newX = i + dx;
            const newY = j + dy;

            if (newX >= 0 && newX < board.length && newY >= 0 && newY < board[i].length) {
                if (board[newX][newY] === 0) {
                    board[newX][newY] = 2; // 위험 구역으로 표시
                }
            }
        }
    };

    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[i].length; j++) {
            if (board[i][j] === 1) {
                markDangerZone(i, j);
            }
        }
    }

    const countSafeZones = () => {
        return board.reduce((total, row) => {
            return total + row.reduce((count, cell) => {
                return cell === 0 ? count + 1 : count;
            }, 0);
        }, 0);
    };

    return countSafeZones();
}