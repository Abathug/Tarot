package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.CardType;

public class CardView {
	
	private int x;
	private int y;
	private int num;
	
	private CardType color;
	
	private Image image;
	private ImageView imageBack;
	private Image imageFront;
	
	private String path;
	static private String pathBack ="file:.res/ressources/backImage.jpg";
	
	public CardView(String path, CardType color, int num) {
		
		this.setPath(path);
		this.setImage(new Image(path));
		this.imageBack = new ImageView(pathBack);
		this.color = color;
		this.setNum(num);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
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

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
