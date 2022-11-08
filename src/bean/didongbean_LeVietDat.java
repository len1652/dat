package bean;

public class didongbean_LeVietDat {
	private String Madidong;
	private String nhacungcap;
	private int gia;
	private int soluong;
	private String anh;
	public didongbean_LeVietDat(String madidong, String nhacungcap, int gia, int soluong, String anh) {
		super();
		Madidong = madidong;
		this.nhacungcap = nhacungcap;
		this.gia = gia;
		this.soluong = soluong;
		this.anh = anh;
	}
	public didongbean_LeVietDat() {
		super();
	}
	public String getMadidong() {
		return Madidong;
	}
	public void setMadidong(String madidong) {
		Madidong = madidong;
	}
	public String getNhacungcap() {
		return nhacungcap;
	}
	public void setNhacungcap(String nhacungcap) {
		this.nhacungcap = nhacungcap;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
}
