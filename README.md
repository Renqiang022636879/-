# -# 字符串实验
* 班级：计G191
* 学号：2019322052
* 姓名：任强
## 一、实验目的
分析学生选课系统
使用GUI窗体及其组件设计窗体界面
完成学生选课过程业务逻辑编程
基于文件保存并读取数据
处理异常

## 二、要求:
一、系统角色分析及类设计
例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。
定义每种角色人员的属性，及其操作方法。
属性示例：	人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
			学生（编号、姓名、性别、所选课程、……）
			课程（编号、课程名称、上课地点、时间、授课教师、……）
以上属性仅为示例，同学们可以自行扩展。

二、要求:
设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
针对操作过程中可能会出现的各种异常，做异常处理
基于输入/输出编程，支持学生、课程、教师等数据的读写操作。
基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。
本次实验是综合性实验，在40%的实验成绩中占比最大，望同学们认真对待。

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
	

## 四、效果的实现

![image](https://github.com/Renqiang022636879/Java/blob/master/renqiang.png)
## 五、实验总结   
    通过本次实验，将前四次实验融合在一起，完成了一副简陋的成品。首先，创建对象，分别是老师，学生和选课信息，之后，构造方法，利用所学知识，完成类的继承
    以及创建框架，在这次实验中，Gui框架主要是两个按钮和一个文本框，两个按钮分别代表所选课程详情以及位选的课程，在文本框中显示。
    通过这学期的学习，让我不仅在学习中，而且手脑结合，在理解概念的基础上更能够活学活用！
