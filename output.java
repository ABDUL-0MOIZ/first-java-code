public class output{
    public static void  main(String [] args){
int basicSalary=105000;
int drAlouns=basicSalary/100*40;//dearness allowance persentage value calculate
int rntAluns=basicSalary/100*20;
long grSalary=basicSalary + drAlouns+ rntAluns;
System.out.println("Gross Salary is: "+grSalary);
}
}