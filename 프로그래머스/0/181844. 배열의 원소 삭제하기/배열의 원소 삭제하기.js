function solution(arr, delete_list) {
    const answer = arr.filter((num) => !delete_list.includes(num));
    
    return answer;
}