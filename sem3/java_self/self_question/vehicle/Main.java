// public class Vehicle {
//     String brand;
//     Vehicle(String brand){
//         this.brand = brand;
//     }

//     void start(){
//         System.out.println(this.brand +" start");
//     }

// }

// public class Car extends Vehicle {
//     @Override
//     void start(){
//         System.out.println("Car is starting");
//     }
// }


public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car("BMW");
        v.start();  
    }
}
