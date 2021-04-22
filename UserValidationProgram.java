import java.util.regex.*;
import java.util.*;

class User {
      private String firstname;
      private String lastname;
      private String emailId;

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

       public String getEmailId() {
        return emailId;
      }

      public void setEmailId(String emailId) {
        this.emailId=emailId;
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

       public static boolean isValidEmailID(String emailId) {

        String pattern3="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";

        Pattern Q=Pattern.compile(pattern3);
        Matcher n=Q.matcher(emailId);
        return n.matches();
       }

      public static void main(String[] args) {
        User s=new User();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the FirstName: ");
        String name=sc.nextLine();

        System.out.println("Enter the LastName: ");
        String lname=sc.nextLine();

        System.out.println("Enter the EmailId: ");
        String Id=sc.nextLine();

        s.setFirstName(name);
        s.setLastName(lname);
        s.setEmailId(Id);

        System.out.println(s.getFirstName()+":"+isValidIname(s.getFirstName()));
        System.out.println(s.getLastName()+":"+isValidIIname(s.getLastName()));
        System.out.println(s.getEmailId()+":"+isValidEmailID(s.getEmailId())); 
      }
}
