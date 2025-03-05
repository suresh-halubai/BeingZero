package practise;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Programming";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++) {
            char c = input.charAt(i);
            int indx = input.indexOf(c,i+1);

            if(indx == -1){
                sb.append(c);
            }
        }
        System.out.println(input);
        System.out.print(sb);
    }
}
