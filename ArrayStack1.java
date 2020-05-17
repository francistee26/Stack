import java.util.Arrays;

public class ArrayStack1 {
    private int[] items;
    private int top1;
    private int top2;
    
    public ArrayStack1(int capacity) {
        if(capacity <= 0)
            throw new IllegalArgumentException("Capacity must be 1 or greater");
        items = new int[capacity];
        this.top1 = -1;
        this.top2 = capacity;
    }

    public void push1(int item){
        if(isFull1())
            throw new IllegalStateException();
            items[++top1] = item; 
        }
        
    public void push2(int item){
         if(isFull2())
            throw new IllegalStateException();
            System.out.println("Capacity must 1 or greater");
        items[--top2] = item;
    }
    
    public int pop1(){
        if(isEmpty1())
            throw new IllegalStateException();
        return items[top1--];
    }

    public int pop2(){
        if(isEmpty2())
            throw new IllegalStateException();
        return items[top2++];
    }

    public int peek1(){
        if(isEmpty1())
            throw new IllegalStateException();
        return items[top1];
    }

    public int peek2(){
        if(isEmpty2())
            throw new IllegalStateException();
        return items[top2];
    }

    public boolean isEmpty1(){
        return top1 == -1;
    }

    public boolean isEmpty2(){
        return top2 == items.length;
    }

    public boolean isFull1(){
        return top1+1 == top2;
    }
    public boolean isFull2(){
        return top2-1 == top1;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }

    // push
    // pop
    // peek
    // isEmpty
    // int[]
    
}