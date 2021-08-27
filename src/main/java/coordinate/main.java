package coordinate;

import coordinate.domain.Coordinates;
import coordinate.domain.DistanceCalculator;
import coordinate.ui.InputView;
import coordinate.ui.ResultView;

public class main {
    public static void main(String[] args){
        Coordinates coordinates = InputView.generateCoordinate();

        DistanceCalculator distanceCalculator = new DistanceCalculator(coordinates);

        double lineDistance = distanceCalculator.LineCalculator();

        ResultView.drawingCoordinateGraph();

        ResultView.printDistance(lineDistance);

    }
}
