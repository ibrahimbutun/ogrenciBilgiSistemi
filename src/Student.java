public class Student {
    Course c1, c2, c3;
    String name, studentNumber, classes;
    double avarage;
    boolean isPass;

    public Student(Course c1, Course c2, Course c3, String name, String studentNumber, String classes, double avarage,
            boolean isPass) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }

    }

    void isPass() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.avarage > 55) {
            System.out.println("----------------------------------");
            System.out.println("başarılı");
            this.isPass = true;

        } else {
            System.out.println("----------------------------------");
            System.out.println("başarısız...");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println("----------------------------------");
        System.out.println(c1.name + "Notu \t:" + this.c1.note);
        System.out.println(c2.name + "Notu \t:" + this.c2.note);
        System.out.println(c3.name + "Notu \t:" + this.c3.note);
        System.out.println("----------------------------------");
        System.out.println("Ortalamanız \t: " + this.avarage);

    }
}
