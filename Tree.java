package BattleCity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Tree {

    public static final int width = 30;
    public static final int length = 30;
    int x, y;
    Level level;
    private static Toolkit tk = Toolkit.getDefaultToolkit();
    private static Image[] treeImags = null;

    static {
        treeImags = new Image[]{
            tk.getImage(BrickWall.class.getResource("Images/tree.gif")),};
    }

    public Tree(int x, int y, Level level) {
        this.x = x;
        this.y = y;
        this.level = level;
    }

    public void draw(Graphics g) {
        g.drawImage(treeImags[0], x, y, null);
    }

}
