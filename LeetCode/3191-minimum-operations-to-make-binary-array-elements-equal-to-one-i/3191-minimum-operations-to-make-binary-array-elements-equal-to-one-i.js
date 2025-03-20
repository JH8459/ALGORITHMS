/**
 * @param {number[]} nums
 * @return {number}
 */
var minOperations = function(nums) {
    let convertCnt = 0;
    let n = nums.length;

    for (let i = 0; i <= n - 3; i++) {
        if (nums[i] === 0) {
            // 현재 위치에서 3개를 반전
            for (let j = i; j < i + 3; j++) {
                nums[j] ^= 1;
            }
            convertCnt++;
        }
    }

    // 배열이 모두 1인지 확인
    return nums.every(num => num === 1) ? convertCnt : -1;
};