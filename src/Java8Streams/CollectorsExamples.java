package Java8Streams;

import module java.base;
public class CollectorsExamples {
    static void main() {
        List<String> namesList = Arrays.asList("Akash","Aman","Ajay","Vimal","Suraj","Dhruv","Kartik","Sanket");
        List<Integer> numsList = Arrays.asList(2, 4,6,8,12,14,16,18,20,3,9,12,15,18,21,24,27,30);
        List<DatabaseDetails> dbList = Arrays.asList(
            new DatabaseDetails("inventory_db", "admin", "inv123", "jdbc:postgresql://localhost:5432/inventory_db"),
            new DatabaseDetails("sales_db", "sales_user", "sales@2023", "jdbc:mysql://localhost:3306/sales_db"),
            new DatabaseDetails("hr_db", "hr_admin", "hrpass", "jdbc:oracle:thin:@localhost:1521:hr_db"),
            new DatabaseDetails("finance_db", "fin_user", "fin$ecure", "jdbc:postgresql://localhost:5432/finance_db"),
            new DatabaseDetails("analytics_db", "analyst", "ana!ytics", "jdbc:mysql://localhost:3306/analytics_db"),
            new DatabaseDetails("ecommerce_db", "ecom_user", "ecom#2023", "jdbc:postgresql://localhost:5432/ecommerce_db"),
            new DatabaseDetails("support_db", "support", "supP@ss", "jdbc:mysql://localhost:3306/support_db"),
            new DatabaseDetails("marketing_db", "mkt_user", "mkt2023", "jdbc:oracle:thin:@localhost:1521:marketing_db"),
            new DatabaseDetails("logistics_db", "log_user", "logi$tic", "jdbc:postgresql://localhost:5432/logistics_db"),
            new DatabaseDetails("research_db", "res_user", "res3arch", "jdbc:mysql://localhost:3306/research_db")
        );



        //Q1. Collecting Names By Length
        TreeMap<Integer, List<String>> Q1 = namesList.stream()
                .collect(
                        Collectors.groupingBy(
                                        String::length,
                                        TreeMap::new,
                                        Collectors.toList()
                        )
                );

        IO.println(Q1);

        //Q2. Counting Word Occurrences
        String sentence = "Hello My Name Is Akash Singh";
        TreeMap<Character,Long> Q2 = sentence.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, TreeMap::new, Collectors.counting()));
        IO.println(Q2);

        //Q3. Partitioning Even And Odd Number
        IO.println(numsList.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        //Q4. Summing Values in Map
        Map<String,Integer> items = new HashMap<>();
        items.put("Akash", 1);
        items.put("Aman", 2);
        items.put("Ajay", 3);
        items.put("Suraj", 4);
        items.put("Dhruv", 5);

        items.values().stream().reduce(Integer::sum).ifPresent(System.out::println);
        Integer total = items.values().stream().collect(Collectors.summingInt(Integer::intValue));
        IO.println(total);

        //Q5. Creating a Map from Stream elements
        Map<Integer, String> NameMap = namesList.stream()
                .collect(Collectors.toMap(
                        String::length,
                        String::toUpperCase,
                        (exist,replace) -> exist + " "  + replace,
                        ConcurrentHashMap::new
                ));
        IO.println(NameMap);
    }
}
class DatabaseDetails{
    String dbName;
    String dbUser;
    String dbPassword;
    String dbUrl;
    public DatabaseDetails(String dbName, String dbUser, String dbPassword, String dbUrl) {
        this.dbName = dbName;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
