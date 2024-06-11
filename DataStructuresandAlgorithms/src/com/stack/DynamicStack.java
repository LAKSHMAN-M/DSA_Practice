package com.stack;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public Integer push(int value) throws Exception {
        if(isFull()){
            int[] temp = new int[length() * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(value);
    }
}
