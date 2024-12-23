function solution(phone_book) {
    const map = new Map();

    for (const phone of phone_book) {
        map.set(phone, true);
    }

    for (const phone of phone_book) {
        for (let i = 1; i < phone.length; i++) {
            const prefix = phone.slice(0, i);
            
            if (map.has(prefix)) {
                return false; 
            }
        }
    }

    return true;
}