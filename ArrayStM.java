public class ArrayStM {
    public static void main(String[] args) {
        ArrayStack1 arrayS = new ArrayStack1(4);
        
        arrayS.push1(10); 
        arrayS.pop1();
        arrayS.push2(20); 
        arrayS.pop2();
        arrayS.push1(30); 
        arrayS.push2(40); 
       
        System.out.println(arrayS.peek1());
        System.out.println(arrayS.peek2());
        // arrayS.pop();
        // arrayS.pop();
        System.out.println(arrayS);

        
    }
}