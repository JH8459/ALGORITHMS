function solution(food) {
    let answer = [];
    
    // 음식 배열을 순회하며 음식의 개수를 조정하여 문자열을 구성
    for (let i = 1; i < food.length; i++) {
        let count = Math.floor(food[i] / 2); // 짝수 개수만 사용
        answer.push(String(i).repeat(count)); // i를 count만큼 반복하여 추가
    }
    
    let leftSide = answer.join(''); // 왼쪽 부분 문자열 생성
    let rightSide = leftSide.split('').reverse().join(''); // 오른쪽 부분 (좌우대칭)
    
    return leftSide + '0' + rightSide; // 중앙에 '0'을 두고 합침
}