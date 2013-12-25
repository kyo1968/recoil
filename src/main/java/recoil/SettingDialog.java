package recoil;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * オプションダイアログ
 *
 * @version 1.0
 */
public final class SettingDialog extends JDialog {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * コンポーネント類
	 */
	private final JPanel contentPanel = new JPanel();
	private JSpinner spinnerXp;
	private JSpinner spinnerXn;
	private JSpinner spinnerYp;
	private JSpinner spinnerYn;
	private JComboBox<Object> cmbXp;
	private JComboBox<Object> cmbXn;
	private JComboBox<Object> cmbYp;
	private JComboBox<Object> cmbYn;
	private JCheckBox chckbxXpCtrl;
	private JCheckBox chckbxXnCtrl;
	private JCheckBox chckbxYpCtrl;
	private JCheckBox chckbxYnCtrl;
	private JCheckBox chckbxXpAlt;
	private JCheckBox chckbxXnAlt;
	private JCheckBox chckbxYpAlt;
	private JCheckBox chckbxYnAlt;
	private JCheckBox chckbxXpHook;
	private JCheckBox chckbxXnHook;
	private JCheckBox chckbxYpHook;
	private JCheckBox chckbxYnHook;

	/**
	 * メインメソッド
	 * 
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {
		try {
			SettingDialog dialog = new SettingDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * コンストラクタ (Eclipse WDTで生成)
	 */
	public SettingDialog() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Basic Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPanel.add(panel);
		panel.setLayout(new GridLayout(0, 6, 10, 0));
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JLabel lblMovement = new JLabel("Movement");
		panel.add(lblMovement);
		
		JLabel lblKeyBinding = new JLabel("Assigned");
		panel.add(lblKeyBinding);
		
		JLabel lblCtrl = new JLabel("CTRL");
		panel.add(lblCtrl);
		
		JLabel lblAlt = new JLabel("ALT");
		panel.add(lblAlt);
		
		JLabel lblHook = new JLabel("Hook");
		panel.add(lblHook);
		
		JLabel lblXPositive = new JLabel("X positive:");
		panel.add(lblXPositive);
		
		spinnerXp = new JSpinner();
		spinnerXp.setModel(new SpinnerNumberModel(10, 1, 400, 1));
		panel.add(spinnerXp);
		
		cmbXp = new JComboBox<Object>();
		panel.add(cmbXp);
		
		chckbxXpCtrl = new JCheckBox("");
		panel.add(chckbxXpCtrl);
		
		chckbxXpAlt = new JCheckBox("");
		panel.add(chckbxXpAlt);
		
		chckbxXpHook = new JCheckBox("");
		panel.add(chckbxXpHook);
		
		JLabel lblXNegative = new JLabel("X negative:");
		panel.add(lblXNegative);
		
		spinnerXn = new JSpinner();
		spinnerXn.setModel(new SpinnerNumberModel(10, 1, 400, 1));
		panel.add(spinnerXn);
		
		cmbXn = new JComboBox<Object>();
		panel.add(cmbXn);
		
		chckbxXnCtrl = new JCheckBox("");
		panel.add(chckbxXnCtrl);
		
		chckbxXnAlt = new JCheckBox("");
		panel.add(chckbxXnAlt);
		
		chckbxXnHook = new JCheckBox("");
		panel.add(chckbxXnHook);
		
		JLabel lblYPositive = new JLabel("Y positive:");
		panel.add(lblYPositive);
		
		spinnerYp = new JSpinner();
		spinnerYp.setModel(new SpinnerNumberModel(10, 1, 400, 1));
		panel.add(spinnerYp);
		
		cmbYp = new JComboBox<Object>();
		panel.add(cmbYp);
		
		chckbxYpCtrl = new JCheckBox("");
		panel.add(chckbxYpCtrl);
		
		chckbxYpAlt = new JCheckBox("");
		panel.add(chckbxYpAlt);
		
		chckbxYpHook = new JCheckBox("");
		panel.add(chckbxYpHook);
		
		JLabel lblYNegative = new JLabel("Y negative:");
		panel.add(lblYNegative);
		
		spinnerYn = new JSpinner();
		spinnerYn.setModel(new SpinnerNumberModel(10, 1, 400, 1));
		panel.add(spinnerYn);
		
