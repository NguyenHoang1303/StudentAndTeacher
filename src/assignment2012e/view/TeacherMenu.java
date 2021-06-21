package assignment2012e.view;



import assignment2012e.controller.TeacherController;

import java.util.Scanner;

public class TeacherMenu {
    private Scanner scanner = new Scanner(System.in);
    private TeacherController teacherController = new TeacherController();
     void generMenu(){
        boolean is = true;
        while (is){
            System.out.println("Teacher manager");
            System.out.println("-----------------------");
            System.out.println("1. Creat");
            System.out.println("2. Show list");
            System.out.println("3. Search");
            System.out.println("4. Edit");
            System.out.println("5. Delete");
            System.out.println("0. Exit");
            System.out.println("-----------------------");
            System.out.printf("Vui lòng chọn 0-5: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    teacherController.creat();
                    break;
                case 2:
                    teacherController.showList();
                    break;
                case 3:
                    teacherController.search();
                    break;
                case 4:
                    teacherController.update();
                    break;
                case 5:
                    teacherController.delete();
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
