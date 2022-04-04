/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        String helloText = String.format("Hello %s and %s.", args[0], args[1]);
        String byeText = String.format("Goodbye %s and %s.", args[0], args[1]);
        System.out.println(helloText);
        System.out.println(byeText);
    }
}
