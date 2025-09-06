package Library_Managment_Project;
import java.util.*;

interface searchMethods{
    void searchByCode(int code);
    void searchByGenre(int choice);
    List<String> searchByAuthor(String Name);
    List<String> searchByName(String Name);
}

public class searchingMethod extends activateAllBooks implements searchMethods {
    public void searchByCode(int code) {
        if (sb.actionAndAdventure.containsKey(code)) {
            System.out.println("Action And Adventure: " + sb.actionAndAdventure.get(code));
        } else if (sb.artAndPhotography.containsKey(code)) {
            System.out.println("Art And Photography: " + sb.artAndPhotography.get(code));
        } else if (sb.classics.containsKey(code)) {
            System.out.println("Classics: " + sb.classics.get(code));
        } else if (sb.comicBooksOrGraphicNovel.containsKey(code)) {
            System.out.println("Comic Books or Graphic Novel: " + sb.comicBooksOrGraphicNovel.get(code));
        } else if (sb.detectiveAndMystery.containsKey(code)) {
            System.out.println("Detective and Mystery: " + sb.detectiveAndMystery.get(code));
        } else if (sb.fantasy.containsKey(code)) {
            System.out.println("Fantasy: " + sb.fantasy.get(code));
        } else if (sb.historicalFiction.containsKey(code)) {
            System.out.println("Historical Fiction: " + sb.historicalFiction.get(code));
        } else if (sb.horror.containsKey(code)) {
            System.out.println("Horror: " + sb.horror.get(code));
        } else if (sb.romance.containsKey(code)) {
            System.out.println("Romance: " + sb.romance.get(code));
        } else if (sb.scienceFiction.containsKey(code)) {
            System.out.println("Science Fiction: " + sb.scienceFiction.get(code));
        } else if (sb.shortStories.containsKey(code)) {
            System.out.println("Short Stories: " + sb.shortStories.get(code));
        } else if (sb.suspenseAndThrillers.containsKey(code)) {
            System.out.println("Suspense and Thrillers: " + sb.suspenseAndThrillers.get(code));
        } else if (sb.biographiesAndAutobiographies.containsKey(code)) {
            System.out.println("Biographies and Autobiographies: " + sb.biographiesAndAutobiographies.get(code));
        } else if (sb.cookbooks.containsKey(code)) {
            System.out.println("Cookbooks: " + sb.cookbooks.get(code));
        } else if (sb.poetry.containsKey(code)) {
            System.out.println("Poetry: " + sb.poetry.get(code));
        } else if (sb.selfHelpAndPersonalDevelopment.containsKey(code)) {
            System.out.println("Self-Help and Personal Development: " + sb.selfHelpAndPersonalDevelopment.get(code));
        } else if (sb.travel.containsKey(code)) {
            System.out.println("Travel: " + sb.travel.get(code));
        } else if (sb.humor.containsKey(code)) {
            System.out.println("Humor: " + sb.humor.get(code));
        } else if (sb.drama.containsKey(code)) {
            System.out.println("Drama: " + sb.drama.get(code));
        } else if (sb.science.containsKey(code)) {
            System.out.println("Science: " + sb.science.get(code));
        } else if (sb.philosophy.containsKey(code)) {
            System.out.println("Philosophy: " + sb.philosophy.get(code));
        } else if (sb.children.containsKey(code)) {
            System.out.println("Children: " + sb.children.get(code));
        } else if (sb.youngAdult.containsKey(code)) {
            System.out.println("Young Adult: " + sb.youngAdult.get(code));
        } else if (sb.mystery.containsKey(code)) {
            System.out.println("Mystery: " + sb.mystery.get(code));
        } else if (sb.historicalNonFiction.containsKey(code)) {
            System.out.println("Historical Non-Fiction: " + sb.historicalNonFiction.get(code));
        } else if (sb.businessAndFinance.containsKey(code)) {
            System.out.println("Business and Finance: " + sb.businessAndFinance.get(code));
        } else if (sb.healthAndFitness.containsKey(code)) {
            System.out.println("Health and Fitness: " + sb.healthAndFitness.get(code));
        } else if (sb.music.containsKey(code)) {
            System.out.println("Music: " + sb.music.get(code));
        } else if (sb.sportsAndOutdoors.containsKey(code)) {
            System.out.println("Sports and Outdoors: " + sb.sportsAndOutdoors.get(code));
        } else if (sb.educationAndReference.containsKey(code)) {
            System.out.println("Education and Reference: " + sb.educationAndReference.get(code));
        } else if (sb.religionAndSpirituality.containsKey(code)) {
            System.out.println("Religion and Spirituality: " + sb.religionAndSpirituality.get(code));
        } else if (sb.parentingAndFamily.containsKey(code)) {
            System.out.println("Parenting and Family: " + sb.parentingAndFamily.get(code));
        } else if (sb.trueCrime.containsKey(code)) {
            System.out.println("True Crime: " + sb.trueCrime.get(code));
        } else if (sb.technologyAndComputing.containsKey(code)) {
            System.out.println("Technology and Computing: " + sb.technologyAndComputing.get(code));
        } else if (sb.psychology.containsKey(code)) {
            System.out.println("Psychology: " + sb.psychology.get(code));
        } else if (sb.sociology.containsKey(code)) {
            System.out.println("Sociology: " + sb.sociology.get(code));
        } else if (sb.politicalScience.containsKey(code)) {
            System.out.println("Political Science: " + sb.politicalScience.get(code));
        } else if (sb.mythology.containsKey(code)) {
            System.out.println("Mythology: " + sb.mythology.get(code));
        } else if (sb.paranormal.containsKey(code)) {
            System.out.println("Paranormal: " + sb.paranormal.get(code));
        } else {
            System.out.println("Invalid Genre Code");
        }
    }

