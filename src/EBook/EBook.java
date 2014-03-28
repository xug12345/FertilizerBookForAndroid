package EBook;

public class EBook implements IEBook {
	ITreeNode root;
	@Override
	public ITreeNode readBook(String xml) {
		// TODO Auto-generated method stub
		root=buildTree(xml);
		return root;
	}

	private ITreeNode buildTree(String xml) {
		// TODO Auto-generated method stub
		String element=getFirstElement(xml);
		ITreeNode node=BookTreeNode.readNodeInfo(element);
		
		return node;
	}

	private String getFirstElement(String xml) {
		// TODO Auto-generated method stub
		int last=xml.indexOf("</element>");
		return null;
	}

	@Override
	public String buildIndex(ITreeNode root) {
		// TODO Auto-generated method stub
		return null;
	}

}
