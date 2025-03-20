/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function (accounts) {
    const sumByAccounts = accounts.map((account) => {
        return account.reduce((acc, cur) => acc += cur, 0);
    })

    return Math.max(...sumByAccounts);
};