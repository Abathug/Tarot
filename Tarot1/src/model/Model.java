package model;

import java.util.ArrayList;
import java.util.Collections;

import application.View;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
	
	private View view;

	public Model()
	{
		Table table = new Table();
	}

	public void setView(View view) {

		this.view=view;
	}
	
	
}


