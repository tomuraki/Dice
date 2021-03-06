void setup()
{
	size(250,250);
}
void draw()
{
	background(255,255,255);
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
void mousePressed()
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
	void roll()
	{
		numDot=(int)(Math.random()*6)+1;
	}
	void show() 
	{
		noFill();
		rect(myX-12.2,myY-12.2,25,25);

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
