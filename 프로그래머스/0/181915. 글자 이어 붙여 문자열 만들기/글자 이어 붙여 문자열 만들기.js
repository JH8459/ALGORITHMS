function solution(my_string, index_list) {
    let answer = "";
    
    index_list.map((index) => answer += my_string[index]);
                   
    return answer;
}