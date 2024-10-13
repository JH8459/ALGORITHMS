function solution(num_list) {
    const length = num_list.length;
    const lastItem = num_list[length - 1];
    const lastBeforeItem = num_list[length - 2];
    
    if(lastItem > lastBeforeItem){
        num_list.push(lastItem - lastBeforeItem);
    } else {
        num_list.push(lastItem * 2);
    }
    
    return num_list;
}