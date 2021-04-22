import java.util.regex.*;
import java.util.*;

class User {
      private String firstname;
      private String lastname;

      public String getFirstName() {
        return firstname;
      }

      public void setFirstName(String firstname) {
        this.firstname=firstname;
      }

       public String getLastName() {
        return lastname;
      }

      public void setLastName(String lastname) {
        this.lastname=lastname;
      }
}


public class UserValidationProgram {

      public static boolean isValidIname(String firstname) {

        String pattern1="^[A-Z]{1}[A-Z a-z]{2,}$";

        Pattern P=Pattern.compile(pattern1);
        Matcher m=P.matcher(firstname);
        return m.matches();
       }

       public static boolean isValidIIname(String lastname) {

        String pattern2="^[A-Z]{1}[A-Z a-z]{2,}$";

        Pattern Q=Pattern.compile(pattern2);
        Matcher n=Q.matcher(lastname);
        return n.matches();
       }


      public static void main(String[] args) {
        User s=new User();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the FirstName: ");
        String name=sc.nextLine();

        System.out.println("Enter the LastName: ");
        String lname=sc.nextLine();

        s.setFirstName(name);
        s.setLastName(lname);

        System.out.println(s.getFirstName()+":"+isValidIname(s.getFirstName()));
        System.out.println(s.getLastName()+":"+isValidIIname(s.getLastName()));
      }
}
