class Hybrid extends Vehicle {
    @Override
    public void forward() {
        System.out.println("Hybrid moves forward using electric mode.");
    }

    @Override
    public void reverse() {
        System.out.println("Hybrid reverses silently with battery power.");
    }
}
