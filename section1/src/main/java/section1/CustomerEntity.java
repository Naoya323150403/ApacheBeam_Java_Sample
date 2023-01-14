package section1;

public class CustomerEntity {

	private String id;
	private String name;
	public String getId() {
		return id;
	}

	public CustomerEntity() {

	}

	public CustomerEntity(String pId, String pName) {
		this.id = pId;
		this.name = pName;

	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}




}
