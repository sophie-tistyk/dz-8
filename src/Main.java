public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Anna", "Martina");
        Student student2 = new Student(2, "John", "Smith");
        Student student3 = new Student(3, "Regina", "Phalange");

        Group group = new Group(student1);

        group.addStudent(student2);
        group.addStudent(student3);

        System.out.println("Students of the group");
        for (Student student : group.getStudents()) {
            System.out.println(student);
        }

        group.changeLeader(student2);

        group.removeStudent(student3);

        group.renameStudent(student1, "Anna", "Smith");

        System.out.println();
        System.out.println("Students of the group after changes:");
        for (Student student : group.getStudents()) {
            System.out.println(student);
        }

        group.addTask("Learn encapsulation");
        group.addTask("Learn inheritance");
        group.addTask("Learn polymorphism");

        group.completeTask(student1, "Learn encapsulation");

    }
}
