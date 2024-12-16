function solution(n) {
    const answer = Array.from(Array(n), () => Array(n).fill(0));
    
    const dr = [0, 1, 0, -1];
    const dc = [1, 0, -1, 0];
    
    let r = 0, c = 0, dirIdx = 0, num = 1;
    
    while(num <= n * n){
        answer[r][c] = num++;
        
        const nr = r + dr[dirIdx % 4];
        const nc = c + dc[dirIdx % 4];
        
        if(nr < 0 || n <= nr || nc < 0 || n <= nc || answer[nr][nc]){
            dirIdx += 1;
        }
        
        r = r + dr[dirIdx % 4];
        c = c + dc[dirIdx % 4];
    }
    
    return answer;
}