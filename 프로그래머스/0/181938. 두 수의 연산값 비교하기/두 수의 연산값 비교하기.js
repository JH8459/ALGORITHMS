function solution(a, b) {
    const ab = a.toString() + b.toString();
    const ab2 = 2 * a * b;
    
    return +ab >= +ab2 ? +ab : +ab2;
}