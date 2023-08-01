public class Alphabet {
    private final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private final String NUMBERS = "0123456789";
    private final String SIGNS = "!§$%&/()=?+#*@{[]}-";

    public String getUppercaseLetter(int i) {
        return String.valueOf(UPPERCASE.charAt(i));
    }
}
