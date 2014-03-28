package EBook;

import java.util.ArrayList;

/**
 * 	@author xug12345
 *	�ڵ�������
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
	 * @return �ֽڵ㼯��
	 */
	ITreeNode[] getChildren();

	/**
	 * @return ���ڵ�
	 */
	ITreeNode getParent();
	//
	/**
	 * @return ���ڵ�
	 */
	ITreeNode getRoot();
	
	
	/**
	 * @param keyword �ؼ����б�
	 * @param andlogic ���ϵ=true,���ϵ=false
	 * @return Ŀ��ڵ��б�
	 */
	ArrayList<ITreeNode> findSubNodes(String[] keyword, boolean andlogic);

	/**
	 * @return ����
	 */
	String getTitle();

	/**
	 * @return ����
	 */
	String getDescription();

	/**
	 * @return ͼ��
	 */
	String[] getImages();

}
