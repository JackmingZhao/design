package senior_pattern.chuangjianlei_pattern.superman.builder;

public class ChildSuperManBuilder extends Builder {

	@Override
	public SuperMan getSuperMan() {
		super.setBody("ǿ׳������");
		super.setSpecialTalent("��ǹ����");
		super.setSpecialSymbol("��ǰ��СS���");
		return super.superMan;
	}

}
