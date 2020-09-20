package AccessModifiers1;

public class ProductPage extends BasePage{
    String productName;
    String productPrice;

    void addToCard(){
        BasePage basePage= new BasePage();
        basePage.searchForProduct("product");
        BasePage title= new BasePage();
        System.out.println("Product affed to cart");
    }


}

