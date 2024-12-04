function solution(arr, k) {
    let answer = arr.reduce((list, num) => list.includes(num) ? list : [...list, num], []);

    if(answer.length >= k){
        answer = answer.slice(0, k);
    } else {
        while (answer.length < k) {
            answer.push(-1);
        }
    }
    
    return answer;
}