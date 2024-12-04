function solution(arr) {
    const powerArrLength = getPowerNum(arr.length);
    
    while(arr.length < powerArrLength){
        arr.push(0);
    }
    
    return arr;
}

const getPowerNum = (num) => {
    while(num & (num - 1)){
        num++;
    }
    
    return num;
}