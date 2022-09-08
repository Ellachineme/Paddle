package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	ShapeRenderer shape;
	Paddle paddle;

	@Override
	public void create(){
		shape = new ShapeRenderer();
		paddle = new Paddle(Gdx.input.getX(), Gdx.input.getY(), 100,12);

	}
	@Override
	public void render (){
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		//drawing the shape begins
		//shape.begin(ShapeRenderer.ShapeType.Filled);
		//paddle.draw(shape);
		//shape.end();
		shape.begin(ShapeRenderer.ShapeType.Filled);
		shape.rect(Gdx.input.getX(), Gdx.input.getY(), 100,12);
		shape.end();


	}
}
