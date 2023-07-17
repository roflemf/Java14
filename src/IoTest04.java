import java.io.File;

// java.io 패키지의 File api 내장 클래스느 ㅍ파일과 디렉터리를 다룬다. 웹개발에서는 주로 자료실을 만들때 사용


public class IoTest04 {
   public static void main(String[] args) {
      File filePath = new File("./src"); // STS 즉 이클립스에서 ./ 즉 현재경로는 해당 프로젝트 이다.
      
      String[] fileList = filePath.list(); // src폴더의 파일목록을 배열로 반환한다.
      
      for(int i = 0; i < fileList.length; i++) {
         System.out.print(" " + fileList[i]);
      }   
      System.out.println("\n---------------------\n");
      
      // 문제) 향상된 확장 for반복문으로 파일 목록을 출력해보자.
      for(String fileName:fileList) {
         System.out.println(" " + fileName);
      }
   }
}