import java.util.Arrays;

public class ArrayStack1 {
    private int[] items = new int[10];
    private int top1;
    private int top2;
    public void push(int item){
        
    public ArrayStack1(int capacity) {
                this.items = items;
                this.top1 = top1;
                this.top2 = top2;
            }
        if(count == items.length)
            throw new StackOverflowError();
        items[count] = item;
        count+=2; 
    }
    public void push2(int item){
        if(count1 == items.length/2)
            throw new StackOverflowError();
        items[count1] = item;
        count1+=2;
    }
    
    public int pop(){
        if(count == 0)
            throw new IllegalStateException();
        return items[--count];
    }

    public int peek(){
        if(count == 0)
            throw new IllegalStateException();
        return items[--count];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        var result = Arrays.copyOfRange(items, 0,count);
        return Arrays.toString(result);
    }

    // push
    // pop
    // peek
    // isEmpty
    // int[]
    
}