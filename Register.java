public class Register {
	public static boolean registerStatus = false ;
	
	public static void setRegisterStatus(boolean status){
		registerStatus = status ;
	}
	
	public boolean verifyregisterinfo(String userid, String username,String password, String email, String date, String month, String year){
		String DOB = year + "-" + month + "-" + date ;
		data DB=new data();
		DB.checkregister( userid , username, password , email, DOB , "local" , "2016-08-15" , "valid") ;
		return true;	
	}
}