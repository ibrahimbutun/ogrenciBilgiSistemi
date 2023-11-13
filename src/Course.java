public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;

    public Course(Teacher teacher, String name, String code, String prefix) {
        this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("ders-öğretmen bilgisi uyuşmuyor");
        }
        this.teacher = teacher;

    }

    void printTeacherInfo() {
        System.out.println("bilgiler yazılıyor...");
        this.teacher.printTeacher();
    }

}
