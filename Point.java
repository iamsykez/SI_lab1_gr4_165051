class Point {
	String id;
	String color = new String("blue");
	double x,y;


	public Point(String id, double x, double y, String color){
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}	

	
	public String getId(){
		return id;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public double getX(){
		return x;
	} 
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY(){
		return y;
	} 
	
	public void setY(double y) {
		this.y = y;
	}
	
	public String getColor(){
		return color;
	} 
	
	public void setColor(String color) {
		this.color = color;
	}

	

	public void move (char xDirection, char yDirection) {
		
		setX(getX()+xDirection);
		setY(getY()+yDirection);
	}

	public void draw () {
		System.out.println(getX() + getY())
	}



}