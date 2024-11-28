function solution(arr) {
    let answer = 0;
    
    while(true){
        const now = convert(arr);
        
        if(arraysEqual(arr, now)){
            break;
        }
        
        arr = now;
        answer++;
    }
    
    return answer;
}

function convert(arr) {
    const answer = arr.map((num) => {
        if(!(num % 2) && num >= 50){
            return  num / 2;
        } else if(num % 2 && num < 50){
            return num * 2 + 1;
        } else {
            return num;
        }
    });
    
    return answer;
}

function arraysEqual(a, b) {
  if (a.length !== b.length) return false;
    
  for (let i = 0; i < a.length; i++) {
    if (a[i] !== b[i]) return false;
  }
    
  return true;
}