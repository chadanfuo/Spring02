package net.madvirus.spring4.chap02.search;

public class HttpSearchClient  implements SearchClient{

	@Override
	public void addDocument(SearchDocument searchDocumenet) {
		System.out.println("���� �߰���");
	}

	@Override
	public void checkLive() {
		System.out.println("���� Ȯ��");
	}

}
