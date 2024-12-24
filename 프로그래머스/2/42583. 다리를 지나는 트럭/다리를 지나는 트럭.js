function solution(bridge_length, weight, truck_weights) {
    let time = 0; // 경과 시간
    let bridge = Array(bridge_length).fill(0); // 다리 위 트럭 상태 (길이를 bridge_length로 초기화)
    let totalWeight = 0; // 다리 위 트럭의 총 무게

    while (truck_weights.length > 0 || totalWeight > 0) {
        time++; // 시간 경과

        // 다리에서 트럭 이동 (맨 앞의 트럭이 다리를 건너면 제거)
        totalWeight -= bridge.shift();

        // 대기 트럭이 다리에 올라갈 수 있는지 확인
        if (truck_weights.length > 0) {
            if (totalWeight + truck_weights[0] <= weight) {
                const truck = truck_weights.shift(); // 대기 트럭 중 가장 앞의 트럭
                bridge.push(truck); // 다리 위로 이동
                totalWeight += truck; // 다리 위 총 무게 갱신
            } else {
                bridge.push(0); // 트럭이 올라갈 수 없으면 빈 공간 유지
            }
        }
    }

    return time;
}