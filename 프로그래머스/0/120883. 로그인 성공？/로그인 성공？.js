function solution(id_pw, db) {
    const [inputId, inputPw] = id_pw; // 입력된 아이디와 비밀번호 분리

    for (const [dbId, dbPw] of db) {
        if (dbId === inputId) { // 아이디가 일치하는지 확인
            if (dbPw === inputPw) { // 비밀번호가 일치하는지 확인
                return "login"; // 아이디와 비밀번호가 모두 일치
            } else {
                return "wrong pw"; // 아이디는 일치하지만 비밀번호가 틀림
            }
        }
    }

    return "fail"; // 아이디가 일치하지 않음
}
