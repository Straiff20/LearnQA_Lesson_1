import java.util.regex.Pattern;

public class MainClass {

    private int class_number = 20;
    private String class_string = "Hello, world";

    public boolean getClassString() {
        String str =  this.class_string;
        String wordForSearch = "Hello";
        boolean findWord = Pattern.compile(Pattern.quote(wordForSearch), Pattern.CASE_INSENSITIVE).matcher(str).find();

        if (!findWord) {
            System.out.println("Error: class_string don't have \"Hello\" word");
        } else {
            System.out.println("Complete: class_string have \"Hello\" word");
        }
        return true;
    }

    public int getClassNumber() {
        return class_number;
    }

    public int getLocalNumber() {
        return 14;
    }
}
