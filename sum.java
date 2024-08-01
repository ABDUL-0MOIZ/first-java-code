public class sum{
    public static void main(String []args){
        int no=123456;
        int temp=0;
        int result=0;

    while(no!=0)
    {
        temp=no%10;
        result +=temp;
        no /=10;


    }
    System.out.println(result);
    }}