package ch1;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	public GridLayoutEx() {
		super("GridLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();

		// 1x10�� GridLayout ��ġ������
		contentPane.setLayout(new GridLayout(2, 5, 1, 1));

		for (int i = 0; i < 10; i++) {// 10���� ��ư ����
			String text = Integer.toString(i); // i�� ���ڿ��� ��ȯ
			JButton button = new JButton(text);

			contentPane.add(button); // ����Ʈ�ҿ� ��ư ����
		}

		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}
}