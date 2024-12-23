function solution(clothes) {
    const map = new Map();
    
    clothes.forEach(([name, type]) => {
        map.set(type, (map.get(type) || 0) + 1);
    });

    let combinations = 1;
    for (const count of map.values()) {
        combinations *= (count + 1);
    }

    return combinations - 1;
}