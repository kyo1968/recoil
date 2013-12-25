package recoil;

import java.awt.event.KeyEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * キーマップクラス
 *
 * @version 1.0
 */
public final class KeyMapper {
	
	/**
	 * キーコードテーブル
	 */
	private static final int [] VK_TABLE =  {
		/* 数字キー */
		KeyEvent.VK_0,		KeyEvent.VK_1,		KeyEvent.VK_2,		KeyEvent.VK_3,		KeyEvent.VK_4,
		KeyEvent.VK_5,		KeyEvent.VK_6,		KeyEvent.VK_7,		KeyEvent.VK_8,		KeyEvent.VK_9,
		
		/* アルファベットキー */
		KeyEvent.VK_A,		KeyEvent.VK_B,		KeyEvent.VK_C,		KeyEvent.VK_D,		KeyEvent.VK_E,
		KeyEvent.VK_F,		KeyEvent.VK_G,		KeyEvent.VK_H,		KeyEvent.VK_I,		KeyEvent.VK_J,
		KeyEvent.VK_K,		KeyEvent.VK_L,		KeyEvent.VK_M,		KeyEvent.VK_N,		KeyEvent.VK_O,
		KeyEvent.VK_P,		KeyEvent.VK_Q,		KeyEvent.VK_R,		KeyEvent.VK_S,		KeyEvent.VK_T,
		KeyEvent.VK_U,		KeyEvent.VK_V,		KeyEvent.VK_W,		KeyEvent.VK_X,		KeyEvent.VK_Y,
		KeyEvent.VK_Z,
		
		/* ファンクションキー */
		KeyEvent.VK_F1,		KeyEvent.VK_F2,		KeyEvent.VK_F3,		KeyEvent.VK_F4,		KeyEvent.VK_F5,
		KeyEvent.VK_F6,		KeyEvent.VK_F7,		KeyEvent.VK_F8,		KeyEvent.VK_F9,		KeyEvent.VK_F10,
		KeyEvent.VK_F11,	KeyEvent.VK_F12
	};
	
	/**
	 * キーマップ
	 */
	private Map<String, Integer> keyMap = new LinkedHashMap<String, Integer>();

	/**
	 * コンストラクタ
	 */
	public KeyMapper() {
		/* キーマップの初期化 */
		for (int i = 0; i < VK_TABLE.length; i++) {
			/* キーとコードで紐づけ */
			keyMap.put(KeyEvent.getKeyText(VK_TABLE[i]), VK_TABLE[i]);
		}
	}
	
	/**
	 * キーのセットを取得する。
	 * 
	 * @return キーセット
	 */
	public Set<String>getVirtualKeyText() {
		return (keyMap.keySet());
	}
	
	/**
	 * コードからキーを取得する。
	 * @param code
	 * @return
	 */
	public String getVirtualText(int code) {
		return (KeyEvent.getKeyText(code));
	}
	
	/**
	 * キーからコードを取得する。
	 * 
	 * @param key キー
	 * @return コード
	 */
	public int getVirtuaCode(String key) {
		return (keyMap.get(key));
	}
}
