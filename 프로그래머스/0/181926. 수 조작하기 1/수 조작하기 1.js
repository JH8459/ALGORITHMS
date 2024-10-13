function solution(n, controls) {
    for(let i = 0; i < controls.length; i++){
        const control = controls.charAt(i);
        
        if(control === "w"){
            n += 1;
        } else if(control === "a"){
            n -= 10;
        } else if(control === "s"){
            n -= 1;
        } else {
            n += 10;
        }   
    }
    
    return n;
}