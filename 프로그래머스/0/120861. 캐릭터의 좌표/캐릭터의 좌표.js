function solution(keyinput, board) {
    let x = 0, y = 0;
    
    const leftLimit = -Math.floor(board[0] / 2);
    const rightLimit = Math.floor(board[0] / 2);
    const downLimit = -Math.floor(board[1] / 2);
    const upLimit = Math.floor(board[1] / 2);
    
    keyinput.forEach((key) => {
        if(key === "left") x = Math.max(x - 1, leftLimit);
        else if(key === "right") x = Math.min(x + 1, rightLimit);
        else if(key === "down") y = Math.max(y - 1, downLimit);
        else y = Math.min(y + 1, upLimit);
    });
    
    return [x, y];
}