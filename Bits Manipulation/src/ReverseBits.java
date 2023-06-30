public class ReverseBits {
    public static void main(String[] args) {
        int X = 5;
        int result = reversedBits(X);
        System.out.println(result);
    }

    public static int reversedBits(int X) {
        int reversed = 0;

        for (int i = 0; i < 32; i++) {
            reversed <<= 1;  // Left shift by 1 bit

            if ((X & 1) == 1) {
                reversed |= 1;  // Set the least significant bit to 1
            }

            X >>= 1;  // Right shift by 1 bit
        }

        return reversed;
    }
}
