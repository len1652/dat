package bo;

import java.util.ArrayList;




import bean.didongbean_LeVietDat;
import dao.didongdao_LeVietDat;

public class didongbo_LeVietDat {
	didongdao_LeVietDat dao = new didongdao_LeVietDat();
	ArrayList<didongbean_LeVietDat> ds;
	   public ArrayList<didongbean_LeVietDat> getdidong(){
		   ds=dao.getdidong();
		   return ds;
	   }
	   
	   public ArrayList<didongbean_LeVietDat> timkiem(String key){
		   
		   int keyisnumber=0;
		   ArrayList<didongbean_LeVietDat> tam= new ArrayList<didongbean_LeVietDat>();
		   for (int i = 0; i < key.length(); i++) {
	            if (Character.isLetter(key.charAt(i))) {
	            	keyisnumber=0;
	                break;
	            }
	            if (i + 1 == key.length()) {
	            	keyisnumber=1;
	            }
	        } 
		   
		   if (keyisnumber == 0) {
			   
			   for(didongbean_LeVietDat s: ds) {
				   if(s.getTendidong().toLowerCase().contains(key.toLowerCase())) {
					   tam.add(s);
				   }
			   }
		   }
		   else {
			   long x = Long.parseLong(key);
			   for(didongbean_LeVietDat s: ds) {
				   if(s.getGia()>= x) {
					   tam.add(s);
				   }
			   }
		   }
			   
				   		
		   return tam;
	   }
	   
}
