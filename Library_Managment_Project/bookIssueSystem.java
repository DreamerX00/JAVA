package Library_Managment_Project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

interface systemMap{
    void addBook(String Name,String Author,int code);
    void getBook(int code,String issueDate,String userName);
    void feedBack();
    void printUnissuedBooks();
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
    public void getBook(int code,String issueDate,String userName) {
        StoredBooks();
        String bookTitle;
        if (!StoredBooks().get(code).contains("Issued To")) {
            Genre();
            bookTitle = " " + StoredBooks().get(code);
            updatedBookInfo = bookTitle + " Issued To " + userName + " On " + issueDate;
            System.out.print("Select The Genre :");
            int choice = inp.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("1. Action and Adventure");
                    sb.actionAndAdventure.put(code, updatedBookInfo);
                }
                case 2 -> {
                    System.out.println("2. Classics");
                    sb.classics.put(code, updatedBookInfo);
                }
                case 3 -> {
                    System.out.println("3. Comics");
                    sb.comicBooksOrGraphicNovel.put(code, updatedBookInfo);
                }
                case 4 -> {
                    System.out.println("4. Detective and Mystery");
                    sb.detectiveAndMystery.put(code, updatedBookInfo);
                }
                case 5 -> {
                    System.out.println("5. Fantasy");
                    sb.fantasy.put(code, updatedBookInfo);
                }
                case 6 -> {
                    System.out.println("6. Historical Fiction");
                    sb.historicalFiction.put(code, updatedBookInfo);
                }
                case 7 -> {
                    System.out.println("7. Horror");
                    sb.horror.put(code, updatedBookInfo);
                }
                case 8 -> {
                    System.out.println("8. Romance");
                    sb.romance.put(code, updatedBookInfo);
                }
                case 9 -> {
                    System.out.println("9. Science Fiction");
                    sb.scienceFiction.put(code, updatedBookInfo);
                }
                case 10 -> {
                    System.out.println("10. Short Stories");
                    sb.shortStories.put(code, updatedBookInfo);
                }
                case 11 -> {
                    System.out.println("11. Suspense and Thrillers");
                    sb.suspenseAndThrillers.put(code, updatedBookInfo);
                }
                case 12 -> {
                    System.out.println("12. Biographies and Autobiographies");
                    sb.biographiesAndAutobiographies.put(code, updatedBookInfo);
                }
                case 13 -> {
                    System.out.println("13. Cookbooks");
                    sb.cookbooks.put(code, updatedBookInfo);
                }
                case 14 -> {
                    System.out.println("14. Poetry");
                    sb.poetry.put(code, updatedBookInfo);
                }
                case 15 -> {
                    System.out.println("15. Self-Help and Personal Development");
                    sb.selfHelpAndPersonalDevelopment.put(code, updatedBookInfo);
                }
                case 16 -> {
                    System.out.println("16. Drama");
                    sb.drama.put(code, updatedBookInfo);
                }
                case 17 -> {
                    System.out.println("17. Science");
                    sb.science.put(code, updatedBookInfo);
                }
                case 18 -> {
                    System.out.println("18. Philosophy");
                    sb.philosophy.put(code, updatedBookInfo);
                }
                case 19 -> {
                    System.out.println("19. Children");
                    sb.children.put(code, updatedBookInfo);
                }
                case 20 -> {
                    System.out.println("20. Young Adult");
                    sb.youngAdult.put(code, updatedBookInfo);
                }
                case 21 -> {
                    System.out.println("21. Mystery");
                    sb.mystery.put(code, updatedBookInfo);
                }
                case 22 -> {
                    System.out.println("22. Historical Non-Fiction");
                    sb.historicalNonFiction.put(code, updatedBookInfo);
                }
                case 23 -> {
                    System.out.println("23. Business and Finance");
                    sb.businessAndFinance.put(code, updatedBookInfo);
                }
                case 24 -> {
                    System.out.println("24. Health and Fitness");
                    sb.healthAndFitness.put(code, updatedBookInfo);
                }
                case 25 -> {
                    System.out.println("25. Art and Photography");
                    sb.artAndPhotography.put(code, updatedBookInfo);
                }
                case 26 -> {
                    System.out.println("26. Music");
                    sb.music.put(code, updatedBookInfo);
                }
                case 27 -> {
                    System.out.println("27. Sports and Outdoors");
                    sb.sportsAndOutdoors.put(code, updatedBookInfo);
                }
                case 28 -> {
                    System.out.println("28. Education and Reference");
                    sb.educationAndReference.put(code, updatedBookInfo);
                }
                case 29 -> {
                    System.out.println("29. Religion and Spirituality");
                    sb.religionAndSpirituality.put(code, updatedBookInfo);
                }
                case 30 -> {
                    System.out.println("30. Parenting and Family");
                    sb.parentingAndFamily.put(code, updatedBookInfo);
                }
                case 31 -> {
                    System.out.println("31. True Crime");
                    sb.trueCrime.put(code, updatedBookInfo);
                }
                case 32 -> {
                    System.out.println("32. Technology and Computing");
                    sb.technologyAndComputing.put(code, updatedBookInfo);
                }
                case 33 -> {
                    System.out.println("33. Psychology");
                    sb.psychology.put(code, updatedBookInfo);
                }
                case 34 -> {
                    System.out.println("34. Sociology");
                    sb.sociology.put(code, updatedBookInfo);
                }
                case 35 -> {
                    System.out.println("35. Political Science");
                    sb.politicalScience.put(code, updatedBookInfo);
                }
                case 36 -> {
                    System.out.println("36. Mythology");
                    sb.mythology.put(code, updatedBookInfo);
                }
                case 37 -> {
                    System.out.println("37. Paranormal");
                    sb.paranormal.put(code, updatedBookInfo);
                }
                case 38 -> {
                    System.out.println("38. Travel");
                    sb.travel.put(code, updatedBookInfo);
                }
                case 39 -> {
                    System.out.println("39. Humor");
                    sb.humor.put(code, updatedBookInfo);
                }
                default -> System.out.println("Invalid choice");
            }

            System.out.println("Congratulation The Book "+updatedBookInfo+" Successfully");
        }
        else
            System.out.println("Sorry "+userName+" "+updatedBookInfo+" And Will Be Available in 2 Days");
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
    public void printUnissuedBooks() {
        for (Map.Entry<Integer, String> entry : StoredBooks().entrySet()) {
            if (!entry.getValue().toLowerCase().contains("Issued To".toLowerCase())) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}
