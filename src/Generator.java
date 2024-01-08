import java.util.Scanner;

public class Generator {

    //shows what chars are used in password
    //0: upper, 1: lower, 2: nums, 3; signs
    private final boolean[] alphabetConfig;
    private int length;
    private String pool;
    public Generator() {
        alphabetConfig = new boolean[4];
        this.mainLoop();
    }

    public void mainLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Time to generate your password");

        System.out.println("Do you want upper case letters? (y/n)");
        char option = Character.toLowerCase(scanner.next().charAt(0));
        setPool(0, option);
        System.out.println("Do you want lower case letters? (y/n)");
        option = Character.toLowerCase(scanner.next().charAt(0));
        setPool(1, option);
        System.out.println("Do you want numbers? (y/n)");
        option = Character.toLowerCase(scanner.next().charAt(0));
        setPool(2, option);
        System.out.println("Do you want signs? (y/n)");
        option = Character.toLowerCase(scanner.next().charAt(0));
        setPool(3, option);
        pool = Alphabet.getAlphabet(alphabetConfig);

        System.out.println("How long do you want your password to be?");
        length = scanner.nextInt();
    }
    public String generatePassword() {
        return null;
    }

    private void setPool(int index, char option) {
        switch (option) {
            case 'y':
                alphabetConfig[index] = true;
                break;
            case 'n':
                alphabetConfig[index] = false;
                break;
            default:
                throw new IllegalArgumentException("Must be either 'y' or 'n'.");
        }
    }

}
