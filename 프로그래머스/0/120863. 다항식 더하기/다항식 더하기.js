function solution(polynomial) {
    const terms = polynomial.split(' ');

    let xCoefficient = 0;
    let constantSum = 0;

    terms.forEach((term) => {
        if (term.includes('x')) {
            const coefficientMatch = term.match(/\d+/);
            xCoefficient += coefficientMatch ? Number(coefficientMatch[0]) : 1; // 숫자가 없으면 계수는 1
        } else if (term !== '+') {
            constantSum += Number(term);
        }
    });

    let result = [];

    if (xCoefficient > 0) result.push(xCoefficient === 1 ? 'x' : `${xCoefficient}x`);
    if (constantSum > 0) result.push(`${constantSum}`);

    return result.join(' + ');
}