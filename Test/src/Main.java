public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        // System.out.println("Make " + car.getMake());
        // System.out.println("Model " + car.getModel());
        // System.out.println("Color " + car.getColor());
        car.setMake("Volvo");
        car.setDoors(2);
        car.setColor("Black");
        car.setConvertible(true);
        car.setModel("Carrera");


        car.describeCar();
        

    }
}
