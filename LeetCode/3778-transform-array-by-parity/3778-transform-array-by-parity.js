/**
 * @param {number[]} nums
 * @return {number[]}
 */
var transformArray = function(nums) {
    return nums.map((num) => num % 2).sort((a, b) => a - b);
};