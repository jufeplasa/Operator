package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Operador;
import java.text.DecimalFormat;

public class OperadoresGUI {

    @FXML
    private Label labMessg1;

    @FXML
    private Label labMessg2;

    @FXML
    private TextField txtField1;

    @FXML
    private TextField txtField2;
    
	DecimalFormat df = new DecimalFormat("0.00");
	
    @FXML
    public void division(ActionEvent event) {
    	String str1=txtField1.getText();
    	String str2=txtField2.getText();
    	double num1=Double.parseDouble(str1);
    	double num2=Double.parseDouble(str2);
    	double result=Operador.dividir(num1,num2);
    	labMessg2.setText(df.format(result));
    }

    @FXML
    public void multiplicacion(ActionEvent event) {
    	String str1=txtField1.getText();
    	String str2=txtField2.getText();
    	double num1=Double.parseDouble(str1);
    	double num2=Double.parseDouble(str2);
    	double result=Operador.multiplicar(num1,num2);
    	labMessg1.setText(df.format(result));
    }

}
