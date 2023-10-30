public class ServerNameGenerator {
    static String[] nouns = {"Cat", "Dog", "Book", "Tree", "Computer", "Ocean", "Bicycle", "Sun", "Guitar", "Pizza"};
    static String[] adjectives = {"Happy", "Bright", "Delicious", "Playful", "Lively", "Cozy", "Mysterious", "Energetic", "Enchanting", "Sincere"};
    public static String getWord(String[] arr) {
        return arr[(int) (Math.random() * (arr.length))];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(getWord(nouns) + "-" + getWord(adjectives));
    }
}
