import java.util.Scanner;

public class cashier{
    public static void main(String [] args){
      Scanner scanner= new Scanner(System.in);
      System.out.println("Enter total cash:")
      int cash=scanner.nextInt();
      int chek100=cash/100;
      int remaning=cash%100;
      int check50=remaning/50;
       remaning=remaning%50;
      int check10=remaning/10;
      
      System.out.println("100 notes: "+chek100);
      System.out.println("50 notes: "+check50);
      System.out.println("10 notes:"+check10);

     scanner.close();
    }
}