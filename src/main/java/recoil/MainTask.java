package recoil;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Robot;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.sf.feeling.swt.win32.extension.hook.Hook;
import org.sf.feeling.swt.win32.extension.hook.data.HookData;
import org.sf.feeling.swt.win32.extension.hook.data.KeyboardHookData;
import org.sf.feeling.swt.win32.extension.hook.listener.HookEventListener;

public class MainTask {
	public static void main(String[] args) {
		Image image;
		try {
			image = ImageIO.read(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("Game.png"));

			TrayIcon icon = new TrayIcon(image);
			icon.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);

				}
			});

			final Robot r = new Robot();

			Object o = new Object();
			Hook.KEYBOARD.addListener(o, new HookEventListener() {

				@Override
				public void acceptHookData(HookData hookData) {
					if (hookData != null) {
						long vc =((KeyboardHookData) hookData).getVirtualKeyCode(); 
						long sc =((KeyboardHookData) hookData).getScanCode(); 
						System.out.println("VC="+ vc);
						System.out.println("SC=" + sc);

						if (vc == 81) {
							
							r.mouseMove(100, 100);
						}
					}
				}
			});

			Hook.KEYBOARD.install(o);
			SystemTray.getSystemTray().add(icon);
			// Hook.KEYBOARD.uninstall(o);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}
}
