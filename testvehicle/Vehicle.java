
package testvehicle;

public abstract class Vehicle {
    private String manufacturer;
    private String model;
    private double price;
    private int maxSpeed;
    static int count=0;
    
    public Vehicle(String mf,String m,double p,int ms){
        manufacturer = mf;
        model = m;
        price = p;
        maxSpeed = ms;
        count++;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setManufacturer(String mf){
        manufacturer=mf;
    
    }
    public void setModel(String m){
        model=m;
    
    }
    public void setPrice(double p){
        price = p;
    
    }
    public void setMaxSpeed(int ms){
        maxSpeed=ms;
    
    }
    
    
    public String compareTo(Vehicle v){
        if(maxSpeed>v.maxSpeed){
            return"vehicle: "+manufacturer+"is faster than: "+v.manufacturer;
        }
        else if(maxSpeed<v.maxSpeed){
            return"vehicle: "+manufacturer+"is slower than: "+v.manufacturer;   
        }
        else{
            return"The vehicles have the same speed";
        }
    }
}
