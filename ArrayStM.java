public class ArrayStM {
    public static void main(String[] args) {
        ArrayStack arrayS = new ArrayStack();
        arrayS.push(10); 
        arrayS.push(20); 
        arrayS.push(30); 
        arrayS.push(40); 
        arrayS.push(50);
        arrayS.pop();
        arrayS.pop();
        arrayS.pop();
        arrayS.pop();
        arrayS.pop();
        System.out.println(arrayS.isEmpty());

        
    }
}