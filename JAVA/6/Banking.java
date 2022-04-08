public class Banking {
    public static void main(String [] args){
        Account a1 = new Account("Hugo","001",100);
        a1.deposit(995.5);
        a1.withdraw(800);
        System.out.println(a1);
    }
}
