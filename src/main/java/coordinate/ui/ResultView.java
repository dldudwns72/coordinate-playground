package coordinate.ui;

import coordinate.domain.Coordinate;
import coordinate.domain.Coordinates;

public class ResultView {
    private static final int MAX_COORDINATE = 24;
    private static final int MIN_COORDINATE = 0;

    public static void drawingCoordinateGraph(Coordinates coordinates) {
        System.out.println("실행결과");

        Coordinate firstCoordinate = coordinates.getCoordinates().get(0);
        Coordinate secondCoordinate =  coordinates.getCoordinates().get(1);


        for (int i = MAX_COORDINATE; i > MIN_COORDINATE; i--) {
            printYCoordinateMultiplesOfTwo(i);
        }

        System.out.printf("%4s","+");

        System.out.printf("%4s%n","ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.print("   ");

        for (int i = 1; i <= MAX_COORDINATE; i++) {
            printXCoordinateMultiplesOfTwo(i);
        }

    }

    private static void printYCoordinateMultiplesOfTwo(int coordinate) {

        if (coordinate % 2 == 0) {
            System.out.printf("%3dㅣ%n",coordinate);
        }

        if (coordinate % 2 != 0) {
            System.out.printf("%4s%n","ㅣ" );
        }

    }

    private static void printXCoordinateMultiplesOfTwo(int coordinate) {
        System.out.print(" ");

        if (coordinate % 2 == 0) {
            System.out.printf("%2d",coordinate);
        }
    }

    public static void printDistance(double distance){
        double resultDistance = Math.round(distance*100) /100.0;
        System.out.printf("%n 두 점 사이의 거리는 " + resultDistance + "입니다.");
    }
}
