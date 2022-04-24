public class Regular_Ticket {
    private int price, sales;

    public Regular_Ticket( int price, int sales ){
        setPrice(price);
        setSales(sales);
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setSales(int sales) {
        this.sales = sales;
    }
    public int getPrice(){
        return price;
    }
    public int getSales(){
        return sales;
    }
    public void sales(int sale){
        sales += sale;
    }

    public String toString(){
        return "Regular Ticket 累積銷售金額達 "+ getPrice()*getSales() +"元";
    }
}
