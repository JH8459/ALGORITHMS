function solution(str1, str2) {
    const length = str1.length;
    let str = '';
    
    for(let i = 0; i < length; i++){
        str += str1[i];    
        str += str2[i];
    }
    
    return str;
}