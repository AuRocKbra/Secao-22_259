package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constrains;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController implements Initializable{
	@FXML
	private TextField txtNum1;
	@FXML
	private TextField txtNum2;
	@FXML
	private Label resultado;
	@FXML
	private Button btSuma;
	
	@FXML
	public void btSomaAction() {
		try {
			Double numero1 = Double.valueOf(txtNum1.getText());
			Double numero2 = Double.valueOf(txtNum2.getText());
			Double resul = numero1 + numero2;
			resultado.setText(String.format("%.2f",resul));
		}catch(NumberFormatException e) {
			Alerts.showAlerts("Erro","Argumento inválido",e.getMessage(),AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Constrains.setTextFieldDouble(txtNum1);
		Constrains.setTextFieldDouble(txtNum2);
		Constrains.setTextFieldMaxLength(txtNum1, 10);
		Constrains.setTextFieldMaxLength(txtNum2, 10);
	}
}
