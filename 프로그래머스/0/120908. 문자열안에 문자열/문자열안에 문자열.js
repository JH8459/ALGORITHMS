function solution(str1, str2) {
    const isInclude = str1.includes(str2);
    
    return isInclude ? 1 : 2;
}