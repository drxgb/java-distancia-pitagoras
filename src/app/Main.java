package app;

import java.util.Locale;

import com.drxgb.miniengine.Game;

import view.MainMap;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Game game = Game.getInstance();
		game.setTitle("Condado Braveheart");
		game.setStage(new MainMap(Game.WIDTH, Game.HEIGHT));
		game.start();
	}

}
