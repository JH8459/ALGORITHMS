function solution(people, limit) {
    // 몸무게를 오름차순 정렬
    people.sort((a, b) => a - b);

    let left = 0;  // 가장 가벼운 사람
    let right = people.length - 1;  // 가장 무거운 사람
    let boats = 0;

    while (left <= right) {
        // 두 사람이 함께 탈 수 있는 경우
        if (people[left] + people[right] <= limit) {
            left++;  // 가벼운 사람도 태움
        }
        
        right--;  // 무거운 사람은 반드시 태워야 함
        boats++;  // 보트 1대 추가
    }

    return boats;
}