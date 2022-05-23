class Solution {
    public boolean isValid(String s) {
        boolean result = false;
        Stack<Character> seq = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('|| s.charAt(i)=='[' || s.charAt(i)=='{'){
                seq.add(s.charAt(i));
                continue;
            }
           else{
               if(!seq.isEmpty()){
                   Character top = seq.peek();
                   Character input = s.charAt(i);
                   if(input == '}' && top=='{' ||
                      input == ')' && top=='('||
                      input == ']' && top== '['  )
                   {
                       seq.pop();
                
                   }
                  else{
                      return false;
                  }
               }else{
                   return false;
               }
           }    
            
            
        }
        return seq.isEmpty();
    }
}
