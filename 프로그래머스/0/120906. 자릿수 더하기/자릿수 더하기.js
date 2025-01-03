function solution(n) {
    return [...n.toString()]
        .map((num) => Number(num))
        .reduce((acc, cur) => acc += cur);
}