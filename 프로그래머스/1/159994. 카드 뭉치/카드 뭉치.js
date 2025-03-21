function solution(cards1, cards2, goal) {
    let cards1Idx = 0, cards2Idx = 0;
    let answer = "Yes";
    
    for(const word of goal){
        if(cards1Idx < cards1.length && cards1[cards1Idx] === word) cards1Idx++;
        else if(cards2Idx < cards2.length && cards2[cards2Idx] === word) cards2Idx++;
        else {
            answer = "No";
            break;
        }
    }
    
    return answer;
}