package mmc.com.emunation;

public enum OpStatus {
	// 枚举常量定义的同时指定状态码
	S_OK(0), S_PROTOCOL(1), S_AUTH(2), S_ITEMEXISTED(3), S_ITEMNOTFOUND(4), S_SQL(
			15), S_UNKNOWN(16);
	private int code; // 状态码值

	OpStatus(int code) { // 非public构造方法
		this.code = code;
	}

	
	public int getCode() {
		return code;
	}


	public String toString() {
		return String.valueOf(code);
	}
}