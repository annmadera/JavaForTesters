package AccessModifiers1;

 public class BasePage {

       public String title;
       public String url;
       public String username;

       public  BasePage(){}

       protected void goTo(String pageURL){
            System.out.println("Going to page");
        }
          public void searchForProduct(String product){

            System.out.println("Searching for product" +product);
        }
}
