package com.chris.reflect.Bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Auther Chris Lee
 * @Date 12/24/2018 12:43
 * @Description
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Male extends HumanBeing {
	private List<String> carList;
	
	public Male(String name, String address, String gendar)
	{
		super(name, address, gendar);
	}
}
