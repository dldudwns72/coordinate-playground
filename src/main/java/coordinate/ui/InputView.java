package coordinate.ui;

import coordinate.domain.Coordinate;
import coordinate.domain.Coordinates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String INPUT_COORDINATE_MESSAGE = "좌표를 입력하세요";

    public static Coordinates generateCoordinate() {
        System.out.println(INPUT_COORDINATE_MESSAGE);
        Scanner scanner = new Scanner(System.in);

        String inputCoordinate = scanner.next();

        return splitCoordinate(inputCoordinate);
    }

    private static Coordinates splitCoordinate(String inputCoordinate) {
        List<Coordinate> coordinates = new ArrayList<>();

        List<String> splitCoordinates = Arrays.asList(inputCoordinate.split("-"));

        for(String coordinate : splitCoordinates){
            coordinates.add(new Coordinate(coordinate));
        }

        Coordinates coordinatesResult = new Coordinates(coordinates);

        return coordinatesResult;
    }

}
