package fxml;
import tps_hr.*;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.*;

public class homeController extends newMain {
	 @FXML
	    private Button timeSheetBtn;

	    @FXML
	    private Button profileBtn;

	    @FXML
	    private Button payrollBtn;

	    @FXML
	    private Button editBtn;

	    @FXML
	    private Button holidayBtn;

	    @FXML
	    private Button logOutBtn;

	    @FXML
	    private AnchorPane announcePane;

	    @FXML
	    void setOnActionforTimeSheet(ActionEvent event) {
	    	
	    }

	    @FXML
	    void setOnActionforProfile(ActionEvent event) {
	    	switchScene("Profile.fxml");
	    }

	    @FXML
	    void setOnActionforPayroll(ActionEvent event) {
	    	switchScene("Payroll.fxml");
	    }

	    @FXML
	    void setOnActionforEdit(ActionEvent event) {
	    	if(this.user instanceof Finance) {
	    		switchScene("editFinance.fxml");
	    	}
	    	if(this.user instanceof CEO) {
	    		this.stage.setscene(editCEO());
	    	}
	    	if(this.user instanceof EVP) {
	    		switchScene("editEVP.fxml");
	    	}
	    	if(this.user instanceof GA) {
	    		switchScene("editGA.fxml");
	    	}
	    	if(this.user instanceof Sales) {
	    		switchScene("editSales.fxml");
	    	}
	    	if(this.user instanceof Operation) {
	    		switchScene("editOperation.fxml");
	    	}
	    }

	    @FXML
	    void setOnActionforHoliday(ActionEvent event) {
	    	switchScene("HolidayEntitilement.fxml");
	    }
	    @FXML
	    void setOnActionforLogOut(ActionEvent event) {
	    	System.exit(0);
	    }

}