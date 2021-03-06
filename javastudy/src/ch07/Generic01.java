package ch07;

import lombok.Data;

@Data
class ResponseDto<T> {
	private int statusCode; // 200(성공), 300(다시요청), 400(잘못된요청)
	// private Object data; // 모든 타입을 다 받을 수 있는 Object 하지만 코드를 저장하기는 쉬워도
	// 사용하기가 불편하다 캐스팅을 해야 하기 때문에.

	private T data; // 그래서 클래스에 들어오는 타입을 정해주지 않고 들어올 때 정해준다.

}

public class Generic01 {

	public static void main(String[] args) {
		ResponseDto<Integer> dto = new ResponseDto();
		dto.setStatusCode(200); // 통신을 받았다고 가정.
		dto.setData(1); // 데이터 내용이 숫자일수도 문자일수도 아니면 클래스 객체일지도 모른다.

		System.out.println(dto.getStatusCode());
		// System.out.println(dto.getData());

		if (dto.getStatusCode() == 200) {
			System.out.println(dto.getData());
		}

	}

}
