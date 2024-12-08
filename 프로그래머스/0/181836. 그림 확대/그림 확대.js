function solution(picture, k) {
    return picture.flatMap((row) => 
        Array(k).fill([...row].map(char => char.repeat(k)).join(''))
    );
}