package car;

public class car_owner {
	String color;
	String brand;
	String plate_number;
	int weight;
	int speed=0;
	public car_owner(String newcolor,String newbrand,String newplate_number,int newweight) {
		color=newcolor;
		brand=newbrand;
		plate_number=newplate_number;
		weight=newweight;
	}
	public void speedup() {
		speed++;
	}
	public void speeddown() {
		speed--;
	}
	public void stop() {
		speed=0;
	}
}
