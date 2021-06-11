class TakeOnRentDriverless extends TakeOnRent {
    private double pricePerKm;

    TakeOnRentDriverless(String name, String carType) {
        super(name, carType);
        if (carType.equalsIgnoreCase("SUV")) {
            pricePerKm = 9;
            System.out.println("Price per Km for current segment is : " + pricePerKm + "Rs\n");
        } else if (carType.equalsIgnoreCase("SEDAN")) {
            pricePerKm = 6;
            System.out.println("Price per Km for current segment is : " + pricePerKm + "Rs\n");
        }
    }
}