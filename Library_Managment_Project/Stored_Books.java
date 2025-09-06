package Library_Managment_Project;

import java.util.HashMap;
import java.util.Map;

public class Stored_Books {
    public static class booksInterface{
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
        Map<Integer, String> mythology = new HashMap<>();
        Map<Integer, String> paranormal = new HashMap<>();
    }
    public static class Books extends booksInterface {
        void systemBooksInAction() {
            actionAndAdventure.put(101, "Black Flag ~ By David Ricciardi");
            actionAndAdventure.put(102, "The Sentinel ~ By Lee Child and Andrew Child");
            actionAndAdventure.put(103, "Hour of The Assassin ~ By Matthew Quirk");
            actionAndAdventure.put(104, "Wrath of Poseidon~ By Clive Cussler and Robin Burcell");
            actionAndAdventure.put(105, "The Ancient Nine ~ By Ian K. Smith");
            actionAndAdventure.put(106, "Coastal Pursuit ~ By J.D. Dudycha");
            actionAndAdventure.put(107, "Savage Son ~ By Jack Carr");
            actionAndAdventure.put(108, "Gale Force ~ By Owen Laukkanen");
            actionAndAdventure.put(109, "The White Road ~ By Sarah Lotz");
            actionAndAdventure.put(110, "Empire of Lies ~ By Raymond Khoury");
        }

        void systemBooksInClassics() {
            classics.put(201, "Pride and Prejudice ~ By Jane Austen");
            classics.put(202, "To Kill a Mockingbird ~ By Harper Lee");
            classics.put(203, "1984 ~ By George Orwell");
            classics.put(204, "The Great Gatsby ~ By F. Scott Fitzgerald");
            classics.put(205, "Moby-Dick ~ By Herman Melville");
            classics.put(206, "War and Peace ~ By Leo Tolstoy");
            classics.put(207, "Crime and Punishment ~ By Fyodor Dostoevsky");
            classics.put(208, "Wuthering Heights ~ By Emily Brontë");
            classics.put(209, "Jane Eyre ~ By Charlotte Brontë");
            classics.put(210, "Great Expectations ~ By Charles Dickens");
        }

        void systemBooksInComics() {
            comicBooksOrGraphicNovel.put(301, "Maus ~ By Art Spiegelman");
            comicBooksOrGraphicNovel.put(302, "Watchmen ~ By Alan Moore and Dave Gibbons");
            comicBooksOrGraphicNovel.put(303, "Persepolis ~ By Marjane Satrapi");
            comicBooksOrGraphicNovel.put(304, "Blankets ~ By Craig Thompson");
            comicBooksOrGraphicNovel.put(305, "Fun Home ~ By Alison Bechdel");
            comicBooksOrGraphicNovel.put(306, "Batman: The Dark Knight Returns ~ By Frank Miller");
            comicBooksOrGraphicNovel.put(307, "Sandman ~ By Neil Gaiman");
            comicBooksOrGraphicNovel.put(308, "Saga ~ By Brian K. Vaughan and Fiona Staples");
            comicBooksOrGraphicNovel.put(309, "Persepolis ~ By Marjane Satrapi");
            comicBooksOrGraphicNovel.put(310, "V for Vendetta ~ By Alan Moore and David Lloyd");
        }

        void systemBooksInDetectiveAndMystery() {
            detectiveAndMystery.put(401, "The Girl with the Dragon Tattoo ~ By Stieg Larsson");
            detectiveAndMystery.put(402, "Gone Girl ~ By Gillian Flynn");
            detectiveAndMystery.put(403, "The Da Vinci Code ~ By Dan Brown");
            detectiveAndMystery.put(404, "The Big Sleep ~ By Raymond Chandler");
            detectiveAndMystery.put(405, "In the Woods ~ By Tana French");
            detectiveAndMystery.put(406, "The Hound of the Baskervilles ~ By Arthur Conan Doyle");
            detectiveAndMystery.put(407, "Gorky Park ~ By Martin Cruz Smith");
            detectiveAndMystery.put(408, "The No. 1 Ladies' Detective Agency ~ By Alexander McCall Smith");
            detectiveAndMystery.put(409, "The Woman in the Window ~ By A.J. Finn");
            detectiveAndMystery.put(410, "The Silent Patient ~ By Alex Michaelides");
        }

        void systemBooksInFantasy() {
            fantasy.put(501, "The Hobbit ~ By J.R.R. Tolkien");
            fantasy.put(502, "Harry Potter and the Sorcerer's Stone ~ By J.K. Rowling");
            fantasy.put(503, "The Name of the Wind ~ By Patrick Rothfuss");
            fantasy.put(504, "A Game of Thrones ~ By George R.R. Martin");
            fantasy.put(505, "The Fellowship of the Ring ~ By J.R.R. Tolkien");
            fantasy.put(506, "The Chronicles of Narnia ~ By C.S. Lewis");
            fantasy.put(507, "Mistborn: The Final Empire ~ By Brandon Sanderson");
            fantasy.put(508, "The Wheel of Time ~ By Robert Jordan");
            fantasy.put(509, "Eragon ~ By Christopher Paolini");
            fantasy.put(510, "The Magicians ~ By Lev Grossman");
        }

