package test03_map;

public class Person {
    String name;
    String id;
    
    public Person(String name, String id) {
        super();
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + "]";
    }
    
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person other = (Person) obj;
			return id.equals(other.id);
		}
		return false;
	}
    
}
