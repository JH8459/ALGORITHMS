function solution(num_list) {
    const multiply = num_list.reduce((acc, cur) => acc * cur, 1);
    const sumPow = num_list.reduce((acc, cur) => acc + cur, 0);
    
    return multiply < Math.pow(sumPow, 2) ? 1 : 0;
}