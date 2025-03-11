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
var middleNode = function(head) {
    let node = head, length = 1;
    
    while (node.next) {
        node = node.next;
        length++;
    }

    let middle = parseInt(length / 2);

    while(middle--){
        head = head.next;
    }

    return head;
};