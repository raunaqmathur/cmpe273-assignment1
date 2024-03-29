package userWallet

import java.util.Calendar
import org.hibernate.validator.constraints.NotEmpty
import com.fasterxml.jackson.annotation.JsonFormat
import org.codehaus.jackson.annotate.JsonIgnore
import java.text._

object IDCard{
    private var IDCardCounter : Int = 123455
    private def inc = {IDCardCounter += 1; IDCardCounter}
}

class IDCard {
		 var  card_id :String  = ""
		   
		@NotEmpty(message =  "{Invalid card name}")  
		var card_name : String = ""
		  
		@NotEmpty(message =  "{Invalid card number}")
		var card_number : String = ""
		
		@JsonIgnore  
		@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")  
		private var expiration_date :java.util.Date = _
		
		
		def getCard_id() : String = card_id 
		
		def getCard_name() : String = card_name
		
		def getCard_number(): String = card_number
		
		def getExpiration_date(): java.util.Date = expiration_date
	
		
		def setCard_id()   = {
		  card_id = "c-" + IDCard.inc
		}
		 
		 
		 def setCard_name(s: String) = {card_name=s}
		
		def setCard_number(s: String) = {card_number=s}
		
		def setExpiration_date(s:String ) = { 
		  var formatter : DateFormat = new SimpleDateFormat("MM-dd-yyyy");
		  var date:java.util.Date = formatter.parse(s);
		  expiration_date = date;
		  }
	
		
}


