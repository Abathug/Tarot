package model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Card {
	
	private String color;
	private int value;
	private String fileName;
	
	// constructor
	
	public Card(String color, int value, String fileName) {
        
		this.color = color;
		this.value = value;
		this.fileName = fileName;
		
    }
	
	// getters
	
	public String getColor(){
		return color;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	// setters
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	private ObservableList<Card> cardData = FXCollections.observableArrayList();
	private ObjectProperty<Card> currentCard = new SimpleObjectProperty<>(null);
	
	public ObjectProperty<Card> currentPersonProperty() {
        return currentCard ;
    }

}
