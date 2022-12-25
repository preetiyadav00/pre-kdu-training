import java.util.*;


class prg1
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int a=s.length();
        int b=t.length();
        System.out.println("The length of the first string is " + a);
        System.out.println("The length of the second string is " + b);
        if(a==b)
        {
            System.out.println("The length of the two strings is the same");
        }
        else
        {
            System.out.println("The length of the two strings is not the same");
        }
        if(s==t)
        {
            System.out.print("Two strings are equal");
        }
        else
        {
            System.out.println("Two strings are not equal");
        }
        sc.close();
	}
}