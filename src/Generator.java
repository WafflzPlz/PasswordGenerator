public class Generator {

    private final Alphabet alphabet = new Alphabet();

    private boolean useUpper = false;
    private boolean useLower = false;
    private boolean useNumbers = false;
    private boolean useSigns = false;

    public Generator(boolean upper, boolean lower, boolean numbers, boolean signs) {
        useUpper = upper;
        useLower = lower;
        useNumbers = numbers;
        useSigns = signs;
    }

}
