function solution(my_string) {
    const str = my_string.split(' ');
    const answer = str.reduce((acc, cur, index) => {
        if(cur === '+'){
            acc += Number(str[index + 1]);
        } else if(cur === '-') {
            acc -= Number(str[index + 1]);
        } 
        
        return acc;
    }, Number(str[0]));
    
    return answer;
}