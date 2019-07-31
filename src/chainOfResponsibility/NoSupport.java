package chainOfResponsibility;

//解決策resolve()として常にfalseを返す
//すなわち、自分は何もしないというクラス
public class NoSupport extends Support {

	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false;
	}

}
