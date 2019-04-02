package com.chris.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther Chris Lee
 * @Date 12/25/2018 15:06
 * @Description
 */
@Data
@AllArgsConstructor
class Player implements Comparable<Player> {
	
	private int ranking;
	
	private String name;
	
	private int age;
	
	@Override
	public int compareTo(Player o) {
		return this.ranking - o.ranking;
	}
}