        void systemBooksInHistoricalFiction() {
            historicalFiction.put(601, "All the Light We Cannot See ~ By Anthony Doerr");
            historicalFiction.put(602, "The Book Thief ~ By Markus Zusak");
            historicalFiction.put(603, "The Nightingale ~ By Kristin Hannah");
            historicalFiction.put(604, "The Pillars of the Earth ~ By Ken Follett");
            historicalFiction.put(605, "Atonement ~ By Ian McEwan");
            historicalFiction.put(606, "The Other Boleyn Girl ~ By Philippa Gregory");
            historicalFiction.put(607, "The Tattooist of Auschwitz ~ By Heather Morris");
            historicalFiction.put(608, "The Dutch House ~ By Ann Patchett");
            historicalFiction.put(609, "The Great Alone ~ By Kristin Hannah");
            historicalFiction.put(610, "The Night Watchman ~ By Louise Erdrich");
        }
        void systemBooksInHorror() {
            horror.put(701, "Dracula ~ By Bram Stoker");
            horror.put(702, "Frankenstein ~ By Mary Shelley");
            horror.put(703, "The Shining ~ By Stephen King");
            horror.put(704, "It ~ By Stephen King");
            horror.put(705, "The Exorcist ~ By William Peter Blatty");
            horror.put(706, "The Haunting of Hill House ~ By Shirley Jackson");
            horror.put(707, "Bird Box ~ By Josh Malerman");
            horror.put(708, "Pet Sematary ~ By Stephen King");
            horror.put(709, "Psycho ~ By Robert Bloch");
            horror.put(710, "The Silence of the Lambs ~ By Thomas Harris");
        }
        void systemBooksInRomance() {
            romance.put(801, "Pride and Prejudice ~ By Jane Austen");
            romance.put(802, "Outlander ~ By Diana Gabaldon");
            romance.put(803, "The Notebook ~ By Nicholas Sparks");
            romance.put(804, "Gone with the Wind ~ By Margaret Mitchell");
            romance.put(805, "Me Before You ~ By Jojo Moyes");
            romance.put(806, "Jane Eyre ~ By Charlotte Brontë");
            romance.put(807, "The Fault in Our Stars ~ By John Green");
            romance.put(808, "To All the Boys I've Loved Before ~ By Jenny Han");
            romance.put(809, "Eleanor Oliphant Is Completely Fine ~ By Gail Honeyman");
            romance.put(810, "The Hating Game ~ By Sally Thorne");
        }

        void systemBooksInScienceFiction() {
            scienceFiction.put(901, "Dune ~ By Frank Herbert");
            scienceFiction.put(902, "Ender's Game ~ By Orson Scott Card");
            scienceFiction.put(903, "The Hitchhiker's Guide to the Galaxy ~ By Douglas Adams");
            scienceFiction.put(904, "Neuromancer ~ By William Gibson");
            scienceFiction.put(905, "Foundation ~ By Isaac Asimov");
            scienceFiction.put(906, "Snow Crash ~ By Neal Stephenson");
            scienceFiction.put(907, "The War of the Worlds ~ By H.G. Wells");
            scienceFiction.put(908, "Brave New World ~ By Aldous Huxley");
            scienceFiction.put(909, "The Time Machine ~ By H.G. Wells");
            scienceFiction.put(910, "The Left Hand of Darkness ~ By Ursula K. Le Guin");
        }
        void systemBooksInShortStories() {
            shortStories.put(1001, "The Complete Stories ~ By Flannery O'Connor");
            shortStories.put(1002, "Interpreter of Maladies ~ By Jhumpa Lahiri");
            shortStories.put(1003, "Dubliners ~ By James Joyce");
            shortStories.put(1004, "The Things They Carried ~ By Tim O'Brien");
            shortStories.put(1005, "Tenth of December ~ By George Saunders");
            shortStories.put(1006, "The Lottery and Other Stories ~ By Shirley Jackson");
            shortStories.put(1007, "The Illustrated Man ~ By Ray Bradbury");
            shortStories.put(1008, "Nine Stories ~ By J.D. Salinger");
            shortStories.put(1009, "A Good Man Is Hard to Find and Other Stories ~ By Flannery O'Connor");
            shortStories.put(1010, "The Collected Stories of Arthur C. Clarke ~ By Arthur C. Clarke");
        }
        
        
        void systemBooksInSuspenseAndThrillers() {
            suspenseAndThrillers.put(1101, "The Silent Patient ~ By Alex Michaelides");
            suspenseAndThrillers.put(1102, "The Girl on the Train ~ By Paula Hawkins");
            suspenseAndThrillers.put(1103, "The Da Vinci Code ~ By Dan Brown");
            suspenseAndThrillers.put(1104, "Gone Girl ~ By Gillian Flynn");
            suspenseAndThrillers.put(1105, "The Reversal ~ By Michael Connelly");
            suspenseAndThrillers.put(1106, "The Girl with the Dragon Tattoo ~ By Stieg Larsson");
            suspenseAndThrillers.put(1107, "The Firm ~ By John Grisham");
            suspenseAndThrillers.put(1108, "The Bourne Identity ~ By Robert Ludlum");
            suspenseAndThrillers.put(1109, "The Girl with a Clock for a Heart ~ By Peter Swanson");
            suspenseAndThrillers.put(1110, "Before I Go to Sleep ~ By S.J. Watson");
        }
        
