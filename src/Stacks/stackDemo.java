package Stacks;
import java.util.Scanner;
class stack
{
    private int maxSize;
    private int top;
    private long []stackArray;
    public stack(int s)
    {
        maxSize=s;
        stackArray=new long[maxSize];
        top=-1;
    }
    public void push(long j)
    {

        stackArray[++top]=j;
    }
    public long pop()
    {

        return stackArray[top--];
    }
    public boolean isEmpty()
    {

        return (top==-1);
    }
    public boolean isFull()
    {

        return (top==maxSize-1);
    }

}
public class stackDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack st=new stack(10);

         st.push(20);
         st.push(40);
         st.push(60);
         st.push(80);

         while (!st.isEmpty())
         {
             long value =st.pop();
             System.out.print(value);
             System.out.print(" ");
         }
        System.out.println("");
    }
}
