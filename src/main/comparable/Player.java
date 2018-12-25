package comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther Chris Lee
 * @Date 12/25/2018 14:11
 * @Description
 */
@Data
@AllArgsConstructor
public class Player implements Comparable<Player> {
	private int ranking;
	
	private String name;
	
	private int age;
	
	@Override
	public int compareTo(Player o) {
		return o.ranking - this.ranking;
	}
}
