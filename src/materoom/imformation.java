package materoom;
import javax.swing.*;

import javax.swing.table.TableColumn;

import java.io.*;
import java.awt.*;
import java.awt.event.*;


public class imformation {
    public static void main(String args[]) {
    	

    		    Login Log = new Login();
//        WinTable Win=new WinTable();
    }
}

class Login extends JFrame{
//	{
//	定义一个用户的个人信息
			String name="admin";
			String pwd="123456";

	public Login()
    {
        setTitle("宿舍管理登陆");    //设置显示窗口标题
        JButton jb1, jb2;//登录、取消
    	JLabel jl2, jl3;//QQ号码、QQ密码
    	JTextField jtf,jpf;	//文本框
//    	Box b1=Box.createHorizontalBox();    //创建横向Box容器
//        Box b2=Box.createVerticalBox();    //创建纵向Box容器
        

    	jl2 = new JLabel("管理账号：");
		jl3 = new JLabel("管理密码：");

		jtf = new JTextField(5);
//		jtf.setText("普通文本框");    //设置文本框的内容
		jpf = new JTextField(5);
		jb1 = new JButton("登录");
		jb2 = new JButton("取消");
        
        
        
        setSize(400,200);    //设置窗口显示尺寸
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
        JPanel jp=new JPanel();

//		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
//        jp.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
        jp.setLayout(new GridLayout(3,4,20,20));

//		jl2.setAlignmentX(1.5f);
        jl2.setBounds(200, 300, 200, 10);
        jp.add(jl2);
//        jl3.setAlignmentX(1.5f);
        jp.add(jtf);
        jp.add(jl3);
//        jp.setLayout(new BoxLayout(jp, BoxLayout.X_AXIS));
        
        jp.add(jpf);
        jp.add(jb1);
        jp.add(jb2);
        add(jp);
       jb1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
        	 if (name.equals(jtf.getText())) {
        		 if(pwd.equals(jpf.getText())){
        			 setVisible(false);
        			 WinTable Win=new WinTable();
        		 }
        	 }else{
        		 JOptionPane.showMessageDialog(jp,"用户名或密码错误！","错误 ",0);
        	 }
        }
    }); 
        
        
        
//        c.add(jl);    //将标签组件添加到内容窗格上
        jp.setBounds(300,200,400,200);    //设置容器的大小
        setLocationRelativeTo(null); 
        setVisible(true);    //设置窗口是否可见
    }
	

}
class WinTable extends JFrame implements ActionListener {
	
	int com=0,com2=0,com3=0,com4=0;
	int JPC=0;
	int JPC2=0;
    String pathc="";
    String pathc2="";
    JTable table;
    JTable table2;
    JTable table3;
    JTable table4;
//    static DefaultTableModel tableModel;    
//    static JTable table2;
    Object a[][];Object b[];Object c[][];Object d[][];Object all[][];Object dor[][];
    Object A,B,C,D,E,F,G,H;
    Object name[]={"姓名","学号","电话号码","系别","宿舍号","床位号","德育分","楼栋号"};
    Object name2[]={"姓名","学号","电话号码","系别","宿舍号"};
    Object name3[]={"宿舍楼编号","管理员姓名","楼管处的电话","已入住人数","最大容量"};
    JMenuBar menubar;
    JMenu menu;
    JMenuItem  itemRfresh,itemTip;
    JButton button,JD,JS,JC,JS2,JD2,JS3,JR;
    JTextField textShow;
    JLabel jlabel,label1,label2,label3,label4;
    JPanel panel1,panel2,panel3,panel4,jp1,jp2, jp3, jp4;
    JTabbedPane tabbedPane;
//    JComponent panel1;
    ImageIcon icon;
    JTabbedPane jpt;
    
//    int max=199999999,min=100000000;
//    Random r = new Random(1);

