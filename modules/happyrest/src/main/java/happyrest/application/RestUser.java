package happyrest.application;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RestUser {
 
    private long id;
    private String firstname;
    private String lastname;
 
    public RestUser() {
    }
 
    
    public RestUser(long id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}


	public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getFirstname() {
        return firstname;
    }
 
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
 
    public String getLastname() {
        return lastname;
    }
 
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
 
}
