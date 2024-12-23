function solution(nums) {
    const maxSelect = nums.length / 2;
    const uniqueNums = new Map();
    
    nums.forEach((num) => uniqueNums.set(num ,true));
    
    return Math.min(uniqueNums.size, maxSelect);
}