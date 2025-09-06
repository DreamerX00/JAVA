package Library_Managment_Project;

import java.util.Map;

public class activateAllBooks extends Interface_Classes.Library {
    static Stored_Books.Books sb = new Stored_Books.Books();
    public static void printAllBooks() {
        activateAll();
        printBooksInGenre("Action and Adventure", sb.actionAndAdventure);
        printBooksInGenre("Classics", sb.classics);
        printBooksInGenre("Comics", sb.comicBooksOrGraphicNovel);
        printBooksInGenre("Detective and Mystery", sb.detectiveAndMystery);
        printBooksInGenre("Fantasy", sb.fantasy);
        printBooksInGenre("Historical Fiction", sb.historicalFiction);
        printBooksInGenre("Horror", sb.horror);
        printBooksInGenre("Romance", sb.romance);
        printBooksInGenre("Science Fiction", sb.scienceFiction);
        printBooksInGenre("Short Stories", sb.shortStories);
        printBooksInGenre("Suspense and Thrillers", sb.suspenseAndThrillers);
        printBooksInGenre("Biographies and Autobiographies", sb.biographiesAndAutobiographies);
        printBooksInGenre("Cookbooks", sb.cookbooks);
        printBooksInGenre("Poetry", sb.poetry);
        printBooksInGenre("Self-Help and Personal Development", sb.selfHelpAndPersonalDevelopment);
        printBooksInGenre("Travel", sb.travel);
        printBooksInGenre("Humor", sb.humor);
        printBooksInGenre("Drama", sb.drama);
        printBooksInGenre("Science", sb.science);
        printBooksInGenre("Philosophy", sb.philosophy);
        printBooksInGenre("Children", sb.children);
        printBooksInGenre("Young Adult", sb.youngAdult);
        printBooksInGenre("Mystery", sb.mystery);
        printBooksInGenre("Historical Non-Fiction", sb.historicalNonFiction);
        printBooksInGenre("Business and Finance", sb.businessAndFinance);
        printBooksInGenre("Health and Fitness", sb.healthAndFitness);
        printBooksInGenre("Art and Photography", sb.artAndPhotography);
        printBooksInGenre("Music", sb.music);
        printBooksInGenre("Sports and Outdoors", sb.sportsAndOutdoors);
        printBooksInGenre("Education and Reference", sb.educationAndReference);
        printBooksInGenre("Religion and Spirituality", sb.religionAndSpirituality);
        printBooksInGenre("Parenting and Family", sb.parentingAndFamily);
        printBooksInGenre("True Crime", sb.trueCrime);
        printBooksInGenre("Technology and Computing", sb.technologyAndComputing);
        printBooksInGenre("Psychology", sb.psychology);
        printBooksInGenre("Sociology", sb.sociology);
        printBooksInGenre("Political Science", sb.politicalScience);
        printBooksInGenre("Mythology", sb.mythology);
        printBooksInGenre("Paranormal", sb.paranormal);
        printBooksInGenre("Travel",sb.travel);
        printBooksInGenre("Humor",sb.humor);
    }

    private static void printBooksInGenre(String genre, Map<Integer, String> books) {
        System.out.println("Books in " + genre + ":");
        for (Map.Entry<Integer, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
    public static void activateAll(){
        sb.systemBooksInAction();
        sb.systemBooksInClassics();
        sb.systemBooksInComics();
        sb.systemBooksInDetectiveAndMystery();
        sb.systemBooksInFantasy();
        sb.systemBooksInHistoricalFiction();
        sb.systemBooksInHorror();
        sb.systemBooksInRomance();
        sb.systemBooksInScienceFiction();
        sb.systemBooksInSuspenseAndThrillers();
        sb.systemBooksInBiographiesAndAutobiographies();
        sb.systemBooksInCookbooks();
        sb.systemBooksInPoetry();
        sb.systemBooksInSelfHelpAndPersonalDevelopment();
        sb.systemBooksInDrama();
        sb.systemBooksInScience();
        sb.systemBooksInPhilosophy();
        sb.systemBooksInChildren();
        sb.systemBooksInYoungAdult();
        sb.systemBooksInMystery();
        sb.systemBooksInHistoricalNonFiction();
        sb.systemBooksInBusinessAndFinance();
        sb.systemBooksInHealthAndFitness();
        sb.systemBooksInArtAndPhotography();
        sb.systemBooksInMusic();
        sb.systemBooksInSportsAndOutdoors();
        sb.systemBooksInEducationAndReference();
        sb.systemBooksInReligionAndSpirituality();
        sb.systemBooksInParentingAndFamily();
        sb.systemBooksInTrueCrime();
        sb.systemBooksInTechnologyAndComputing();
        sb.systemBooksInPsychology();
        sb.systemBooksInSociology();
        sb.systemBooksInPoliticalScience();
        sb.systemBooksInMythology();
        sb.systemBooksInParanormal();
        sb.systemBooksInTravel();
        sb.systemBooksInHumor();
        sb.systemBooksInShortStories();
    }

}
