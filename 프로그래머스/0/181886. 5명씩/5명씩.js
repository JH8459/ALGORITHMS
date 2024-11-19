function solution(names) {
    const answer = names.filter((name, idx) => {
        if(!(idx % 5)) return name;
    })
    
    return answer;
}