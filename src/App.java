import java.util.ArrayList;
import java.util.Scanner;

import models.StudentsManage;

public class App {
    public static void main(String[] args) throws Exception {

        // studentManage.show();

        
        // System.out.println("Student saved!");
        // System.out.println("----------------------");

        // String resutl;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhập y để tiếp tục. Nhập n để dừng nhập thông tin sinh viên");
        // resutl = sc.next();

        ArrayList<StudentsManage> studentList = new ArrayList<>();
        StudentsManage studentManage = new StudentsManage();
        studentManage.input();
        studentList.add(studentManage);

        String resutl;
        Scanner sc = new Scanner(System.in);
            System.out.println("Nhập y để tiếp tục. Nhập n để dừng nhập thông tin sinh viên");
            resutl = sc.next();
        while (resutl.equals("y")) {
            StudentsManage studentManage2 = new StudentsManage();
            studentManage2.input();
            studentList.add(studentManage2);
            System.out.println("Nhập y để tiếp tục. Nhập n để dừng nhập thông tin sinh viên");
            resutl = sc.next();
        }

        // ArrayList<StudentsManage> studentList = new ArrayList<>();
        // String resutl;
        // do {
        //     StudentsManage studentManage = new StudentsManage();
        //     studentManage.input();
        //     studentList.add(studentManage);

        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Nhập y để tiếp tục. Nhập n để dừng nhập thông tin sinh viên");
        //     resutl = sc.next();
        // } while (resutl.equals("y"));


        for (StudentsManage student : studentList) {
            System.out.println("-------------------------------");
            System.out.println("Mã sinh viên : " + student.getStudentCode());
            System.out.println("Tên sinh viên : " + student.getStudentName());
            System.out.println("Tuổi sinh viên : " + student.getStudentAge());
            System.out.println("Giới tính sinh viên : " + student.getStudentSex());
        }
        // if (resutl.equals("y")) {
        //     studentManage.input();
        //     studentList.add(studentManage);
        //     for (StudentsManage student : studentList) {
        //         System.out.println("-------------------------------");
        //         System.out.println("Mã sinh viên : " + student.getStudentCode());
        //         System.out.println("Tên sinh viên : " + student.getStudentName());
        //         System.out.println("Tuổi sinh viên : " + student.getStudentAge());
        //         System.out.println("Giới tính sinh viên : " + student.getStudentSex());
        //     }
        // } else if (resutl.equals("n")) {
        //     for (StudentsManage student : studentList) {
        //         System.out.println("-------------------------------");
        //         System.out.println("Mã sinh viên : " + student.getStudentCode());
        //         System.out.println("Tên sinh viên : " + student.getStudentName());
        //         System.out.println("Tuổi sinh viên : " + student.getStudentAge());
        //         System.out.println("Giới tính sinh viên : " + student.getStudentSex());
        //     }
        // }
    }
}
