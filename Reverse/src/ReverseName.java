import java.util.Scanner;
public class ReverseName {
    
    public ReverseName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        String backwards = "";
        for (int i = name.length() - 1; i >= 0; i --) // i am grabbing every character
        {
            backwards += name.charAt(i);
        }
        scan.close();
        System.out.println(backwards);
    }
    
    public static void main(String[] args) {
        new ReverseName();
    }

}