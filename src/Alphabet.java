public class Alphabet {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SIGNS = "!§$%&/()=?+#*@{[]}-";

    public static String getAlphabet(boolean[] options) {

        StringBuilder pool = new StringBuilder();
        for (int i = 0; i < options.length; i++) {
            if (options[i]) {
                switch (i) {
                    case 0 :
                        pool.append(UPPERCASE);
                        break;
                    case 1 :
                        pool.append(LOWERCASE);
                        break;
                    case 2 :
                        pool.append(NUMBERS);
                        break;
                    case 3 :
                        pool.append(SIGNS);
                        break;
                }
            }
        }
        return pool.toString();
    }
}
