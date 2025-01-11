function solution(sides) {
    const [a, b] = sides.sort((a, b) => b - a);
    
    // CASE 1: a가 가장 긴 변일 경우
    const countCaseA = (a, b) => {
        let count = 0;
        for (let c = 1; c <= a; c++) {
            if (b + c > a) count++;
        }
        return count;
    };

    // CASE 2: c가 가장 긴 변일 경우
    const countCaseB = (a, b) => b - 1;

    return countCaseA(a, b) + countCaseB(a, b);
}