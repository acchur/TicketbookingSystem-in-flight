package reservationsystem;

public class Contact {
  private String name;
    private String phoneno;
    private String email;

    public Contact(String name,String phoneno,String email){
        this.name=name;
        this.phoneno=phoneno;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    public void updateContactDetails(){
        super.contactDetails();

    }
}
