package cn.linkpower.json;

public enum Results {
	ok(200,"ok","");
	private Integer code;
	private String mag;
	private Object data;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMag() {
		return mag;
	}
	public void setMag(String mag) {
		this.mag = mag;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	private Results(Integer code, String mag, Object data) {
		this.code = code;
		this.mag = mag;
		this.data = data;
	}
	
	
}
