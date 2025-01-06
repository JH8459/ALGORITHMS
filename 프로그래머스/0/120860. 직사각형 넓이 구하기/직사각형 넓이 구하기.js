function solution(dots) {
    const xList = dots.map(dot => dot[0]);
    const yList = dots.map(dot => dot[1]);

    const width = Math.max(...xList) - Math.min(...xList);
    const height = Math.max(...yList) - Math.min(...yList);

    return width * height;
}