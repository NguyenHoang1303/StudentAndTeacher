package assignment2012e.view;

import java.util.Scanner;

public class HightSchool {
    Scanner scanner = new Scanner(System.in);
    private StudentMenu studentMenu = new StudentMenu();
    private TeacherMenu teacherMenu = new TeacherMenu();


    public void  hightSchoolMenu(){
        System.out.println("Chào mừng đến với FPT-JetKing");
        System.out.println("------------------------------");
        System.out.println("Manager Teacher and Student");
        System.out.println("------------------------------");
        System.out.println("1. Teacher Manager");
        System.out.println("2. Student Manager");
        System.out.println("0. Exit");
        System.out.println("-------------------------------");
        System.out.println("Vui lòng chọn 0-2");
        boolean isHightSchool = true;
        while(isHightSchool){

            System.out.printf("Lựa chọn của bạn la: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    studentMenu.generMenu();
                    break;
                case 2:
                    teacherMenu.generMenu();
                    break;
                case 0:
                    System.out.println("Bye bye!!");
                    isHightSchool = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
                    break;

            }
        }



    }
}
