function solution(rsp) {
    const answer = [...rsp].map((el) => {
        if(el === "2"){
            return 0;
        } else if(el === "0"){
            return 5;
        } else {
            return 2;
        }
    });
    
    return answer.join('');
}