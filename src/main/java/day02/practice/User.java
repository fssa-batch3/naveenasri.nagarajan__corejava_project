package day02.practice;

public class User {

	private int id ;
	private String name ;
	private String password ;
	private String emailId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Naveena");
        user.setPassword("Navee1234");
       user.setEmailId("navee@gmail.com");
        System.out.println("Id: " +user.getId());         
        System.out.println("Name: " +user.getName());      
        System.out.println("Password: " + user.getPassword());
        System.out.println("Email: "+ user.getEmailId());
    }
	
	
}
