function solution(order) {
    const answer = [...order.toString()]
        .filter((number) => number === "3" || number === "6" || number === "9")
        .length;
    
    return answer;
}