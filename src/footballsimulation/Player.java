package footballsimulation;

public class Player {
	
	private String name;
	private int shirtNumber;
	private Position position;
	
	public Player(String name, int shirtNumber, Position position) {
		this.name = name;
		this.shirtNumber = shirtNumber;
		this.position = position;
	
	}

	public String getName() {
		return name;
	}
	public int getShirtName() {
		return shirtNumber;
	}
	public Position getPosition() {
		return position;
	}
		
		this.name = name;
		this.shirtNumber = shirtNumber;
		this.position = position;
		// TODO: Assign values to attributes.
		
	}

	public String getName()
	{
		return name;
	}
	
	
	public Position getPosition()
	{
		return position;
	}
	// TODO: Define getter methods only.
	
	@Override
	public int hashCode() {
		return shirtNumber;
	}

	@Override
	public boolean equals(Object obj) {
		// Note: This method determines whether 
		// two player instances are the same individual.
		// It is very important for sets.
		// Because sets do not contain duplicate elements.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position != other.position)
			return false;
		if (shirtNumber != other.shirtNumber)
			return false;
		return true;
	}
	
}
