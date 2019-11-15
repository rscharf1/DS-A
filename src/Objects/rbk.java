package Objects;

import java.util.*;


public class rbk {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		//turtleSpiralIter(t, 100, 5);
		//turtleSpiral(t, 100, 5);
		//mickeyFace(t, 30);
		//fractalMickeyMouse(t, 30, 3);
	}
	
	public static void turtleSpiralIter(Turtle t, double size, double minSize) {
		while(size>minSize) {
			t.forward(size);
			t.right(90);
			t.forward(size);
			t.right(90);
			size *= 0.9; 
		}
	}
	
	public static void turtleSpiral(Turtle t, double size, double minSize) {
		if(size < minSize) {
			return; 
		}
		else {
			t.forward(size);
			t.right(90);
			t.forward(size);
			t.right(90);
			turtleSpiral(t, size*0.9, minSize);
		}
	}
	
	public static void fractalMickeyMouse(Turtle t, double r, int level) {
		System.out.println(t.turtlePosition());
		if(level==0) {
			return; 
		}
		
		mickeyFace(t, r);
		t.penup();
		//t.left(45);
		System.out.println("fwd " + (3*r/Math.sqrt(2)/2));
		t.forward(3*r/Math.sqrt(2)/2);
		t.left(90);
		t.forward(3*r/Math.sqrt(2)/2);
		t.right(90);
		fractalMickeyMouse(t, r/2, level-1);
		System.out.println(t.turtlePosition());
		t.penup();
		t.right(90);
		t.forward(level*0.25*r/Math.sqrt(2));
		t.left(90);
		t.backward(2*r - r/4);
		t.pendown();
		fractalMickeyMouse(t, r/2, level-1);
	}
	
	
    public static void mickeyFace(Turtle t, double r) {
        int n = (int)(0.9 * Math.abs(r) + 3);
        double side = 2 * r * Math.sin(Math.PI / n);
        //want to have a line for penup because want the turtle to start in the center of the frame
        t.penup();
        t.left(180);
        t.forward(r);
        t.left(180);
        t.right(90);
        t.pendown();
        for (int i = 0; i < n; i++) {
            t.forward(side);
            t.left(360.0 / n);
        }
        t.penup();
        t.left(90);
        t.forward(r);
        t.pendown();
    }

}
