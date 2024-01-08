public class Alphabet {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SIGNS = "!§$%&/()=?+#*@{[]}-";

    private static StringBuilder pool;

    public static String getPool(boolean upper, boolean lower, boolean num, boolean sign) {
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
