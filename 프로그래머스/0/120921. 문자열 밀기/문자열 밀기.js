function solution(A, B) {
    // A를 오른쪽으로 회전하면서 비교
    for (let i = 0; i < A.length; i++) {
        if (A === B) return i;
        // A를 한 칸 오른쪽으로 회전
        A = A.slice(-1) + A.slice(0, -1);
    }

    // 끝까지 비교했는데도 같지 않으면 -1 반환
    return -1;
}