import java.util.Stack;

public class Reverse {
    private String str;
    public Reverse(String str) {
        this.str = str;
    }

    public String reverse(){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray())
            stack.push(ch);
        
        StringBuffer bStr = new StringBuffer();
        while(!stack.empty()){
            bStr.append(stack.pop());
        }
        return bStr.toString();
    }
    
}