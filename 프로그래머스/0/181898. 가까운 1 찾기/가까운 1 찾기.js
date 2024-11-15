function solution(arr, idx) {
    let answer = 0;
    for (let i = 0; i < arr.length; i++) {
        if (i >= idx && arr[i] == 1) {
            answer = i;
            break;
        } else {
            answer = -1;
        }
    }
    
    return answer;
}