import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();
        for (int i =0;i<s.length();i++){
            if (s.charAt(i) == '('||s.charAt(i) == '['||s.charAt(i) == '{'){
                ans.push(s.charAt(i));
            }
            else if (s.charAt(i) == ']'||s.charAt(i) == '}'||s.charAt(i) == ')'){
                if(ans.isEmpty()){
                    return false;
                }else {
                    char popped = ans.pop();
                    if(s.charAt(i) == ')'){
                        if (popped != '('){
                            return false;
                        }
                    }else if(s.charAt(i) == '}'){
                        if (popped != '{'){
                            return false;
                        }
                    }else{
                        if (popped != '['){
                            return false;
                        }
                    }
                }
            }
    }return ans.isEmpty();}
}