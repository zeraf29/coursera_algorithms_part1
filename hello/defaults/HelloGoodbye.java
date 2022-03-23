package defaults;/* *****************************************************************************
 *  Name:              JINHYUP KIM
 *  Coursera User ID:  zeraf29@gmail.com
 *  Last modified:     March 22, 2022
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("You have to put names");
            return;
        }
        else if (args.length > 2) {
            System.out.println("You can only two names");
            return;
        }
        String str = "Hello " + args[0] + " and " + args[1] + "." + "\r\n"
                + "Goodbye " + args[1] + " and " + args[0] + ".";
        System.out.print(str);
    }
}
