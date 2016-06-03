package senior_pattern.chuangjianlei_pattern.superman.builder;

public class AdultSuperManBuilder extends Builder {

	@Override
	public SuperMan getSuperMan() {
		super.setBody("ǿ׳������");
		super.setSpecialTalent("�����");
		super.setSpecialSymbol("��ǰ��S���");
		return super.superMan;
	}

}
