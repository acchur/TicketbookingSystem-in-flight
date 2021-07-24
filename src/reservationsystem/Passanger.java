package reservationsystem;

public class Passanger {

    private static int idCounter;
   private Address address;
    private Contact contact;

    static {
        idCounter = 0;
    }

    public Passanger(int id, Address address, Contact contact) {
        this.id = ++idCounter;
        this.address = address;
        this.contact = contact;
    }

    public Passanger(int id, String address, String contact) {
        this.id = id;
        this.address = address;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
}
