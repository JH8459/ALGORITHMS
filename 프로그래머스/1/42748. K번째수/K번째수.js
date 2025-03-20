function solution(array, commands) {
    
    
    return commands.map((command) => 
        array
            .slice(command[0] - 1, command[1])  // i ~ j번째 숫자까지 자른다.
            .sort((a, b) => a - b)[command[2] - 1]  // 정렬 후 k번째 수를 반환한다.
    );
}