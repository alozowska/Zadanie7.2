public class Student extends People {
    private int indexNumber;
    private int yearOfStudy;

    public Student(String firstName, String name, int indexNumber, int yearOfStudy) {
        super(firstName, name);
        this.indexNumber = indexNumber;
        this.yearOfStudy = yearOfStudy;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(indexNumber + " " + yearOfStudy);
    }
}