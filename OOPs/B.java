public class B {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.userName);
        bankAccount.userName = "xyz";
        System.out.println(bankAccount.userName);

        // bankAccount.Password = "hshjak";//not accesible because it is pvt member
        bankAccount.setPassword("ABCS");
        
    }
}

class BankAccount {
    public String userName="ABC";
    private String Password;

    // default void setPassword(String pwd) {//Default methods are allowed only in interfaces.
        public void setPassword(String pwd){
        Password = pwd;
    }




}