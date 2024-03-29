package userWallet

import org.hibernate.validator.constraints.NotEmpty
import com.fasterxml.jackson.annotation.JsonFormat
import org.codehaus.jackson.annotate.JsonIgnore


object WebLogin{
    private var LoginIDCounter : Int = 123455
    private def inc = {LoginIDCounter += 1; LoginIDCounter}
}

class WebLogin {
  
		var  login_id :String  = ""
		   
		@NotEmpty(message =  "{Invalid url}")    
		var url : String = ""
		
		@NotEmpty(message =  "{Invalid login}") 
		var login : String = ""
		
		@NotEmpty(message =  "{Invalid password}")  
		var password :String = ""
		
		
		
		
		def getLogin_id() : String = login_id 
		
		def getUrl() : String = url
		
		def getLogin(): String = login
		
		def getPassword(): String = password
	
		
		
		def setUrl(s: String) = {url=s}
		
		def setLogin(s: String) = {login=s}
		
		def setPassword(s: String) =  {password = s}
	
		
		
		def setLogin_id()   = {
		  login_id = "l-" + WebLogin.inc
		}
		 
		

}