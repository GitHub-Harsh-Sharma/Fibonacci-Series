import java.io.*;
class Fabonic
{
    public static void main(String args[])throws IOException
    {   
        int i,a=0,b=1;
        for(i=1;i<=13;i++)
        {
            System.out.println(a);
            a=a+b;
            b=a-b;
        }
    }
}