import java.util.Scanner;
class Main {
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  int num=n;
    int temp=1;
    int count=0;
    while(n!=0)
    {
      n=n/10;
      count++;
    }
    while(temp<(count-1))
    {
      num=num/10;
     temp++;
    }
    num=num%10;
    System.out.println(num);
  }
}
    
  