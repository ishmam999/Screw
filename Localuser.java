public class Localuser{	
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
 }