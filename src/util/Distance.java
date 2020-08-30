package util;

public abstract class Distance {

	public static double get(double dx, double dy) {
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
	
}
