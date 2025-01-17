function solution(chicken) {
    let serviceChicken = 0; // 받을 수 있는 서비스 치킨 수
    let coupons = chicken; // 현재 가지고 있는 쿠폰 수

    while (coupons >= 10) {
        let newChicken = Math.floor(coupons / 10); // 새로 받을 수 있는 치킨 수
        serviceChicken += newChicken; // 서비스 치킨 추가
        coupons = newChicken + (coupons % 10); // 남은 쿠폰 계산
    }

    return serviceChicken;
}
