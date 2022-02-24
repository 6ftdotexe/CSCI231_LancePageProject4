
/**
 * Program that uses the built in converter
 * and your own custom code to convert a 
 * hexadicaml string to binary
 *
 * @author Lance Page
 * @version 2/22/22
 */
import java.util.*;
class Main {
    public static int hard(String hex) {
        String str = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int d = str.indexOf(ch);
            val = 16 * val + d;
        }
        return val;
    }
    public static int easy(String str) {
        return Integer.parseInt(str, 16);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hexadecimal string: ");
        String binaryStr = sc.next();
        System.out.println("Hard Way Decimal value: " + hard(binaryStr));
        System.out.println("Easy Way Decimal value: " + easy(binaryStr));
    }
}

/**
 * Input: A12, C4, F4
 * Output: 
 *      Hard way Decimal value: 2578, 196, 244
 *      Easy way Decimal value: 2578, 196, 244
 */
