public class CheckersPlayer{
	
	private boolean status ;
	
	public CheckersPlayer( boolean state ){
		status = state ;
	}
	
	public void setStatus( boolean state){
		status = state ;
	}
	
	public boolean getStatus(){
		return status ;
	}
}