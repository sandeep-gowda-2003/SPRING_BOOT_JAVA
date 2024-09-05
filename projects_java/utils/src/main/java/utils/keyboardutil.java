package utils;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class keyboardutil {
	void test() {
		List<String> names=new ArrayList<String>();
		
		names.forEach(System.out::println());
		var myName="springs";
	}
	
}
