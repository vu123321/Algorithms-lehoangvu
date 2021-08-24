package bean;

public class Item {
    private int id;
    private String name;
    private double price;

    public Item() {
    }

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    // TH tang dan id and Name
//    private static int compare(Item i1 , Item i2){
//        if (i1.getId() - i2.getId() > 0){
//            return  1;
//        }
//        if (i1.getId() - i2.getId() < 0){
//            return -1;
//        }
//        if (i1.getName().compareTo(i2.getName()) > 0){
//            return 1;
//        }
//        return 0;
//    }


    // TH id and Name giam dan

    // pre : this
    // next : items
    // position : swap
    // negative : do nothing
    public  int compareTo(Item item ){
        if (this.getId() - item.getId() < 0){
            return 1;
        }
        if (this.getId() - item.getId() > 0){
            return  -1;
        }
        if (this.getName().compareTo(item.getName()) > 0){
            return 1;
        }
        return 0;
    }
}
