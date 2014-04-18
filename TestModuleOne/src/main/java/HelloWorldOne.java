package src.main.java;

/**
 * Created by Greg on 07/04/2014.
 */
public class HelloWorldOne {

    private String theWord;
    public static final String NOBODY = "nobody";

    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            new HelloWorldOne();
        } else {
            new HelloWorldOne(args[0]);
        }
    }

    public HelloWorldOne() {
        this(NOBODY);
    }

    public HelloWorldOne(String theWord) {
        this.theWord = theWord;
        sayHello();
    }

    public void sayHello() {
        System.out.println("More hello "+theWord);
    }

    public String getTheWord() {
        return theWord;
    }
}
