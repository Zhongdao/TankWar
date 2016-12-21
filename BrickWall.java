package BattleCity;

import java.awt.*;

public class BrickWall implements Block{
	public static final int width = 22; 
	public static final int length = 21;
	int x, y;

	Level level;
	private static Toolkit tk = Toolkit.getDefaultToolkit();
	private static Image[] wallImags = null;
	static {
		wallImags = new Image[] { 
		tk.getImage(BrickWall.class.getResource("Images/commonWall.gif")), };
	}

	public BrickWall(int x, int y, Level level) { 
		this.x = x;
		this.y = y;
		this.level = level; 
	}

	public void draw(Graphics g) {
		g.drawImage(wallImags[0], x, y, null);
	}

	public Rectangle getRect() {  
		return new Rectangle(x, y, width, length);
	}
        public boolean hitedBy(Bullet b){
            if (b.getAlive() && b.getRect().intersects(this.getRect())) {
			b.setAlive(false);
			b.level.otherWall.remove(this); 
			b.level.homeWall.remove(this);
			return true;
		}
		return false;
	}
        

}
