import java.util.Objects;

public class Player {
	int pid;
	String name;
	String game;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public Player(int pid, String name, String game) {
		super();
		this.pid = pid;
		this.name = name;
		this.game = game;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + ", game=" + game + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(game, name, pid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(game, other.game) && Objects.equals(name, other.name) && pid == other.pid;
	}
	
	
}
