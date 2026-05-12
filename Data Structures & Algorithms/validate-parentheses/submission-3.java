class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for(char ch : arr) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(ch == ')' && top != '(') return false;
                if(ch == ']' && top != '[') return false;
                if(ch == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }
        
    
}
