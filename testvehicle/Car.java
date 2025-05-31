
package testvehicle;

public class Car extends Vehicle implements Accelerate {
    private int numDoors;
    private int speed;
    
    public Car(String mf, String m, double p, int ms, int nd){
        super(mf,m,p,ms);
        numDoors=nd;
        speed=0;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public int getSpeed() {
        return speed;
    }
    

    public void setNumDoors(int nd) {
        numDoors = nd;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    @Override
    public String toString() {
        return super.toString()+ "numDoors=" + numDoors;
    }
    @Override
    public int accelerate(){
        return speed+=20;
    }
    
    
    
}
