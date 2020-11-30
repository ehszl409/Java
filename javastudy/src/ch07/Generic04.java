package ch07;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Error {
	private String msg;
}

@AllArgsConstructor
@Data
class User {
	private int id;
	private String username;
}

@AllArgsConstructor
@Data
class RespDto<T> { // new 할 때 타입을 결
	private int code; // 200(정상), 400(실패)
	private T data;
}

public class Generic04 {
	
	static RespDto<?> getData(String username) { // 함수를 호출 할때 타입을 결정
		if(username.equals("ssar")) {
			RespDto<User> dto = new RespDto(200, new User(1, "ssar"));
			return dto;
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("아이디가 틀렸습니다."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		RespDto<?> dto = getData("ssar2");
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}


