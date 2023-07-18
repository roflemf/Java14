import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*도메인 주소를 입력하면 주소에 대한 ip주소를 알아내기 */

public class NetWorkTest01 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader reader;
		String url;
		InetAddress addr = null; //InetAddress 클래스는 ip 번호를 처리할 때 사용하는 클래스이다.
		
		reader = new BufferedReader (new InputStreamReader (System.in));
		/* 1. System.in 은 키보드 입력장치와 연결됌
		 * 2. InputStreamReader 는 읽어들인 바이트를 문자로 변경
		 * 3. BufferedReader는 읽어들인 문자를 버퍼링 즉 임시 메모리에 저장
		 */
		
		System.out.print("웹사이트 주소를 입력 >>");
		url = reader.readLine();//한줄 끝까지 문자열로 읽어들임
		
		try {
			addr = InetAddress.getByName(url);
		}catch(UnknownHostException ue) {ue.printStackTrace();}
		
		System.out.println("==============================>");
		System.out.println(url + "의 ip번호 : "  + addr.getHostAddress());
		
	}
}
