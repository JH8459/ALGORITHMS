function solution(emergency) {
    const sortedEmergency = [...emergency].sort((a, b) => b - a);
    const rank = emergency.map((num) => sortedEmergency.indexOf(num) + 1);
    
    return rank;
}