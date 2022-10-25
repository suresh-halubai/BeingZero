package practise;

public class CopyString {
    public static void main(String[] args) {
        String str = "this is home";
        char[] y = str.toCharArray();
        int size = y.length;
        char[] a = new char[size];

        int i = 0;
        while (i != size) {
            a[i] = y[i];
            i++;
        }
        System.out.println(y);
        System.out.println(a);
    }
}
