import java.io.File;
import java.io.FileNotFoundException;

public class CoffeeShop {


  public void orderCoffee(String coffeeType) throws CoffeeNotAvailableException {
      if(coffeeType == null || coffeeType.isEmpty()){
          throw new IllegalArgumentException("Coffee type must be provided!");

      }

      if(
              !coffeeType.equalsIgnoreCase("Espresso") &&
              !coffeeType.equalsIgnoreCase("Latte") &&
              !coffeeType.equalsIgnoreCase("Cappuccino")

      ){
          throw new CoffeeNotAvailableException(coffeeType + " is not available today.");
      }

      System.out.println("Enjoy your delicious " + coffeeType + "!");

  }

    public void readRecipeFile(String fileName) throws FileNotFoundException{
        File file = new File(fileName);

        if(!file.exists()){
            throw new FileNotFoundException();
        }

        // Simulate reading the file...
        System.out.println("Reading recipe from file...");
    }
}
