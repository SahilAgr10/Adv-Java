public class fibo {
    public static void main(String[] args) {
        System.out.println(fiboS(7));
    }

    private static int fiboS(int n) {
        if(n<2){
            return n;
        }
        return fiboS(n-1)+(n-2);
    }
}
