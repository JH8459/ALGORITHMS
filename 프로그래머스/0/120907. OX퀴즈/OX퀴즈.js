function solution(quiz) {
    const answer = quiz.map((str) => str.split(' ')).map((quizArr) => {
        const x = Number(quizArr[0]), y = Number(quizArr[2]), z = Number(quizArr[4]);
        const op = quizArr[1];
        const result = op === '+' ? x + y === z : x - y === z;
        
        return result ? "O" : "X";
    });
    
    return answer;
}