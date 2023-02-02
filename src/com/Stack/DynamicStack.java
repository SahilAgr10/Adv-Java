package com.Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack(int size) {
        super(size);
    }

    public DynamicStack() {
        super();
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            int[] temp = new int[data.length*2];

            //System.arraycopy(data, 0, temp, 0, data.length); advance copy
            for(int i = 0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}
