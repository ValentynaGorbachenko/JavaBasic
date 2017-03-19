/**
 * Created by Valentynka on 3/18/17.
 */
public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, world!");
        int myNum = 12;
        String myName = "Valentyna";
        System.out.println("Hello, "+myName+"!");
        float f = 4.5f;
        Person newPerson = new Person("(650)302-7126");
        System.out.println(newPerson.phoneValidate(newPerson.phone));
    }
}
class Person{
    // primitive | protected | public
    public String phone;
    public boolean phoneValidate(String phone){
        String pattern = "\\(\\d{3}\\)\\d{3}\\-\\d{4}"; // (123)456-7890
        String pattern2 = "\\(\\d{3}\\)-\\d{3}\\-\\d{4}"; // (123)-456-7890
        String pattern3 = "\\d{10}"; // 1234567890
        String pattern4 = "\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"; // 123-456-7890 or 123.456.7890 or 123 456 7890
        System.out.println("This is from sout "+phone.matches(pattern));
        if (!phone.matches(pattern)){
            return true;
        } else if (phone.matches(pattern2)){
            return true;
        } else if (phone.matches(pattern3)){
            return true;
        } else if (phone.matches(pattern4)){
            return true;
        } else {
            return false;
        }
    };
    public Person (String personPhone){
        this.phone = personPhone;
    }
}