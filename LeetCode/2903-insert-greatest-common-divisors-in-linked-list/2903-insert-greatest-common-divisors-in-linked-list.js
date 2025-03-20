/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var insertGreatestCommonDivisors = function(head) {
    let list = head

    while (list) {
        const next = list.next

        if(!next) break;

        const nowVal = list.val
        const nextVal = next.val

        const gcdVal = nowVal > nextVal ? gcd(nowVal, nextVal) : gcd(nextVal, nowVal)

        list.next = new ListNode(gcdVal, next)
        list = next
    }

    return head
};

const gcd = (a, b) => {
    if (a % b === 0) {
        return b
    }

    return gcd(b, a % b)
}