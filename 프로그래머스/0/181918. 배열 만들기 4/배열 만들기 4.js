function solution(arr) {
    const stk = [];
    let i = 0;
    
    while(i < arr.length) {
        if(!stk.length){
            stk.push(arr[i]);
            i++;
        } else {
            const lastItem = stk[stk.length - 1];
            
            if(lastItem < arr[i]){
                stk.push(arr[i]);
                i++;
            } else {
                stk.pop();
            }
        }
    }
    
    return stk;
}