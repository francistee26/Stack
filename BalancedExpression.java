public class BalancedExpression {
    public static void main(String[] args) {
        String str = "[<1 + 2>";
        var balanced = new Balanced(str);
        System.out.println(balanced.blanced());
    }
}