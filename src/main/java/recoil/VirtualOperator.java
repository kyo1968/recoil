package recoil;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

/**
 * 仮想デバイス操作クラス
 *
 * @version 1.0
 */
public final class VirtualOperator {

	/**
	 * ロボット
	 */
	private Robot robot;
	
	/**
	 * X正移動キーのモディファイア
	 */
	private int xpModFlags = 0;
	
	/**
	 * X負移動キーのモディファイア
	 */
	private int xnModFlags = 0;
	
	/**
	 * Y正移動キーのモディファイア
	 */
	private int ypModFlags = 0;
	
	/**
	 * Y負移動キーのモディファイア
	 */
	private int ynModFlags = 0;
	
	/**
	 * インスタンス
	 */
	private static VirtualOperator me = null;

	/**
	 * コンストラクタ
	 * 
	 * @throws AWTException  ロボット生成エラー
	 */
	private VirtualOperator() throws AWTException {
		/* ロボット生成 */
		robot = new Robot();
	}
	
	/**
	 * インスタンスを取得する。
	 * 
	 * @return インスタンス
	 * @throws AWTException インスタンス生成エラー
	 */
	public static final VirtualOperator getInstance() throws AWTException {
		/* singletonで生成 */
		if (me == null) {
			me = new VirtualOperator();
		}
		return (me);
	}

	/**
	 * イベントリスナを初期化する。
	 * 
	 */
	public void init() {
		
		/* イベントリスナの設定 */
		GlobalScreen.getInstance().addNativeKeyListener(new NativeKeyListener() {
			
			@Override
			public void nativeKeyPressed(NativeKeyEvent e) {
				int c = e.getKeyCode();		/* 仮想コード */
				int m = e.getModifiers();	/* モディファイア */
				MainProperties p = MainProperties.getInstance();
				
				/*  キーイベントをフックしてロボット操作 */
				if (c == p.getXpKeyCode() && p.isXpHook() && m == xpModFlags) {
					moveXPositive(p.getXpMovement());
				} else if (c == p.getXnKeyCode() && p.isXnHook() && m == xnModFlags) {
					moveXNegative(p.getXnMovement());
				} else if (c == p.getYpKeyCode() && p.isYpHook() && m == ypModFlags) {
					moveYPositive(p.getYpMovement());
				} else if (c == p.getYnKeyCode() && p.isYnHook() && m == ynModFlags) {
					moveYNegative(p.getYnMovement());
				}
			}

			@Override
			public void nativeKeyReleased(NativeKeyEvent e) {
			}

			@Override
			public void nativeKeyTyped(NativeKeyEvent e) {
			}
			
		});
	}
	
	/**
	 * マウスカーソルをX正方向に移動する。
	 * 
	 * @param p 移動量
	 */
	private void moveXPositive(int p) {
		PointerInfo pi = MouseInfo.getPointerInfo();
		Point pos = pi.getLocation();
		
		robot.mouseMove(pos.x + p, pos.y);
	}

	/**
	 * マウスカーソルをX負方向に移動する。
	 * 
	 * @param p 移動量
	 */
	private void moveXNegative(int p) {
		PointerInfo pi = MouseInfo.getPointerInfo();
		Point pos = pi.getLocation();
		
		robot.mouseMove(pos.x - p, pos.y);
	}

	/**
	 * マウスカーソルをY正方向に移動する。
	 * 
	 * @param p 移動量
	 */
	private void moveYPositive(int p) {
		PointerInfo pi = MouseInfo.getPointerInfo();
		Point pos = pi.getLocation();
		
		robot.mouseMove(pos.x, pos.y + p);
	}

	/**
	 * マウスカーソルをY負方向に移動する。
	 * 
	 * @param p 移動量
	 */
	private void moveYNegative(int p) {
		PointerInfo pi = MouseInfo.getPointerInfo();
		Point pos = pi.getLocation();
		
		robot.mouseMove(pos.x, pos.y - p);
	}

	/**
	 * モディファイアフラグを設定する。
	 * 
	 * @param alt ALTキー設定フラグ
	 * @param cntl CNTLキー設定フラグ
	 * @return フラグ
	 */
	private int setModifierFlags(boolean alt, boolean cntl) {
		int flags = 0;
		if (alt) {
			flags |= KeyEvent.ALT_MASK;
		}
		if (cntl) {
			flags |= KeyEvent.CTRL_MASK;
		}
		return (flags);
	}

	/**
	 * イベントフックを開始する。
	 * @throws NativeHookException フック登録エラー 
	 */
	public void register() throws NativeHookException {
		
		/* モディファイアフラグの設定 */
		MainProperties p = MainProperties.getInstance();
		xpModFlags = setModifierFlags(p.isXpAlt(), p.isXpCntl());
		xnModFlags = setModifierFlags(p.isXnAlt(), p.isXnCntl());
		ypModFlags = setModifierFlags(p.isYpAlt(), p.isYpCntl());
		ynModFlags = setModifierFlags(p.isYnAlt(), p.isYnCntl());
			
		/* フック開始 */
		GlobalScreen.registerNativeHook();
	}
	
	/**
	 * イベントフックを終了する。
	 */
	public void unregister() {
		/* フック中止 */
		if (GlobalScreen.isNativeHookRegistered()) {
					GlobalScreen.unregisterNativeHook();
		}
	}
}
