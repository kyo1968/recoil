package recoil;

/**
 * プロパティクラス
 *
 * @version 1.0
 */
public final class MainProperties extends BaseProperties {
	
	/**
	 * プロパティファイル名
	 */
	public static final String fileName = "recoil.ini";
	
	/**
	 * X正方向の移動量(X正方向)
	 */
	private int xpMovement = 10;
	
	/**
	 * 移動量のプロパティ名(X正方向)
	 */
	public static final String XP_MOVE = "xp.movement";
	
	/**
	 * 移動キー(X正方向)
	 */
	private int xpKeyCode = 0;
	
	/**
	 * 移動キーのプロパティ名(X正方向)
	 */
	public static final String XP_CODE = "xp.code";
	
	/**
	 * CNTLオプション(X正方向)
	 */
	private boolean xpCntl = false;
	
	/**
	 * CTRLオプションのプロパティ名(X正方向)
	 */
	public static final String XP_CNTL = "xp.cntl";
	
	/**
	 * ALTオプション(X正方向)
	 */
	private boolean xpAlt = false;
	
	/**
	 * ALTオプションのプロパティ名(X正方向)
	 */
	public static final String XP_ALT = "xp.alt";
	
	/**
	 * フック有効化フラグ(X正方向)
	 */
	private boolean xpHook = true;
	/**
	 * フック有効化フラグのプロパティ名(X正方向)
	 */
	public static final String XP_HOOK = "xp.hook";

	/**
	 * 移動量(X負方向)
	 */
	private int xnMovement = 10;
	
	/**
	 * 移動量のプロパティ名(X負方向)
	 */
	public static final String XN_MOVE = "xn.movement";
	
	/**
	 * 移動キー(X負方向)
	 */
	private int xnKeyCode = 0;
	
	/**
	 * 移動キーのプロパティ名(X負方向)
	 */
	public static final String XN_CODE = "xn.code";
	
	/**
	 * CNTLオプション(X負方向)
	 */
	private boolean xnCntl = false;
	
	/**
	 * CNTLオプションのプロパティ名(X負方向)
	 */
	public static final String XN_CNTL = "xn.cntl";
	
	/**
	 * ALTオプション(X負方向)
	 */
	private boolean xnAlt = false;
	
	/**
	 * ALTオプションのプロパティ名(X負方向)
	 */
	public static final String XN_ALT = "xn.alt";
	
	/**
	 * フック有効化フラグ(X負方向)
	 */
	private boolean xnHook = true;
	
	/**
	 * フック有効化フラグのプロパティ名(X負方向)
	 */
	public static final String XN_HOOK = "xn.hook";

	private int ypMovement = 10;
	public static final String YP_MOVE = "yp.movement";
	private int ypKeyCode = 0;
	public static final String YP_CODE = "yp.code";
	private boolean ypCntl = false;
	public static final String YP_CNTL = "yp.cntl";
	private boolean ypAlt = false;
	public static final String YP_ALT = "yp.alt";
	private boolean ypHook = true;
	public static final String YP_HOOK = "yp.hook";

	private int ynMovement = 10;
	public static final String YN_MOVE = "yn.movement";
	private int ynKeyCode = 0;
	public static final String YN_CODE = "yn.code";
	private boolean ynCntl = false;
	public static final String YN_CNTL = "yn.cntl";
	private boolean ynAlt = false;
	public static final String YN_ALT = "yn.alt";
	private boolean ynHook = true;
	public static final String YN_HOOK = "yn.hook";

	/**
	 * インスタンス
	 */
	private static MainProperties me = null;
	
	/**
	 * インスタンスを取得する。
	 * 
	 * @return インスタンス
	 */
	public static final MainProperties getInstance() {
		if (me == null) {
			me = new MainProperties();
		}
		return (me);
	}
	
	/**
	 * コンストラクタ
	 */
	private MainProperties() {
		load(fileName);
	}
	
	public int getXpMovement() {
		return xpMovement;
	}

	public void setXpMovement(int xpMovement) {
		this.xpMovement = xpMovement;
	}

	public int getXpKeyCode() {
		return xpKeyCode;
	}

	public void setXpKeyCode(int xpKeyCode) {
		this.xpKeyCode = xpKeyCode;
	}

	public boolean isXpCntl() {
		return xpCntl;
	}

	public void setXpCntl(boolean xpCntl) {
		this.xpCntl = xpCntl;
	}

	public boolean isXpAlt() {
		return xpAlt;
	}

	public void setXpAlt(boolean xpAlt) {
		this.xpAlt = xpAlt;
	}

	public boolean isXpHook() {
		return xpHook;
	}

	public void setXpHook(boolean xpHook) {
		this.xpHook = xpHook;
	}

	public int getXnMovement() {
		return xnMovement;
	}

	public void setXnMovement(int xnMovement) {
		this.xnMovement = xnMovement;
	}

	public int getXnKeyCode() {
		return xnKeyCode;
	}

	public void setXnKeyCode(int xnKeyCode) {
		this.xnKeyCode = xnKeyCode;
	}