		cmbYn = new JComboBox<Object>();
		panel.add(cmbYn);
		
		chckbxYnCtrl = new JCheckBox("");
		panel.add(chckbxYnCtrl);
		
		chckbxYnAlt = new JCheckBox("");
		panel.add(chckbxYnAlt);
		
		chckbxYnHook = new JCheckBox("");
		panel.add(chckbxYnHook);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						tearDown();
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		/* 初期化処理 */
		setUp();
	}
	
	/**
	 * ダイアログを初期化する。
	 */
	private void setUp() {
		
		/* キーバインド項目の初期化 */
		KeyMapper km = new KeyMapper();
		cmbXp.setModel(new DefaultComboBoxModel<Object> (km.getVirtualKeyText().toArray()));
		cmbXn.setModel(new DefaultComboBoxModel<Object> (km.getVirtualKeyText().toArray()));
		cmbYp.setModel(new DefaultComboBoxModel<Object> (km.getVirtualKeyText().toArray()));
		cmbYn.setModel(new DefaultComboBoxModel<Object> (km.getVirtualKeyText().toArray()));

		/* プロパティの読み込み */
		MainProperties p = MainProperties.getInstance();
		spinnerXp.setValue(p.getXpMovement());
		cmbXp.setSelectedItem(km.getVirtualText(p.getXpKeyCode()));
		chckbxXpCtrl.setSelected(p.isXpCntl());
		chckbxXpAlt.setSelected(p.isXpAlt());
		chckbxXpHook.setSelected(p.isXpHook());
		
		spinnerXn.setValue(p.getXnMovement());
		cmbXn.setSelectedItem(km.getVirtualText(p.getXnKeyCode()));
		chckbxXnCtrl.setSelected(p.isXnCntl());
		chckbxXnAlt.setSelected(p.isXnAlt());
		chckbxXnHook.setSelected(p.isXnHook());

		spinnerYp.setValue(p.getYpMovement());
		cmbYp.setSelectedItem(km.getVirtualText(p.getYpKeyCode()));
		chckbxYpCtrl.setSelected(p.isYpCntl());
		chckbxYpAlt.setSelected(p.isYpAlt());
		chckbxYpHook.setSelected(p.isYpHook());

		spinnerYn.setValue(p.getYnMovement());
		cmbYn.setSelectedItem(km.getVirtualText(p.getYnKeyCode()));
		chckbxYnCtrl.setSelected(p.isYnCntl());
		chckbxYnAlt.setSelected(p.isYnAlt());
		chckbxYnHook.setSelected(p.isYnHook());
	}
	
	/**
	 * ダイアログを終了する。
	 */
	private void tearDown() {
		
		/* プロパティの保存 */
		KeyMapper km = new KeyMapper();
		MainProperties p = MainProperties.getInstance();
		
		p.setXpMovement((Integer)spinnerXp.getValue());
		p.setXpKeyCode(km.getVirtuaCode((String)cmbXp.getSelectedItem()));
		p.setXpCntl(chckbxXpCtrl.isSelected());
		p.setXpAlt(chckbxXpAlt.isSelected());
		p.setXpHook(chckbxXpHook.isSelected());

		p.setXnMovement((Integer)spinnerXn.getValue());
		p.setXnKeyCode(km.getVirtuaCode((String)cmbXn.getSelectedItem()));
		p.setXnCntl(chckbxXnCtrl.isSelected());
		p.setXnAlt(chckbxXnAlt.isSelected());
		p.setXnHook(chckbxXnHook.isSelected());

		p.setYpMovement((Integer)spinnerYp.getValue());
		p.setYpKeyCode(km.getVirtuaCode((String)cmbYp.getSelectedItem()));
		p.setYpCntl(chckbxYpCtrl.isSelected());
		p.setYpAlt(chckbxYpAlt.isSelected());
		p.setYpHook(chckbxYpHook.isSelected());

		p.setYnMovement((Integer)spinnerYn.getValue());
		p.setYnKeyCode(km.getVirtuaCode((String)cmbYn.getSelectedItem()));
		p.setYnCntl(chckbxYnCtrl.isSelected());
		p.setYnAlt(chckbxYnAlt.isSelected());
		p.setYnHook(chckbxYnHook.isSelected());
		
		p.save();
	}
}
