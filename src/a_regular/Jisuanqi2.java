package a_regular;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;

class Win extends Frame implements ActionListener, KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField textRes;
	TextField text;
	Button buttonBack, buttonCE, buttonC, buttonMC, buttonMR, buttonMS,
			buttonMA, buttonAdd, buttonMin, buttonMul, buttonDiv, buttonPoi,
			buttonRes, buttonX, buttonSqr, buttonLeft, buttonRit;
	Button buttonData[];
	Panel panel[];
	Box boxV1, boxV2, boxV3, boxH;
	boolean rs, divErr = false;
	StackData stackData;
	StackOper stackOper;
	NumQueue queue;
	double ms = 0;

	Win(String s) {
		super(s);
		queue = new NumQueue();
		stackData = new StackData();
		stackOper = new StackOper();
		rs = false;
		textRes = new TextField(30);
		text = new TextField(2);
		Font font = new Font("Arial Black", Font.PLAIN, 15);
		text.setForeground(Color.blue);
		text.setFont(font);
		text.setEditable(false);
		textRes.setEditable(false);
		buttonData = new Button[10];
		for (int i = 0; i < 10; i++) {
			buttonData[i] = new Button("  " + String.valueOf(i) + "  ");
			buttonData[i].setForeground(Color.blue);
			buttonData[i].addActionListener(this);
		}
		buttonBack = new Button("Backspace");
		buttonCE = new Button("   CE   ");
		buttonC = new Button("C");
		buttonMC = new Button("MC");
		buttonMR = new Button("MR");
		buttonMS = new Button("MS");
		buttonMA = new Button("M+");
		buttonAdd = new Button("  +  ");
		buttonMin = new Button("  -  ");
		buttonMul = new Button("  *  ");
		buttonDiv = new Button("  /   ");
		buttonPoi = new Button("  .   ");
		buttonRes = new Button(" =  ");
		buttonX = new Button(" 1/x ");
		buttonSqr = new Button("sqrt");
		buttonLeft = new Button("  (   ");
		buttonRit = new Button("  )   ");
		panel = new Panel[5];
		for (int i = 0; i < 5; i++) {
			panel[i] = new Panel();
		}
		boxV1 = Box.createVerticalBox();
		boxV2 = Box.createVerticalBox();
		boxV3 = Box.createVerticalBox();
		boxH = Box.createHorizontalBox();
		Font f = new Font("黑体", Font.PLAIN, 15);
		buttonBack.setForeground(Color.red);
		buttonBack.setFont(f);
		buttonCE.setForeground(Color.red);
		buttonCE.setFont(f);
		buttonC.setForeground(Color.red);
		buttonC.setFont(f);
		buttonMC.setForeground(Color.red);
		buttonMR.setForeground(Color.red);
		buttonMS.setForeground(Color.red);
		buttonMA.setForeground(Color.red);
		buttonCE.setForeground(Color.red);
		buttonAdd.setForeground(Color.red);
		buttonMin.setForeground(Color.red);
		buttonMul.setForeground(Color.red);
		buttonDiv.setForeground(Color.red);
		buttonRes.setForeground(Color.red);
		buttonPoi.setForeground(Color.blue);
		buttonSqr.setForeground(Color.blue);
		buttonLeft.setForeground(Color.blue);
		buttonRit.setForeground(Color.blue);
		buttonX.setForeground(Color.blue);
		panel[0].add(buttonBack);
		panel[0].add(buttonCE);
		panel[0].add(buttonC);
		panel[1].add(buttonData[7]);
		panel[1].add(buttonData[8]);
		panel[1].add(buttonData[9]);
		panel[1].add(buttonDiv);
		panel[1].add(buttonSqr);
		panel[2].add(buttonData[4]);
		panel[2].add(buttonData[5]);
		panel[2].add(buttonData[6]);
		panel[2].add(buttonMul);
		panel[2].add(buttonLeft);
		panel[3].add(buttonData[1]);
		panel[3].add(buttonData[2]);
		panel[3].add(buttonData[3]);
		panel[3].add(buttonMin);
		panel[3].add(buttonRit);
		panel[4].add(buttonData[0]);
		panel[4].add(buttonX);
		panel[4].add(buttonPoi);
		panel[4].add(buttonAdd);
		panel[4].add(buttonRes);
		boxV3.add(panel[0]);
		boxV3.add(Box.createVerticalStrut(6));
		for (int i = 1; i < 5; i++) {
			boxV3.add(panel[i]);
			boxV3.add(Box.createVerticalStrut(2));
		}
		boxV2.add(text);
		boxV2.add(Box.createVerticalStrut(9));
		boxV2.add(buttonMC);
		boxV2.add(Box.createVerticalStrut(7));
		boxV2.add(buttonMR);
		boxV2.add(Box.createVerticalStrut(8));
		boxV2.add(buttonMS);
		boxV2.add(Box.createVerticalStrut(8));
		boxV2.add(buttonMA);
		boxH.add(boxV2);
		boxH.add(Box.createHorizontalStrut(13));
		boxH.add(boxV3);
		boxV1.add(textRes);
		boxV1.add(Box.createVerticalStrut(13));
		boxV1.add(boxH);
		add(boxV1);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		buttonBack.addActionListener(this);
		buttonCE.addActionListener(this);
		buttonC.addActionListener(this);
		buttonDiv.addActionListener(this);
		buttonMul.addActionListener(this);
		buttonAdd.addActionListener(this);
		buttonMin.addActionListener(this);
		buttonPoi.addActionListener(this);
		buttonX.addActionListener(this);
		buttonRes.addActionListener(this);
		buttonSqr.addActionListener(this);
		buttonLeft.addActionListener(this);
		buttonRit.addActionListener(this);
		buttonMC.addActionListener(this);
		buttonMR.addActionListener(this);
		buttonMS.addActionListener(this);
		buttonMA.addActionListener(this);
		textRes.addKeyListener(this);
		buttonCE.addKeyListener(this);
		setBounds(100, 100, 270, 260);
		setVisible(true);
		setLayout(new FlowLayout());
		validate();
	}

	public void keyPressed(KeyEvent e) {
		String str = textRes.getText();
		if (e.getKeyCode() == KeyEvent.VK_0
				|| e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
			if (rs == true) {
				textRes.setText(String.valueOf(0));
				rs = false;
			} else
				textRes.setText(str + 0);
		}
		if (e.getKeyCode() == KeyEvent.VK_1
				|| e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
			if (rs == true) {
				textRes.setText(String.valueOf(1));
				rs = false;
			} else
				textRes.setText(str + 1);
		}
		if (e.getKeyCode() == KeyEvent.VK_2
				|| e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
			if (rs == true) {
				textRes.setText(String.valueOf(2));
				rs = false;
			} else
				textRes.setText(str + 2);
		}
		if (e.getKeyCode() == KeyEvent.VK_3
				|| e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
			if (rs == true) {
				textRes.setText(String.valueOf(3));
				rs = false;
			} else
				textRes.setText(str + 3);
		}
		if (e.getKeyCode() == KeyEvent.VK_4
				|| e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
			if (rs == true) {
				textRes.setText(String.valueOf(4));
				rs = false;
			} else
				textRes.setText(str + 4);
		}
		if (e.getKeyCode() == KeyEvent.VK_5
				|| e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
			if (rs == true) {
				textRes.setText(String.valueOf(5));
				rs = false;
			} else
				textRes.setText(str + 5);
		}
		if (e.getKeyCode() == KeyEvent.VK_6
				|| e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
			if (rs == true) {
				textRes.setText(String.valueOf(6));
				rs = false;
			} else
				textRes.setText(str + 6);
		}
		if (e.getKeyCode() == KeyEvent.VK_7
				|| e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
			if (rs == true) {
				textRes.setText(String.valueOf(7));
				rs = false;
			} else
				textRes.setText(str + 7);

		}
		if (e.getKeyCode() == KeyEvent.VK_8
				|| e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
			if (rs == true) {
				textRes.setText(String.valueOf(8));
				rs = false;
			} else
				textRes.setText(str + 8);
		}
		if (e.getKeyCode() == KeyEvent.VK_9
				|| e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
			if (rs == true) {
				textRes.setText(String.valueOf(9));
				rs = false;
			} else
				textRes.setText(str + 9);

		}
		if (e.getKeyCode() == KeyEvent.VK_PERIOD) {
			textRes.setText(str + ".");
			rs = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SLASH) {
			textRes.setText(str + "/");
			rs = false;
		}
		if (e.getKeyCode() == 106) {
			textRes.setText(str + "*");
			rs = false;
		}
		if (e.getKeyCode() == 107) {
			textRes.setText(str + "+");
			rs = false;
		}
		if (e.getKeyCode() == 109) {
			textRes.setText(str + "-");
			rs = false;
		}
		if (e.getKeyCode() == 110) {
			textRes.setText(str + ".");
			rs = false;
		}
		if (e.getKeyCode() == 111) {
			textRes.setText(str + "/");
			rs = false;
		}
		if (e.getKeyCode() == 10 || e.getKeyCode() == 61) {
			stackOper.init();
			stackData.init();
			stackOper.push('#');
			double dou = 0;
			int ps = 0, pc = 0;
			String exp = textRes.getText() + "#";
			char ch[] = exp.toCharArray();

			char op;
			int i = 0;
			op = ch[i];

			while (op != '#' || stackOper.getTop() != '#') {
				if ((op > 47 && op < 58) || op == '.') {
					queue.inQueue(op);
					i++;
					op = ch[i];
				} else {
					if (!queue.isEmpty()) {
						dou = queue.getNumber();
						stackData.push(dou);
						queue.init();
					}
					// System.out.println(""+dou);System.exit(0);
					ps = getSPri(stackOper.getTop());
					pc = getCPri(op);
					if (stackOper.getTop() == '(' && op == '#'
							|| stackOper.getTop() == ')' && op == '('
							|| stackOper.getTop() == '#' && op == ')') {
						textRes.setText("算式不规范！");
						rs = true;
					}
					if (ps < pc) {
						stackOper.push(op);
						i++;
						op = ch[i];
					}
					if (ps == pc) {
						op = ch[++i];
					}
					if (ps > pc) {
						char theta = stackOper.pop();
						double b = stackData.pop();
						double a = stackData.pop();
						stackData.push(operate(a, b, theta));
					}
				}
			}
			double res = stackData.getTop();
			if (divErr == true) {
				textRes.setText("除数不能为0！");
				divErr = false;
			} else {
				String ss = String.valueOf(res);
				int nn = ss.indexOf(".");
				nn += 4;
				if (nn != -1) {
					if (nn > ss.length())
						textRes.setText(ss);
					else
						textRes.setText(ss.substring(0, nn));
				} else
					textRes.setText(ss);
			}
			// textRes.setText(String.valueOf(res));
			rs = true;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public int getSPri(char op) {
		int pr = 0;
		switch (op) {
		case ')':
			pr = 6;
			break;
		case '*':
			pr = 5;
			break;
		case '/':
			pr = 5;
			break;
		case '+':
			pr = 3;
			break;
		case '-':
			pr = 3;
			break;
		case '(':
			pr = 1;
			break;
		case '#':
			pr = 0;
			break;
		}
		return pr;
	}

	public int getCPri(char op) {
		int pr = 0;
		switch (op) {
		case ')':
			pr = 1;
			break;
		case '*':
			pr = 4;
			break;
		case '/':
			pr = 4;
			break;
		case '+':
			pr = 2;
			break;
		case '-':
			pr = 2;
			break;
		case '(':
			pr = 6;
			break;
		case '#':
			pr = 0;
			break;
		}
		return pr;
	}

	public void actionPerformed(ActionEvent e) {
		String textStr = textRes.getText();
		for (int i = 0; i < 10; i++) {
			if (e.getSource() == buttonData[i]) {
				if (rs == true) {
					textRes.setText("" + i);
					rs = false;
				} else
					textRes.setText(textStr + i);
			}
		}
		if (e.getSource() == buttonDiv) {
			textRes.setText(textStr + "/");
			rs = false;
		}
		if (e.getSource() == buttonMul) {
			textRes.setText(textStr + "*");
			rs = false;
		}
		if (e.getSource() == buttonMin) {
			textRes.setText(textStr + "-");
			rs = false;
		}
		if (e.getSource() == buttonAdd) {
			textRes.setText(textStr + "+");
			rs = false;
		}
		if (e.getSource() == buttonLeft) {
			if (rs == true) {
				textRes.setText("(");
				rs = false;
			} else
				textRes.setText(textStr + "(");
		}
		if (e.getSource() == buttonRit) {
			if (rs == true) {
				textRes.setText(")");
				rs = false;
			} else
				textRes.setText(textStr + ")");
		}
		if (e.getSource() == buttonPoi) {
			if (rs == true) {
				textRes.setText(".");
				rs = false;
			} else
				textRes.setText(textStr + ".");
		}
		if (e.getSource() == buttonSqr) {
			String str0 = textRes.getText();
			double num = Double.parseDouble(str0);
			num = Math.sqrt(num);
			textRes.setText("" + num);
			rs = true;
		}
		if (e.getSource() == buttonX) {
			String str1 = textRes.getText();
			double num = Double.parseDouble(str1);
			if (num == 0) {
				textRes.setText("分母不能为零！");
				rs = true;
			} else {
				num = 1 / num;
				textRes.setText(String.valueOf(num));
				rs = true;
			}
		}
		if (e.getSource() == buttonMS) {
			String s = textRes.getText();
			int n = s.indexOf("=");
			if (n == -1) {
				double dou = Double.parseDouble(s);
				ms = dou;
				text.setText(" M");
			} else {
				s = s.substring(n + 1);
				double dou = Double.parseDouble(s);
				ms = dou;
				text.setText(" M");
			}
		}
		if (e.getSource() == buttonMR) {
			textRes.setText(String.valueOf(ms));
		}
		if (e.getSource() == buttonMC) {
			ms = 0;
			text.setText("");
		}
		if (e.getSource() == buttonMA) {
			String s = textRes.getText();
			double dou = Double.parseDouble(s);
			ms = ms + dou;
		}
		if (e.getSource() == buttonRes) {
			stackOper.init();
			stackData.init();
			stackOper.push('#');
			double dou = 0;
			int ps = 0, pc = 0;
			String exp = textRes.getText() + "#";
			char ch[] = exp.toCharArray();

			char op;
			int i = 0;
			op = ch[i];

			while (op != '#' || stackOper.getTop() != '#') {
				if ((op > 47 && op < 58) || op == '.') {
					queue.inQueue(op);
					i++;
					op = ch[i];
				} else {
					if (!queue.isEmpty()) {
						dou = queue.getNumber();
						// System.out.println(String.valueOf(dou));//System.exit(0);
						stackData.push(dou);
						queue.init();
					}
					// System.out.println(""+dou);System.exit(0);
					ps = getSPri(stackOper.getTop());
					pc = getCPri(op);
					if (stackOper.getTop() == '(' && op == '#'
							|| stackOper.getTop() == ')' && op == '('
							|| stackOper.getTop() == '#' && op == ')') {
						textRes.setText("算式不规范！");
						rs = true;
					}
					if (ps < pc) {
						stackOper.push(op);
						i++;
						op = ch[i];
					}
					if (ps == pc) {
						op = ch[++i];
					}
					if (ps > pc) {
						char theta = stackOper.pop();
						double b = stackData.pop();
						double a = stackData.pop();
						stackData.push(operate(a, b, theta));
					}
				}
			}
			double res = stackData.getTop();
			if (divErr == true) {
				textRes.setText("除数不能为0！");
				divErr = false;
			} else {
				String ss = String.valueOf(res);
				int nn = ss.indexOf(".");
				nn += 4;
				if (nn != -1) {
					if (nn > ss.length())
						textRes.setText(ss);
					else
						textRes.setText(ss.substring(0, nn));
				} else
					textRes.setText(ss);
			}
			// textRes.setText(String.valueOf(res));
			rs = true;
		}
		if (e.getSource() == buttonC) {
			textRes.setText("");
		}
		if (e.getSource() == buttonBack) {
			String temp = textRes.getText();
			if (temp.equals("")) {
			} else {
				int leng = temp.length();
				temp = temp.substring(0, leng - 1);
				textRes.setText(temp);
			}
		}
	}

	public double operate(double a, double b, char ch) {
		double res = 0;
		switch (ch) {
		case '+':
			res = a + b;
			break;
		case '-':
			res = a - b;
			break;
		case '*':
			res = a * b;
			break;
		case '/':
			if (b == 0) {
				textRes.setText("分母不可为零！");
				rs = true;
				divErr = true;
				break;
			} else {
				res = a / b;
				break;
			}
		default:
			textRes.setText("算式出错！");
			rs = true;
		}
		return res;
	}
}

class NumQueue {
	char num[];
	int head, rear;

	NumQueue() {
		num = new char[20];
		head = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		if (head == rear)
			return true;
		else
			return false;
	}

	public void inQueue(char ch) {
		num[++rear] = ch;
	}

	public void init() {
		head = -1;
		rear = -1;
		for (int i = 0; i < 20; i++)
			num[i] = '\0';
	}

	public double getNumber() {
		String str = new String(num);
		double dou = Double.parseDouble(str);
		return dou;
	}
}

class StackData {
	double data[];
	int top;
	int base;

	StackData() {
		data = new double[15];
		top = -1;
		base = -1;
	}

	public double getTop() {
		return data[top];
	}

	public void push(double num) {
		data[++top] = num;
	}

	public double pop() {
		return data[top--];
	}

	public boolean isEmpty() {
		if (top == base)
			return true;
		else
			return false;
	}

	public void init() {
		top = -1;
		base = -1;
	}
}

class StackOper {
	char data[];
	int top;
	int base;

	StackOper() {
		data = new char[20];
		top = -1;
		base = -1;
	}

	public char getTop() {
		return data[top];
	}

	public void init() {
		top = -1;
		base = -1;
	}

	public void push(char ch) {
		data[++top] = ch;
	}

	public char pop() {
		return data[top--];
	}

	public boolean isEmpty() {
		if (top == base)
			return true;
		else
			return false;
	}
}

public class Jisuanqi2 {
	public static void main(String[] args) {
		new Win("计算器");
	}
}
