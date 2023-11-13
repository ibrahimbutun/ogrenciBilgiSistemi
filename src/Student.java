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
        calculateAvarage();
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

    void addSozlu(int tarihSozlu, int fizikSozlu, int biyolojiSozlu) {
        if (tarihSozlu >= 0 && tarihSozlu <= 100) {
            System.out.println("tarihSozlu");
            this.c1.sozlu = tarihSozlu;
        }
        if (fizikSozlu >= 0 && fizikSozlu <= 100) {
            System.out.println("fizikSozlu");
            this.c2.sozlu = fizikSozlu;
        }
        if (biyolojiSozlu >= 0 && biyolojiSozlu <= 100) {
            System.out.println("biyolojiSozlu");
            this.c3.sozlu = biyolojiSozlu;
        }
    }

    void calculateAvarage() {
        System.out.println("sozlu notları eklendi.");
        this.avarage = ((this.c1.note * 0.8 + this.c1.sozlu * 0.2) + (this.c2.note * 0.8 + this.c2.sozlu * 0.2)
                + (this.c3.note * 0.8 + this.c3.sozlu * 0.2)) / 3.0;
        System.out.println("sözlü notu çıkış");
    }

    void isPass() {
        calculateAvarage();
        if (this.avarage > 55) {
            System.out.println("başarılı");
            this.isPass = true;

        } else {
            System.out.println("başarısız...");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(c1.name + "Notu \t:" + this.c1.note);
        System.out.println(c1.name + "Sözlü Notu \t:" + this.c1.sozlu);
        System.out.println(c2.name + "Notu \t:" + this.c2.note);
        System.out.println(c2.name + "Sözlü Notu \t:" + this.c2.sozlu);
        System.out.println(c3.name + "Notu \t:" + this.c3.note);
        System.out.println(c3.name + "Sözlü Notu \t:" + this.c3.sozlu);
        System.out.println("Ortalamanız \t: " + this.avarage);

    }
}
