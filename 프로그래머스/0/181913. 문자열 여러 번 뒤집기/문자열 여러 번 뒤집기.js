function solution(my_string, queries) {
    let idx = 0;
    
    while (idx < queries.length) {
        const query = queries[idx];
        const start = query[0];
        const end = query[1];
    
        const startStr = my_string.slice(0, start);
        const middleStr = my_string.slice(start, end + 1).split("").reverse().join("");
        const endStr = my_string.slice(end + 1);
        
        my_string = startStr + middleStr + endStr;
        
        idx++;
    }
    
    return my_string;
}