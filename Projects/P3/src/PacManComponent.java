import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Color;

public class PacManComponent extends JComponent {
	private int scale;
	private Color color = Color.YELLOW;

	public PacManComponent(int x, int y, int scale) {
		setLocation(x, y);
		setSize(20, 40);
		this.scale = scale;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double ball = new Ellipse2D.Double(0, 0, scale, scale);
		g.setColor(color);
		g2.fill(ball);
	}

	public void setLocation(int x, int y) {
		super.setLocation(scale * x, scale * y);
	}

}
