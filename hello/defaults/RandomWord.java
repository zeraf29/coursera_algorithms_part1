package defaults;/* *****************************************************************************
 *  Name:              JINHYUP KIM
 *  Coursera User ID:  zeraf29@gmail.com
 *  Last modified:     March 22, 2022
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double idx = 1.0;
        double probability = 0.0;
        String target = "";
        while (!StdIn.isEmpty()) {
            String read = StdIn.readString();
            probability = 1 / idx++;
            if (StdRandom.bernoulli(probability)) target = read;
        }
        StdOut.println(target);
    }
}
