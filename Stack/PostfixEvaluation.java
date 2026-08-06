import java.util.*;

public class PostfixEvaluation {
    static int precedence(char ch){
        if(ch=='*' || ch=='/')
            return 2;
        if(ch=='+' || ch=='-')
            return 1;
        return -1;
    }

    static String infixToPostfix(String s){
        String output = "";
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                output = output + ch;
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.empty() && stack.peek()!='('){
                    output = output + stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.empty() && precedence(ch)<=precedence(stack.peek())){
                    output = output + stack.peek();
                    stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.empty()){
            output = output + stack.peek();
            stack.pop();
        }
        return output;
    }
    public static int evalPostfix(String s){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
                stack.push(ch-'0');
            else {
                int v1 = stack.pop();
                int v2 = stack.pop();
                switch(ch){
                    case '+': stack.push(v2+v1); break;
                    case '-': stack.push(v2-v1); break;
                    case '*': stack.push(v2*v1); break;
                    case '/': stack.push(v2/v1); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args)
    {
        System.out.println(evalPostfix(infixToPostfix("2+3"))); // 5
        System.out.println(evalPostfix("23*4+"));   // 10
        System.out.println(evalPostfix("52-3*"));   // 9
    }

}
