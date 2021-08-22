package coordinate.ui;

import coordinate.domain.Coordinate;

import java.util.Scanner;

public class InputView {
    private static final String inputCoordinate = "좌표를 입력하세요";

    private Scanner scanner = new Scanner(System.in);

    public Coordinate generateCoordinate(){
        System.out.println(inputCoordinate);

        return null;
    }

}
