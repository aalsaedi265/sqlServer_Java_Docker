package interfaceClass;

public class motor implements Driverable{
    
    @Override
	public void turnLeft() {
		System.out.println("bike can turn left");
	}

	@Override
	public void turnRight() {
		System.out.println("bike can turn right");
	}
}