    WinTable() {
    	
        a=new Object[6][8];
        c=new Object[4][8];
        d=new Object[6][8];
        all=new Object[100][8];
        dor=new Object[4][5];
//        String b[]={"A","B","C","D","E","F","G","H"};
        setTitle("学生宿舍管理系统"); 
        button=new JButton("查询学生信息");
        JD=new JButton("删除");
        JS=new JButton("保存");
        JC=new JButton("删除");
        JS2=new JButton("保存");
        JD2=new JButton("删除");
        JS3=new JButton("保存");
        JR=new JButton("刷新数据");
        textShow = new JTextField(18);
        table=new JTable(a,name);
        table2=new JTable(c,name);
        table3=new JTable(d,name);
        table4=new JTable(dor,name3);
//        tableModel = new DefaultTableModel(c,name); 
//        table2=new JTable(tableModel){
//            public boolean isCellEditable(int row, int column)
//                      {
//                                            return false;//表格不允许被编辑
//                      }
//}; 
        jlabel=new JLabel("请输入查找信息");
        button.addActionListener(this);
        JD.addActionListener(this);
        JS.addActionListener(this);
        JC.addActionListener(this);
        JS2.addActionListener(this);
        JD2.addActionListener(this);
        JS3.addActionListener(this);
        JR.addActionListener(this);
        menubar=new JMenuBar();
        menu=new JMenu("菜单");

        itemRfresh=new JMenuItem("刷新信息");
        itemTip=new JMenuItem("提示信息");
        itemTip.addActionListener(this);
        itemRfresh.addActionListener(this);
        menu.add(itemRfresh);
        menu.add(itemTip);

        menubar.add(menu);
        setJMenuBar(menubar);

        Container con=getContentPane();
        textShow.setBounds(5, 170, 130, 30);
//        add(textShow);
        jlabel.setBounds(5, 200, 230, 30);
//        add(jlabel);
//        getContentPane().add(new JScrollPane(table),BorderLayout.CENTER);

        con.add(new JLabel("修改或录入数据后,需回车确认"),BorderLayout.NORTH);
//        con.add(button,BorderLayout.SOUTH);
        
//        int JPC=0;
//        String pathc="";
        JPanel j4 = new JPanel();       //中间容器
		
		JLabel l3 = new JLabel("楼栋选择:");
//		JTextField jt2 = new JTextField(18);
//		jt2.setBounds(150, 220, 100, 50);
		JComboBox<String> c3 = new JComboBox<String>();
		c3.addItem("-下拉选择-");
		c3.addItem("1");
		c3.addItem("2");
		c3.addItem("3");
		c3.addItem("4");
		
		j4.add(l3);
		j4.add(c3);
		c3.addItemListener(new ItemListener()
        {        
                //开始itemStateChanged方法，该方法在选择一种颜色时自动调用
                public void itemStateChanged(ItemEvent e) {
                //首先获得选择的列表的索引号

                	table.repaint();
                        int index = c3.getSelectedIndex();          
                        JPC=index;
                        switch(JPC){
                        case 0:break;
                        case 1:pathc = "Z:/大学/JAVA/学生宿舍管理系统/mateinfo/1";break;
                        case 2:pathc = "Z:/大学/JAVA/学生宿舍管理系统/mateinfo/2";break;
                        case 3:pathc = "Z:/大学/JAVA/学生宿舍管理系统/mateinfo/3";break;
                        case 4:pathc = "Z:/大学/JAVA/学生宿舍管理系统/mateinfo/4";break;
                        case 5:break;
                        	
                        }

                } 
        }); // 事件监听添加完成 
        
        JPanel j2 = new JPanel();       //中间容器		
		JLabel l1 = new JLabel("宿舍列表:");
		JTextField jt1 = new JTextField(18);
		jt1.setBounds(150, 220, 100, 50);
		JComboBox<String> c1 = new JComboBox<String>();
		c1.addItem("-下拉选择-");
		c1.addItem("00001");
		c1.addItem("00002");
		c1.addItem("00003");
		c1.addItem("00004");
		
		j2.add(l1);
		j2.add(c1);
		c1.addItemListener(new ItemListener()
        {        
                //开始itemStateChanged方法，该方法在选择一种颜色时自动调用
                public void itemStateChanged(ItemEvent e) {
                //首先获得选择的列表的索引号
                
                	int i,j;
                	
                	for(i=0;i<6;i++){//清空刷新表格信息
                		for(j=0;j<8;j++)
                		a[i][j]=null;
                	}

                        int index = c1.getSelectedIndex();                    
                        //判断所选的内容
                        JPC2=index;
                        switch(JPC2){
                        case 0:break;
                        case 1:pathc2 = "/00001.txt";break;
                        case 2:pathc2 = "/00002.txt";break;
                        case 3:pathc2 = "/00003.txt";break;
                        case 4:pathc2 = "/00004.txt";break;
                        case 5:break;
                        	
                        }

//                		String path = "Z:/大学/JAVA/学生宿舍管理系统/mateinfo/0000"+index+ ".txt";
                        String path = pathc+pathc2;
//                		path=path+"/0000"+index+".txt";
                        File fRead=new File(path);
                        try{
                        	
                            Reader in = new FileReader(fRead);

                            BufferedReader bufferRead =new BufferedReader(in);
                            String str = null;
                            i=0;j=0;
                            while((str=bufferRead.readLine())!=null) {
                            	
                                System.out.println(str);
                                String info=str;
//                              String[] ad=new String[6];
//                                info = str.replaceAll("\\r|\\n", "");
//                                if(str.equals("\n"))continue;
                                String result = ("*******");
                                if(info.equals(result)) info="-*-*-*-*-*-*-*-";
                               String arr[]=info.split("[*]");

                       		for (int i1 = 0; i1 < arr.length ; i1++) {
//                       			System.out.println(arr.length);
//                       			if(i1>4) break;
//                       			if(arr[i1]=="\\n")continue;
                       			System.out.println(arr[i1]);
                       			a[i][j]=arr[i1];
                       			j++;

                       		}
           
                       		i++;
                       		j=0;

                            }
                            bufferRead.close();
                            in.close();
                            table.repaint();
                        }
                        catch(IOException ex) {
                            System.out.println(ex.toString());
                        }
                } 
        }); // 事件监听添加完成 
        
		
        

        
//        Container c = getContentPane();
        tabbedPane=new JTabbedPane();	//创建选项卡面板对象
      //创建标签

      		label3=new JLabel("第三个标签的面板",SwingConstants.CENTER);
      		
//      		jp1 = new JPanel();
      		
      		
      	//创建面板
    		panel1=new JPanel();
    		panel2=new JPanel();

    		panel4=new JPanel();
//    		panel1.add(label1);    		

    		panel1.add(JD,BorderLayout.NORTH);
    		panel1.add(JS,BorderLayout.NORTH);
    		panel1.add(j2,JLabel.CENTER);
    		panel1.add(j4,JLabel.CENTER);
    		
//    		panel1.add(jt1,JLabel.CENTER);
    		panel1.add(new JScrollPane(table),BorderLayout.NORTH);
//    		hideColumn(table,5);
//    		hideColumn(table,6);
//    		panel1.setLayout(new GridLayout(4, 6));
//    		panel2.setLayout(new GridLayout(3, 3));
//    		panel2.add(label2);
//    		panel2.add(j2);    		
    		panel2.add(textShow);
    		panel2.add(jlabel);
    		panel2.add(button,BorderLayout.SOUTH);
    		panel2.add(new JScrollPane(table2),BorderLayout.NORTH);
//    		hideColumn(table2,5);
//    		hideColumn(table2,6);
    		

    		
    		panel4.add(JR,JLabel.CENTER);
    		panel4.add(JD2,JLabel.CENTER);
    		panel4.add(JS3,JLabel.CENTER);
    		panel4.add(new JScrollPane(table4),JLabel.CENTER);
//    		panel1.setBackground(Color.yellow);
//    		panel2.setBackground(Color.blue);
//    		panel3.setBackground(Color.green);
    		
    		//将标签面板加入到选项卡面板对象上
    		tabbedPane.addTab("宿舍总览",null,panel1,"Live");
    		tabbedPane.addTab("信息查询",null,panel2,"Search");
    		tabbedPane.addTab("楼栋信息",null,panel4,"Dormitory");
//    		this.add(button, BorderLayout.WEST);	//按钮位于南部
//    		this.add(tabbedPane, BorderLayout.CENTER);	//选项卡窗格位于中部


    		con.add(tabbedPane);
    		
    		
    		

        

    		informationFresh();
        setSize(800,600);
        setVisible(true);
        setLocationRelativeTo(null); 
        setResizable(false);	//禁止改变窗体大小
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//    @SuppressWarnings("unused")
	public void actionPerformed(ActionEvent e) {

        int i,j;

//        File fRead = new File("F\\11.txt");
//        File fWrite = new File("F\\11.txt");
        
        if (e.getSource() == JD){
        	int selectedRows[]=table.getSelectedRows();
        	int a2=selectedRows[0];
//        	int a1=0;
        	String t="-";
        	System.out.println(a);
        	for(int a1=0;a1<8;a1++){
        		a[a2][a1]=t;
        	}
        	table.repaint();
        }
        
        else if (e.getSource() == JS){
//            int index = table.getSelectedIndex();                    
            //判断所选的内容
        	
//    		String path = "Z:/大学/JAVA/学生宿舍管理系统/mateinfo/"+a[0][4]+ ".txt";
//    		String path = pathc+"/"+a[0][4]+ ".txt";
        	String path = pathc+pathc2;
            File fWrite=new File(path);
//            File fWrite = new File("Z://temp/Student/1.txt");
            try{  Writer out = new FileWriter(fWrite);
                BufferedWriter bufferWrite = new BufferedWriter(out);
                Object object = null;

                String str=object+"*";

//                String str =" ";
                for(i=0;i<6;i++){
                    for (int j1 = 0; j1<8; j1++) {
                    	System.out.println(a[i][j1]);

//                    	if(a[i][j1]==null) continue;
                       str=a[i][j1].toString();

                       if(j1==7)bufferWrite.write(str);
                       else bufferWrite.write(str+"*");
//                    if(j1==6)if(a[i+1][j1]==" ")continue;

                }
//                    if(i<5) {if(a[i+1][0]==" ") break;}
                    bufferWrite.newLine();
            }

                bufferWrite.close();
                out.close();

            }
            catch(IOException e1) {
                System.out.println(e1.toString());
            }
        }
        else if (e.getSource() == JD2){
        	int selectedRows[]=table4.getSelectedRows();
        	int a2=selectedRows[0];
//        	int a1=0;
        	String t="-";
        	System.out.println(a);
        	for(int a1=0;a1<5;a1++){
        		dor[a2][a1]=t;
        		
        	}
        	table.repaint();
        	
        }
        else if (e.getSource() == JS3){
        	String path = "Z:/大学/JAVA/学生宿舍管理系统/mateinfo/Dormitory.txt";
//        	String path = pathc+pathc2;
            File fWrite=new File(path);
//            File fWrite = new File("Z://temp/Student/1.txt");
            try{  Writer out = new FileWriter(fWrite);
                BufferedWriter bufferWrite = new BufferedWriter(out);
                Object object = null;

                String str=object+"*";

//                String str =" ";
                for(i=0;i<4;i++){
                    for (int j1 = 0; j1<5; j1++) {
                    	System.out.println(dor[i][j1]);

//                    	if(a[i][j1]==null) continue;
                       str=dor[i][j1].toString();

                       if(j1==4)bufferWrite.write(str);
                       else bufferWrite.write(str+"*");
//                    if(j1==6)if(a[i+1][j1]==" ")continue;

                }
//                    if(i<5) {if(a[i+1][0]==" ") break;}
                    bufferWrite.newLine();
            }

                bufferWrite.close();
                out.close();

            }
            catch(IOException e1) {
                System.out.println(e1.toString());
            }
        }
        else if (e.getSource() == JR){
        	informationFresh();
        	for(i=0;i<4;i++){//清空刷新表格信息
        		for(j=0;j<5;j++)
        		dor[i][j]=null;
        	}
        	table.repaint();

        		String path = "Z:/大学/JAVA/学生宿舍管理系统/mateinfo/Dormitory.txt";

                File fRead=new File(path);
                try{
//                	table.repaint();
                    Reader in = new FileReader(fRead);

                    BufferedReader bufferRead =new BufferedReader(in);
                    String str = null;
                    i=0;j=0;
                    while((str=bufferRead.readLine())!=null) {
                    	
                        System.out.println(str);
                        String info=str;
//                        str = str.replaceAll("\\r|\\n", "");
//                      String[] ad=new String[6];
                        String result = ("****");
                        if(info.equals(result)) info="-*-*-*-*-";
                       String arr[]=info.split("[*]");

               		for (int i1 = 0; i1 < arr.length ; i1++) {
//               			System.out.println(arr.length);
//               			if(i1>4) break;
               			System.out.println(arr[i1]);
               			dor[i][j]=arr[i1];
               			
               			j++;
               			
               		}
   
               		i++;
               		j=0;

                    }
                    dor[0][3]=com;
                    dor[1][3]=com2/2;
                    dor[2][3]=com3/2;
                    dor[3][3]=com4/2;
                    bufferRead.close();
                    in.close();
                    table4.repaint();
                }
                catch(IOException ex) {
                    System.out.println(ex.toString());
                }
        }
        

        
        else if (e.getSource() == button){
//            boolean boo=false;
        	int t=0;
//            boolean next=false;
        for(int i1=0;i1<com+com2+com3+com4;i1++) {
//        	System.out.println(com);
                for (int j2 = 0; j2 <5; j2++) {
                    if (all[i1][j2].equals(textShow.getText())) {
                    	for(int j3=0,j4=0;j3<8;j3++){
                    		c[t][j3]=all[i1][j4];
                    		j4++;
                    		
                    	}

//                        boo = true;
                    	t++;
                    	System.out.println(t);

                        //         i=0;j2=0;


                    }
//                                            break;

                }

//            	System.out.println(t);

//                if(boo==true) break;
        }
        
    	System.out.println(99);
        if(t==0){
     	JOptionPane.showMessageDialog(panel2,"无此人信息！","警告",2);
         jlabel.setText("无此人信息");
        }
                                    table2.repaint();
        }

            else if(e.getSource()==itemRfresh){
            	informationFresh();
            }
            else if(e.getSource()==itemTip){
            	JOptionPane.showMessageDialog(panel2,"在查看宿舍总览时请先选择楼栋再选择宿舍","提示",3);
            	JOptionPane.showMessageDialog(panel2,"查询学生信息时如没有结果可以尝试刷新","提示",3);
            	JOptionPane.showMessageDialog(panel2,"进行任何编辑操作后不要忘了保存哦","提示",3);
            }
    }
    
    public void informationFresh(){

    	int index=1,index2=1;
        int i=0,j=0;int t=0;
        com=0;
        for(index2=1;index2<5;index2++){
    	for(index=1;index<5;index++){
    	
		String path = "Z:/大学/JAVA/学生宿舍管理系统/mateinfo/"+index2+"/0000"+index+ ".txt";
//    		String path = pathc+"/0000"+index+ ".txt";
        File fRead=new File(path);
        try{
        	
            Reader in = new FileReader(fRead);

            BufferedReader bufferRead =new BufferedReader(in);
            String str = null;

            while((str=bufferRead.readLine())!=null) {
            	if(index2==1)com++;
            	else if(index2==2)com2++;
            	else if(index2==3)com3++;
            	else if(index2==4)com4++;
                System.out.println(str);
                String info=str;
                
//                if(str==null) continue;
//              String[] ad=new String[6];
                String result = ("*******");
                String result2 = ("-*-*-*-*-*-*-*-");
                if(info.equals(result2)){ 
//                	info="-*-*-*-*-*-*-*-";
//                	t++;
                	if(index2==1)com--;
                	else if(index2==2)com2--;
                	else if(index2==3)com3--;
                	else if(index2==4)com4--;
                	System.out.println(t);
                	}
//                System.out.println(t);
               String arr[]=info.split("[*]");

       		for (int i1 = 0; i1 < arr.length ; i1++) {
//       			if(info=="\n")break;
//       			System.out.println(arr.length);
//       			if(i1>4) break;
//       			System.out.println(arr[i1]);
       			all[i][j]=arr[i1];
       			j++;

       		}

       		i++;
       		j=0;

            }
            System.out.println(com);
            table2.repaint();
            bufferRead.close();
            in.close();

        }
        catch(IOException ex) {
            System.out.println(ex.toString());
        }
        
    	}
        }
    	
    }
    
    public void hideColumn(JTable table,int index){ 

        TableColumn tc= table.getColumnModel().getColumn(index); 
        tc.setMaxWidth(0); 
        tc.setPreferredWidth(0); 
        tc.setMinWidth(0); 
        tc.setWidth(0); 

        table.getTableHeader().getColumnModel().getColumn(index).setMaxWidth(0); 
        table.getTableHeader().getColumnModel().getColumn(index).setMinWidth(0); 
    }
}







