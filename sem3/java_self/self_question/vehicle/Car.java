public class Car extends Vehicle {
    Car(String brand){
        super(brand);
    }
    
    @Override
    void start(){
        System.out.println("Car is starting");
    }
}
