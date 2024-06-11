package com.stack;

public class DynamicQueue extends CustomQueue{
    public DynamicQueue() {
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean offer(int val) {
        if(isFull()){
            int temp[] = new int[length() * 2];
            for (int i = 0; i < length(); i++) {
                temp[i] = this.data[i];
            }
            this.data = temp;
        }
        return super.offer(val);
    }
}
