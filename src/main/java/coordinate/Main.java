package coordinate;

import coordinate.domain.Coordinates;
import coordinate.domain.DistanceCalculator;
import coordinate.ui.InputView;
import coordinate.ui.ResultView;

public class Main {
    public static void main(String[] args){

        Coordinates coordinates = InputView.generateCoordinate();

        ResultView.drawingCoordinateGraph(coordinates);
        ResultView.printCalculatorResult(coordinates);

    }
}
