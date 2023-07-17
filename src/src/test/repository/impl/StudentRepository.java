package repository.impl;

import model.Student;
import repository.IStudentRepository;

import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository {

    private static final List<Student> students = new LinkedList<>();
//    private List<Integer> ints = new ArrayList<>();

    static {
        students.add(new Student(1, "HaiTT", "12/12/1222", 9));
        students.add(0, new Student(2, "HaiTT1", "12/12/1222", 9));
        students.add(new Student(3, "HaiTT2", "12/12/1222", 9));
        students.get(1);
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
