function solution(my_string) {
    const numArr = my_string
        .replace(/[a-z]/ig, ' ')
        .split(/\s+/)
        .map(Number);
    
    return numArr.reduce((acc, cur) => acc += cur, 0);
}