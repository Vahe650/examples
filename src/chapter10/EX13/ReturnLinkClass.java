package chapter10.EX13;

public class ReturnLinkClass {
    public User aClass(final String name, final String surname, final String email, final String pass) {
        return new User(name, surname, email, pass) {
            {
                System.out.println(getName() + getSurname() + getEmail() + getPass());
            }
            @Override
            public String getName() {
                return name;
            }

            @Override
            public String getSurname() {
                return surname;
            }

            @Override
            public String getEmail() {
                return email;
            }

            @Override
            public String getPass() {
                return pass;
            }
        };
    }

    public static void main(String[] args) {
        ReturnLinkClass returnLinkClass = new ReturnLinkClass();
        User user = returnLinkClass.aClass(null, null, null, null);
        user.setName("armen");
        System.out.println(user);
        System.out.println(returnLinkClass.aClass("valod ", "valodyan ", "email ", "pass"));
        System.out.println(returnLinkClass.aClass("vaasdlod ", "valoasdasddyan ", "emwqeqwail ", "pasdasdasdass"));


    }
}
