package ContactManager;

public class Contacts {
    protected String firstName;
    protected String lastName;
    protected int phoneNumber;

    public Contacts(String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    Contacts Drew = new Contacts("Drew", "Shin", 562888777);
    Contacts Obi = new Contacts("Obi", "Wan-Kenobi", 342344598);
    Contacts Anakin = new Contacts("Anakin", "Skywalker", 87909237);

}

