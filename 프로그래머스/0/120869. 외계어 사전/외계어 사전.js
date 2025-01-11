function solution(spell, dic) {
    // 특정 단어가 spell의 모든 문자를 포함하는지 확인하는 함수
    const doesWordContainAllSpellChars = (word) => {
        return spell.every((char) => word.includes(char));
    };
    
    // 사전에 spell의 모든 문자를 포함하는 단어가 있는지 확인
    const isSpellInDictionary = dic.some(doesWordContainAllSpellChars);
    
    // 조건에 따라 결과 반환
    return isSpellInDictionary ? 1 : 2;
}