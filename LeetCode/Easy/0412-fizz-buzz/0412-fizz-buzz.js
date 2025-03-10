/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {
    return Array.from({ length: n }, (_, i) => {
        const num = i + 1;
        let result = '';

        if (num % 3 === 0) result += 'Fizz';
        if (num % 5 === 0) result += 'Buzz';

        return result || num.toString();
    });
};