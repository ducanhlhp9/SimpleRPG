package Game.SimpleRPG.tilegame.entities.statics;

import java.awt.Graphics;

import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.gfx.Assets;

public class Bird extends StaticEntity{
	public Bird(Handler handler, float x, float y) {
		super(handler, x, y, 50 , 50 );
		bounds.x = 16;
		bounds.y =(int)(height/2);
		bounds.width = width-20;
		bounds.height =(int) (height - height/1.5f);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.bird,(int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
//		g.setColor(Color.red);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
}
