import java.util.Random;
import java.util.Scanner;

public class cricket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first team Name:");
        String name = input.nextLine();
        System.out.println("Enter Second team Name:");
        String name2 = input.nextLine();
        Random random = new Random();

        {
            System.out.println("Enter second team captain toss(heads or tails):");
            String tos = input.nextLine();
            int toss = random.nextInt(2);
            if (toss == 0 && tos.equalsIgnoreCase("heads")) {
                System.out.println("heads comes " + name2 + " win the toss ");

            } else {
                System.out.println("tails comes " + name + " win the toss ");

            }

        }
        String[] team1 = new String[11];
        //to add team member of 1st team
        String[] team2 = new String[11];
        //to enter team member of second team
        {
            int n = 1, n2 = 1;
            for (int i = 0; i <= 10; i++) {

                System.out.print("Enter  player Name of team 1 : player" + n + " :");

                String player = input.next();
                team1[i] = player;
                n++;
            }
            for (int i = 0; i <= 10; i++) {

                System.out.print("Enter player Name  of team 2  " + n2 + " :");
                String player = input.next();
                team2[i] = player;
                n2++;

            }
        }


            String nam1;
            int ball1 = 0;
            int score1 = 0;
            int p1 = 0;
            int temp1 = 0;
            int temps1 = 0;
            int tempbal1 = 0;
            String out1 = "out";
            String[] Data1 = new String[11];
            for (int i = 1; i < 20; i++) {
                for (int j = 1; j <= 6; j++) {
                    int sc = random.nextInt(7);

                    if (sc == 5) {
                        if (p1 >= 11) {
                            break;
                        }
                        temps1 = score1 - temps1;
                        tempbal1 = ball1 - tempbal1;
                        float strick = ((float) temps1 / tempbal1) * 100;

                        nam1 = team1[p1] + "\t\t" + temps1 + "\t\t" + tempbal1 + "\t\t" + "\t\t" + strick + "\t\t" + out1;


                        Data1[p1] = nam1;

                        p1++;


                    }

                    score1 = temp1 + sc;
                    temp1 = score1;
                    ball1++;
                }


            }



                    String nam;
                    int ball = 0;
                    int score = 0;
                    int p = 0;
                    int temp = 0;
                    int temps = 0;
                    int tempbal = 0;
                    String out = "out";
                    String[] Data = new String[11];
                    for (int i = 1; i < 20; i++) {
                        for (int j = 1; j <= 6; j++) {
                            int sc = random.nextInt(7);

                            if (sc == 5) {
                                if (p >=11) {
                                    break;
                                }
                                temps = score - temps;
                                tempbal = ball - tempbal;
                                float strick = ((float) temps / tempbal) * 100;

                                nam = team2[p] + "\t\t" + temps + "\t\t" + tempbal + "\t\t" + "\t\t" + strick + "\t\t" + out;


                                Data[p] = nam;

                                p++;

                            }

                            score = temp + sc;
                            temp = score;
                            ball++;
                        }


                    }
           for (String s : Data1) {
            System.out.println(s);

        }
          System.out.println("total Score of team 1 is :"+score1+" : on : "+ball1);

         for (String s : Data) {
            System.out.println(s);

        }
         System.out.println("total Score of team 2 is :"+score+": on :"+ball);

      if(score1<score){
          System.out.println(name2+" wins the match");
      }
      else {
          System.out.println(name+" wins the match");
      }
    }


}

