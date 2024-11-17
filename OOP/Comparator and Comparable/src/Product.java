// The company wants the Products it sells to be by-default sorted by category and then rating. - Comparable will help!

import java.time.LocalDate;

public class Product implements Comparable<Product>{
    private LocalDate mfd;
    private String category;
    private Integer price;
    private float rating;

    public Product(LocalDate mfd, String category, Integer price, float rating) {
        this.mfd = mfd;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public int compareTo(Product p) {
        // if(this.mfd.compareTo(p.mfd)>0){
        //     return -1;
        // }else{
        //     return 1;
        // }
        if(this.category.compareTo(p.category) == 0){
            if(this.rating<p.rating){
                return 1; //swap
            }
        }else{
            if(this.category.compareTo(p.category)>0){
                return 1;
            }
        }
        return -1;
    }

    

    public LocalDate getMfd() {
        return mfd;
    }

    public void setMfd(LocalDate mfd) {
        this.mfd = mfd;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "[mfd=" + mfd + ", category=" + category + ", price=" + price + ", rating=" + rating + "]\n";
    }
}
