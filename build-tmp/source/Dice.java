import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size(250,250);
}
public void draw()
{
	background(0,255,255);
	int count=0;
	for(int y=0; y<=250; y+=50)
		{
			for(int x=0; x<=250; x+=50)
			{
			Die theDie=new Die(x,y);
	        theDie.roll();
	        count+=theDie.numDot;
	        theDie.show();
		    }
	    }  
	noFill();
	stroke(0,0,0);
	text("total: " + count,180,240);
	noLoop();
	        
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	//variable declarations here
	int myX;
	int myY;
	int numDot;
	int s;
	Die(int x, int y) //constructor
	{
		//variable initializations here (in die class, draw only one. draw multiple in draw function)
		myX=x+15;
		myY=y+15;
		numDot=0;
		s=7;
	}
	public void roll()
	{
		numDot=(int)(Math.random()*6)+1;
	}
	public void show() 
	{
		noFill();
		rect(myX-12.2f,myY-12.2f,25,25);

		if(numDot==1)
		{
			fill(0,0,0);
			ellipse(myX,myY,5,5);
		}
		else if(numDot==2)
		{
			fill(0,0,0);
			ellipse(myX-s,myY-s,5,5);
			ellipse(myX+s,myY+s,5,5);
		}
		else if(numDot==3)
		{
			fill(0,0,0);
			ellipse(myX-s,myY-s,5,5);
			ellipse(myX,myY,5,5);
			ellipse(myX+s,myY+s,5,5);
		}
		else if(numDot==4)
		{
			fill(0,0,0);
			ellipse(myX-s,myY-s,5,5);
			ellipse(myX+s,myY-s,5,5);
			ellipse(myX-s,myY+s,5,5);
			ellipse(myX+s,myY+s,5,5);
		}
		else if(numDot==5)
		{
			fill(0,0,0);
			ellipse(myX-s,myY-s,5,5);
			ellipse(myX+s,myY-s,5,5);
			ellipse(myX,myY,5,5);
			ellipse(myX-s,myY+s,5,5);
			ellipse(myX+s,myY+s,5,5);
		}
		else if(numDot==6)
		{
			fill(0,0,0);
			ellipse(myX-s,myY-s,5,5);
			ellipse(myX+s,myY-s,5,5);
			ellipse(myX-s,myY,5,5);
			ellipse(myX+s,myY,5,5);
			ellipse(myX-s,myY+s,5,5);
			ellipse(myX+s,myY+s,5,5);
		}

	}
	
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
