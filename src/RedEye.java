import java.util.Scanner;

public class RedEye {
    static Boolean RedEye;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String answer="";
         while(true){
             System.out.println("ARE YOUR EYES RED?:press (YES|any_key)");
             answer=scanner.nextLine();
             if((answer.equalsIgnoreCase("y"))||(answer.equalsIgnoreCase("yes"))){
                 System.out.println("Get some sleep");
             }
             else{
                 System.out.println("you look great");
             }
             System.out.println("Do you want to try again? press (any_key) to continue Or(NO|n) to Exit");
             answer=scanner.nextLine();
             if((answer.equalsIgnoreCase("n"))||(answer.equalsIgnoreCase("no"))){
                 System.exit(0);
             }

         }
    }
}
