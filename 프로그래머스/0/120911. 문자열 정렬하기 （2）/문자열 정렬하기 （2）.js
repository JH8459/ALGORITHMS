function solution(my_string) {
    return [...my_string.toLowerCase()].sort((a, b) => a.charCodeAt() - b.charCodeAt()).join('');
    
}