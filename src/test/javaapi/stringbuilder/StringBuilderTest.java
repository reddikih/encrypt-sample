package test.javaapi.stringbuilder;

/**
 * Created by hikida on 2014/09/11.
 */
public class StringBuilderTest {

    public static void main(String ... args) {
        StringBuilder sb = new StringBuilder();
        String a = sb.toString();
        if (a == null) System.out.print("a is null\n");
        else if ("".equals(a)) System.out.print("a is empty\n");
        else System.out.print("a is not null or empty\n");
    }
}
