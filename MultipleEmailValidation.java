import java.util.regex.*;

public class MultipleEmailValidation {

     public static boolean isValidEmail(String email) {

         String pattern="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";

         Pattern S=Pattern.compile(pattern);
         Matcher p=S.matcher(email);
         System.out.println(email+"............. "+p.matches());
         return p.matches();
     }

     public static void main(String[] args) {

       isValidEmail("abc@yahoo.com");
       isValidEmail("abc-100@yahoo.com");
       isValidEmail("abc.100@yahoo.com");
       isValidEmail("abc111@abc.com");
       isValidEmail("abc-100@abc.net");
       isValidEmail("abc.100@abc.com.au");
       isValidEmail("abc@1.com");
       isValidEmail("abc+100@gmail.com");
       isValidEmail("abc@gmail.com.com");
       isValidEmail("abc+100@gmail.com");
       isValidEmail("abc@.com.my");
       isValidEmail("abc123@gmail.a");
       isValidEmail("abc123@.com");
       isValidEmail("abc123@.com.com");
       isValidEmail(".abc@abc.com");
       isValidEmail("abc()*@gmail.com");
       isValidEmail("abc@%*.com");
       isValidEmail("abc..2002@gmail.com");
       isValidEmail("abc.@gmail.com");
       isValidEmail("abc@abc@gmail.com");
       isValidEmail("abc@gmail.com.1a");
       isValidEmail("abc@gmail.com.aa.au");
    }
}
