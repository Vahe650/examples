package shild.libraryHome;

public class AuthorH {
    String name;
    String email;
    String gender;

    private AuthorH(String name, String email, String gender) {

    }

    public String getName(String name) {
        return name;
    }

    public String getEmail(String email) {
        return email;
    }

    public String getGender(String gender) {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
