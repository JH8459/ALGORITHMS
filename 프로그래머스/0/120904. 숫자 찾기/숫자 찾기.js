function solution(num, k) {
    const index = [...num.toString()].indexOf(k.toString());
    
    return index >= 0 ? index + 1 : index;
}