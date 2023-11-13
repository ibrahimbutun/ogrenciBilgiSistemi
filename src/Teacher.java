public class Teacher {
    String name;
    String mobilePhoneNumber;
    String branch;

    Teacher(String name, String branch, String mobilePhoneNumber) {
        this.name = name;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.branch = branch;
    }

    void printTeacher() {
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.mobilePhoneNumber);
        System.out.println("Bölümü : " + this.branch);
    }
}
