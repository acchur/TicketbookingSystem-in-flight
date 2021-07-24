package reservationsystem;

public class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street,String city,String state){
        this.street=street;
        this.city=city;
        this.state=state;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void getAddressDetails(){
        System.out.println("street " +street+ "City " +city+ "State "+state);
    }
}
