import java.util.*;
import java.lang.*;

// public static void main(String args[])

public class Pair<F, S> {
    private F first; // primer parte del par
    private S second; // segunda parte del par

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
