public class Special_Ticket {
    private int price, sales;
    private double discount;

    public Special_Ticket( int price, int sales ,double discount){
        setPrice(price);
        setSales(sales);
        setDiscount(discount);
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setSales(int sales) {
        this.sales = sales;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public int getPrice(){
        return price;
    }
    public int getSales(){
        return sales;
    }
    public double getDiscount(){
        return discount;
    }
    public void sales(int sale){
        sales += sale;
    }

    public String toString(){
        return "Special Ticket 累積銷售金額達 "+getPrice()*getDiscount()*getSales()+"元";
    }
}
