import java.util.Scanner;

<<<<<<< HEAD
import javax.lang.model.util.ElementScanner14;
=======
>>>>>>> fb4cd1a02175ded104cb2508e4cc50bda964d56d

public class Catalog {
    private cart myCart;
    private item myitem;
    public void ViewCatalog(){
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Categories");
        System.out.println("1-Chocolate category");
        System.out.println("2-Toffee category");
        System.out.println("3-Candy category");
        System.out.println("Enter your choice: ");
        choice=in.nextInt();
        CategoryItems(choice);
    }
    public void CategoryItems(int choice){
        if(choice==1){
            System.out.println("Chocolate category");
            System.out.printf("%-15S %s\n", "Product Name", "Price","Availabilty");
            System.out.printf("%-15S %s\n", "Galaxy"  ,myitem.getPrice("Galaxy"),myitem.available("Galaxy"));
            System.out.printf("%-15S %s\n", "Cadbury" ,myitem.getPrice("Cadbury"),myitem.available("Cadbury"));
            System.out.printf("%-15S %s\n", "kitkat"  ,myitem.getPrice("kitkat"),myitem.available("kitkat"));
            System.out.printf("%-15S %s\n", "nutella" ,myitem.getPrice("nutella"),myitem.available("nutella"));
        }else if(choice==2){
            System.out.println("Toffee category");
            System.out.printf("%-15S %s\n", "Product Name", "Price");
            System.out.printf("%-15S %s\n", "toffee"   ,myitem.getPrice("toffee"),myitem.available("toffee"));
            System.out.printf("%-15S %s\n", "lollipop" ,myitem.getPrice("lollipop"),myitem.available("lollipop"));
            System.out.printf("%-15S %s\n", "gum"      ,myitem.getPrice("gum"),myitem.available("gum"));
        }else if(choice==3){
            System.out.println("Candy category");
            System.out.printf("%-15S %s\n", "Product Name", "Price");
            System.out.printf("%-15S %s\n", "gateau",myitem.getPrice("gateau"),myitem.available("gateau"));
            System.out.printf("%-15S %s\n", "torta" ,myitem.getPrice("torta"),myitem.available("torta"));
            System.out.printf("%-15S %s\n", "donuts",myitem.getPrice("donuts"),myitem.available("donuts"));
        }  
        System.out.println("Do you want to buy product?");
        
        System.out.println("Enter The Name of product:");     
    }
}