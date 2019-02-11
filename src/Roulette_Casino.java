import java.sql.Array;
import java.util.Scanner;

public class Roulette_Casino {
    public static void main(String[] args) {
        int counter_win=0;
        int counter_lost=0;
        int random1,random2;
        String input;
        String color1;
        int bet_amount;
        String choice;
        int total_balance=0;
        System.out.println("|____________________________|");
        System.out.println("|********WELLCOME_TO*********|");
        System.out.println("|*****ROULETTE CASINO GAME***|");
        System.out.println("|----------------------------|");

        System.out.println("|----------------------------|");
        System.out.println("|**Lets play some Roulette!**|");
        System.out.println("|----------------------------|");
        while (true){
            random1 = (int) (Math.random() * 36 + 1);
            //System.out.println(random1);
            random2=(int) (Math.random() * 2 + 1);
            if(random2==1){
                color1="black";
            }
            else{
                color1="red";
            }
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the type of bet you would like to place (red|black|even|odd|high|low): ");
            //System.out.println(random2);
            input=scanner.nextLine();
            switch(input){
                case "red":
                    System.out.println("Enter in your bet amount: ");
                    bet_amount=scanner.nextInt();
                    System.out.println("The ball landed on "+random1+" "+color1);
                    if(color1=="red"){
                        total_balance=total_balance+bet_amount;
                        System.out.println("Congratulations, you've won.");
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_win++;
                    }
                    else{
                        System.out.println("Sorry, you've lost this bet.");
                        total_balance=total_balance-bet_amount;
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_lost++;
                    }
                    break;
                case "black":
                    System.out.println("Enter in your bet amount: ");
                    bet_amount=scanner.nextInt();
                    System.out.println("The ball landed on "+random1+" "+color1);
                    if(color1=="black"){
                        total_balance=total_balance+bet_amount;
                        System.out.println("Congratulations, you've won.");
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_win++;
                    }
                    else{
                        System.out.println("Sorry, you've lost this bet.");
                        total_balance=total_balance-bet_amount;
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_lost++;
                    }
                    break;
                case "even":
                    System.out.println("Enter in your bet amount:");
                    bet_amount=scanner.nextInt();
                    System.out.println("The ball landed on "+random1+" "+color1);
                    if(random1%2==0){
                        total_balance=total_balance+bet_amount;
                        System.out.println("Congratulations, you've won.");
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_win++;
                    }
                    else{
                        System.out.println("Sorry, you've lost this bet.");
                        total_balance=total_balance-bet_amount;
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_lost++;
                    }
                    break;
                case "odd":
                    System.out.println("Enter in your bet amount:");
                    bet_amount=scanner.nextInt();
                    System.out.println("The ball landed on "+random1+" "+color1);
                    if(random1%2!=0){
                        total_balance=total_balance+bet_amount;
                        System.out.println("Congratulations, you've won.");
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_win++;
                    }
                    else{
                        System.out.println("Sorry, you've lost this bet.");
                        total_balance=total_balance-bet_amount;
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_lost++;
                    }
                    break;
                case "high":
                    System.out.println("Enter in your bet amount:");
                    bet_amount=scanner.nextInt();
                    System.out.println("The ball landed on "+random1+" "+color1);
                    if((random1>18)&&(random1<=36)){
                        total_balance=total_balance+bet_amount;
                        System.out.println("Congratulations, you've won.");
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_win++;
                    }
                    else{
                        System.out.println("Sorry, you've lost this bet.");
                        total_balance=total_balance-bet_amount;
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_lost++;
                    }
                    break;
                case "low":
                    System.out.println("Enter in your bet amount:");
                    bet_amount=scanner.nextInt();
                    System.out.println("The ball landed on "+random1+" "+color1);
                    if(random1<=18){

                        total_balance=total_balance+bet_amount;
                        System.out.println("Congratulations, you've won.");
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_win++;
                    }
                    else{
                        System.out.println("Sorry, you've lost this bet.");
                        total_balance=total_balance-bet_amount;
                        System.out.println("You currently have: "+"$"+(total_balance));
                        counter_lost++;
                    }
                    break;
                    default:
                        System.out.println("please enter the correct bet ..");
            }
            System.out.println("Would you like to play again (true|false)?");

            choice=scanner.next();
            if(choice.equalsIgnoreCase("false")){
                System.out.println("Thank you for playing!");
                System.out.println("This is how much money you have remaining: "+"$"+total_balance);
                System.out.println("You've won "+counter_win +" and lost "+counter_lost +" game(s)");
                System.exit(0);
            }
        }
    }
}
