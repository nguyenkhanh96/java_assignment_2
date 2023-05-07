package models;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * StudentsManage
 */
public class StudentsManage {
    private int studentCode;
    private String studentName;
    private int studentAge;
    private String studentSex;

    public StudentsManage() {
    }

    public StudentsManage(int studentCode, String studentName, int studentAge, String studentSex) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSex = studentSex;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã sinh viên");
        this.studentCode = sc.nextInt();

        System.out.println("Nhập tên sinh viên");
        this.studentName = sc.next();

        System.out.println("Nhập tuổi sinh viên");
        this.studentAge = sc.nextInt();

        System.out.println("Nhập giới tính sinh viên");
        this.studentSex = sc.next();
    }

    public void show() {
        System.out.println("-------------------------------");
        System.out.println("Mã sinh viên : " + studentCode);
        System.out.println("Tên sinh viên : " + studentName);
        System.out.println("Tuổi sinh viên : " + studentAge);
        System.out.println("Giới tính sinh viên : " + studentSex);
    }
}