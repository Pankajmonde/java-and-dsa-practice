package oops;

class Account {
    public String name; //public access modifier allows the member to be accessed from any other class in the same package or different package. It is the most permissive access level.
    protected String email; //protected access modifier allows the member to be accessed from any other class in the same package or from a subclass in a different package. It is more restrictive than public but less restrictive than private.
    private String password; //private access modifier allows the member to be accessed only within the class in which it is declared. It is the most restrictive access level.

    // Getter and setter f

        public void setPassword(String password) {
            this.password = password;
        }
    
        public String getPassword() {
            return this.password;
        }
}
public class AcesssModi {
    public static void main(String[] args) {
        Account acc1=new Account();
        acc1.name="harry";
        acc1.email="harry@gmail.com";
        acc1.setPassword("12345");
        System.err.println("name: "+acc1.name);

    }
    
}
