package Library_Managment_Project;

import javax.swing.*;
import java.util.InputMismatchException;

public class userInteraction extends searchingMethod{
    public static void menuChoice(){
        try{
            Interface_Classes.Library lb = new Interface_Classes.Library();
            searchingMethod sm = new searchingMethod();
            lb.mainMenu();
            System.out.print("\n->");
            int option = inp.nextInt();
            if (option > 0 && option <= 6){
                switch (option) {
                    case 1 -> printAllBooks();
                    case 3 -> {
                        lb.searchBook();
                        int choice = inp.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.print("Enter The Name of The Author : ");
                                bookAuthor = inp.next();
                                System.out.println(sm.searchByAuthor(bookAuthor));
                                break;
                            case 2:
                                System.out.print("Enter The Name of Your Book : ");
                                bookName = inp.next();
                                System.out.println(sm.searchByName(bookName));
                                break;
                            case 3:
                                System.out.print("Enter The Code of Your Book : ");
                                bookCode = inp.nextInt();
                                sm.searchByCode(bookCode);
                                break;
                            case 4:
                                lb.Genre();
                                System.out.println("Enter The Genre Number You Want");
                                System.out.print("--> ");
                                int genOption = inp.nextInt();
                                sm.searchByGenre(genOption);
                                break;
                            case 5:
                                break;

                        }
                    }
                    case 6 -> {
                        System.out.println("Have a Good Day Sir !!!");
                        System.exit(0);
                    }
                }
            }
            else
                throw new invalidChoice();
        }
        catch(invalidChoice e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException Ime){
            System.out.println("Don't Be Dumb Bro You Need To Type Digits not Letters");
            inp.nextLine();
        }
    }
}
