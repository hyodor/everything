package may12;

public class Assignment4 {

	public static void main(String[] args) {
	
		// abcdefghijklmnopqrstuvwxyz 
		char[] abcCode = 
		{ '`','~','!','@','#','$','%','^','&','*', 
		'(',')','-','_','+','=','|','[',']','{', 
		'}',';',':',',','.','/'}; 
		// 0 1 2 3 4 5 6 7 8 9 
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

		String src = "abc123";
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장 
		for(int i=0; i < src.length();i++) { 
		char ch = src.charAt(i); 
		System.out.println("원래 문자 " + i +"번째: " + ch);
		
		
		if(ch>='a'&&ch<='z') {
			result +=abcCode[ch-'a'];
		}else {
			result +=numCode[ch-'0'];
		}
			}
		
		//다시 복호화하기
		
		String originalCode = "";
		
		for(int i = 0; i<result.length();i++) {
			char c = result.charAt(i);
			int asc = (int)c;
			
			//암호     원본
			//알파벳 -> 숫자
			int index = 0;
			if(asc>=97&&asc<=122) {
				for(int j = 0; j<numCode.length;j++) {
					if(c == numCode[j]) {
						index = j;
						break;
					}
				}
				index +=48; //숫자에 해당하는 아스키코드값으로 설정하기
				originalCode+=(char)index; // 아스키코드값을 문자로 변경해주고 추가함
				
			}
			
			//암호     원본
			//기호 -> 알파벳 
			else {
				for(int j = 0; j<abcCode.length;j++) {
					if(c==abcCode[j]) {
						index = j;
						break;
					}
				}
				index +=97;
				originalCode+=(char)index;
			}
		}
		
		System.out.println("src : " + src); 
		System.out.println("result : " + result);
		System.out.println("originalCode : " + originalCode);
		}
	}

/* for(int i = 0; i<src.length();i++){
 * char ch = src.charAt(i);
 * int asc = (int)c;
 * 
 * if(asc>=97&&asc<=122){
 * asc-=97;
 * result +=abcCode[asc];}
 * 
 * if(asc>=48 && asc<=57){
 * asc -=48;
 * result +=numCode[asc];}
 * }
 */