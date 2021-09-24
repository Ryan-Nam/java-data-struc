package Section_3_Stack_Queue;

import java.util.Stack;

public class Q3_Stack_Reverse {
    public static void main(String[] args) {
        // Reversing with API
        Stack<Character> stack = new Stack<Character>();
        String str = "Hello World?";

        // Write Here
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i)); // 'H', 'e', 'l' ......
        }

        //System.out.println(stack);

        String str_reverse = "";
        // many ways
       /* // 1. for loop
        for (int i = 0; i < str.length(); i++){
            str_reverse += stack.pop();
        }*/

        // 2. while loop
        while (!stack.isEmpty()){
            str_reverse += stack.pop();
        }
        System.out.println(str_reverse);

    }
}