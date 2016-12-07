package controler;

import application.View;
import model.Model;

public class Controler {
	
	public Model model;
	public View view;
	
	public Controler(Model model, View view)
	{
		this.model = model;
		this.view = view;
	}
	

}
