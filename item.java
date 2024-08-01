import java.util.Scanner;
public class item{
    public static void main(String [] args){
 Scanner scanner=new Scanner(System.in);
 System.out.println("Enter total price")
 double totalprice=scanner.nextDouble();

 double profit=totalprice/100*20;
 double costtotal=totalprice-profit;
 double costitem=costtotal/15;
 System.out.println("cost on one item is : "+costitem);
    }
}