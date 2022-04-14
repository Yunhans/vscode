public class Account{

    private String name;
    private String acctNo;
    private double balance;

    public void setName(String a){
        name = a;
    }
    public String getName(){
        return name;
    }
    public void setAcctNo(String a){
        acctNo = a;
    }
    public String getAcctNo(){
        return acctNo;
    }
    public void setBalance(double a){
        balance = a;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double a){
        if(a >= 0){ balance+=a; }
    }

    public void withdraw(double a){
        if(a>=0 && a<=balance){ balance-=a; }
    }

    public Account(String name, String acctNo, double balance){
        setName(name);
        setAcctNo(acctNo);
        setBalance(balance);
    }

    public String toString(){
        return "Name: "+name+" Account number: "+acctNo+" Your current balance: "+balance;
    }

}
