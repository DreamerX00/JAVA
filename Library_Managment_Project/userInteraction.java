package Library_Managment_Project;
import java.util.InputMismatchException;

public class userInteraction extends bookIssueSystem{
    public static void menuChoice(){
        try{
            Interface_Classes.Library lb = new Interface_Classes.Library();
            searchingMethod sm = new searchingMethod();
            bookIssueSystem bis = new bookIssueSystem();
            lb.mainMenu();
            System.out.print("\n->");
            int option = inp.nextInt();
            if (option > 0 && option <= 6){
                switch (option) {
                    case 1 -> printAllBooks();
                    case 2 -> {
                        System.out.println("Unissued Books In Thi Library");
                        bis.printUnissuedBooks();
                    }
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
                    case 4 -> {
                        System.out.println("Welcome Writer Please Fill Up The Info. Below:");
                        inp.nextLine();
                        System.out.print("Enter The Book Author Name : ");
                        inp.nextLine();
                        String userAuthor = inp.nextLine();
                        System.out.print("Enter The Book Name : ");
                        String userBook = inp.nextLine();
                        System.out.print("Enter The Book Code (Unique) : ");
                        int userCode = inp.nextInt();
                        inp.nextLine();
                        bis.addBook(userBook,userAuthor,userCode);
                    }
                    case 5 -> {
                        lb.bookIssueSystem();
                        System.out.print("-->");
                        int choice = inp.nextInt();
                        switch (choice) {
                            case 1 -> {
                                String date = ldt.format(dtf);
                                System.out.println("Welcome Learner Feel Free To Issue Any Book :");
                                inp.nextLine();
                                System.out.print("Enter The Book Code : ");
                                int bookCode = inp.nextInt();
                                inp.nextLine();
                                System.out.print("Enter Your Name : ");
                                userName = inp.nextLine();
                                bis.getBook(bookCode,date,userName);
                            }
                            case 3 -> bis.feedBack();
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
