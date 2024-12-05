function solution(rank, attendance) {
    const answer = rank.map((num, idx) => {
        if(attendance[idx]) return { num, idx };
        else return { num: 0, idx };
    }).filter((el) => el.num).sort((a, b) => a.num - b.num);
    
    return answer[0].idx * 10000 + answer[1].idx * 100 + answer[2].idx;
}