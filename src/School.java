public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Anna", "Kowalska", 199886, 3);
        student1.show();
        Teacher teacher1 = new Teacher("Jan", "Nowak", "dr", "Zarządzanie");
        teacher1.show();
    }
}
