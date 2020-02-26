package net.madvirus.spring4.chap02.search;

public class HttpSearchClientFactory implements SearchClientFactory{
	private String server;
	private String contentType;
	private String encoding;
	
	public HttpSearchClientFactory(String server, String contentType, String encoding) {
		this.server = server;
		this.contentType = contentType;
		this.encoding = encoding;
	}
	public void init(){
		System.out.println("init");
		System.out.println(this);
		System.out.printf("HttpSearchClientFactory: 초기화 함 - %s, %s, %s\n", server,contentType,encoding);
		System.out.println("end init");
	}
	@Override
	public String toString() {
		return "HttpSearchClientFactory [server=" + server + ", contentType=" + contentType + ", encoding=" + encoding
				+ "]";
	}
	
	public SearchClient create(){
		System.out.println("create");
		return new HttpSearchClient();
	}
	
}
