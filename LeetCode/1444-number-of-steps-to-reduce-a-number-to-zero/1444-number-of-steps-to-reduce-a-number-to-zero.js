/**
 * @param {number} num
 * @return {number}
 */
var numberOfSteps = function(num) {
    let step = 0;
    while (num > 0) {
        num = num % 2 === 0 ? num / 2 : num - 1;
        step++;
    }
    return step;
};