function solution(arr, flag) {
    const answer = arr.reduce((acc, cur, index) => flag[index] ? [...acc, ...new Array(cur * 2).fill(cur)] : [...acc].slice(0, -cur), []);
    
    return answer;
}