public class Teacher extends People {
    private String degree;
    private String subject;

    public Teacher(String firstName, String name, String degree, String subject) {
        super(firstName, name);
        this.degree = degree;
        this.subject = subject;
    }

    public String getDegree() {
        return degree;
    }

    public String getSubject() {
        return subject;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(degree + " " + subject);
    }
}
