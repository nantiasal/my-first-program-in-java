
package testvehicle;

public class TestVehicle {

    public static void main(String[] args) {
      Car Car1=new Car("FIAT","UNO",10000,210,5);
      Car Car2=new Car("SEAT","LEON",10500,200,3);
      
      System.out.println("to ocima 1: "+Car1);
      System.out.println("to ocima 2: "+Car2);
      System.out.println(Car1.compareTo(Car2));
      
      System.out.println("to plithos ton oximaton:" +Vehicle.count);
      Car1.accelerate();
      Car2.accelerate();
      System.out.println("h taxutita tou 1: " +Car1.getSpeed());
    }
    
}
