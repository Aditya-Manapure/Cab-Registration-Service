public class Customer {
    private final String name;
    private String username;
    private String password;
    private String contactNumber;
    private String email;
    private String city;
    private int rating;

    public Customer(String name, String username, String password, String contactNumber, String email, String city, int rating) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.contactNumber = contactNumber;
        this.email = email;
        this.city = city;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public int getRating() {
        return rating;
    }
}
