public class Teacher extends ParticipantsOfEducation {
    private int seniority;

    public Teacher(String firstName, String lastName, int seniority) {
        super(firstName, lastName);
        this.seniority = seniority;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
    public String showInfo(){
        String info=firstName+", "+lastName+", "+seniority;
        return info;
    }
}


