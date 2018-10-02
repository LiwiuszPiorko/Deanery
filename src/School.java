public class School {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Liwiusz", "Piórko",6);
        String info=teacher.showInfo();
        System.out.println(info);

        Student student=new Student("Marek","Nowak",3);
        String sInfo=student.showStudentInfo();
        System.out.println(sInfo);

    }
}
