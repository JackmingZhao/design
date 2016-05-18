package command_pattern;

/**
 * 命令对象化，在对象中调用真正的业务处理类
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
