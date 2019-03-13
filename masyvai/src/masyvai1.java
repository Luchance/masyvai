import java.util.Locale;
import java.util.StringTokenizer;
import java.util.Arrays;

public class masyvai1 {
    public static void main(String[] args) {

//        1as
        String spec = "***********************Programming***********************\n" +
                "*Java is a popular programming language, created in 1995*\n" +
                "*********************************************************";
        System.out.println(spec);

//2as

        char [] hello ={'H','e','l','l','o',' ','W','o','r','l','d','!'};
        String hello1 = String.valueOf(hello);
        System.out.println(hello1);

//3as

        char [] data ={'p','r','o','g','r','a','m','m','i','n','g'};
        String data1 = String.valueOf(data);
        String data2 = data1.substring(0, 1).toUpperCase() + data1.substring(1);
        System.out.println(data1.toUpperCase());
        System.out.println(data2);

//        4as

        String data3 = new StringBuffer(data1).reverse().toString();
        System.out.println(data1);
        System.out.println(data3);

//        5as

        String inverted = "“).cte ,iP yrrebpsaR ,xuniL ,caM ,swodniW( smroftalp tnereffid no skrow avaJ”";
        String inverted1 = new StringBuffer(inverted).reverse().toString();
        System.out.println(inverted1);

//        6as

        boolean[] xor = { false, true };
        for (boolean a : xor) {
            for (boolean b: xor) {
                boolean c = a ^ b;
                System.out.println(a + " ^ " + b + " = " + c);
            }
        }

//        7as

        String str = "A \240 b 3 & 4 \040";
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

//        8as

        System.out.println("Byte Max Value: "+Byte.MAX_VALUE);
        System.out.println("Byte Max Value: "+Byte.MIN_VALUE);
        System.out.println("Short Max Value: "+Short.MAX_VALUE);
        System.out.println("Short Max Value: "+Short.MIN_VALUE);
        System.out.println("Int Max Value: "+Integer.MAX_VALUE);
        System.out.println("Int Max Value: "+Integer.MIN_VALUE);
        System.out.println("Long Max Value: "+Long.MAX_VALUE);
        System.out.println("Long Max Value: "+Long.MIN_VALUE);

//        9as

        String str69 = "Stringchanger.";
        byte[] b = str69.getBytes();
        System.out.println("String to byte array: " + Arrays.toString(b));

//        10as

        byte[] byteArray1 = {84,104,101,32,98,101,115,116,32,112,97, 115,115,119,111,114,100,32,109,97,110,97,103,101,114,115,32,102,111,114,32,50,48, 49,57};
        String strCode = new String(byteArray1);
        System.out.println(strCode);
    }
}
