package classes;

public class ProgrammerBook extends Book {

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result *= level;
		result += language.length();
		return result;
	}
	
	public int getLevel(){
		return level;
	}
		
	public String getLanguage(){
		return language;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof ProgrammerBook))
			return false;
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		ProgrammerBook other = (ProgrammerBook) obj;
		if (!super.equals(other))
			return false;
		if (!this.language.equals(other.getLanguage()))
			return false;
		if (level != other.getLevel())
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += super.toString();
		result += "language " + language;
		result += "level " + level;
		return result;
	}
	
	private String language;
	private int level;

}
