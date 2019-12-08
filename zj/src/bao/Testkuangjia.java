package bao;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Testkuangjia {

    public static void main(String[] args) {

    	 Frame f = new Frame();//建立一个空窗口。
    	 f.setTitle("Frame WHERECOME du");
    	 FlowLayout fl = new FlowLayout();  //使用流布局
         f.setLayout(fl);//修改布局管理
         f.setSize(500, 400);//设置窗口大小,
         f.setLocation(300, 200);//设置窗口的初始位置
         f.setVisible(true);//显示窗口。
    	 

         f.addWindowListener(new WindowAdapter(){
 			public void windowClosing(WindowEvent e){
 				Window window=(Window)e.getComponent();
 				window.dispose();
 			}
 		});


 		TextField textField = new TextField();
 		textField.setBounds(200, 100, 250, 50);
 		textField.setBackground(Color.white);
 		MyActionListener myActionListener = new MyActionListener(textField);//创建一个按钮监听事件对象
 		f.add(textField);
 		Button button1= new Button("Choose couse");
 		Button button2= new Button("Back course");
 		button1.setBounds(200,200,50,50);
 		button1.setBackground(Color.orange);
 		button1.addActionListener(myActionListener);//添加myActionListener监听事件
 		f.add(button1);

 		button2.setBounds(300,200,50,50);
 		button2.setBackground(Color.red);
 		ActionListener myActionListener2=new MyActionListener2(textField);
		button2.addActionListener(myActionListener2);//添加myActionListener监听事件
 		f.add(button2);
        f.setLayout(null);//清空布局
    }
    	
}
class MyActionListener implements ActionListener{
	
	 A course=new A(1, "Englishi", "主教楼",1,2);
	 D teather=new D(1, "王益", "女",course);
	 C student=new C(1, "任强", "男",course,teather);
	private TextField textField;
 
	public MyActionListener(TextField textField) {
		super();
		this.textField = textField;
	}
	public void actionPerformed(ActionEvent e) {
		textField.setText(" " +student+ " ");
}
}
class MyActionListener2 implements ActionListener{
	
	private TextField textField;
	public MyActionListener2(TextField textField) {
		super();
		this.textField = textField;
	}
	public void actionPerformed(ActionEvent e) {
			textField.setText("not to chouse course");
	
	}
	
}