        void systemBooksInBiographiesAndAutobiographies() {
            biographiesAndAutobiographies.put(1201, "The Diary of a Young Girl ~ By Anne Frank");
            biographiesAndAutobiographies.put(1202, "Steve Jobs ~ By Walter Isaacson");
            biographiesAndAutobiographies.put(1203, "The Glass Castle ~ By Jeannette Walls");
            biographiesAndAutobiographies.put(1204, "The Wright Brothers ~ By David McCullough");
            biographiesAndAutobiographies.put(1205, "Becoming ~ By Michelle Obama");
            biographiesAndAutobiographies.put(1206, "The Immortal Life of Henrietta Lacks ~ By Rebecca Skloot");
            biographiesAndAutobiographies.put(1207, "Angela's Ashes ~ By Frank McCourt");
            biographiesAndAutobiographies.put(1208, "Long Walk to Freedom ~ By Nelson Mandela");
            biographiesAndAutobiographies.put(1209, "Into the Wild ~ By Jon Krakauer");
            biographiesAndAutobiographies.put(1210, "The Man Who Knew Infinity ~ By Robert Kanigel");
        }
        
        void systemBooksInCookbooks() {
            cookbooks.put(1301, "The Joy of Cooking ~ By Irma S. Rombauer");
            cookbooks.put(1302, "Mastering the Art of French Cooking ~ By Julia Child");
            cookbooks.put(1303, "Essentials of Classic Italian Cooking ~ By Marcella Hazan");
            cookbooks.put(1304, "How to Cook Everything ~ By Mark Bittman");
            cookbooks.put(1305, "The Pioneer Woman Cooks ~ By Ree Drummond");
            cookbooks.put(1306, "Thug Kitchen: The Official Cookbook ~ By Thug Kitchen");
            cookbooks.put(1307, "Cravings: Recipes for All the Food You Want to Eat ~ By Chrissy Teigen");
            cookbooks.put(1308, "Paleo Cooking With Your Instant Pot ~ By Jennifer Robins");
            cookbooks.put(1309, "The Whole30: The 30-Day Guide to Total Health and Food Freedom ~ By Melissa Hartwig");
            cookbooks.put(1310, "Smitten Kitchen Every Day ~ By Deb Perelman");
        }
        
        void systemBooksInHealthAndFitness() {
            healthAndFitness.put(1401, "The Four Hour Body ~ By Timothy Ferriss");
            healthAndFitness.put(1402, "You Are Your Own Gym ~ By Mark Lauren");
            healthAndFitness.put(1403, "The China Study ~ By T. Colin Campbell");
            healthAndFitness.put(1404, "Born to Run ~ By Christopher McDougall");
            healthAndFitness.put(1405, "StrongLifts 5x5 ~ By Mehdi Hadim");
            healthAndFitness.put(1406, "Atomic Habits ~ By James Clear");
            healthAndFitness.put(1407, "Eat to Live ~ By Joel Fuhrman");
            healthAndFitness.put(1408, "The Paleo Solution ~ By Robb Wolf");
            healthAndFitness.put(1409, "The Whole30 ~ By Melissa Hartwig and Dallas Hartwig");
            healthAndFitness.put(1410, "Spark: The Revolutionary New Science of Exercise and the Brain ~ By John J. Ratey");
        }

        // Example for Art and Photography genre
        void systemBooksInArtAndPhotography() {
            artAndPhotography.put(1501, "The Story of Art ~ By E.H. Gombrich");
            artAndPhotography.put(1502, "Ways of Seeing ~ By John Berger");
            artAndPhotography.put(1503, "The Artist's Way ~ By Julia Cameron");
            artAndPhotography.put(1504, "On Photography ~ By Susan Sontag");
            artAndPhotography.put(1505, "The Elements of Color ~ By Johannes Itten");
            artAndPhotography.put(1506, "The Photographer's Eye ~ By Michael Freeman");
            artAndPhotography.put(1507, "The Art Book ~ By Phaidon Press");
            artAndPhotography.put(1508, "Steve McCurry: The Iconic Photographs ~ By Steve McCurry");
            artAndPhotography.put(1509, "Ansel Adams: 400 Photographs ~ By Ansel Adams");
            artAndPhotography.put(1510, "The Creative's Guide to Starting a Business ~ By Harriet Kelsall");
        }

