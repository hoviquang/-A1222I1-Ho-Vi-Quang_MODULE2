package service.impl;

import controller.StudentController;
import model.Student;
import repository.IStudentRepository;
import repository.impl.StudentRepository;
import service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private Scanner scanner= new Scanner(System.in);
    private static IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void addStudent() {
        Student student = inputInfo();
        iStudentRepository.addStudent(student);
        System.out.println("Thêm mới thành công");
        System.out.println("---------------------------------");
    }

    @Override
    public void displayAllStudent() {
        List<Student> studentList = iStudentRepository.getAll();
        for(Student student: studentList) {
            System.out.println(student.toString());
        }
    }

    public Student inputInfo() {
        Student student = new Student();
        System.out.print("Nhập mã: ");
        student.setCode(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập tên: ");
        student.setName(scanner.nextLine());
        System.out.print("Nhập ngày sinh: ");
        student.setDateOfBirth(scanner.nextLine());
        System.out.print("Nhập điểm: ");
        student.setGrade(Double.parseDouble(scanner.nextLine()));
        return student;
    }
}