	public boolean isXnCntl() {
		return xnCntl;
	}

	public void setXnCntl(boolean xnCntl) {
		this.xnCntl = xnCntl;
	}

	public boolean isXnAlt() {
		return xnAlt;
	}

	public void setXnAlt(boolean xnAlt) {
		this.xnAlt = xnAlt;
	}

	public boolean isXnHook() {
		return xnHook;
	}

	public void setXnHook(boolean xnHook) {
		this.xnHook = xnHook;
	}

	public int getYpMovement() {
		return ypMovement;
	}

	public void setYpMovement(int ypMovement) {
		this.ypMovement = ypMovement;
	}

	public int getYpKeyCode() {
		return ypKeyCode;
	}

	public void setYpKeyCode(int ypKeyCode) {
		this.ypKeyCode = ypKeyCode;
	}

	public boolean isYpCntl() {
		return ypCntl;
	}

	public void setYpCntl(boolean ypCntl) {
		this.ypCntl = ypCntl;
	}

	public boolean isYpAlt() {
		return ypAlt;
	}

	public void setYpAlt(boolean ypAlt) {
		this.ypAlt = ypAlt;
	}

	public boolean isYpHook() {
		return ypHook;
	}

	public void setYpHook(boolean ypHook) {
		this.ypHook = ypHook;
	}

	public int getYnMovement() {
		return ynMovement;
	}

	public void setYnMovement(int ynMovement) {
		this.ynMovement = ynMovement;
	}

	public int getYnKeyCode() {
		return ynKeyCode;
	}

	public void setYnKeyCode(int ynKeyCode) {
		this.ynKeyCode = ynKeyCode;
	}

	public boolean isYnCntl() {
		return ynCntl;
	}

	public void setYnCntl(boolean ynCntl) {
		this.ynCntl = ynCntl;
	}

	public boolean isYnAlt() {
		return ynAlt;
	}

	public void setYnAlt(boolean ynAlt) {
		this.ynAlt = ynAlt;
	}

	public boolean isYnHook() {
		return ynHook;
	}

	public void setYnHook(boolean ynHook) {
		this.ynHook = ynHook;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void loadProperties() {
		
		setXpMovement(getInt(XP_MOVE, 0));
		setXpKeyCode(getInt(XP_CODE, 0));
		setXpCntl(getBoolean(XP_CNTL, false));
		setXpAlt(getBoolean(XP_ALT, false));
		setXpHook(getBoolean(XP_HOOK, false));

		setXnMovement(getInt(XN_MOVE, 0));
		setXnKeyCode(getInt(XN_CODE, 0));
		setXnCntl(getBoolean(XN_CNTL, false));
		setXnAlt(getBoolean(XN_ALT, false));
		setXnHook(getBoolean(XN_HOOK, false));

		setYpMovement(getInt(YP_MOVE, 0));
		setYpKeyCode(getInt(YP_CODE, 0));
		setYpCntl(getBoolean(YP_CNTL, false));
		setYpAlt(getBoolean(YP_ALT, false));
		setYpHook(getBoolean(YP_HOOK, false));

		setYnMovement(getInt(YN_MOVE, 0));
		setYnKeyCode(getInt(YN_CODE, 0));
		setYnCntl(getBoolean(YN_CNTL, false));
		setYnAlt(getBoolean(YN_ALT, false));
		setYnHook(getBoolean(YN_HOOK, false));

	}
	
	/**
	 * プロパティファイルを保存する。
	 */
	public void save() {
		save(fileName);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void storeProperties() {
		properties.put(XP_MOVE, Integer.toString(getXpMovement()));
		properties.put(XP_CODE, Integer.toString(getXpKeyCode()));
		properties.put(XP_CNTL,  Boolean.toString(isXpCntl()));
		properties.put(XP_ALT,  Boolean.toString(isXpAlt()));
		properties.put(XP_HOOK,  Boolean.toString(isXpHook()));

		properties.put(XN_MOVE, Integer.toString(getXnMovement()));
		properties.put(XN_CODE, Integer.toString(getXnKeyCode()));
		properties.put(XN_CNTL,  Boolean.toString(isXnCntl()));
		properties.put(XN_ALT,  Boolean.toString(isXnAlt()));
		properties.put(XN_HOOK,  Boolean.toString(isXnHook()));

		properties.put(YP_MOVE, Integer.toString(getYpMovement()));
		properties.put(YP_CODE, Integer.toString(getYpKeyCode()));
		properties.put(YP_CNTL,  Boolean.toString(isYpCntl()));
		properties.put(YP_ALT,  Boolean.toString(isYpAlt()));
		properties.put(YP_HOOK,  Boolean.toString(isYpHook()));

		properties.put(YN_MOVE, Integer.toString(getYnMovement()));
		properties.put(YN_CODE, Integer.toString(getYnKeyCode()));
		properties.put(YN_CNTL,  Boolean.toString(isYnCntl()));
		properties.put(YN_ALT,  Boolean.toString(isYnAlt()));
		properties.put(YN_HOOK,  Boolean.toString(isYnHook()));
	}
}