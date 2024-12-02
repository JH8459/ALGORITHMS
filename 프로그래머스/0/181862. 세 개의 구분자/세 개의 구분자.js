function solution(myStr) {
    const reg1 = /[a-c]/gi;
    const reg2 = /a{2,}/gi;
    
    const answer = myStr.replaceAll(reg1, 'a').replaceAll(reg2, 'a').split('a').filter((str) => str.length);
    
    return answer.length ? answer : ["EMPTY"];
}