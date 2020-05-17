import java.util.Arrays;

public class Exercise2 {
    private int min;
    private int prevMin;
    private int[] items;
    private int count;
    private int index;

    public Exercise2(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("Capacity must be 1 or grater");
        items = new int[capacity];
        this.min = 0;
        this.prevMin = 0;
        this.count = 0;
        this.index = 0;
    }

    public void push(int item) {
        if (count == items.length)
            throw new StackOverflowError("Stack is full");
        items[count++] = item;
        findMin(item);
    }

    private void findMin(int item) {
        if (count - 1 == 0)
            min = items[index];
        if (min > item){
            prevMin = min;
            min = item;
        }
    }

    public int pop() {
        if (items.length == 0)
            throw new IllegalStateException("Change Stack state");
        if (items[--count] == min)
            min = prevMin;
        return items[count];

    }

    public int min() {
        return min;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

}