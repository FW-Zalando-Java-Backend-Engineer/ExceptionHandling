import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();

        try{
            shop.orderCoffee("PumpkinSpice");
        }catch(CoffeeNotAvailableException e){
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Runtime Exception Caught: " + e.getMessage());
        }finally{
            // scanner.close() in case we are using Scanner object
            // IO stream could be closed if it was used
            System.out.println("Thank you for visiting our Coffee Shop! ☕");
        }

        try{
            shop.readRecipeFile("recipes.txt");
        }catch(FileNotFoundException e){
            System.out.println("Checked Exception Caught: Recipe file missing!");
        }finally{
            // scanner.close() in case we are using Scanner object
            // IO stream could be closed if it was used
            System.out.println("Thank you for visiting our Coffee Shop! ☕");
        }
    }
}
