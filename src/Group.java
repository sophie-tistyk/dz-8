import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {

    private Student leader;
    private List<Student> students = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    Map<Student, List<String>> studentTasks = new HashMap<>();

    public Group(Student leader) {
        this.leader = leader;
        students.add(leader);
    }

    public void changeLeader(Student newLeader) {
        if (students.contains(newLeader)) {
            leader = newLeader;
        }

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        if (student != leader) {
            students.remove(student);
        }
    }

    public void renameStudent(Student student, String newFirstName, String newLastName) {
        if (students.contains(student)) {
            student.setFirstName(newFirstName);
            student.setLastName(newLastName);
        }

    }

    public ArrayList<Student> getStudents() {
        return (ArrayList<Student>) this.students;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void completeTask(Student student, String task) {
        System.out.println("Student " + student + " has completed task " + task);
    }
}

