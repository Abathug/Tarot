package application;

import javafx.scene.image.Image;
import model.CardType;
import javafx.scene.image.ImageView;
import model.CardType;

public class CardView extends ImageView{

	private int x;
	private int y;
	private int num;

	private CardType color;


	private ImageView imageBack;
	private Image imageFront;

	private String path;
	static final private String pathBack = "file:.src/ressources/backImage.jpg";

	public CardView(String path, CardType color, int num) {

		this.setPath(path);
		try {
			this.setImage(new Image(path));
			this.imageBack = new ImageView(pathBack);
			this.color = color;
			this.setNum(num);
		} catch (Exception e) {
			System.err.println(path + " image introuvable");
		}
	}



	public void setX(int x) {
		this.x = x;
	}



	public void setY(int y) {
		this.y = y;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