        // Example for Music genre
        void systemBooksInMusic() {
            music.put(1601, "This Is Your Brain on Music ~ By Daniel J. Levitin");
            music.put(1602, "How Music Works ~ By David Byrne");
            music.put(1603, "The Rest Is Noise: Listening to the Twentieth Century ~ By Alex Ross");
            music.put(1604, "Born to Run ~ By Bruce Springsteen");
            music.put(1605, "Mozart's Starling ~ By Lyanda Lynn Haupt");
            music.put(1606, "Just as I Am ~ By Cicely Tyson");
            music.put(1607, "Soul Train: The Music, Dance, and Style of a Generation ~ By Ahmir 'Questlove' Thompson");
            music.put(1608, "The Inner Game of Music ~ By Barry Green");
            music.put(1609, "Musicophilia: Tales of Music and the Brain ~ By Oliver Sacks");
            music.put(1610, "Girl in a Band ~ By Kim Gordon");
        }

        // Example for Sports and Outdoors genre
        void systemBooksInSportsAndOutdoors() {
            sportsAndOutdoors.put(1701, "Into Thin Air ~ By Jon Krakauer");
            sportsAndOutdoors.put(1702, "Friday Night Lights ~ By H.G. Bissinger");
            sportsAndOutdoors.put(1703, "Open ~ By Andre Agassi");
            sportsAndOutdoors.put(1704, "The Boys in the Boat ~ By Daniel James Brown");
            sportsAndOutdoors.put(1705, "Moneyball ~ By Michael Lewis");
            sportsAndOutdoors.put(1706, "Shoe Dog ~ By Phil Knight");
            sportsAndOutdoors.put(1707, "The Perfect Mile ~ By Neal Bascomb");
            sportsAndOutdoors.put(1708, "Seabiscuit ~ By Laura Hillenbrand");
            sportsAndOutdoors.put(1709, "The Miracle of Castel di Sangro ~ By Joe McGinniss");
            sportsAndOutdoors.put(1710, "Unbroken ~ By Laura Hillenbrand");
        }

        // Example for Education and Reference genre
        void systemBooksInEducationAndReference() {
            educationAndReference.put(1801, "The Elements of Style ~ By William Strunk Jr. and E.B. White");
            educationAndReference.put(1802, "The Oxford English Dictionary ~ By John Simpson");
            educationAndReference.put(1803, "A People's History of the United States ~ By Howard Zinn");
            educationAndReference.put(1804, "The Educated Mind ~ By Kieran Egan");
            educationAndReference.put(1805, "The World Is Flat ~ By Thomas L. Friedman");
            educationAndReference.put(1806, "The Elements of Typographic Style ~ By Robert Bringhurst");
            educationAndReference.put(1807, "The Story of Philosophy ~ By Will Durant");
            educationAndReference.put(1808, "A Short History of Nearly Everything ~ By Bill Bryson");
            educationAndReference.put(1809, "The Norton Anthology of English Literature ~ By M.H. Abrams");
            educationAndReference.put(1810, "The Joy of x ~ By Steven Strogatz");
        }

        // ... (continue for other genres)

        // Example for Religion and Spirituality genre
        void systemBooksInReligionAndSpirituality() {
            religionAndSpirituality.put(1901, "The Bible");
            religionAndSpirituality.put(1902, "The Quran");
            religionAndSpirituality.put(1903, "The Tao Te Ching ~ By Laozi");
            religionAndSpirituality.put(1904, "The Bhagavad Gita");
            religionAndSpirituality.put(1905, "The Torah");
            religionAndSpirituality.put(1906, "The Dhammapada");
            religionAndSpirituality.put(1907, "Mere Christianity ~ By C.S. Lewis");
            religionAndSpirituality.put(1908, "The Prophet ~ By Kahlil Gibran");
            religionAndSpirituality.put(1909, "The Art of Happiness ~ By Dalai Lama and Howard Cutler");
            religionAndSpirituality.put(1910, "The Power of Now ~ By Eckhart Tolle");
        }

