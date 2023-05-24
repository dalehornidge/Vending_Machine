package Machine;

import Products.Product;

import java.util.ArrayList;

public class Spring {

    private Code code;
    private int price;
    private ArrayList<Product> products;

    public Spring(Code code, int price){
        this.code = code;
        this.price = price;
        this.products = new ArrayList<Product>();
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code){
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }
    public Product returnProduct(){
        return this.products.remove(0);}

    public int countProducts(){
        return this.products.size();
    }

}
