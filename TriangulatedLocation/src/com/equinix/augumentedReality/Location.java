package com.equinix.augumentedReality;
/**
 * 
 */

/**
 * @author njirafe
 *
 */
public class Location {

	private double x_cord;
	private double y_cord;

	public Location() {

	}
	public Location(double x_cord , double y_cord ){

		this.x_cord = x_cord;
		this.y_cord = y_cord;
	}
	public double getX_cord() {
		return x_cord;
	}

	public void setX_cord(double x_cord) {
		this.x_cord = x_cord;
	}

	public double getY_cord() {
		return y_cord;
	}

	public void setY_cord(double y_cord) {
		this.y_cord = y_cord;
	}
}
