public class people{
    public static void main(String [] args){
        long persentagemen=52;
        long population=80000;
        long letarcy=48;
         long letratemen=35;
        long totalmen=80000/100*persentagemen;

       long totalwomen=80000-totalmen;
       long totalletarcy=80000/100*letarcy;
    long totalletarmen=80000/100*letratemen;
            long totalletrWoomen=totalletarcy-totalletarmen;
            long totlilltratMen=totalmen-totalletarmen;
            long totalIltelWomen=totalwomen-totalletrWoomen;
            System.out.println("total iletrate men is:"+totlilltratMen);
            System.out.println("totalilletrate women :"+totalIltelWomen);

    }
}