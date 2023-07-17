import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IoTest10 {
	public static void main(String[] args) {
		
		Customer cus = new Customer(10, "홍길동", 23, 173.6);
		
		try {
			System.out.println(cus.toString());
			FileOutputStream fos = new FileOutputStream("./src/result10.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cus);//객체 단위로 기록
			
			oos.close(); fos.close();
			
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}
