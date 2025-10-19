package ImportantConcepts;

import module java.base;

public class StringBufferOperations {
    static void main() throws InterruptedException {
        // Same as StringBuilder but thread-safe.
        Thread recipe1 = new myDailyRecipes(Arrays.asList(
                "Paneer cubes", "Butter", "Oil", "Onions", "Tomatoes", "Cashew nuts", "Garlic", "Ginger",
                "Green chili", "Cumin seeds", "Bay leaf", "Coriander powder", "Garam masala", "Red chili powder",
                "Turmeric", "Salt", "Sugar", "Kasuri methi", "Fresh cream", "Cilantro"
        ), "Paneer Butter Masala");

        Thread recipe2 = new myDailyRecipes(Arrays.asList(
                "Basmati rice", "Carrots", "Beans", "Green peas", "Potatoes", "Onions", "Tomatoes", "Green chilies",
                "Ginger garlic paste", "Mint leaves", "Coriander leaves", "Yogurt", "Biryani masala", "Red chili powder",
                "Turmeric", "Salt", "Oil", "Ghee", "Cinnamon", "Cloves", "Cardamom"
        ), "Vegetable Biryani");

        Thread recipe3 = new myDailyRecipes(Arrays.asList(
                "Chickpeas", "Onions", "Tomatoes", "Ginger garlic paste", "Green chilies", "Cumin seeds", "Bay leaf",
                "Coriander powder", "Cumin powder", "Garam masala", "Chole masala", "Red chili powder", "Turmeric",
                "Salt", "Tea bags", "Oil", "Kasuri methi", "Amchur powder", "Cilantro", "Water"
        ), "Punjabi Chole");

        recipe1.start();
        recipe2.start();
        recipe3.start();
        recipe1.join();
        recipe2.join();
        recipe3.join();


        IO.println("All Recipes Completed");

    }
}

class myDailyRecipes extends Thread {
    private final StringBuffer sb = new StringBuffer();
    public int recipes = 0;
    private final String recipe;
    private final List<String> ingredients;
    private final HashMap<String, List<String>> recipesMap = new HashMap<>();

    public myDailyRecipes(List<String> ingredients, String recipe) {
        this.ingredients = ingredients;
        this.recipe = recipe;
        recipesMap.putIfAbsent(recipe, new ArrayList<>());
        recipes++;
    }

    @Override
    public void run() {
        IO.println("Recipe " + recipe + " has been started");
        for (String ingredient : ingredients) {
            try {
                recipesMap.get(recipe).add(ingredient);
                IO.println("Adding ingredient " + ingredient + " to recipe " + recipe);
                Thread.sleep(1);
                sb.append("We Added the ingredient ").append(ingredient).append(" to recipe ").append(recipe).append(" And Then ");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        IO.println(sb.toString());
        IO.println("Recipe " + recipe + " has been completed"+" String Length : " +sb.length());
        //1480,1363 1494
    }

}
