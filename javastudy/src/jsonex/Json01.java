package jsonex;

import com.google.gson.Gson;

public class Json01 {
	
	class Com {
		private int id;
		private String content;
	}

	public static void main(String[] args) {
		// java -> Json
		Comment ct1	= new Comment(1, "댓글1");
		Gson gson = new Gson();
		String ct1Json = gson.toJson(ct1);
		System.out.println(ct1Json);
		
		//Json(String) -> java
		Comment ct2 = gson.fromJson(ct1Json, Comment.class);
		System.out.println(ct2.getId());
		System.out.println(ct2.getContent());
		
		

	}

}
