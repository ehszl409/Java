package sms;

import lombok.Data;

@Data
public class Response {

	String group_id;
	String error_list;
	String success_count;
	String error_count;

	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2G65eohHRHhCMRb\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
		Response res = new Response();

//		System.out.println(data.indexOf("{"));
//		System.out.println(data.lastIndexOf("}"));
//		System.out.println();

		data = data.replace("{", "");
		data = data.replace("}", "");
		System.out.println(data);

		String[] splitd01 = data.split(",");
//		for (int i = 0; i < splitd01.length; i++) {
//			System.out.println(splitd01[i]);
//		}
//		System.out.println();

		String[] data2 = splitd01[0].split(":");
		String[] data3 = splitd01[1].split(":");
		String[] data4 = splitd01[2].split(":");
		String[] data5 = splitd01[3].split(":");

//		System.out.println("data2 : " + data2[0] + " " + data2[1]);
//		System.out.println("data3 : " + data3[1] + " " + data3[2]);
//		System.out.println("data4 : " + data4[0] + " " + data4[1]);
//		System.out.println("data5 : " + data5[0] + " " + data5[1]);

		res.group_id = data2[1].replace("\"", "");
		System.out.println(res.group_id);

		res.error_list = data3[2].replace("\"", "");
		System.out.println(res.error_list);

		res.success_count = data4[1];
		System.out.println(res.success_count);

		res.error_count = data5[1];
		System.out.println(res.error_count);
		
		System.out.println(res);

		// System.out.println(data);
	}
}
