package exercise6;

public class Song {
    private int id;
    private String name;

    public Song(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

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
	
	public String toString() {
		return "[id: "+id+ "name" + name +"]";
	}
}