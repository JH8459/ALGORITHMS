function solution(todo_list, finished) {
    const answer = todo_list.filter((todo, index) => {
        if(!finished[index]) return todo;
    });
    
    return answer;
}