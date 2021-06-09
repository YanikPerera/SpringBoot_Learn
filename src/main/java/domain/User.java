package domain;

import lombok.Data;

//here i have used lombok for testing purpose.. when we use this we no need provide getters and
//setter to the project..lombok is automatically provide us getter and setters to each variable
// for use lombok
/*we should have to add lombok dependency to the project pom.xml
 * and after the lombok plugging should install to the eclips by folowing steps  
 * */
@Data
public class User {
	
	private String id;
	private String name;
	private String email;
	

}
