package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class GUIController implements Initializable
{
    @FXML
    private TextArea orderArea;
    @FXML
    private Label occupancyRateLable;
    @FXML
    private Label wasteRateLabel;
    @FXML
    private ChoiceBox<?> rateChoiceBox;
    @FXML
    private LineChart<?, ?> testGraf;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }        

    @FXML
    private void testKnapAction(ActionEvent event)
    {
    }
}
