package longtest;
import java.util.Scanner;

public class longtest {

    public static void main(String[] args) {
        /* 
            You are working on a tool that will help you manage your money better. You've divided your tool into two parts, the first part determining how much money you will have available to spend each day.
		
            This part of the tool was written so that it will retrieve information about you. Note that monetary values will allow for decimal values.
		*/
        Scanner reader = new Scanner(System.in);
        String ans = "";
        int days = 0;
        double allowance, expenses = 0, dailyBudget;
        
        System.out.println("Good day! Please enter the relevant information to calculate your average daily budget.");
        do{
            System.out.print("Do you receive a monthly or weekly allowance? ");
            ans = reader.nextLine();
            switch(ans){
                case "weekly":
                    days = 7;
                    break;
                case "monthly":
                    days = 30;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while(days == 0);
        
        System.out.printf("How much is the %s allowance you receive? ", ans);
        allowance = Double.parseDouble(reader.nextLine());
        
        System.out.print("Do you have regular daily expenses (y/n)? ");
        ans = reader.nextLine();
        if(ans == ("y")){
            System.out.print("How much are your daily expenses? ");
            expenses = Double.parseDouble(reader.nextLine());
        }
        dailyBudget = (allowance - expenses*days)/days;
        System.out.printf("You have P%.2f to spend each day.%n", dailyBudget);
    }
    
}
