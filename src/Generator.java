public class Generator {

    private boolean useUpper = false;
    private boolean useLower = false;
    private boolean useNumbers = false;
    private boolean useSigns = false;

    private String pool;
    public Generator(boolean upper, boolean lower, boolean numbers, boolean signs) {
        useUpper = upper;
        useLower = lower;
        useNumbers = numbers;
        useSigns = signs;
        pool = Alphabet.getAlphabet(upper, lower, numbers, signs);
    }

    public String generatePassword() {
        return null;
    }

}
