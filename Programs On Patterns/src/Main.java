import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Patterns p= new Patterns();

        // p.equilateralTrianglePattern(num);
        //p.invertedEquilateralTrianglePattern(num);
        //p.filledBox(num);
        //p.hollowBox(num);
        // p.hollowBoxWithCross(num);
        //p.cross(num);
        //p.rightAngledTrianglePattern(num);
        //p.mirrorRightAngledTrianglePattern(num);
        //p.invertedRightAngledTriangle(num);
        //p.MirrorInvertedRightAngledTriangle(num);
        //p.diamondStarPattern(num);
        //p.hollowDiamondStarPattern(num);
        //p.numberTrianglePattern(num);
        //p.numberTrianglePattern2(num);
        //p.numberDiamondPattern(num);
        //p.numberDiamondPattern2(num);
        //p.printTriangle(num);
        //p.printInvertedTriangle(num);
        //p.printTrianglePattern2(num);
        p.printStarPattern(num);

    }
}