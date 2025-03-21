function solution(participant, completion) {
    const participantMap = new Map();

  // 참가자 카운트 증가
  for (const name of participant) {
    participantMap.set(name, (participantMap.get(name) || 0) + 1);
  }

  // 완주자 카운트 감소
  for (const name of completion) {
    participantMap.set(name, participantMap.get(name) - 1);
  }

  // 카운트가 1로 남은 사람이 완주하지 못한 사람
  for (const [name, count] of participantMap.entries()) {
    if (count > 0) return name;
  }
}