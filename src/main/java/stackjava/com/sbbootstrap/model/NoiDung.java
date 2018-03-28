package stackjava.com.sbbootstrap.model;

public class NoiDung {
	
	private String id;
	private String tieude;
	private String noi_dung;
	private String link_anh;
	
	public NoiDung(String id, String tieude, String noi_dung, String link_anh) {
		super();
		this.id=id;
		this.tieude=tieude;
		this.noi_dung=noi_dung;
		this.link_anh=link_anh;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	public String getNoi_dung() {
		return noi_dung;
	}

	public void setNoi_dung(String noi_dung) {
		this.noi_dung = noi_dung;
	}

	public String getLink_anh() {
		return link_anh;
	}

	public void setLink_anh(String link_anh) {
		this.link_anh = link_anh;
	}

}
