public class Alphabet {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SIGNS = "!§$%&/()=?+#*@{[]}-";

    public static String getAlphabet(boolean upper, boolean lower, boolean num, boolean sign) {

        StringBuilder pool = new StringBuilder();

        if (upper) {
            pool.append(UPPERCASE);
        }
        if (lower) {
            pool.append(LOWERCASE);
        }
        if (num) {
            pool.append(NUMBERS);
        }
        if (sign) {
            pool.append(SIGNS);
        }
        return pool.toString();
    }
}
