public class People {
    private String firstName;
    private String name;

    public People(String firstName, String name) {
        this.firstName = firstName;
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.print(firstName + " " + name + " ");
    }
}
