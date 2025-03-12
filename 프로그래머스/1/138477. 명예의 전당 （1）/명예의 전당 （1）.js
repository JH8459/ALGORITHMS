// 우선순위 큐 구현
class MinHeap {
    constructor() {
        this.heap = [];
    }

    push(value) {
        this.heap.push(value);
        this.heap.sort((a, b) => a - b);
    }

    pop() {
        return this.heap.shift();
    }

    peek() {
        return this.heap[0];
    }

    size() {
        return this.heap.length;
    }
}

function solution(k, score) {
    const minHeap = new MinHeap();
    const answer = [];

    for (const dayScore of score) {
        if (minHeap.size() < k) {
            minHeap.push(dayScore);
        } else if (minHeap.peek() < dayScore) {
            minHeap.pop();
            minHeap.push(dayScore);
        }
        
        answer.push(minHeap.peek());
    }

    return answer;
}