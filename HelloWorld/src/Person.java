/**
 * Created by Valentynka on 3/19/17.
 */
public class Person{
    // primitive | protected | public
    public String phone;
    public boolean phoneValidate(String phone){
        String pattern = "\\(\\d{3}\\)\\d{3}\\-\\d{4}"; // (123)456-7890
        String pattern2 = "\\(\\d{3}\\)-\\d{3}\\-\\d{4}"; // (123)-456-7890
        String pattern3 = "\\d{10}"; // 1234567890
        String pattern4 = "\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"; // 123-456-7890 or 123.456.7890 or 123 456 7890
        // System.out.println("This is from sout "+phone.matches(pattern));
        if (phone.matches(pattern)){
            return true;
        }
        else if (phone.matches(pattern2)) {
            return true;
        }
        else if (phone.matches(pattern3)) {
            return true;
        }
        else if (phone.matches(pattern4)) {
            return true;
        }
        else {
            return false;
        }
    };
    public Person (String personPhone){
        this.phone = personPhone;
    }
}