    public void searchByGenre(int choice) {
        switch (choice) {
            case 1 -> {
                System.out.println("1. Action and Adventure");
                printGenreBooks(sb.actionAndAdventure, "Action and Adventure");
            }
            case 2 -> {
                System.out.println("2. Classics");
                printGenreBooks(sb.classics, "Classics");
            }
            case 3 -> {
                System.out.println("3. Comics");
                printGenreBooks(sb.comicBooksOrGraphicNovel, "Comics");
            }
            case 4 -> {
                System.out.println("4. Detective and Mystery");
                printGenreBooks(sb.detectiveAndMystery, "Detective and Mystery");
            }
            case 5 -> {
                System.out.println("5. Fantasy");
                printGenreBooks(sb.fantasy, "Fantasy");
            }
            case 6 -> {
                System.out.println("6. Historical Fiction");
                printGenreBooks(sb.historicalFiction, "Historical Fiction");
            }
            case 7 -> {
                System.out.println("7. Horror");
                printGenreBooks(sb.horror, "Horror");
            }
            case 8 -> {
                System.out.println("8. Romance");
                printGenreBooks(sb.romance, "Romance");
            }
            case 9 -> {
                System.out.println("9. Science Fiction");
                printGenreBooks(sb.scienceFiction, "Science Fiction");
            }
            case 10 -> {
                System.out.println("10. Short Stories");
                printGenreBooks(sb.shortStories, "Short Stories");
            }
            case 11 -> {
                System.out.println("11. Suspense and Thrillers");
                printGenreBooks(sb.suspenseAndThrillers, "Suspense and Thrillers");
            }
            case 12 -> {
                System.out.println("12. Biographies and Autobiographies");
                printGenreBooks(sb.biographiesAndAutobiographies, "Biographies and Autobiographies");
            }
            case 13 -> {
                System.out.println("13. Cookbooks");
                printGenreBooks(sb.cookbooks, "Cookbooks");
            }
            case 14 -> {
                System.out.println("14. Poetry");
                printGenreBooks(sb.poetry, "Poetry");
            }
            case 15 -> {
                System.out.println("15. Self-Help and Personal Development");
                printGenreBooks(sb.selfHelpAndPersonalDevelopment, "Self-Help and Personal Development");
            }
            case 16 -> {
                System.out.println("16. Drama");
                printGenreBooks(sb.drama, "Drama");
            }
            case 17 -> {
                System.out.println("17. Science");
                printGenreBooks(sb.science, "Science");
            }
            case 18 -> {
                System.out.println("18. Philosophy");
                printGenreBooks(sb.philosophy, "Philosophy");
            }
            case 19 -> {
                System.out.println("19. Children");
                printGenreBooks(sb.children, "Children");
            }
            case 20 -> {
                System.out.println("20. Young Adult");
                printGenreBooks(sb.youngAdult, "Young Adult");
            }
            case 21 -> {
                System.out.println("21. Mystery");
                printGenreBooks(sb.mystery, "Mystery");
            }
            case 22 -> {
                System.out.println("22. Historical Non-Fiction");
                printGenreBooks(sb.historicalNonFiction, "Historical Non-Fiction");
            }
            case 23 -> {
                System.out.println("23. Business and Finance");
                printGenreBooks(sb.businessAndFinance, "Business and Finance");
            }
            case 24 -> {
                System.out.println("24. Health and Fitness");
                printGenreBooks(sb.healthAndFitness, "Health and Fitness");
            }
            case 25 -> {
                System.out.println("25. Art and Photography");
                printGenreBooks(sb.artAndPhotography, "Art and Photography");
            }
            case 26 -> {
                System.out.println("26. Music");
                printGenreBooks(sb.music, "Music");
            }
            case 27 -> {
                System.out.println("27. Sports and Outdoors");
                printGenreBooks(sb.sportsAndOutdoors, "Sports and Outdoors");
            }
            case 28 -> {
                System.out.println("28. Education and Reference");
                printGenreBooks(sb.educationAndReference, "Education and Reference");
            }
            case 29 -> {
                System.out.println("29. Religion and Spirituality");
                printGenreBooks(sb.religionAndSpirituality, "Religion and Spirituality");
            }
            case 30 -> {
                System.out.println("30. Parenting and Family");
                printGenreBooks(sb.parentingAndFamily, "Parenting and Family");
            }
            case 31 -> {
                System.out.println("31. True Crime");
                printGenreBooks(sb.trueCrime, "True Crime");
            }
            case 32 -> {
                System.out.println("32. Technology and Computing");
                printGenreBooks(sb.technologyAndComputing, "Technology and Computing");
            }
            case 33 -> {
                System.out.println("33. Psychology");
                printGenreBooks(sb.psychology, "Psychology");
            }
            case 34 -> {
                System.out.println("34. Sociology");
                printGenreBooks(sb.sociology, "Sociology");
            }
            case 35 -> {
                System.out.println("35. Political Science");
                printGenreBooks(sb.politicalScience, "Political Science");
            }
            case 36 -> {
                System.out.println("36. Mythology");
                printGenreBooks(sb.mythology, "Mythology");
            }
            case 37 -> {
                System.out.println("37. Paranormal");
                printGenreBooks(sb.paranormal, "Paranormal");
            }
            case 38 -> {
                System.out.println("38. Travel");
                printGenreBooks(sb.travel, "Travel");
            }
            case 39 -> {
                System.out.println("39. Humor");
                printGenreBooks(sb.humor, "Humor");
            }
            default -> System.out.println("Invalid genre choice. Please choose a valid genre.");
        }

    }

