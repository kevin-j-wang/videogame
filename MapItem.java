
public abstract class MapItem {
	private Hitbox hitbox;
	private Sprite sprite;
	private Vec2 globalCoordinate;
	public MapItem (Hitbox hitbox, Sprite sprite, Vec2 globalCoordinate) {
		this.hitbox = hitbox;
		this.sprite = sprite;
		this.globalCoordinate = globalCoordinate;
	}
	public void move(Vec2 amount) {
		globalCoordinate.plus(amount);
	}
}
