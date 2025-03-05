package practise;

public class ReverseAnArray1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] rev = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            rev[(arr.length-1)-i] = arr[i];
        }
        System.out.print("[");
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]+",");
        }
        System.out.println("]");
    }
}
