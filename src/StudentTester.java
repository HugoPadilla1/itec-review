public class StudentTester {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Hugo", 19),
                new Student("Caroline", 21),
                new Student("Camilla", 18)
        };

        System.out.println("Students older than 20:");
        for (Student student : students) {
            if (student.getAge() > 20){
                System.out.println(student.getName());
            }
        }
    }
}
