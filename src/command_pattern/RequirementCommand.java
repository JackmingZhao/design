package command_pattern;

/**
 * ������󻯣��ڶ����е���������ҵ������
 * @author lenovo
 *
 */
public class RequirementCommand extends Command {

	@Override
	public void execute() {
		super.rg.find();
		super.pg.add();
		super.pg.add();
		super.cg.add();
		super.rg.plan();
	}

}
