import java.util.*;
class Solution {
    static boolean isSame(char a,char b)
    {
        if(a=='('||a==')'){return (b=='('||b==')');}
        if(a=='['||a==']'){return (b=='['||b==']');}
        return (b=='{'||b=='}');
    }
    static boolean isOpen(char a)
    {
        return (a=='{'||a=='('||a=='[');
    }
    public boolean isValid(String s) {
        Stack<Character> cmp= new Stack<Character>();  
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(cmp.empty()){
                char t=s.charAt(i);
                if(!isOpen(t)){return false;}
                cmp.push(t);
                continue;
            }
            char b=cmp.peek();
            char c=s.charAt(i);
            if(isSame(b,c))
            {
                if(isOpen(c)){cmp.push(c);}
                else{cmp.pop();}
                continue;
            }
            if(isOpen(c)){cmp.push(c);}else{return false;}
        }
        return cmp.empty()?true:false;
        
    }
}
