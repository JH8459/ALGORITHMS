function solution(rny_string) {
    const answer = [...rny_string].map((str) => {
        if(str === 'm') return "rn";
        else return str;
    }).join('');
    
    return answer;
}