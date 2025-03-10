/**
 * @param {string} s
 * @return {number}
 */
var scoreOfString = function(s) {
    return [...s].reduce((acc, cur, idx, arr) => {
        if (idx > 0) {
            acc += Math.abs(cur.charCodeAt(0) - arr[idx - 1].charCodeAt(0));
        }
        return acc;
    }, 0);
};