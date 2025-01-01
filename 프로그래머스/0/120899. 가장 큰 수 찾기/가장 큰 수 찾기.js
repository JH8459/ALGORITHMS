function solution(array) {
    const sortArray = [...array].sort((a, b) => b - a);
    const index = array.findIndex((el) => el === sortArray[0]);
    
    return [sortArray[0], index];
}