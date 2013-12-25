package recoil;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import org.jnativehook.NativeHookException;

/**
 * メインタスククラス
 *
 * @version 1.0
 */
public final class MainTask {

	/**
	 * トレイアイコン
	 */
	private TrayIcon trayIcon;

	/**
	 * メインメソッド
	 * 
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {
		new MainTask().setUp();	/* タスク実行 */
	}

	/**
	 * アプリケーションを初期化する。
	 */
	private void setUp() {

		try {
			/* イメージアイコンの設定 */
			Image image = ImageIO.read(Thread.currentThread()
					.getContextClassLoader().getResourceAsStream("Game.png"));

			/* トレイアイコンの設定 */
			trayIcon = new TrayIcon(image);
			final VirtualOperator vo = VirtualOperator.getInstance();
			
			/* ポップアップメニューハンドラ */
			trayIcon.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new SettingDialog().setVisible(true);
				}
			});

			/* ポップアップメニューの設定 */
			PopupMenu popupMenu = new PopupMenu();
			popupMenu.setLabel("Main");

			/* 設定メニュー */
			MenuItem item0 = new MenuItem("Settings");
			item0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					vo.unregister();
					new SettingDialog().setVisible(true);
					try {
						vo.register();
					} catch (NativeHookException e1) {
						JOptionPane.showConfirmDialog(null, e1.getMessage(), "FATAL ERROR", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					}
				}
			});
			popupMenu.add(item0);

			/* 終了メニュー */
			MenuItem item1 = new MenuItem("Exit");
			item1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			popupMenu.add(item1);

			/* 仮想デバイスオペレータを登録 */
			vo.init();
			vo.register();

			/* タスクトレイに登録 */
			trayIcon.setPopupMenu(popupMenu);

			SystemTray.getSystemTray().add(trayIcon);
		} catch (IOException | NativeHookException | AWTException e) {
			JOptionPane.showConfirmDialog(null, e.getMessage(), "FATAL ERROR", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
}
