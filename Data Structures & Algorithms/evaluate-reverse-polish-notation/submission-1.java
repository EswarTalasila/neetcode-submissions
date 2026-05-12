class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens) {
            if(!isOperator(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(applyOperator(a,b, token));
            }
        }

        return stack.pop();
    }

    public boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || 
               token.equals("*") || token.equals("/");
    }

    public int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;  // truncates toward zero automatically
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }
}
