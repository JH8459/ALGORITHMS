function solution(my_string) {
    const answer = my_string.trim().replace(/\s{2,}/gi, ' ').split(" ");
    
    return answer;
}