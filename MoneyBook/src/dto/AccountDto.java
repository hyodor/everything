package dto;

public class AccountDto extends Calendar {
	//private String dateTime; // 날짜 -> Calendar, Date 2021-05-21 이런식으로 나오게
	private String use; //용도 -> 제목(ex.영화 관람)
	private String classify; //수입/지출
	private int money; // 금액
	private String memo; // 메모, 자기가 적고 싶은 것들..



public AccountDto() {
	
}

public AccountDto(Calendar, String, int, int, String) {
	super();
	//this.dateTime = dateTime;
	this.calendar = c;
	this.use = use;
	this.classify = classify;
	this.money = money;
	this.memo = memo;
}


public String getUse() {
	return use;
}

public void setUse(String use) {
	this.use = use;
}

public String getClassify() {
	return classify;
}

public void setClassify(String classify) {
	this.classify = classify;
}

public int getMoney() {
	return money;
}

public void setMoney(int money) {
	this.money = money;
}

public String getMemo() {
	return memo;
}

public void setMemo(String memo) {
	this.memo = memo;
}

@Override
public String toString() {
	return super.toString() + ", use=" + use + ", classify=" + classify + ", money=" + money
			+ ", memo=" + memo;
	}
}