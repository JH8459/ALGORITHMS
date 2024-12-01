function solution(myString, pat) {
    const answer = [...myString].map((str) => {
        if(str === 'A'){
            return 'B';
        } else {
            return 'A';
        }
    }).join('').includes(pat);
    
    return Number(answer);
}