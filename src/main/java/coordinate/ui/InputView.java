package coordinate.ui;

import coordinate.domain.Coordinate;
import coordinate.domain.Coordinates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String INPUT_COORDINATE_MESSAGE = "좌표를 입력하세요";

    public static Coordinates generateCoordinate() {
        System.out.println(INPUT_COORDINATE_MESSAGE);
        Scanner scanner = new Scanner(System.in);

        String inputCoordinate = scanner.next();

        List<Coordinate> coordinates = splitCoordinate(inputCoordinate);

        return new Coordinates(coordinates);
    }

    private static List<Coordinate> splitCoordinate(String inputCoordinate) {
        List<Coordinate> coordinates = new ArrayList<>();

        String firstCoordinate = inputCoordinate.substring(0, inputCoordinate.indexOf("-"));
        String secondCoordinate = inputCoordinate.substring(inputCoordinate.indexOf("-") + 1);

        coordinates.add(new Coordinate(firstCoordinate));
        coordinates.add(new Coordinate(secondCoordinate));

        return coordinates;
    }

}
