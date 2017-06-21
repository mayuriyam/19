import java.io.*;
import java.util.*;
class facto
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
       int a=sc.nextInt();
       int fact=1;
       for(int i=1;i<=a;i++)
       {    
         fact=fact*i;    
        }   
       System.out.println(fact);
    }
}