    @Override
    public List<String> searchByAuthor(String author) {
        String authorLower = author.toLowerCase();
        Set<String> results = new HashSet<>();

        for (Map.Entry<String, Map<Integer, String>> genreEntry : getAllGenreMaps().entrySet()) {
            String genre = genreEntry.getKey();
            Map<Integer, String> genreMap = genreEntry.getValue();

            for (Map.Entry<Integer, String> entry : genreMap.entrySet()) {
                if (entry.getValue().toLowerCase().contains("~ by " + authorLower)) {
                    // Concatenate genre, book title, and author to create a unique identifier
                    String bookInfo = "\nGenre: " + genre + " || Book Found -> "+ "Code:- " +entry.getKey()+" Name :- "+ entry.getValue();
                    results.add(bookInfo);
                }
            }
        }

        if (results.isEmpty()) {
            results.add("Author Not Found in any genre");
        }

        // Convert the set to a list before returning
        return new ArrayList<>(results);
    }
    public List<String> searchByName(String book) {
        String bookLower = book.toLowerCase();
        Set<String> results = new HashSet<>();

        for (Map.Entry<String, Map<Integer, String>> genreEntry : getAllGenreMaps().entrySet()) {
            String genre = genreEntry.getKey();
            Map<Integer, String> genreMap = genreEntry.getValue();

            for (Map.Entry<Integer, String> entry : genreMap.entrySet()) {
                if (entry.getValue().toLowerCase().contains(bookLower)) {
                    // Concatenate genre, book title, and author to create a unique identifier
                    String bookInfo = "\nGenre: " + genre + " || Book Found -> "+ "Code:- " +entry.getKey()+" Name :- "+ entry.getValue();
                    results.add(bookInfo);
                }
            }
        }

        if (results.isEmpty()) {
            results.add("Book Not Found in any genre");
        }

        // Convert the set to a list before returning
        return new ArrayList<>(results);
    }

    private void printGenreBooks(Map<Integer, String> genreBooks, String genreName) {
        System.out.println(genreName);
        for (Map.Entry<Integer, String> entry : genreBooks.entrySet()) {
            System.out.println("Code: " + entry.getKey() + ", Book: " + entry.getValue());
        }
    }

