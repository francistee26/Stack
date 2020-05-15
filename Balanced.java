import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Balanced {
    private String str;
    private final List<Character> leftBrackets 
            = Arrays.asList('[', '<', '{', '(');
    private List<Character> rightBrackets 
            = Arrays.asList(']', '>', '}', ')');

    public Balanced(String str) {
        this.str = str;
    }

    public boolean blanced() {
        Stack<Character> stack = new Stack<>();
        for(char item : str.toCharArray()){
            if(leftBrackets(item))
                stack.push(item);
            if(rightBrackets (item)){
                if(stack.empty()) return false;
                var top = stack.pop();
                if(!bracketsMatch (item,top)) return false;
            }
        }
        return stack.empty();
    }

    private boolean leftBrackets (char item) {
        return leftBrackets.contains(item); 

    }

    private boolean rightBrackets (char item) {
        return rightBrackets.contains(item);
    }

    private boolean bracketsMatch (char left, char right) {
        return  leftBrackets(left) == rightBrackets(right);
    }
    
    
}