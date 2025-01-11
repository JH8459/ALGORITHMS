function solution(n) {
    let answer = 0;
    let count = 0;

    while (count < n) {
        answer++;
        
        // 3의 배수이거나 숫자에 3이 포함되면 3x 마을 숫자가 아님
        if (answer % 3 === 0 || answer.toString().includes('3')) {
            continue;
        }
        
        count++;
    }

    return answer;
}