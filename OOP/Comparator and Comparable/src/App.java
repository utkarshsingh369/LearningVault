import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> products = new ArrayList<>();
        final Logger logger = Logger.getLogger("AppLogger");

        
        // Mock static data for 12 products
        products.add(new Product(LocalDate.of(2020, 6, 15), "Electronics", 500, 4.5f));  
        products.add(new Product(LocalDate.of(2021, 8, 30), "Clothing", 50, 3.8f));     
        products.add(new Product(LocalDate.of(2022, 3, 10), "Groceries", 30, 4.0f));     
        products.add(new Product(LocalDate.of(2019, 11, 25), "Books", 20, 4.8f));       
        products.add(new Product(LocalDate.of(2018, 7, 1), "Home Appliances", 150, 3.9f)); 
        products.add(new Product(LocalDate.of(2020, 5, 12), "Toys", 20, 4.2f));        
        products.add(new Product(LocalDate.of(2021, 9, 22), "Furniture", 200, 3.7f));  
        products.add(new Product(LocalDate.of(2020, 12, 10), "Sports", 100, 4.6f));    
        products.add(new Product(LocalDate.of(2019, 1, 3), "Electronics", 300, 4.1f)); 
        products.add(new Product(LocalDate.of(2022, 10, 15), "Groceries", 40, 4.3f));   
        products.add(new Product(LocalDate.of(2021, 6, 17), "Clothing", 70, 4.7f));    
        products.add(new Product(LocalDate.of(2020, 4, 25), "Books", 25, 4.5f));      

        logger.info("\nBefore default sorting:\n\n"+products.toString());

        Collections.sort(products);
        logger.info("\nAfter default sorting (sort by category and decreasing rating):\n\n"+products.toString());


        // use custom comparator (sort based on rating, if same, on increasing price)

        Comparator<Product> userSort = new Comparator<Product>(){
            @Override
            public int compare(Product p1, Product p2) {
                if(p1.getRating()==p2.getRating()){
                    if(p1.getPrice()>p2.getPrice()){
                        return 1;
                    }
                    return -1;
                }else{
                    if(p1.getRating()<p2.getRating()){
                        return 1;
                    }
                    return -1;
                }
            }
        };
        Collections.sort(products,userSort);
        logger.info("\n\nAfter user sorting"+products.toString());
    }
}
