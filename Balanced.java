import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Balanced {
    private String str;
    private final List<Character> leftBrackets 
            = Arrays.asList('[', '<', '{', '(');
    private final List<Character> rightBrackets 
            = Arrays.asList(']', '>', '}', ')');

    public Balanced(String str) {
        this.str = str;
    }

    public boolean blanced() {
        Stack<Character> stack = new Stack<>();
        for(char item : str.toCharArray()){
            if(isLeftBrackets(item))
                stack.push(item);
            if(isRightBrackets (item)){
                if(stack.empty()) return false;

                var top = stack.pop();
                if(!bracketsMatch (top,item)) return false;
            }
        }
        return stack.empty();
    }

    private boolean isLeftBrackets (char item) {
        return leftBrackets.contains(item); 

    }

    private boolean isRightBrackets (char item) {
        return rightBrackets.contains(item);
    }

    private boolean bracketsMatch (char left, char right) {
        return  leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
    
    
}