import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int i,j,k,c=1;
      int n=in.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=n;j>i;j--)
        {
          System.out.print(" ");
        }
        for(k=1;k<=i;k++)
        {
          System.out.print(c);
            c++;
          System.out.print(" ");
        }
        System.out.print("\n");
      }
      
      
    	// Type your code here
    }    
}