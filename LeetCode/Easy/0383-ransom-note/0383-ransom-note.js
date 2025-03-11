/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    let letterCount = new Map();

    for (let char of magazine) {
        letterCount.set(char, (letterCount.get(char) || 0) + 1);
    }

    for (let char of ransomNote) {
        if (!letterCount.has(char) || letterCount.get(char) === 0) {
            return false;
        }

        letterCount.set(char, letterCount.get(char) - 1);
    }

    return true;
};