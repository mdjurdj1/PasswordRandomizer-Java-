import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        int i = 0;
        while(i < length) {
            int num = random.nextInt(24);
            password += "abcdefghijklmnopqrstuvwxyz".charAt(num);
            i++;
        }
        return password;
    }
}
