function solution(prices) {
    const result = Array(prices.length).fill(0); // 각 초마다 가격이 유지된 기간을 저장
    const stack = []; // 가격이 떨어지지 않은 인덱스를 저장하는 스택

    // 1. 각 초의 가격을 순회하며 처리
    for (let currentTime = 0; currentTime < prices.length; currentTime++) {
        // 스택에 있는 인덱스와 현재 가격을 비교하여 가격이 떨어진 경우 처리
        while (stack.length > 0 && prices[stack[stack.length - 1]] > prices[currentTime]) {
            const previousTime = stack.pop(); // 스택에서 인덱스를 꺼냄
            result[previousTime] = currentTime - previousTime; // 유지된 기간 계산
        }

        // 현재 인덱스를 스택에 추가
        stack.push(currentTime);
    }
    
    // 2. 스택에 남아 있는 인덱스 처리 (끝까지 가격이 떨어지지 않은 경우)
    while (stack.length > 0) {
        const previousTime = stack.pop();
        result[previousTime] = prices.length - 1 - previousTime; // 끝까지 유지된 기간 계산
    }

    return result;
}