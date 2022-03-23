/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("You have to put names");
            return;
        }
        StringBuilder helloSb = new StringBuilder();
        StringBuilder goodByeSb = new StringBuilder();
        for(int i=0; i<args.length; i++){
            helloSb.append(" ").append(args[i]);
            goodByeSb.insert(0, args[i]).insert(0, " ");
        }
        helloSb.insert(0, "Hello").append(".")
               .append(System.getProperty("line.separator"))
               .append(goodByeSb.insert(0, "Goodbye").append("."));
        System.out.print(helloSb.toString());
    }
}
