package EBook;

public interface IEBook {
	ITreeNode readBook(String xml);
	String buildIndex(ITreeNode root);
}
