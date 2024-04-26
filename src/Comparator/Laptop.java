package Comparator;

import java.util.Comparator;

public class Laptop {

    private String brandName;
    private int price;
    private String modelName;

    public Laptop(String brandName, int price, String modelName) {
        this.brandName = brandName;
        this.price = price;
        this.modelName = modelName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                ", modelName='" + modelName + '\'' +
                '}';
    }


//    @Override
//    public int compare(Laptop o1, Laptop o2) {
//
//        if(o1.getPrice() > o2.getPrice()){
//            return 1;
//        } else if (o1.getPrice() < o2.getPrice()){
//            return -1;
//        } else{
//            return 0;
//        }
//    }

}
