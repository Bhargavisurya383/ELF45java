package Polymorphism;

public class Driver1 {
	public void NoOfWheels(vehicle v)
	{
		v.wheels();
	}
	public static void main(String[] args) {
		auto a1=new auto();
		Driver1 d1=new Driver1();
		d1.NoOfWheels(a1);// 3wheels
		bike b1=new bike();
		d1.NoOfWheels(b1);//2 wheels
		vehicle v1=new vehicle();
		d1.NoOfWheels(v1);//6 wheels
	}

}
