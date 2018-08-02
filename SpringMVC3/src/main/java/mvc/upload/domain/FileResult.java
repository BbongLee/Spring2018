package mvc.upload.domain;

public class FileResult {

	//서버에 저장된 파일이름
	private String savedName;
	//사용자가 업로드한 원본 파일이름
	private String originalName;
	public FileResult() {
		// TODO Auto-generated constructor stub
	}
	public FileResult(String savedName, String originalName) {
		super();
		this.savedName = savedName;
		this.originalName = originalName;
	}
	public String getSavedName() {
		return savedName;
	}
	public void setSavedName(String savedName) {
		this.savedName = savedName;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	@Override
	public String toString() {
		return "FileResult [savedName=" + savedName + ", originalName=" + originalName + "]";
	}
	
}
