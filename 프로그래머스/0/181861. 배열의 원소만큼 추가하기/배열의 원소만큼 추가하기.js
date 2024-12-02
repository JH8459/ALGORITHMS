function solution(arr) {
    const answer = arr.reduce((acc, cur) => [...acc, ...new Array(cur).fill(cur)], []);
    
    return answer;
}