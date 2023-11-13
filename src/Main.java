public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555 555 55 55");
        Teacher t2 = new Teacher("ahmet hoca", "FZK", "532 532 53 32");
        Teacher t3 = new Teacher("ömer", "BIO", "6565");

        // t1.printTeacher();

        Course tarih = new Course(t1, "Tarih", "101", "TRH", 20);
        Course fizik = new Course(t2, "Fizik", "202", "FZK", 1);
        Course biyoloji = new Course(t3, "Biyoloji", "303", "BIO", 30);
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyoloji.addTeacher(t3);
        // tarih.printTeacherInfo();

        Student s1 = new Student(fizik, tarih, biyoloji, "eymen bütün", "1071", "4", 0, false);
        s1.addBulkExamNote(100, 80, 50);
        // s1.printNote();
        s1.isPass();

        Student s2 = new Student(tarih, fizik, biyoloji, "necmi", "100", "4", 0, false);
        s2.addBulkExamNote(50, 30, 20);
        s2.isPass();
    }
}
