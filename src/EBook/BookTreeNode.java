package EBook;

import java.util.ArrayList;

public class BookTreeNode implements ITreeNode {

	BookTreeNode parent;
	BookTreeNode[] children;
	BookTreeNode root;
	
	String title;
	String description;
	String[] images;
	@Override
	public ITreeNode[] getChildren() {
		// TODO Auto-generated method stub
		return children;
	}

	@Override
	public ITreeNode getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

	@Override
	public ITreeNode getRoot() {
		// TODO Auto-generated method stub
		return root;
	}

	@Override
	public ArrayList<ITreeNode> findSubNodes(String[] keywords, boolean andlogic) {
		// TODO Auto-generated method stub
		ArrayList<ITreeNode> result=new ArrayList<ITreeNode>();
		for(String keyword : keywords)
		{
			if(title.contains(keyword))
			{
				result.add(this);
				break;
			}
			else if(description.contains(keyword))
			{
				result.add(this);
				break;
			}
		}
		for(ITreeNode child:children)
		{
			result.addAll(child.findSubNodes(keywords, andlogic));
		}
		return result;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public String[] getImages() {
		// TODO Auto-generated method stub
		return images;
	}

	static public ITreeNode readNodeInfo(String xml) {
		// TODO Auto-generated method stub
		return null;
	}

}
