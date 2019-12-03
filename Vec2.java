
public class Vec2 {
	private double x;
	private double y;

	public Vec2(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double x() {
		return x;
	}

	public double y() {
		return y;
	}

	public Vec2 plus(Vec2 vector) {
		x += vector.x;
		y += vector.y;
		return this;
	}

	public Vec2 minus(Vec2 vector) {
		x -= vector.x;
		y -= vector.y;
		return this;
	}

	public Vec2 plusx(double x) {
		return plus(new Vec2(x, 0));
	}

	public Vec2 plusy(double y) {
		return plus(new Vec2(0, y));
	}

	public Vec2 plus(double x, double y) {
		return plus(new Vec2(x, y));
	}

	public Vec2 minusx(double x) {
		return minus(new Vec2(x, 0));
	}

	public Vec2 minusy(double y) {
		return minus(new Vec2(0, y));
	}

	public Vec2 minus(double x, double y) {
		return minus(new Vec2(x, y));
	}

	public Vec2 negate() {
		x = -x;
		y = -y;
		return this;
	}
}