        // Example for Parenting and Family genre
        void systemBooksInParentingAndFamily() {
            parentingAndFamily.put(2001, "Parenting from the Inside Out ~ By Daniel J. Siegel and Mary Hartzell");
            parentingAndFamily.put(2002, "The Whole-Brain Child ~ By Daniel J. Siegel and Tina Payne Bryson");
            parentingAndFamily.put(2003, "Simplicity Parenting ~ By Kim John Payne and Lisa M. Ross");
            parentingAndFamily.put(2004, "How to Talk So Kids Will Listen & Listen So Kids Will Talk ~ By Adele Faber and Elaine Mazlish");
            parentingAndFamily.put(2005, "Raising An Emotionally Intelligent Child ~ By John Gottman");
            parentingAndFamily.put(2006, "The 5 Love Languages of Children ~ By Gary Chapman and Ross Campbell");
            parentingAndFamily.put(2007, "Parenting Without Power Struggles ~ By Susan Stiffelman");
            parentingAndFamily.put(2008, "The Happiest Baby on the Block ~ By Harvey Karp");
            parentingAndFamily.put(2009, "No-Drama Discipline ~ By Daniel J. Siegel and Tina Payne Bryson");
            parentingAndFamily.put(2010, "The Whole-Brain Child Workbook ~ By Daniel J. Siegel and Tina Payne Bryson");
        }

        // Example for True Crime genre
        void systemBooksInTrueCrime() {
            trueCrime.put(2101, "In Cold Blood ~ By Truman Capote");
            trueCrime.put(2102, "I'll Be Gone in the Dark ~ By Michelle McNamara");
            trueCrime.put(2103, "The Devil in the White City ~ By Erik Larson");
            trueCrime.put(2104, "The Stranger Beside Me ~ By Ann Rule");
            trueCrime.put(2105, "Helter Skelter ~ By Vincent Bugliosi and Curt Gentry");
            trueCrime.put(2106, "My Favorite Murder ~ By Karen Kilgariff and Georgia Hardstark");
            trueCrime.put(2107, "The Innocent Man ~ By John Grisham");
            trueCrime.put(2108, "Midnight in the Garden of Good and Evil ~ By John Berendt");
            trueCrime.put(2109, "Columbine ~ By Dave Cullen");
            trueCrime.put(2110, "The Run of His Life ~ By Jeffrey Toobin");
        }
        void systemBooksInTravel() {
            travel.put(2201, "Into the Wild ~ By Jon Krakauer");
            travel.put(2202, "Wild: From Lost to Found on the Pacific Crest Trail ~ By Cheryl Strayed");
            travel.put(2203, "A Walk in the Woods ~ By Bill Bryson");
            travel.put(2204, "Eat, Pray, Love ~ By Elizabeth Gilbert");
            travel.put(2205, "The Alchemist ~ By Paulo Coelho");
            travel.put(2206, "In a Sunburned Country ~ By Bill Bryson");
            travel.put(2207, "On the Road ~ By Jack Kerouac");
            travel.put(2208, "Travels with Charley ~ By John Steinbeck");
            travel.put(2209, "The Beach ~ By Alex Garland");
            travel.put(2210, "Vagabonding: An Uncommon Guide to the Art of Long-Term World Travel ~ By Rolf Potts");
        }

        void systemBooksInPsychology() {
            psychology.put(2301, "Thinking, Fast and Slow ~ By Daniel Kahneman");
            psychology.put(2302, "Man's Search for Meaning ~ By Viktor E. Frankl");
            psychology.put(2303, "Influence: The Psychology of Persuasion ~ By Robert B. Cialdini");
            psychology.put(2304, "The Power of Habit ~ By Charles Duhigg");
            psychology.put(2305, "Predictably Irrational ~ By Dan Ariely");
            psychology.put(2306, "Blink: The Power of Thinking Without Thinking ~ By Malcolm Gladwell");
            psychology.put(2307, "The Tipping Point ~ By Malcolm Gladwell");
            psychology.put(2308, "Quiet: The Power of Introverts in a World That Can't Stop Talking ~ By Susan Cain");
            psychology.put(2309, "Emotional Intelligence ~ By Daniel Goleman");
            psychology.put(2310, "Nudge: Improving Decisions About Health, Wealth, and Happiness ~ By Richard H. Thaler and Cass R. Sunstein");
        }

        void systemBooksInSociology() {
            sociology.put(2401, "The Sociological Imagination ~ By C. Wright Mills");
            sociology.put(2402, "The Tipping Point ~ By Malcolm Gladwell");
            sociology.put(2403, "Bowling Alone ~ By Robert D. Putnam");
            sociology.put(2404, "Outliers: The Story of Success ~ By Malcolm Gladwell");
            sociology.put(2405, "The Culture Code ~ By Daniel Coyle");
            sociology.put(2406, "Freakonomics: A Rogue Economist Explores the Hidden Side of Everything ~ By Steven D. Levitt and Stephen J. Dubner");
            sociology.put(2407, "The Paradox of Choice: Why More Is Less ~ By Barry Schwartz");
            sociology.put(2408, "The Wisdom of Crowds ~ By James Surowiecki");
            sociology.put(2409, "Evicted: Poverty and Profit in the American City ~ By Matthew Desmond");
            sociology.put(2410, "The Spirit Catches You and You Fall Down ~ By Anne Fadiman");
        }
        
