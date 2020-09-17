package gd;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;


public class Main {

	private JFrame frame;
	
	String one;
	String two;
	String three;
	String result;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 125, 560, 236);
		frame.getContentPane().add(scrollPane);
		
		
		JTextArea ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		JButton btn = new JButton("\uBF51\uC544\uB0B4\uAE30");
		btn.setFont(new Font("����", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> listfn = new ArrayList<>();
				List<String> listmn = new ArrayList<>();
				List<String> listln = new ArrayList<>();
				
				listfn.add("��");listfn.add("��");listfn.add("��");
				listfn.add("��");listfn.add("��");listfn.add("��");
				listfn.add("��");listfn.add("��");listfn.add("��");
				listfn.add("��");listfn.add("��");listfn.add("��");
				listfn.add("��");listfn.add("��");listfn.add("��");
				listfn.add("Ȳ");listfn.add("��");listfn.add("��");
				listfn.add("��");listfn.add("ȫ");
				
				listmn.add("��");listmn.add("��");listmn.add("��");
				listmn.add("��");listmn.add("��");listmn.add("ȣ");
				listmn.add("��");listmn.add("��");listmn.add("��");
				listmn.add("��");listmn.add("��");listmn.add("��");
				listmn.add("��");listmn.add("��");listmn.add("��");
				listmn.add("��");listmn.add("��");listmn.add("��");
				listmn.add("��");listmn.add("ȫ");listmn.add("��");
				listmn.add("��");listmn.add("��");listmn.add("��");
				listmn.add("��");listmn.add("��");listmn.add("��");
				listmn.add("��");listmn.add("��");listmn.add("��");
				listmn.add("��");listmn.add("��");listmn.add("��");
				listmn.add("��");listmn.add("��");
				
				listln.add("��");listln.add("��");listln.add("��");
				listln.add("��");listln.add("��");listln.add("ȣ");
				listln.add("��");listln.add("��");listln.add("��");
				listln.add("��");listln.add("��");listln.add("��");
				listln.add("��");listln.add("��");listln.add("��");
				listln.add("��");listln.add("��");listln.add("��");
				listln.add("��");listln.add("ȫ");listln.add("��");
				listln.add("��");listln.add("��");listln.add("��");
				listln.add("��");listln.add("��");listln.add("��");
				listln.add("��");listln.add("��");listln.add("��");
				listln.add("��");listln.add("��");listln.add("��");
				listln.add("��");listln.add("��");
				
				Collections.shuffle(listfn);
				Collections.shuffle(listmn);
				Collections.shuffle(listln);
				
				int i, j, k, l;
				String one="";
				String two="";
				String three="";
				String result="";
				String cityResult="";
				
				
				List<String> city = new ArrayList<String>();
				
				city.add("����");city.add("�뱸");city.add("����");city.add("�λ�");
				city.add("��õ");city.add("���");city.add("����");city.add("����");
				city.add("�Ȼ�");city.add("���");city.add("����");city.add("û��");
				city.add("����");city.add("����");city.add("����");city.add("����");
				city.add("����");city.add("����");city.add("����");city.add("����");
				city.add("ȫõ");city.add("��õ");city.add("�ϻ�");city.add("��õ");
				city.add("����");city.add("��ī��");city.add("�ʶ��Ǿ�");city.add("LA");
				city.add("����");city.add("�����");city.add("������");city.add("����¡");
				
				Collections.shuffle(city);
				
				for(i = 0; i < listfn.size();i++) 
					one = listfn.get(i);
					
				for(j = 0; j < listmn.size();j++) 
					two = listmn.get(j);
					
				for(k = 0; k < listln.size();k++)
					
					three = listln.get(k);
					
					result = one+two+three;
					
				for(l = 0; l < city.size();l++)
					
					cityResult = city.get(l);
				
				
				JButton btn1 = new JButton("�̸� : "+result +" || ����: "+ cityResult );
				ta.append(btn1.getText() + "\n");
				btn1.setText("");

			}
		});
		btn.setBounds(404, 10, 154, 80);
		frame.getContentPane().add(btn);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984, \uACE0\uD5A5 \uC0DD\uC131\uAE30");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel.setBounds(12, 10, 282, 80);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
