public class Alphabet {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SIGNS = "!§$%&/()=?+#*@{[]}-";

    public static String getAlphabet(boolean[] options) {

        StringBuilder pool = new StringBuilder();
        for (int i = 0; i < options.length; i++) {
            switch (i) {
                case 0 -> pool.append(UPPERCASE);
                case 1 -> pool.append(LOWERCASE);
                case 2 -> pool.append(NUMBERS);
                case 3 -> pool.append(SIGNS);
            }
        }
        return pool.toString();
    }
}
