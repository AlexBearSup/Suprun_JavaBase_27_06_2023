package ua.hillel.suprun.homeworks.practics;

public class AlgAkkerman {

    static int akker (int M, int N){
        if ( M == 0){
            return N + 1;
        } else if (M > 0 && N == 0) {
            return akker(M-1, 1);
        } else if (M > 0 && N > 0) {
            return akker(M-1, akker( M, N - 1 ));
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(akker(2, 4));
    }

}
