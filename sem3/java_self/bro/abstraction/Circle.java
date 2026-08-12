// package abstraction;

public class Circle extends Shape {
    double radius;
    
    Circle(double rad){
        this.radius = rad;
    }

    @Override
    double area() {
        return (Math.PI * Math.pow(this.radius, 2)) ;
    }
}
