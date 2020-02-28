package p1;

import java.util.Properties;

import org.compiere.model.PO;
import org.compiere.model.POInfo;

public class A2 extends PO {

	private static final long serialVersionUID = 1L;

	public A2() {
		super(null, 0, null);
	}

	@Override
	protected int get_AccessLevel() {
		return 0;
	}

	@Override
	protected POInfo initPO(Properties ctx) {
		return null;
	}
}