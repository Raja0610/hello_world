import java.util.*;

public class Main
{
    public static void printReverse(String str)
    {
        if(str.length()==0)
        {
            return;
        }
        else{
            String smallStr=str.substring(1);
            printReverse(smallStr);
            System.out.print(str.charAt(0));
            return;
        }
    }
    
    public static int firstOccurence(String str,char x)
    {
        if(str.length()==0)
        {
            return -1;
        }
        if(str.charAt(0)==x)
        {
            return 0;
        }
        else{
            String smallStr=str.substring(1);
            int result=firstOccurence(smallStr,x);
            if(result==-1)
            {
                return -1;
            }
            else{
               return result+1;
            }
        }
    }
    
    public static int lastOccurence(String str,char value)
    {
        if(str.length()==1)
        {
            return -1;
        }
        else{
            String smallStr=str.substring(1);
            int result=lastOccurence(smallStr,value);
            if(result!=-1)
            {
                result+=1;
                return result;
            }
            if(result==-1&&str.charAt(0)==value)
            {
                return 0;
            }
            return result;
        }
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char value;
		value=sc.next().charAt(0);
		//printReverse(s);
		System.out.println(firstOccurence(s,value));
		System.out.println(lastOccurence(s,value));
	}
}
