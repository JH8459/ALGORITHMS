function solution(sides) {
    const answer = sides.sort((a, b) => b - a);
    const isTriangle = answer[0] < answer[1] + answer[2];
    
    return isTriangle? 1 : 2;
}