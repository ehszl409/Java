package conn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Conn01 {

	public static void main(String[] args) {
		try {
			// 1. 주소 설정 URL 클래스 사용
			URL url = new URL("https://www.naver.com");
			
			// 2. 버퍼연결을 위해 스트림에 접근
			// 해당 주소로 가는 논리적인 선을 conn에 담는다.
			// 논리적인 선 : 여러가지 길 중에 가장 빠른 길을 찾고 A에서 B로 가는 
			// 가장 빠른 가상의 길을 만든다. 그리고 아까 찾은 가장 빠른 길을 
			// 가상의 길에 대입한다. 
			HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
					
			// 3. 버퍼 연결 (buffer의 크기 8192Byte)
			//OutputStream os = conn.getOutputStream();
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			
			String input = null;
			String download	 = "";
			while((input = br.readLine()) != null) {
				 download = download + input;
			}
			
			//System.out.println(download);
			
			Document doc = Jsoup.parse(download);
			Elements temp = doc.select(".todaytemp");
			System.out.println("오늘의 온도는 : " + temp.get(0).text());
		} catch (Exception e) {
			return;
		}

	}

}
