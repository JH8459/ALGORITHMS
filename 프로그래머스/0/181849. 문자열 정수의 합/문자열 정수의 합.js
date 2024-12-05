function solution(num_str) {
    const answer = [...num_str].reduce((acc, cur) => acc += Number(cur), 0);
    return answer;
}