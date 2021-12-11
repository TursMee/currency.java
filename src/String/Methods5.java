package String;

public class Methods5 {
    public static void main(String[] args) {
        String word = "Sunday";
        //replase();
        String updateWord = word.replace('a','$');
        System.out.println(updateWord);

        String newUpdate = word.replace("Sun","Satur");//use "" for word, '' for char
        System.out.println(newUpdate);

        String code = "java";
        System.out.println(code.replace('a','%'));//replase both 'a'-->j%v%
    }
}
