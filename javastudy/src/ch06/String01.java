package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// DTO = Data Transfer Object = 통신에서 많이 사용됨.
class UserDto {
	private int id;
	private String name;
}

public class String01 {

	public static void main(String[] args) {
		String data = " id : 1, name : 홍길동 ";
		System.out.println(data);
		System.out.println();
		// 파싱 (Parsing) : 구문 분석.
//		UserDto dto = new UserDto();
//		dto.setId(1);
//		dto.setName("홍길동");
//		System.out.println(dto);
		System.out.println("trim()");
		String tdata = data.trim();
		System.out.println(tdata);
		System.out.println();
		
		System.out.println("replace()");
		data = data.replace(" ", "");
		System.out.println(data);
		System.out.println();
		
		System.out.println("split()");
		String[] splitdata = data.split(",");
		for (int i = 0; i < splitdata.length; i++) {
			System.out.println(splitdata[i]);
		} System.out.println();
		
		System.out.println("replace(), contain()");
		splitdata[0] = splitdata[0].replace("1", "ehsl409");
		splitdata[1] = splitdata[1].replace("홍길동", "박신율");
		for (int i = 0; i < splitdata.length; i++) {
			System.out.println(splitdata[i]);
			System.out.println(splitdata[i].contains("박신율"));
		}
		
		
		}
	}


