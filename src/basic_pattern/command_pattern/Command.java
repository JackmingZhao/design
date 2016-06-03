package basic_pattern.command_pattern;

public abstract class Command {

	RequirementGroup rg = new RequirementGroup();
	PageGroup pg = new PageGroup();
	CodeGroup cg = new CodeGroup();
	
	public abstract void execute();
	
}
