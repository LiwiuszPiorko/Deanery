public class Student extends ParticipantsOfEducation {

    private int yearOfStudy;


    public Student(String firstName, String lastName, int yearOfStudy) {
        super(firstName, lastName);
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String showStudentInfo() {
        String sInfo = firstName + ", " + lastName + ", " + yearOfStudy;
        return sInfo;
    }
}

