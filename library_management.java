import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class library_management {
    public static void main(String[] args) {

    }
}
interface Elements{
    void mainMenu();
    void searchBook();
    void Genre();
    void bookIssueSystem();
    void addBook();

}
class booksInterface{
    Map<Integer, String> actionAndAdventure = new HashMap<>();
    Map<Integer, String> classics = new HashMap<>();
    Map<Integer, String> comicBooksOrGraphicNovel = new HashMap<>();
    Map<Integer, String> detectiveAndMystery = new HashMap<>();
    Map<Integer, String> fantasy = new HashMap<>();
    Map<Integer, String> historicalFiction = new HashMap<>();
    Map<Integer, String> horror = new HashMap<>();
    Map<Integer, String> romance = new HashMap<>();
    Map<Integer, String> scienceFiction = new HashMap<>();
    Map<Integer, String> shortStories = new HashMap<>();
    Map<Integer, String> suspenseAndThrillers = new HashMap<>();
    Map<Integer, String> biographiesAndAutobiographies = new HashMap<>();
    Map<Integer, String> cookbooks = new HashMap<>();
    Map<Integer, String> poetry = new HashMap<>();
    Map<Integer, String> selfHelpAndPersonalDevelopment = new HashMap<>();
    Map<Integer, String> travel = new HashMap<>();
    Map<Integer, String> humor = new HashMap<>();
    Map<Integer, String> drama = new HashMap<>();
    Map<Integer, String> science = new HashMap<>();
    Map<Integer, String> philosophy = new HashMap<>();
    Map<Integer, String> children = new HashMap<>();
    Map<Integer, String> youngAdult = new HashMap<>();
    Map<Integer, String> mystery = new HashMap<>();
    Map<Integer, String> historicalNonFiction = new HashMap<>();
    Map<Integer, String> businessAndFinance = new HashMap<>();
    Map<Integer, String> healthAndFitness = new HashMap<>();
    Map<Integer, String> artAndPhotography = new HashMap<>();
    Map<Integer, String> music = new HashMap<>();
    Map<Integer, String> sportsAndOutdoors = new HashMap<>();
    Map<Integer, String> educationAndReference = new HashMap<>();
    Map<Integer, String> religionAndSpirituality = new HashMap<>();
    Map<Integer, String> parentingAndFamily = new HashMap<>();
    Map<Integer, String> trueCrime = new HashMap<>();
    Map<Integer, String> technologyAndComputing = new HashMap<>();
    Map<Integer, String> psychology = new HashMap<>();
    Map<Integer, String> sociology = new HashMap<>();
    Map<Integer, String> politicalScience = new HashMap<>();
    Map<Integer, String> philosophyGenre = new HashMap<>();
    Map<Integer, String> mythology = new HashMap<>();
    Map<Integer, String> paranormal = new HashMap<>();
}
class Books extends booksInterface{
    void systemBooks(){
        actionAndAdventure.put()
    }
}
public class Library implements Elements extends Books{
    Scanner inp = new Scanner(System.in);

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
                5. Exit""");
    }

    @Override
    public void searchBook() {
        System.out.println("""
                -------------------------
                1. Search By Author
                2. Search By Name
                3. Search By Code""");
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
            16. Travel                       17. Humor                      18. Drama
            19. Science                      20. Philosophy                 21. Children's
            22. Young Adult                  23. Mystery                    24. Historical Non-Fiction
            25. Business and Finance         26. Health and Fitness         27. Art and Photography
            28. Music                        29. Sports and Outdoors        30. Education and Reference
            31. Religion and Spirituality    32. Parenting and Family       33. True Crime
            34. Technology and Computing     35. Psychology                 36. Sociology
            37. Political Science            38. Philosophy                 39. Mythology
            40. Paranormal
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
}
