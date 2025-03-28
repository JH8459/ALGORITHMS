function solution(n, slicer, num_list) {
    let answer = [];
    
    if(n === 1){
        answer = num_list.slice(0, slicer[1] + 1); 
    } else if(n === 2){
        answer = num_list.slice(slicer[0]); 
    } else if(n === 3){
        answer = num_list.slice(slicer[0], slicer[1] + 1); 
    } else {
        answer = num_list.slice(slicer[0], slicer[1] + 1);
        answer = answer.filter((num, idx) => !(idx % slicer[2]));
    }
    
    return answer;
}