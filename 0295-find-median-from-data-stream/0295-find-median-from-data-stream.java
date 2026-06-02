class MedianFinder {
    PriorityQueue<Integer> small =new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> large =new PriorityQueue<>();
    public MedianFinder() {

    }

    public void addNum(int num) {
        small.add(num);
        large.add(small.remove());
        if (large.size() > small.size()) {
            small.add(large.remove());
        }
    }

    public double findMedian() {
        if (small.size() > large.size()) {
            return small.peek();
        }
        return (small.peek() + large.peek()) / 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */