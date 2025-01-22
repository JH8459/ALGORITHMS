function solution(common) {
    // 등차수열인지 확인
    const diff = common[1] - common[0];
    const isArithmetic = common[2] - common[1] === diff;

    if (isArithmetic) {
        // 등차수열일 경우
        return common[common.length - 1] + diff;
    } else {
        // 등비수열일 경우
        const ratio = common[1] / common[0];
        return common[common.length - 1] * ratio;
    }
}