        // Example for Political Science genre
        void systemBooksInPoliticalScience() {
            politicalScience.put(2501, "The Republic ~ By Plato");
            politicalScience.put(2502, "The Prince ~ By Niccolò Machiavelli");
            politicalScience.put(2503, "Democracy in America ~ By Alexis de Tocqueville");
            politicalScience.put(2504, "The Communist Manifesto ~ By Karl Marx and Friedrich Engels");
            politicalScience.put(2505, "The Federalist Papers ~ By Alexander Hamilton, James Madison, and John Jay");
            politicalScience.put(2506, "The Road to Serfdom ~ By Friedrich Hayek");
            politicalScience.put(2507, "The Audacity of Hope ~ By Barack Obama");
            politicalScience.put(2508, "The Conscience of a Conservative ~ By Barry Goldwater");
            politicalScience.put(2509, "A People's History of the United States ~ By Howard Zinn");
            politicalScience.put(2510, "The Shock Doctrine ~ By Naomi Klein");
        }
        void systemBooksInPhilosophy() {
            philosophy.put(2601, "Meditations ~ By Marcus Aurelius");
            philosophy.put(2602, "Thus Spoke Zarathustra ~ By Friedrich Nietzsche");
            philosophy.put(2603, "Critique of Pure Reason ~ By Immanuel Kant");
            philosophy.put(2604, "Being and Time ~ By Martin Heidegger");
            philosophy.put(2605, "The Prince ~ By Niccolò Machiavelli");
            philosophy.put(2606, "The Republic ~ By Plato");
            philosophy.put(2607, "The Art of War ~ By Sun Tzu");
            philosophy.put(2608, "Discourse on Method ~ By René Descartes");
            philosophy.put(2609, "A Treatise of Human Nature ~ By David Hume");
            philosophy.put(2610, "Beyond Good and Evil ~ By Friedrich Nietzsche");
        }

        void systemBooksInMythology() {
            mythology.put(2701, "The Hero with a Thousand Faces ~ By Joseph Campbell");
            mythology.put(2702, "Norse Mythology ~ By Neil Gaiman");
            mythology.put(2703, "Bulfinch's Mythology ~ By Thomas Bulfinch");
            mythology.put(2704, "D'Aulaires' Book of Greek Myths ~ By Ingri d'Aulaire and Edgar Parin d'Aulaire");
            mythology.put(2705, "The Masks of God series ~ By Joseph Campbell");
            mythology.put(2706, "The Power of Myth ~ By Joseph Campbell and Bill Moyers");
            mythology.put(2707, "The Iliad ~ By Homer");
            mythology.put(2708, "The Odyssey ~ By Homer");
            mythology.put(2709, "Metamorphoses ~ By Ovid");
            mythology.put(2710, "The Prose Edda ~ By Snorri Sturluson");
        }
        void systemBooksInDrama() {
            drama.put(2801, "Romeo and Juliet ~ By William Shakespeare");
            drama.put(2802, "Hamlet ~ By William Shakespeare");
            drama.put(2803, "Death of a Salesman ~ By Arthur Miller");
            drama.put(2804, "A Streetcar Named Desire ~ By Tennessee Williams");
            drama.put(2805, "Macbeth ~ By William Shakespeare");
            drama.put(2806, "The Crucible ~ By Arthur Miller");
            drama.put(2807, "Oedipus Rex ~ By Sophocles");
            drama.put(2808, "The Glass Menagerie ~ By Tennessee Williams");
            drama.put(2809, "Antigone ~ By Sophocles");
            drama.put(2810, "King Lear ~ By William Shakespeare");
        }

        void systemBooksInScience() {
            science.put(2901, "Cosmos ~ By Carl Sagan");
            science.put(2902, "A Brief History of Time ~ By Stephen Hawking");
            science.put(2903, "The Double Helix ~ By James D. Watson");
            science.put(2904, "The Selfish Gene ~ By Richard Dawkins");
            science.put(2905, "Silent Spring ~ By Rachel Carson");
            science.put(2906, "Sapiens: A Brief History of Humankind ~ By Yuval Noah Harari");
            science.put(2907, "The Immortal Life of Henrietta Lacks ~ By Rebecca Skloot");
            science.put(2908, "The Structure of Scientific Revolutions ~ By Thomas S. Kuhn");
            science.put(2909, "Guns, Germs, and Steel ~ By Jared Diamond");
            science.put(2910, "The Gene: An Intimate History ~ By Siddhartha Mukherjee");
        }
        void systemBooksInTechnologyAndComputing() {
            technologyAndComputing.put(3001, "The Code Book ~ By Simon Singh");
            technologyAndComputing.put(3002, "Clean Code: A Handbook of Agile Software Craftsmanship ~ By Robert C. Martin");
            technologyAndComputing.put(3003, "Sapiens: A Brief History of Humankind ~ By Yuval Noah Harari");
            technologyAndComputing.put(3004, "The Phoenix Project: A Novel About IT, DevOps, and Helping Your Business Win ~ By Gene Kim");
            technologyAndComputing.put(3005, "The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution ~ By Walter Isaacson");
            technologyAndComputing.put(3006, "Hackers: Heroes of the Computer Revolution ~ By Steven Levy");
            technologyAndComputing.put(3007, "Thinking, Fast and Slow ~ By Daniel Kahneman");
            technologyAndComputing.put(3008, "The Pragmatic Programmer: Your Journey to Mastery ~ By Dave Thomas and Andy Hunt");
            technologyAndComputing.put(3009, "Algorithms to Live By: The Computer Science of Human Decisions ~ By Brian Christian and Tom Griffiths");
            technologyAndComputing.put(3010, "The Cathedral and the Bazaar: Musings on Linux and Open Source by an Accidental Revolutionary ~ By Eric S. Raymond");
        }
        
