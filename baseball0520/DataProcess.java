package baseball0520;

import java.io.*;
import java.util.ArrayList;

public class DataProcess {
	
	private File file;
	
	public DataProcess(String filename) {
		file = new File("C:\\hyo\\" + filename + ".txt");
		
	}
	
	public void createFile() {
		try {
			if(file.createNewFile()) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Human> fileLoad() {
		ArrayList<Human> filelist = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			//data의 총 수를 구한다. 
			
			int count = 0;
			String str;
			while((str=br.readLine())!=null) {
				count++;
				
			}br.close();
			
			//datas를 할당한다. 
			
			ArrayList<Human> filelist1 = new ArrayList<Human>();
		
			
			//data 취합
			
			br = new BufferedReader(new FileReader(file));
			int w = 0; 
				while((str = br.readLine())!=null) {
					 filelist1.add(new Human());
					w++;
				} br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filelist;
		}
	
	public void fileSave(ArrayList<Human> filelist) {
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for(int i = 0; i<filelist.size(); i++) {
				pw.println(filelist.get(i));
			} pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일에 저장되었습니다.");
	}
}
