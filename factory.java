package car;

public class factory {
	String brand;
	int weight;
	int wheels;
	int price;
	boolean issell=false;
	public factory(String newbrand,int newweight,int newwheels,int newprice) {
		brand=newbrand;
		weight=newweight;
		wheels=newwheels;
		price=newprice;
	}
	public void sell() {
		if(issell)
			System.out.printf("Sorry,the car %s has been sold.\n",brand);
		else
			issell=true;
	}
}