        // ... (previous code)
        void systemBooksInChildren() {
            children.put(3101, "Charlotte's Web ~ By E.B. White");
            children.put(3102, "The Chronicles of Narnia ~ By C.S. Lewis");
            children.put(3103, "Matilda ~ By Roald Dahl");
            children.put(3104, "Where the Wild Things Are ~ By Maurice Sendak");
            children.put(3105, "Harry Potter and the Sorcerer's Stone ~ By J.K. Rowling");
            children.put(3106, "The Little Prince ~ By Antoine de Saint-Exupéry");
            children.put(3107, "Alice's Adventures in Wonderland ~ By Lewis Carroll");
            children.put(3108, "The Cat in the Hat ~ By Dr. Seuss");
            children.put(3109, "The Gruffalo ~ By Julia Donaldson");
            children.put(3110, "Goodnight Moon ~ By Margaret Wise Brown");
        }

        void systemBooksInYoungAdult() {
            youngAdult.put(3201, "The Hunger Games ~ By Suzanne Collins");
            youngAdult.put(3202, "The Fault in Our Stars ~ By John Green");
            youngAdult.put(3203, "Divergent ~ By Veronica Roth");
            youngAdult.put(3204, "The Maze Runner ~ By James Dashner");
            youngAdult.put(3205, "To All the Boys I've Loved Before ~ By Jenny Han");
            youngAdult.put(3206, "Twilight ~ By Stephenie Meyer");
            youngAdult.put(3207, "The Perks of Being a Wallflower ~ By Stephen Chbosky");
            youngAdult.put(3208, "The Giver ~ By Lois Lowry");
            youngAdult.put(3209, "The Outsiders ~ By S.E. Hinton");
            youngAdult.put(3210, "Six of Crows ~ By Leigh Bardugo");
        }
        void systemBooksInMystery() {
            mystery.put(3301, "The Girl with the Dragon Tattoo ~ By Stieg Larsson");
            mystery.put(3302, "Gone Girl ~ By Gillian Flynn");
            mystery.put(3303, "The Da Vinci Code ~ By Dan Brown");
            mystery.put(3304, "The Big Sleep ~ By Raymond Chandler");
            mystery.put(3305, "In the Woods ~ By Tana French");
            mystery.put(3306, "The Hound of the Baskervilles ~ By Arthur Conan Doyle");
            mystery.put(3307, "Gorky Park ~ By Martin Cruz Smith");
            mystery.put(3308, "The No. 1 Ladies' Detective Agency ~ By Alexander McCall Smith");
            mystery.put(3309, "The Woman in the Window ~ By A.J. Finn");
            mystery.put(3310, "The Silent Patient ~ By Alex Michaelides");
        }
        void systemBooksInHistoricalNonFiction() {
            historicalNonFiction.put(3401, "The Diary of Anne Frank ~ By Anne Frank");
            historicalNonFiction.put(3402, "Unbroken ~ By Laura Hillenbrand");
            historicalNonFiction.put(3403, "Band of Brothers ~ By Stephen E. Ambrose");
            historicalNonFiction.put(3404, "The Wright Brothers ~ By David McCullough");
            historicalNonFiction.put(3405, "The Guns of August ~ By Barbara W. Tuchman");
            historicalNonFiction.put(3406, "1776 ~ By David McCullough");
            historicalNonFiction.put(3407, "The Immortal Life of Henrietta Lacks ~ By Rebecca Skloot");
            historicalNonFiction.put(3408, "The Devil in the White City ~ By Erik Larson");
            historicalNonFiction.put(3409, "Code Girls ~ By Liza Mundy");
            historicalNonFiction.put(3410, "The Ghost Map ~ By Steven Johnson");
        }
        
