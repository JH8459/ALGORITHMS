function solution(code) {
    let mode = false;
    let ret = '';
    
    for(let i = 0; i < code.length; i++){
        const ch = code.charAt(i);
        
        if(ch === "1"){
            // code[idx] = "1"이면, mode 반전
            mode = !mode;
        } else {
            // code[idx]가 "1"이 아니면, 현재 mode에 따라 로직 수행
            if(mode){
                // mode가 1이라면, idx가 홀수일 때 ret의 맨 뒤에 code[idx]를 추가한다.
                if(i % 2){
                    ret += ch;
                }
            } else {
                // mode가 0이라면, idx가 짝수일 때 ret의 맨 뒤에 code[idx]를 추가한다.
                if(!(i % 2)){
                    ret += ch;
                }
            }
        }
    }
    
    return ret.length ? ret : "EMPTY";
}