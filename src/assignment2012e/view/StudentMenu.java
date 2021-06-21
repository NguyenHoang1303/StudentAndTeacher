package assignment2012e.view;

import assignment2012e.controller.StudentController;

import java.util.Scanner;

public class StudentMenu {
    private Scanner scanner = new Scanner(System.in);
    private StudentController studentController = new StudentController();
     void generMenu(){
        boolean is = true;
        while (is){
            System.out.println("Student manager");
            System.out.println("-----------------------");
            System.out.println("1. Creat student");
            System.out.println("2. Show list student");
            System.out.println("3. Search student");
            System.out.println("4. Edit student");
            System.out.println("5. Delete student");
            System.out.println("0. Exit");
            System.out.println("-----------------------");
            System.out.printf("Vui lòng chọn 0-5: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    studentController.creat();
                    break;
                case 2:
                    studentController.showList();
                    break;
                case 3:
                    studentController.search();
                    break;
                case 4:
                    studentController.update();
                    break;
                case 5:
                    studentController.delete();
                    break;
                case 0:
                    System.out.println("Good bye!");
                    is = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại.");
                    break;
            }

            System.out.println("Gõ Enter để tiếp tục.");
            scanner.nextLine();
        }

    }
}
