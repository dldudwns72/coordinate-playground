package coordinate.ui;

public class ResultView {
    private static final int MAX_COORDINATE = 24;
    private static final int MIN_COORDINATE = 0;

    public static void drawingCoordinateGraph() {
        System.out.println("실행결과");

        for (int i = MAX_COORDINATE; i > 0; i--) {
            printYCoordinateMultiplesOfTwo(i);
        }

        System.out.printf("%4s","+");

        for (int i = 0; i < MAX_COORDINATE; i++) {
            System.out.print("ㅡ");
        }

        System.out.println("");
        System.out.print("   ");


        for (int i = 1; i <= MAX_COORDINATE; i++) {
            printXCoordinateMultiplesOfTwo(i);
        }


    }

    private static void printYCoordinateMultiplesOfTwo(int coordinate) {

        if (coordinate % 2 == 0) {
            System.out.printf("%3d",coordinate);
            System.out.println("ㅣ");
        }

        if (coordinate % 2 != 0) {
            System.out.printf("%5s","ㅣ\n" );
        }

    }

    private static void printXCoordinateMultiplesOfTwo(int coordinate) {
        if (coordinate % 2 == 0) {
            System.out.printf("%d",coordinate);
        }

        if (coordinate % 2 != 0) {
            System.out.print(" ");
        }
    }
}
