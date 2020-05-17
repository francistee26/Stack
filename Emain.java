public class Emain {
    public static void main(String[] args) {
        var ex = new Exercise2(4);
        ex.push(40);
        ex.push(10);
        ex.push(20);
        ex.push(5);
        ex.pop();
        System.out.println(ex.min());
        System.out.println(ex);
    }
}