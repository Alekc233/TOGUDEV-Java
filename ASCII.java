import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    static final char firstC = 'a';
    static final char lastC = 'z';
    static final char questionC = lastC + 1;

    public static void printchar(int l, int w, char c,String[] array){
        int begin = (c - firstC) * w;
        int end = begin + w;
        System.out.print(array[l].substring(begin, end));
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        String text = T.toLowerCase();

        String[] rowArray = new String[H];
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            rowArray[i] = ROW;
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        for (int i = 0; i < H; i++) {
            for (char c : text.toCharArray()) {
                if (firstC <= c && c <= lastC) {
                    printchar(i,L,c,rowArray);
                } else {
                    printchar(i,L,questionC,rowArray);
                }
            }
            System.out.print("\n");
        }
    }
}