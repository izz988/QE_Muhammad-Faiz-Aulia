import java.util.Arrays;

public class Concat {

    public static void main(String[] args) {
        String[] array1 = {"kazuya", "jin", "lee"};
        String[] array2 = {"kazuya", "feng"};

        int aLen = array1.length;
        int bLen = array2.length;
        String[] result = new String[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
    }
}