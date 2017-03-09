// SmileyFace.java
//
// ICS 21: Lab Assignment 1
//
// Originally coded by Norm Jacobson, September 2006
// Minor modifications introduced by Alex Thornton, June 2009
// Revised and adapted for ICS45J Fall 2012 by Norman Jacobson, August 2012
//

// The class representing one smiley face
public class SmileyFace
{
// A SmileyFace consists of four parts:
// * A face (the circle that underlies the entire smiley face)
// * A left eye
// * A right eye
// * A smile
// Provide fields for each

	// When we construct a new SmileyFace from scratch, we create
	// a new face, new eyes, and a new smile, but don't give them
	// any characteristics; they are filled in later.
	public SmileyFace()
	{
		// *** code that implements this method goes here***	
	}

	// When we construct a new SmileyFace that is intended to be a
	// copy of an original SmileyFace, we construct each new part
	// from the same part of the old face
	public SmileyFace(SmileyFace original)
	{
		// *** code that implements this method goes here***	
	}

	// translate() moves the entire face, including all of its parts,
	// by the given horizontal (deltaX) and vertical (deltaY)
	// distances. Positive values move the figure right and down; 
	// negative ones up and left
	public void translate(int deltaX, int deltaY)
	{
		// *** code that implements this method goes here***
	}


	// Accessors that return each part of a SmileyFace:

	public Face getFace()
	{
		// *** code that implements this method goes here***
	}


	public Eye getLeftEye()
	{
		// *** code that implements this method goes here***
	}


	public Eye getRightEye()
	{
		// *** code that implements this method goes here***
	}


	public Smile getSmile()
	{
		// *** code that implements this method goes here***
	}
	
	// Accessors that return the 'edges' of the
	// smiley - the leftmost, rightmost, topmost,  
	// and bottom-most points
	
	public int getLeftEdge()
	{
		// *** code that implements this method goes here***
	}
	
	public int getRightEdge()
	{
		// *** code that implements this method goes here***
	}
	
	public int getTopEdge()
	{
		// *** code that implements this method goes here***
	}

	public int getBottomEdge()
	{
		// *** code that implements this method goes here***
	}
}


