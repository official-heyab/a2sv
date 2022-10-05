class Solution {
    public boolean isValid(String s) {
       
    Stack<Character> charStack = new Stack<Character>();
    for (char st : s.toCharArray()) {
      if (st == '(' || st == '{' || st == '[') {
        charStack.push(st);
      }
      else {
          if(charStack.empty()) {
            return false;
          }
          else{
            char top = charStack.peek();
            if(st == ')' && top == '(' || st == '}' && top == '{' || st == ']' && top == '['){
                    charStack.pop();
                }
            else{
                return false;
            }
        }
      }
    }

    if(charStack.empty())  return true;
    
    return false;
        
    }
}