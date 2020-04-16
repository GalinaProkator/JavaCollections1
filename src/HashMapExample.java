import java.util.HashMap;
//    Task: Check how many usages of a given word there are in a given text.
public class HashMapExample{

    public static void main(String[] args) {
        String[] text = {"Beware", "the", "Jabberwock", "my", "son",
                "The", "jaws", "that", "bite", "the", "claws", "that", "catch",
                "Beware", "the", "Jubjub", "bird", "and", "shun",
                "The", "frumious", "Bandersnatch"};
        String word = "the";

        HashMap<String, Integer> thesaurus = createThesaurus(text);
        System.out.println("The word <<" + word + ">> has been used " + thesaurus.get(word) + " times in the text");

    }

    public static HashMap<String, Integer> createThesaurus(String[] text) {
//        create a new map
        HashMap<String, Integer> map = new HashMap<String, Integer>();

//        checking every word in the text,
//        incrementing value for the existing ones and creating new key-value set for the new ones
        for (String word : text) {
            Integer index = map.get(word);
            if (index != null){
                map.put(word, ++index);
            }
            else{
                map.put(word, 1);
            }
        }
        return map;
    }

}
