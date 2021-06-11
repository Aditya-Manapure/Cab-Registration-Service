class TakeOnRentDriver extends TakeOnRent{
    private double pricePerKm;

    TakeOnRentDriver(String name, String carType){
        super(name, carType);
        if(carType.equals("SUV")){
            pricePerKm = 10;
            System.out.println("Price per Km for current segment is : " + pricePerKm + "Rs\n");
        }else if(carType.equals("SEDAN")){
            pricePerKm = 8;
            System.out.println("Price per Km for current segment is : " + pricePerKm + "Rs\n");
        }

    }
}