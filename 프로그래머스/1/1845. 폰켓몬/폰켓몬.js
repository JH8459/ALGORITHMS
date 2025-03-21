function solution(nums) {
    // 중복을 허용하지 않는 Set 자료형 사용, num / 2 길이와 비교하여 리턴한다.
    return Math.min(new Set(nums).size, nums.length / 2);
}