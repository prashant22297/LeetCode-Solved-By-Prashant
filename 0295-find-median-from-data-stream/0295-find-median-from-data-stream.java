class MedianFinder {
    ArrayList<Integer> number;
    public MedianFinder() {
        number = new ArrayList<>();
        
    }
    
    public void addNum(int num) {
        int index = Collections.binarySearch(number, num);
        if (index < 0) {
            index = -index - 1;
        }
        number.add(index, num);
    }
    
    public double findMedian() {
        int length = number.size();
        if(length%2==0){
            return (number.get(length/2)+number.get((length/2)-1))/2.0;
        }
        else{
            return (double)number.get(length/2);
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */