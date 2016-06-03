package basic_pattern.iterator_pattern;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {
	//所有的项目都放在ArrayList中
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	//所有项目的总数量
	private int currentItem = 0;
	public ProjectIterator(ArrayList<IProject> projectList) {
		this.projectList=projectList;
	}

	@Override
	public boolean hasNext() {
		boolean b = true;
		if (this.currentItem>=this.projectList.size() || this.projectList.get(this.currentItem)==null) {
			b = false;
		}
		return b;
	}

	@Override
	public IProject next() {
		return this.projectList.get(this.currentItem++);
	}

	@Override
	public void remove() {
		
	}

}
