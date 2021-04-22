import java.util.regex.*;
import java.util.*;

class User {
      private String firstname;

      public String getFirstName() {
        return firstname;
      }

      public void setFirstName(String firstname) {
        this.firstname=firstname;
      }
}


public class UserValidationProgram {

      public static boolean isValidUser(String firstname) {

        String pattern1="^[A-Z]{1}[A-Z a-z]{2,}$";

        Pattern P=Pattern.compile(pattern1);
        Matcher m=P.matcher(firstname);
        return m.matches();
       }

      public static void main(String[] args) {
        User s=new User();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the FirstName: ");
        String name=sc.nextLine();


        s.setFirstName(name);

        System.out.println(s.getFirstName()+":"+isValidUser(s.getFirstName()));

      }
}
