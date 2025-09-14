class SportsCar extends Vehicle {
    @Override
    public void forward() {
        System.out.println("SportsCar speeds forward at high acceleration.");
    }

    @Override
    public void reverse() {
        System.out.println("SportsCar carefully reverses with rear sensors.");
    }
}
