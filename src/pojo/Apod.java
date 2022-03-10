package pojo;

public class Apod {
	private String date;
	private String explanation;
	private String hdurl;
	private String url;
	private String media_type;
	private String service_version;
	private String title;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getHdurl() {
		return hdurl;
	}
	public void setHdurl(String hdurl) {
		this.hdurl = hdurl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMedia_type() {
		return media_type;
	}
	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}
	public String getService_version() {
		return service_version;
	}
	public void setService_version(String service_version) {
		this.service_version = service_version;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Apod(String date, String explanation, String hdurl, String url, String media_type, String service_version,
			String title) {
		this.setDate(date);
		this.setExplanation(explanation);
		this.setHdurl(hdurl);
		this.setUrl(url);
		this.setMedia_type(media_type);
		this.setService_version(service_version);
		this.setTitle(title);
	}
	
	public Apod() {
		this("", "", "", "", "", "", "");
	}
	@Override
	public String toString() {
		return "Apod [getDate()=" + getDate() + ", getExplanation()=" + getExplanation() + ", getHdurl()=" + getHdurl()
				+ ", getUrl()=" + getUrl() + ", getMedia_type()=" + getMedia_type() + ", getService_version()="
				+ getService_version() + ", getTitle()=" + getTitle() + "]";
	}
}
