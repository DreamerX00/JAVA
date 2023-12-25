package Library_Managment_Project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

interface systemMap{
    void addBook(String Name,String Author,int code);
    void getBook(int code);
    void feedBack();
}
public class bookIssueSystem extends searchingMethod implements systemMap{
    @Override
    public void addBook(String Name, String Author, int code) {
    if (checkDuplicate(code)){
        Genre();
        System.out.println("Select The Genre Type ");
        int choice = inp.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("1. Action and Adventure");
                    sb.actionAndAdventure.put(code, Name + " ~ By " + Author);
                }
                case 2 -> {
                    System.out.println("2. Classics");
                    sb.classics.put(code, Name + " ~ By " + Author);
                }
                case 3 -> {
                    System.out.println("3. Comics");
                    sb.comicBooksOrGraphicNovel.put(code, Name + " ~ By " + Author);
                }
                case 4 -> {
                    System.out.println("4. Detective and Mystery");
                    sb.detectiveAndMystery.put(code, Name + " ~ By " + Author);
                }
                case 5 -> {
                    System.out.println("5. Fantasy");
                    sb.fantasy.put(code, Name + " ~ By " + Author);
                }
                case 6 -> {
                    System.out.println("6. Historical Fiction");
                    sb.historicalFiction.put(code, Name + " ~ By " + Author);
                }
                case 7 -> {
                    System.out.println("7. Horror");
                    sb.horror.put(code, Name + " ~ By " + Author);
                }
                case 8 -> {
                    System.out.println("8. Romance");
                    sb.romance.put(code, Name + " ~ By " + Author);
                }
                case 9 -> {
                    System.out.println("9. Science Fiction");
                    sb.scienceFiction.put(code, Name + " ~ By " + Author);
                }
                case 10 -> {
                    System.out.println("10. Short Stories");
                    sb.shortStories.put(code, Name + " ~ By " + Author);
                }
                case 11 -> {
                    System.out.println("11. Suspense and Thrillers");
                    sb.suspenseAndThrillers.put(code, Name + " ~ By " + Author);
                }
                case 12 -> {
                    System.out.println("12. Biographies and Autobiographies");
                    sb.biographiesAndAutobiographies.put(code, Name + " ~ By " + Author);
                }
                case 13 -> {
                    System.out.println("13. Cookbooks");
                    sb.cookbooks.put(code, Name + " ~ By " + Author);
                }
                case 14 -> {
                    System.out.println("14. Poetry");
                    sb.poetry.put(code, Name + " ~ By " + Author);
                }
                case 15 -> {
                    System.out.println("15. Self-Help and Personal Development");
                    sb.selfHelpAndPersonalDevelopment.put(code, Name + " ~ By " + Author);
                }
                case 16 -> {
                    System.out.println("16. Drama");
                    sb.drama.put(code, Name + " ~ By " + Author);
                }
                case 17 -> {
                    System.out.println("17. Science");
                    sb.science.put(code, Name + " ~ By " + Author);
                }
                case 18 -> {
                    System.out.println("18. Philosophy");
                    sb.philosophy.put(code, Name + " ~ By " + Author);
                }
                case 19 -> {
                    System.out.println("19. Children");
                    sb.children.put(code, Name + " ~ By " + Author);
                }
                case 20 -> {
                    System.out.println("20. Young Adult");
                    sb.youngAdult.put(code, Name + " ~ By " + Author);
                }
                case 21 -> {
                    System.out.println("21. Mystery");
                    sb.mystery.put(code, Name + " ~ By " + Author);
                }
                case 22 -> {
                    System.out.println("22. Historical Non-Fiction");
                    sb.historicalNonFiction.put(code, Name + " ~ By " + Author);
                }
                case 23 -> {
                    System.out.println("23. Business and Finance");
                    sb.businessAndFinance.put(code, Name + " ~ By " + Author);
                }
                case 24 -> {
                    System.out.println("24. Health and Fitness");
                    sb.healthAndFitness.put(code, Name + " ~ By " + Author);
                }
                case 25 -> {
                    System.out.println("25. Art and Photography");
                    sb.artAndPhotography.put(code, Name + " ~ By " + Author);
                }
                case 26 -> {
                    System.out.println("26. Music");
                    sb.music.put(code, Name + " ~ By " + Author);
                }
                case 27 -> {
                    System.out.println("27. Sports and Outdoors");
                    sb.sportsAndOutdoors.put(code, Name + " ~ By " + Author);
                }
                case 28 -> {
                    System.out.println("28. Education and Reference");
                    sb.educationAndReference.put(code, Name + " ~ By " + Author);
                }
                case 29 -> {
                    System.out.println("29. Religion and Spirituality");
                    sb.religionAndSpirituality.put(code, Name + " ~ By " + Author);
                }
                case 30 -> {
                    System.out.println("30. Parenting and Family");
                    sb.parentingAndFamily.put(code, Name + " ~ By " + Author);
                }
                case 31 -> {
                    System.out.println("31. True Crime");
                    sb.trueCrime.put(code, Name + " ~ By " + Author);
                }
                case 32 -> {
                    System.out.println("32. Technology and Computing");
                    sb.technologyAndComputing.put(code, Name + " ~ By " + Author);
                }
                case 33 -> {
                    System.out.println("33. Psychology");
                    sb.psychology.put(code, Name + " ~ By " + Author);
                }
                case 34 -> {
                    System.out.println("34. Sociology");
                    sb.sociology.put(code, Name + " ~ By " + Author);
                }
                case 35 -> {
                    System.out.println("35. Political Science");
                    sb.politicalScience.put(code, Name + " ~ By " + Author);
                }
                case 36 -> {
                    System.out.println("36. Mythology");
                    sb.mythology.put(code, Name + " ~ By " + Author);
                }
                case 37 -> {
                    System.out.println("37. Paranormal");
                    sb.paranormal.put(code, Name + " ~ By " + Author);
                }
                case 38 -> {
                    System.out.println("38. Travel");
                    sb.travel.put(code, Name + " ~ By " + Author);
                }
                case 39 -> {
                    System.out.println("39. Humor");
                    sb.humor.put(code, Name + " ~ By " + Author);
                }
                default -> System.out.println("Invalid choice");
            }
        System.out.println("Congratulation Your Book Is Added In The Library");
        }
    }
    private boolean checkDuplicate(int code){
        if(StoredBooks().containsKey(code)){
            System.out.println("Code Exist For The Book : "+StoredBooks().get(code));
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public void getBook(int code) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy || HH : mm");
        String userName = "";
        String issueDate;
        issueDate = dt.format(format);
        String bookTitle,updatedBookInfo = "";

        Map<Integer, String> storedBooks = StoredBooks(); // Retrieve the map once

        if (!checkStatus(storedBooks, code)) {
            inp.nextLine();
            System.out.print("Enter Your Name: ");
            userName = inp.nextLine();

            bookTitle = storedBooks.get(code);
            updatedBookInfo = bookTitle + ("Issued To: " + userName + " on: " + issueDate);

            // Update the book information in the storedBooks map directly
            storedBooks.put(code, updatedBookInfo);

            System.out.println("Congratulations " + storedBooks.get(code));
        } else {
            System.out.println("Book Already Issued To User: " + userName + " On " + issueDate);
        }
        storedBooks.put(code, updatedBookInfo);
    }

    @Override
    public void feedBack() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy || HH : mm");
        System.out.print("""
                =====================================
                  Welcome To Our FeedBack Window
                =====================================
                """);
        Date = now.format(format);
        System.out.println("Current Time "+Date);
        inp.nextLine();
        System.out.print("Enter Your Name : ");
        userName = inp.nextLine();
        System.out.print("Enter The Type of Issue / Appreciation / Suggestion : ");
        issueType = inp.nextLine();
        System.out.println("Type Your Statement Below :");
        issue = inp.nextLine();
        System.out.println("Thanks For Your FeedBack and Have A Good Day");

    }

    private boolean checkStatus(Map<Integer, String> storedBooks, int code) {
        // Check if the book information contains the username (indicating it's already issued)
        return storedBooks.get(code).contains("Issued To : ");
    }

}
