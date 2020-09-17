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
		btn.setFont(new Font("굴림", Font.PLAIN, 30));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> listfn = new ArrayList<>();
				List<String> listmn = new ArrayList<>();
				List<String> listln = new ArrayList<>();
				
				listfn.add("김");listfn.add("이");listfn.add("박");
				listfn.add("최");listfn.add("정");listfn.add("강");
				listfn.add("조");listfn.add("윤");listfn.add("장");
				listfn.add("임");listfn.add("한");listfn.add("오");
				listfn.add("서");listfn.add("신");listfn.add("권");
				listfn.add("황");listfn.add("안");listfn.add("송");
				listfn.add("전");listfn.add("홍");
				
				listmn.add("민");listmn.add("준");listmn.add("서");
				listmn.add("예");listmn.add("도");listmn.add("호");
				listmn.add("지");listmn.add("원");listmn.add("우");
				listmn.add("시");listmn.add("후");listmn.add("현");
				listmn.add("건");listmn.add("영");listmn.add("희");
				listmn.add("숙");listmn.add("용");listmn.add("송");
				listmn.add("전");listmn.add("홍");listmn.add("선");
				listmn.add("민");listmn.add("헌");listmn.add("현");
				listmn.add("정");listmn.add("예");listmn.add("나");
				listmn.add("재");listmn.add("근");listmn.add("찬");
				listmn.add("태");listmn.add("보");listmn.add("소");
				listmn.add("찬");listmn.add("은");
				
				listln.add("민");listln.add("준");listln.add("서");
				listln.add("예");listln.add("도");listln.add("호");
				listln.add("지");listln.add("원");listln.add("우");
				listln.add("시");listln.add("후");listln.add("현");
				listln.add("건");listln.add("영");listln.add("희");
				listln.add("숙");listln.add("용");listln.add("송");
				listln.add("전");listln.add("홍");listln.add("선");
				listln.add("민");listln.add("헌");listln.add("현");
				listln.add("정");listln.add("예");listln.add("나");
				listln.add("재");listln.add("근");listln.add("찬");
				listln.add("태");listln.add("보");listln.add("소");
				listln.add("찬");listln.add("은");
				
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
				
				city.add("서울");city.add("대구");city.add("대전");city.add("부산");
				city.add("인천");city.add("울산");city.add("광주");city.add("수원");
				city.add("안산");city.add("경산");city.add("구미");city.add("청도");
				city.add("강릉");city.add("속초");city.add("상주");city.add("문경");
				city.add("목포");city.add("진주");city.add("전주");city.add("나주");
				city.add("홍천");city.add("과천");city.add("일산");city.add("영천");
				city.add("뉴욕");city.add("시카고");city.add("필라델피아");city.add("LA");
				city.add("도쿄");city.add("나고야");city.add("상하이");city.add("베이징");
				
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
				
				
				JButton btn1 = new JButton("이름 : "+result +" || 고향: "+ cityResult );
				ta.append(btn1.getText() + "\n");
				btn1.setText("");

			}
		});
		btn.setBounds(404, 10, 154, 80);
		frame.getContentPane().add(btn);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984, \uACE0\uD5A5 \uC0DD\uC131\uAE30");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(12, 10, 282, 80);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
