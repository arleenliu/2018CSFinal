import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * 
 * @author arleenliu
 * @version 5/9/18
 *
 */
public class DrawingSurface extends PApplet {

	// private PImage background;
	private PImage editable;
	public static int screenNum;


	private IntroPanel intro; // 1
	private CityPanel city; // 4
	private InstructionsPanel instructions; // 2
	private InitPanel init;// 3

	public DrawingSurface() {
		screenNum = 1;
		runSketch();
	}

	public void setup() {
		intro = new IntroPanel();
		instructions = new InstructionsPanel();
		init = new InitPanel();
	}

	public void draw() {

		if (mousePressed) {
			mousePressed();
		}
		if (screenNum == 1) {
			intro.draw(this);
		} else if (screenNum == 2) {
			instructions.draw(this);
		} else if (screenNum == 3) {
			init.draw(this);
			
			strokeWeight(2);
			stroke(255);
			rect((float)(209/700.0*width), (float)(285/600.0*height), (float)(95/700.0*width), (float)(52/600.0*width));
			rect((float)(372/700.0*width), (float)(282/600.0*height), (float)(90/700.0*width), (float)(60/600.0*width));
			rect((float)(535/700.0*width), (float)(243/600.0*height), (float)(70/700.0*width), (float)(90/600.0*width));
			rect((float)(209/700.0*width), (float)(465/600.0*height), (float)(90/700.0*width), (float)(52/600.0*width));
			rect((float)(380/700.0*width), (float)(465/600.0*height), (float)(88/700.0*width), (float)(52/600.0*width));
			rect((float)(522/700.0*width), (float)(465/600.0*height), (float)(95/700.0*width), (float)(52/600.0*width));

		} else if (screenNum == 4) {
			city.draw(this);
		}
		
	}

	public void initPanel() {
		editable = loadImage("InitPanel.jpg");
		editable.resize(width,height);
		image(editable, 0, 0);

	}

	// public void instructionsPanel() {
	// background(255);
	// stroke(0);
	// text("INSTRUCTIONS", (float)(width *0.5), (float)(height *0.5));
	// image(loadImage("shelbyface.png") /*.resize(w, h)*/, (float)(width *0.25),
	// (float)(height *0.25));
	//
	// }

	// public void cityPanel() {
	// editable = loadImage("cityBackground.jpg");
	// editable.resize(width,height);
	//
	// image(editable, 0, 0);
	//
	// stroke(0);
	// strokeWeight(5);
	// for (int i = 0; i < size - 1; i++) {
	// line(0, i * (height / size), width, i * (height / size));
	// line(i * (width / size), 0, i * (width / size), height);
	// }
	// }

	public void mousePressed() {
		Point p = new Point(mouseX, mouseY);

		if (screenNum == 1) {
			// if (mouseX)

			Rectangle a = new Rectangle((int) (0.107142857 * width), (int) (0.423 * height), (int) (0.2642857 * width),
					(int) (0.05 * height));
			Rectangle b = new Rectangle((int) (0.7 * width), (int) (0.423 * height), (int) (0.107142857 * width),
					(int) (0.05 * height));

			if (a.contains(p)) {
				screenNum = 2;
			} else if (b.contains(p)) {
				screenNum = 3;
			}

		} else if (screenNum == 3) {
			Rectangle a = new Rectangle(209, 275, 95, 55);
			Rectangle b = new Rectangle(372, 270, 90, 64);
			Rectangle c = new Rectangle(535, 237, 70, 100);
			Rectangle d = new Rectangle(209, 450, 93, 55);
			Rectangle e = new Rectangle(380, 450, 88, 55);
			Rectangle f = new Rectangle(522, 450, 95, 60);		
			
			if (a.contains(p)) {
				screenNum = 4;
				city = new CityPanel(1);
			} else if (b.contains(p)) {
				screenNum = 4;
				city = new CityPanel(2);

			} else if (c.contains(p)) {
				screenNum = 4;
				city = new CityPanel(3);

			} else if (d.contains(p)) {
				screenNum = 4;
				city = new CityPanel(4);

			} else if (e.contains(p)) {
				screenNum = 4;
				city = new CityPanel(5);

			} else if (f.contains(p)) {
				screenNum = 4;
				city = new CityPanel(6);

			}
		}
	}

}
