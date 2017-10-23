public class Checkers{
	private int hieght ;
	private int width ;
	private int xAxis ;
	private int yAxis ;
	private String status ;
	
	public Checkers( int xAxis , int yAxis , int hieght , int width , String state ){
		this.xAxis = xAxis ;
		this.yAxis = yAxis ;
		this.hieght = hieght ;
		this.width = width ;
		this.status = state ;
	}
	
	public void set( int xAxis , int yAxis , int hieght , int width){
		this.xAxis = xAxis ;
		this.yAxis = yAxis ;
		this.hieght = hieght ;
		this.width = width ;
	}
	
	public int getXAxis(){
		return xAxis ;
	}
	
	public int getYAxis(){
		return yAxis ;
	}
	
	public int getHieght(){
		return hieght ;
	}
	
	public int getWidth(){
		return width ;
	}
	
	public void setStatus( String state ){
		status = state ;
	}
	
	public String getStatus(){
		return status ;
	}
}