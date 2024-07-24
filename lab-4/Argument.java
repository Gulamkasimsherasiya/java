public class Argument{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No arguments provided.");
            return;
        }

        if (searchUpperCase(args)) {
            System.out.println("All arguments begin with uppercase letters.");
        }
    }

    public static boolean searchUpperCase(String[] args) {
        for (String arg : args) {
            if (!Character.isUpperCase(arg.charAt(0))) {
                System.out.printf("Error: Argument '%s' does not begin with an uppercase letter.\n", arg);
                return false;
            }
        }
        return true;
    }
}