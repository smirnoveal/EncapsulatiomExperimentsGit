public class LogisticCompany {

    //final task 5.9.2.

    private final Dimensions dimensions;

    private final int weight;
    private final String deliveryAddress;
    private final boolean flip;
    private final String registrationNumber;
    private final boolean fragility;

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Dimensions setDimensions(int height, int width, int length) {
        return new Dimensions(height, width, length);
    }

    public int getWeight() {
        return weight;
    }

    public LogisticCompany setWeight(int weight) {
        return new LogisticCompany(dimensions,weight,
                deliveryAddress, flip, registrationNumber, fragility);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public LogisticCompany setDeliveryAddress(String deliveryAddress) {
        return new LogisticCompany(dimensions,weight,
                deliveryAddress, flip, registrationNumber, fragility);
    }

    public boolean isFlip() {
        return flip;
    }

    public LogisticCompany setFlip(boolean flip) {
        return new LogisticCompany(dimensions,weight,
                deliveryAddress, flip, registrationNumber, fragility);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public LogisticCompany setRegistrationNumber(String registrationNumber) {
        return new LogisticCompany(dimensions,weight,
                deliveryAddress, flip, registrationNumber, fragility);
    }

    public boolean isFragility() {
        return fragility;
    }

    public LogisticCompany setFragility(boolean fragility) {
        return new LogisticCompany(dimensions,weight,
                deliveryAddress, flip, registrationNumber, fragility);
    }

    public LogisticCompany(Dimensions dimensions, int weight, String deliveryAddress,
                           boolean flip, String registrationNumber,
                           boolean fragility) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.flip = flip;
        this.registrationNumber = registrationNumber;
        this.fragility = fragility;
    }

    public String toString(){
        return ("Габариты - " + dimensions.toString() + "\n" + "Весом - " + weight+
                "\n"+ "Адрес доставки - " + deliveryAddress + "\n" + (flip? "можно переворачивать":"не переворачивать!")
                +"\n" + "Госномер автомобиля - " + registrationNumber + "\n"  + (fragility? "Хрупоке!":"Можно швырять :)"));
    }


}