        void systemBooksInBusinessAndFinance() {
            businessAndFinance.put(3501, "Rich Dad Poor Dad ~ By Robert T. Kiyosaki");
            businessAndFinance.put(3502, "The Intelligent Investor ~ By Benjamin Graham");
            businessAndFinance.put(3503, "Thinking, Fast and Slow ~ By Daniel Kahneman");
            businessAndFinance.put(3504, "How to Win Friends and Influence People ~ By Dale Carnegie");
            businessAndFinance.put(3505, "Zero to One ~ By Peter Thiel");
            businessAndFinance.put(3506, "The Lean Startup ~ By Eric Ries");
            businessAndFinance.put(3507, "The Millionaire Next Door ~ By Thomas J. Stanley and William D. Danko");
            businessAndFinance.put(3508, "Freakonomics ~ By Steven D. Levitt and Stephen J. Dubner");
            businessAndFinance.put(3509, "Good to Great ~ By Jim Collins");
            businessAndFinance.put(3510, "Drive ~ By Daniel H. Pink");
        }
        void systemBooksInPoetry() {
            poetry.put(3601, "Leaves of Grass ~ By Walt Whitman");
            poetry.put(3602, "The Waste Land ~ By T.S. Eliot");
            poetry.put(3603, "Selected Poems ~ By Emily Dickinson");
            poetry.put(3604, "The Raven ~ By Edgar Allan Poe");
            poetry.put(3605, "Howl ~ By Allen Ginsberg");
            poetry.put(3606, "Beowulf");
            poetry.put(3607, "Paradise Lost ~ By John Milton");
            poetry.put(3608, "The Love Song of J. Alfred Prufrock ~ By T.S. Eliot");
            poetry.put(3609, "The Canterbury Tales ~ By Geoffrey Chaucer");
            poetry.put(3610, "The Odyssey ~ By Homer");
        }
        void systemBooksInSelfHelpAndPersonalDevelopment() {
            selfHelpAndPersonalDevelopment.put(3701, "Atomic Habits ~ By James Clear");
            selfHelpAndPersonalDevelopment.put(3702, "The 7 Habits of Highly Effective People ~ By Stephen R. Covey");
            selfHelpAndPersonalDevelopment.put(3703, "How to Win Friends and Influence People ~ By Dale Carnegie");
            selfHelpAndPersonalDevelopment.put(3704, "Mindset: The New Psychology of Success ~ By Carol S. Dweck");
            selfHelpAndPersonalDevelopment.put(3705, "You Are a Badass ~ By Jen Sincero");
            selfHelpAndPersonalDevelopment.put(3706, "The Power of Now ~ By Eckhart Tolle");
            selfHelpAndPersonalDevelopment.put(3707, "The Subtle Art of Not Giving a F*ck ~ By Mark Manson");
            selfHelpAndPersonalDevelopment.put(3708, "Daring Greatly ~ By Brené Brown");
            selfHelpAndPersonalDevelopment.put(3709, "Man's Search for Meaning ~ By Viktor E. Frankl");
            selfHelpAndPersonalDevelopment.put(3710, "The Four Agreements ~ By Don Miguel Ruiz");
        }
        void systemBooksInParanormal() {
            paranormal.put(3801, "Twilight ~ By Stephenie Meyer");
            paranormal.put(3802, "City of Bones ~ By Cassandra Clare");
            paranormal.put(3803, "A Discovery of Witches ~ By Deborah Harkness");
            paranormal.put(3804, "Shiver ~ By Maggie Stiefvater");
            paranormal.put(3805, "Beautiful Creatures ~ By Kami Garcia and Margaret Stohl");
            paranormal.put(3806, "Evermore ~ By Alyson Noël");
            paranormal.put(3807, "Hush, Hush ~ By Becca Fitzpatrick");
            paranormal.put(3808, "The Raven Boys ~ By Maggie Stiefvater");
            paranormal.put(3809, "The Immortal Rules ~ By Julie Kagawa");
            paranormal.put(3810, "Miss Peregrine's Home for Peculiar Children ~ By Ransom Riggs");
        }
        void systemBooksInHumor() {
            humor.put(3901, "Me Talk Pretty One Day ~ By David Sedaris");
            humor.put(3902, "The Hitchhiker's Guide to the Galaxy ~ By Douglas Adams");
            humor.put(3903, "Bossypants ~ By Tina Fey");
            humor.put(3904, "Good Omens ~ By Terry Pratchett and Neil Gaiman");
            humor.put(3905, "Naked ~ By David Sedaris");
            humor.put(3906, "Where'd You Go, Bernadette ~ By Maria Semple");
            humor.put(3907, "Lamb: The Gospel According to Biff, Christ's Childhood Pal ~ By Christopher Moore");
            humor.put(3908, "The Princess Bride ~ By William Goldman");
            humor.put(3909, "Is Everyone Hanging Out Without Me? (And Other Concerns) ~ By Mindy Kaling");
            humor.put(3910, "Let's Explore Diabetes with Owls ~ By David Sedaris");
        }

    }

}

