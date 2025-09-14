
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle suv = new SUV();
        Vehicle sportsCar = new SportsCar();
        Vehicle hybrid = new Hybrid();

        suv.forward();
        suv.reverse();

        sportsCar.forward();
        sportsCar.reverse();

        hybrid.forward();
        hybrid.reverse();
    }
}
