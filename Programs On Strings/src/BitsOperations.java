public class BitsOperations {
    public static void main(String[] args) {
        //bin(12);
        System.out.println(2 >> 1);
    }

    private static void bin(int num) {
        if (num > 0){
            bin(num >> 1);
            System.out.print(num & 1);
        }
    }
}