    public Map<String, Map<Integer, String>> getAllGenreMaps() {
        Map<String, Map<Integer, String>> allGenreMaps = new HashMap<>();
        allGenreMaps.put("actionandadventure", sb.actionAndAdventure);
        allGenreMaps.put("classics", sb.classics);
        allGenreMaps.put("comicbooksorgraphicnovel", sb.comicBooksOrGraphicNovel);
        allGenreMaps.put("detectiveandmystery", sb.detectiveAndMystery);
        allGenreMaps.put("fantasy", sb.fantasy);
        allGenreMaps.put("historicalfiction", sb.historicalFiction);
        allGenreMaps.put("horror", sb.horror);
        allGenreMaps.put("romance", sb.romance);
        allGenreMaps.put("sciencefiction", sb.scienceFiction);
        allGenreMaps.put("shortstories", sb.shortStories);
        allGenreMaps.put("suspenseandthrillers", sb.suspenseAndThrillers);
        allGenreMaps.put("biographiesandautobiographies", sb.biographiesAndAutobiographies);
        allGenreMaps.put("cookbooks", sb.cookbooks);
        allGenreMaps.put("poetry", sb.poetry);
        allGenreMaps.put("selfhelpandpersonaldevelopment", sb.selfHelpAndPersonalDevelopment);
        allGenreMaps.put("travel", sb.travel);
        allGenreMaps.put("humor", sb.humor);
        allGenreMaps.put("drama", sb.drama);
        allGenreMaps.put("science", sb.science);
        allGenreMaps.put("philosophy", sb.philosophy);
        allGenreMaps.put("children", sb.children);
        allGenreMaps.put("youngadult", sb.youngAdult);
        allGenreMaps.put("mystery", sb.mystery);
        allGenreMaps.put("historicalnonfiction", sb.historicalNonFiction);
        allGenreMaps.put("businessandfinance", sb.businessAndFinance);
        allGenreMaps.put("healthandfitness", sb.healthAndFitness);
        allGenreMaps.put("artandphotography", sb.artAndPhotography);
        allGenreMaps.put("music", sb.music);
        allGenreMaps.put("sportsandoutdoors", sb.sportsAndOutdoors);
        allGenreMaps.put("educationandreference", sb.educationAndReference);
        allGenreMaps.put("religionandspirituality", sb.religionAndSpirituality);
        allGenreMaps.put("parentingandfamily", sb.parentingAndFamily);
        allGenreMaps.put("truecrime", sb.trueCrime);
        allGenreMaps.put("technologyandcomputing", sb.technologyAndComputing);
        allGenreMaps.put("psychology", sb.psychology);
        allGenreMaps.put("sociology", sb.sociology);
        allGenreMaps.put("politicalscience", sb.politicalScience);
        allGenreMaps.put("mythology", sb.mythology);
        allGenreMaps.put("paranormal", sb.paranormal);

        return allGenreMaps;
    }
    public Map<Integer, String> StoredBooks() {
        Map<Integer, String> allGenre = new HashMap<>();
        allGenre.putAll(sb.actionAndAdventure);
        allGenre.putAll(sb.classics);
        allGenre.putAll(sb.comicBooksOrGraphicNovel);
        allGenre.putAll(sb.detectiveAndMystery);
        allGenre.putAll(sb.fantasy);
        allGenre.putAll(sb.historicalFiction);
        allGenre.putAll(sb.horror);
        allGenre.putAll(sb.romance);
        allGenre.putAll(sb.scienceFiction);
        allGenre.putAll(sb.shortStories);
        allGenre.putAll(sb.suspenseAndThrillers);
        allGenre.putAll(sb.biographiesAndAutobiographies);
        allGenre.putAll(sb.cookbooks);
        allGenre.putAll(sb.poetry);
        allGenre.putAll(sb.selfHelpAndPersonalDevelopment);
        allGenre.putAll(sb.drama);
        allGenre.putAll(sb.science);
        allGenre.putAll(sb.philosophy);
        allGenre.putAll(sb.children);
        allGenre.putAll(sb.youngAdult);
        allGenre.putAll(sb.mystery);
        allGenre.putAll(sb.historicalNonFiction);
        allGenre.putAll(sb.businessAndFinance);
        allGenre.putAll(sb.healthAndFitness);
        allGenre.putAll(sb.artAndPhotography);
        allGenre.putAll(sb.music);
        allGenre.putAll(sb.sportsAndOutdoors);
        allGenre.putAll(sb.educationAndReference);
        allGenre.putAll(sb.religionAndSpirituality);
        allGenre.putAll(sb.parentingAndFamily);
        allGenre.putAll(sb.trueCrime);
        allGenre.putAll(sb.technologyAndComputing);
        allGenre.putAll(sb.psychology);
        allGenre.putAll(sb.sociology);
        allGenre.putAll(sb.politicalScience);
        allGenre.putAll(sb.mythology);
        allGenre.putAll(sb.paranormal);
        allGenre.putAll(sb.travel);
        allGenre.putAll(sb.humor);

        return allGenre;
    }

}




