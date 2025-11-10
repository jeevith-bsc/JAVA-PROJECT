public class User {
    protected String username;
    protected String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("User: " + username + " (" + email + ")");
    }
}
