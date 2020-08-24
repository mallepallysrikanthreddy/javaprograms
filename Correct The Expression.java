import java.util.*;
import java.io.*;
class Main{
    public static void main (String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        String[]  s1 = str.split("=",0);
        //System.out.println(s1[1]);
        
        int n3 = Integer.parseInt(s1[1]);
        int index=0;
        int flag=0;
        char op=' ';
        
        for(int i=0;i<s1[0].length();i++){
            
            if(s1[0].charAt(i)=='+' || s1[0].charAt(i)=='-' || s1[0].charAt(i)=='*' || s1[0].charAt(i)=='/' || s1[0].charAt(i)=='%'){
                if(s1[0].charAt(i)=='+' || s1[0].charAt(i)=='-' || s1[0].charAt(i)=='*' || s1[0].charAt(i)=='/')
                {
                    index=i;
                    op=s1[0].charAt(i);
                }
                else
                    flag=1;
            }
        }
        if(flag==0){
            //System.out.println(index);
            //System.out.println(op);
            String op2;
            if(op=='+')
                op2="\\+";
            else if(op=='*')
                op2="\\*";
            else
                op2=String.valueOf(op);
            String[] s2 = s1[0].split(op2,6);
            
            int n1= Integer.parseInt(s2[0]),n2= Integer.parseInt(s2[1]);
            if(n1 + n2 == n3)
                op='+';
            else if(n1 - n2 == n3)
                op='-';
            else if(n1 * n2 == n3)
                op='*';
            else if(n1 / n2 == n3)
                op='/';
            System.out.print(n1);
            System.out.print(op);
            System.out.print(n2+"="+n3);
        }
        else if(flag==1)
            System.out.println("Invalid Input");
    }
}
