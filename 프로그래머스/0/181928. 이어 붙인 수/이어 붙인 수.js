function solution(num_list) {
    const odd = num_list.filter((num) => num % 2).join("");
    const even = num_list.filter((num) => !(num % 2)).join("");
    
    return Number(odd) + Number(even);
}