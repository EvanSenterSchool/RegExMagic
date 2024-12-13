import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scan
        Scanner scan = new Scanner(System.in);
        String ssn = inputHelper.getRegExString(scan,"Please enter your Social Security Number (xxx-xx-xxxx)","\\d{3}-\\d{2}-\\d{4}");{
            System.out.println("Your SSN is :" + ssn);
        }
        String mNumber = inputHelper.getRegExString(scan,"Enter your student M number","(M|m)\\d{5}");{
            System.out.println("Your Student M Number is:" + mNumber);
        }
        String choice = inputHelper.getRegExString(scan,"Menu: O - Open  S - Save  V - View  Q - Quit ","[OoSsVvQq]");{
            System.out.println("You choose: " + choice );
        }
    }
}