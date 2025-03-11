function solution(s) {
    let conversionCount = 0;
    let zeroRemovalCount = 0;

    while (s !== "1") {
        const zeroCount = s.split('1').join('').length;
        zeroRemovalCount += zeroCount;
        
        s = (s.length - zeroCount).toString(2);
        conversionCount++;
    }

    return [conversionCount, zeroRemovalCount];
}