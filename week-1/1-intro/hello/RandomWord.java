import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;
        String text = StdIn.readString();
        if(StdIn.isEmpty()) return;

        while(true) {
            if(StdIn.isEmpty()) StdOut.println(text);
            int algoNum = 1 / i;
            if(StdRandom.bernoulli(algoNum)) text = StdIn.readString();

            i++;
        }
    }
}