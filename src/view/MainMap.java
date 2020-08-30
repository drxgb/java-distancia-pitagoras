package view;

import java.awt.Color;
import java.awt.Graphics;

import com.drxgb.miniengine.Stage;
import com.drxgb.miniengine.util.ImageFactory;

import entities.Enemy;
import entities.Player;
import util.Distance;

public class MainMap extends Stage {

	public MainMap(Integer width, Integer height) {
		super(width, height);
	}

	@Override
	public void start() {
		objects.add(
				new Player(
						ImageFactory.loadImage("player"),
						224.0,
						192.0
					)
				);
		objects.add(
				new Enemy(
						ImageFactory.loadImage("enemy"),
						388.0,
						120.0
					)
				);
	}

	@Override
	public void stop() {}
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		
		Player p = (Player) objects.get(0);
		Enemy  e = (Enemy)  objects.get(1);
		
		double dx = Math.abs(p.x - e.x);
		double dy = Math.abs(p.y - e.y);
		double d  = Distance.get(dx, dy);
		
		g.setColor(Color.WHITE);
		g.drawString("d: "  + String.format("%.2f", d) , 8, 20);
		g.drawString("dx: " + String.format("%.2f", dx), 8, 36);
		g.drawString("dy: " + String.format("%.2f", dy), 8, 52);
		
		if (d < 120.0) {
			g.setColor(Color.RED);
		} else {
			g.setColor(Color.GREEN);
		}
		g.drawLine(p.x.intValue(), p.y.intValue(), e.x.intValue(), e.y.intValue());
		g.drawLine(p.x.intValue(), p.y.intValue(), e.x.intValue(), p.y.intValue());
		g.drawLine(e.x.intValue(), p.y.intValue(), e.x.intValue(), e.y.intValue());
	}

}
