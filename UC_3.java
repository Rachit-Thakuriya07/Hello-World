public class UC_3 {
    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            name = args[0];     // name from command line
        } else {
            name = "World";     // default value
        }

        System.out.println("Hello " + name);
    }
}