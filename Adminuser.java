public class Adminuser {
	data DB;
	
	public String[][] ViewProfile(String id){
		DB= new data();
		return DB.getProfile(id);
	}
	
	public String[][] ViewProfileList(){
		DB= new data();
		return DB.getProfileList();
	}
	
	public void userlogout(){
		Login.setLoginStatus(false);
		Login.setuType("");
		Login.setID("Django Unchanged");
	}
	
	public void band(String userId){
		DB = new data();
		DB.setBand(userId);
	}
	
	public void unband(String userId){
		DB = new data();
		DB.setUnband(userId);
	}
	/*
	public void deleteUser(String userId){
		DB = new data();
		DB.delete(userId);
	}*/
}
