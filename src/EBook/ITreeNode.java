package EBook;

import java.util.ArrayList;

/**
 * 	@author xug12345
 *	节点树操作
 */
/**
 * @author xug12345
 *
 */
/**
 * @author xug12345
 *
 */
public interface ITreeNode {
	
	/**
	 * @return 字节点集合
	 */
	ITreeNode[] getChildren();

	/**
	 * @return 父节点
	 */
	ITreeNode getParent();
	//
	/**
	 * @return 根节点
	 */
	ITreeNode getRoot();
	
	
	/**
	 * @param keyword 关键字列表
	 * @param andlogic 与关系=true,或关系=false
	 * @return 目标节点列表
	 */
	ArrayList<ITreeNode> findSubNodes(String[] keyword, boolean andlogic);

	/**
	 * @return 标题
	 */
	String getTitle();

	/**
	 * @return 描述
	 */
	String getDescription();

	/**
	 * @return 图集
	 */
	String[] getImages();

}
