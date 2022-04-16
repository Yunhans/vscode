public class Ticket {
    private int price=10;
    private String date,name;

    public Ticket(String date, int price){
        setDate(date);
        setPrice(price);
    }
    public Ticket(String date, String name){
        setDate(date);
        setName(name);
    }

    public void setDate(String date){
        this.date = date;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDate(){
        return date;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }

    public String toString(){
        return getDate()+((getPrice()==10)?"送出一張票。貴賓："+getName():"售出一張票。售價："+getPrice());
    }
}
