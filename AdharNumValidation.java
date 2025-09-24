import java.util.*;
import java.util.regex.*;
public class AdharNumValidation {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Adhar Number");
        String str=sc.nextLine();

        Pattern pt=Pattern.compile("^[0-9]{4}[ _]?[0-9]{4}[ _]?[0-9]{4}$");
        Matcher mt=pt.matcher(str);

        String Ans=mt.matches()?"AdharValid":"AdharInvalid";
        System.out.println(Ans);

    }
}
