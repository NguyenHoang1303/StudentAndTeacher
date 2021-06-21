package assignment2012e.controller;


import assignment2012e.entity.Teacher;

import assignment2012e.model.TeacherModel;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherController {
    private TeacherModel teacherModel = new TeacherModel();
    private Scanner scanner = new Scanner(System.in);

    public void creat() {
        Teacher teacher = new Teacher();
        System.out.printf("Vui lòng nhập id giáo viên: ");
        String id = scanner.nextLine();
        teacher.setRollNumber(id);

        System.out.printf("Vui lòng nhập tên giáo viên: ");
        String fullName = scanner.nextLine();
        teacher.setFullName(fullName);

        System.out.printf("Vui lòng nhập email giáo viên: ");
        String email = scanner.nextLine();
        teacher.setEmail(email);

        System.out.printf("Vui lòng nhập số điện thoại giáo viên: ");
        String phone = scanner.nextLine();
        teacher.setPhone(phone);

        boolean isCreat = teacherModel.save(teacher);
        if (isCreat) {
            System.out.println("Thành công");
        } else {
            System.out.println("Lỗi!!!!!");
        }
    }

    public void showList() {
        ArrayList<Teacher> list = teacherModel.findAll();
        System.out.printf("%10s%10s%10s | %10s%15s%10s | %5s%20s%5s | %5s%10s%5s |",
                "", "id", "",
                "", "Tên", "",
                "", "email", "",
                "", "Số điện thoại", "");
        System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");
        int n = list.size();
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public Teacher search() {
        System.out.println("Vui lòng nhập id giáo viên: ");
        String maSV = scanner.nextLine();
        Teacher teacher = teacherModel.findById(maSV);
        if (teacher == null){
            System.out.println("false");
        } else {
            System.out.printf("%10s%10s%10s | %10s%15s%10s | %5s%20s%5s | %5s%10s%5s |",
                    "", "id", "",
                    "", "Tên", "",
                    "", "email", "",
                    "", "Số điện thoại", "");
            System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------");

            System.out.println(teacher.toString());
        }
        return teacher;
    }

    public void delete() {
        System.out.println("Vui lòng nhập mã giáo viên muốn xoá!");
        String id = scanner.nextLine();
        boolean isDelete = teacherModel.delete(id);
        if(isDelete){
            System.out.println("Giáo viên đã được xoá");
        } else {
            System.out.println("Lỗi");

        }
    }

    public void update() {
        System.out.println("Vui lòng nhập mã Giáo viên muốn sửa!");
        String id = scanner.nextLine();
        Teacher teacher = new Teacher();
        boolean isUpdate = teacherModel.update(id, teacher);
        if(isUpdate){
            System.out.println("Bạn có muốn sửa thông tin Giáo viên?");
            System.out.println("Vui lòng chọn:");
            System.out.println("1: Đồng ý, 2: Thoát");
            boolean isChoice = true;
            while (isChoice) {
                System.out.printf("Lựa chọn của bạn là: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Vui lòng nhập tên:");
                        String fullName = scanner.nextLine();
                        teacher.setFullName(fullName);

                        System.out.println("Vui lòng nhập email:");
                        String email = scanner.nextLine();
                        teacher.setEmail(email);

                        System.out.println("Vui lòng nhập số điẹn thoại:");
                        String phone = scanner.nextLine();
                        teacher.setPhone(phone);

                        teacherModel.update(id,teacher);
                        System.out.println("Giáo viên được chỉnh sửa");
                        isChoice = false;
                        break;
                    case 2:
                        isChoice = false;
                        break;
                    default:
                        System.out.println("Vui lòng chọn lại");
                        break;
                }
            }
        } else {
            System.out.println("false");
        }

    }

}
