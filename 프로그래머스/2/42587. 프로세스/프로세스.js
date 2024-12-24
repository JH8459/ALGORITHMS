function solution(priorities, location) {
    let answer = 0;
    // 우선 순위에 매칭되는 1 ~ priorities 배열의 길이만큼의 문서 배열 생성
    const document = Array.from({ length: priorities.length }, (v, i) => i + 1);
    // 삭제할 타겟 문서 선언
    const target = document[location];
    
    while(document.includes(target)){
        const max = Math.max(...priorities);
        
        if(priorities[0] === max) {
            priorities.shift();
            document.shift();
            answer++;
        }
        else {
            priorities.push(priorities.shift());
            document.push(document.shift());
        }
    }
    
    return answer;
}