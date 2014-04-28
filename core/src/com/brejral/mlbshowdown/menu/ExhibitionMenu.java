package com.brejral.mlbshowdown.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.brejral.mlbshowdown.MLBShowdown;
import com.brejral.mlbshowdown.game.GameScreen;

public class ExhibitionMenu implements Screen {
	final MLBShowdown mlbShowdown;
	SpriteBatch batch;
	FreeTypeFontGenerator generator;
	FreeTypeFontParameter fontParameter;
	BitmapFont aeroDisplayItalicFont36;
	
	public ExhibitionMenu(MLBShowdown showdown) {
		mlbShowdown = showdown;
		batch = new SpriteBatch();
		generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/aero_matics_display_italic.ttf"));
		fontParameter = new FreeTypeFontParameter();
		fontParameter.size = 36;
		aeroDisplayItalicFont36 = generator.generateFont(fontParameter);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		aeroDisplayItalicFont36.setColor(Color.WHITE);
		aeroDisplayItalicFont36.draw(batch, "ExhibitionMenu", 10, 890);
		batch.end();
		
		if (Gdx.input.isKeyPressed(Keys.SPACE)) {
			mlbShowdown.setScreen(new GameScreen(mlbShowdown));
		}
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		batch.dispose();
		generator.dispose();
	}

}