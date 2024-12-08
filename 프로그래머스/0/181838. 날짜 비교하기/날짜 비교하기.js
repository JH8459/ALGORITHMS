function solution(date1, date2) {
    const answer = (date1[0] - date2[0]) * 100 + (date1[1] - date2[1]) * 10 + (date1[2] - date2[2]);
    
    return answer < 0 ? 1 : 0;
}