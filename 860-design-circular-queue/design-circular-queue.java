class MyCircularQueue {
    int arr[],c,ms,hd;
    public MyCircularQueue(int k) {
        arr=new int[k];
        c=0;
        ms=k;
        hd=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        arr[(hd+c)%ms]=value;
        c=c+1;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        hd=(hd+1)%ms;
        c-=1;
        return true;
    }
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[hd];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[(hd+c-1)%ms];
    }
    
    public boolean isEmpty() {
        return c==0;
    }
    
    public boolean isFull() {
        return c==ms;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */