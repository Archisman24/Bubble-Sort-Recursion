import java.util.*;
public class bubblesortRecursion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter 10 numbers to be stored in array:- ");
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        bubblesort(a,0);
        System.out.println("The new array is:-");
        for(i=0;i<10;i++)
        {System.out.print(a[i]+ " ");
        }
    }
    public static int bubblesort(int a[],int i)
    {
        if(i>9)
            return 0;
        else
            loop(a,i,0);
        return bubblesort(a,i+1);
    }
    public static int loop(int a[],int i,int j)
    {
        int t;
        if(j==9-i)
            return 0;
        else
        {
            if(a[j]>a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
        return loop(a,i,j+1);
    }
}
