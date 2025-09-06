package Library_Managment_Project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Interface_Classes {


    public interface Elements{
        void mainMenu();
        void searchBook();
        void Genre();
        void bookIssueSystem();
        void addBook();
    }
    static class Library extends Stored_Books.Books implements Elements {
        public static String Date = "";
        public static String userName = "";
        public static String issue = "";
        public static String issueType = "";
        static LocalDateTime ldt = LocalDateTime.now();
        static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy || HH : mm");
        public static Scanner inp = new Scanner(System.in);
        public static int choice,bookCode;
        public static String bookName,bookAuthor;
        public static String updatedBookInfo;

        @Override
        public void mainMenu(){
            System.out.println("""
                    =============================
                            Welcome Buddy
                    =============================
                    
                    -------- Main Menu -----------
                    1. Books In This Library
                    2. Books Available
                    3. Search Any Book
                    4. Add Book
                    5. Issue Any Book
                    6. Exit""");
        }

        @Override
        public void searchBook() {
            System.out.println("""
                    -------------------------
                    1. Search By Author
                    2. Search By Name
                    3. Search By Code
                    4. Search By Genre
                    5. Go Back""");
        }

        @Override
        public void Genre() {
            System.out.println("""
                ------------------------------------------------------------------------------------------------
                1.  Action And Adventure         2.  Classics                   3.  Comic Books Or Graphic Novel
                4.  Detective and Mystery        5.  Fantasy                    6.  Historical Fiction
                7.  Horror                       8.  Romance                    9.  Science Fiction
                10. Short Stories                11. Suspense and Thrillers     12. Biographies and Autobiographies
                13. Cookbooks                    14. Poetry                     15. Self-Help and Personal Development
                16. Drama                        17. Science                    18. Philosophy
                19. Children's                   20. Young Adult                21. Mystery
                22. Historical Non-Fiction       23. Business and Finance       24. Health and Fitness         
                25. Art and Photography          26. Music                      27. Sports and Outdoors        
                28. Education and Reference      29. Religion and Spirituality  30. Parenting and Family       
                31. True Crime                   32. Technology and Computing   33. Psychology                 
                34. Sociology                    35. Political Science          36. Mythology                 
                37. Paranormal                   38. Travel                     39. Humor
                --------------------------------------------------------------------------------------------------""");
        }


        @Override
        public void addBook() {
            System.out.println("""
                    --------------------------
                    1. Add New Book
                    2. Update Book Name
                    3. Update Author Name
                    4. Exit To Menu""");
        }

        @Override
        public void bookIssueSystem() {
            System.out.println("""
                    -----------------------------------------
                         Welcome To Book Issue Section
                    -----------------------------------------
                    1. Issue a Book
                    2. Submit a Book
                    3. FeedBack For Our Service or Complain About Book/Misprint/Author/Issued/Late etc.
                    """);
        }


    }
}