package entities;

import java.awt.image.BufferedImage;

import com.drxgb.miniengine.GameObject;
import com.drxgb.miniengine.input.InputState;

public class Player extends GameObject {

	public Player(BufferedImage sprite, Double x, Double y) {
		super(sprite, x, y);
	}

	@Override
	public void start() {}

	@Override
	public void stop() {}

	@Override
	public void update() {
		if (keyboard.check(VK_UP, InputState.PRESS)) {
			y -= 2;
		}
		if (keyboard.check(VK_DOWN, InputState.PRESS)) {
			y += 2;
		}
		if (keyboard.check(VK_LEFT, InputState.PRESS)) {
			x -= 2;
		}
		if (keyboard.check(VK_RIGHT, InputState.PRESS)) {
			x += 2;
		}
	}

}
