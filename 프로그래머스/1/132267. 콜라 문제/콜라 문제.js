function solution(a, b, n) {
    let totalCoke = 0; // 총 받은 콜라 개수
    let emptyBottles = n; // 현재 빈 병 개수

    while (emptyBottles >= a) {
        let newCoke = Math.floor(emptyBottles / a) * b; // 교환해서 받을 콜라 개수
        totalCoke += newCoke; // 총 콜라 개수 업데이트
        emptyBottles = emptyBottles % a + newCoke; // 남은 병 개수 갱신
    }

    return totalCoke;
}