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
//	����һ���û��ĸ�����Ϣ
			String name="admin";
			String pwd="123456";

	public Login()
    {
        setTitle("��������½");    //������ʾ���ڱ���
        JButton jb1, jb2;//��¼��ȡ��
    	JLabel jl2, jl3;//QQ���롢QQ����
    	JTextField jtf,jpf;	//�ı���
//    	Box b1=Box.createHorizontalBox();    //��������Box����
//        Box b2=Box.createVerticalBox();    //��������Box����
        

    	jl2 = new JLabel("�����˺ţ�");
		jl3 = new JLabel("�������룺");

		jtf = new JTextField(5);
//		jtf.setText("��ͨ�ı���");    //�����ı��������
		jpf = new JTextField(5);
		jb1 = new JButton("��¼");
		jb2 = new JButton("ȡ��");
        
        
        
        setSize(400,200);    //���ô�����ʾ�ߴ�
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //�ô����Ƿ���Թر�
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
        		 JOptionPane.showMessageDialog(jp,"�û������������","���� ",0);
        	 }
        }
    }); 
        
        
        
//        c.add(jl);    //����ǩ�����ӵ����ݴ�����
        jp.setBounds(300,200,400,200);    //���������Ĵ�С
        setLocationRelativeTo(null); 
        setVisible(true);    //���ô����Ƿ�ɼ�
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
    Object name[]={"����","ѧ��","�绰����","ϵ��","�����","��λ��","������","¥����"};
    Object name2[]={"����","ѧ��","�绰����","ϵ��","�����"};
    Object name3[]={"����¥���","����Ա����","¥�ܴ��ĵ绰","����ס����","�������"};
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
        setTitle("ѧ���������ϵͳ"); 
        button=new JButton("��ѯѧ����Ϣ");
        JD=new JButton("ɾ��");
        JS=new JButton("����");
        JC=new JButton("ɾ��");
        JS2=new JButton("����");
        JD2=new JButton("ɾ��");
        JS3=new JButton("����");
        JR=new JButton("ˢ������");
        textShow = new JTextField(18);
        table=new JTable(a,name);
        table2=new JTable(c,name);
        table3=new JTable(d,name);
        table4=new JTable(dor,name3);
//        tableModel = new DefaultTableModel(c,name); 
//        table2=new JTable(tableModel){
//            public boolean isCellEditable(int row, int column)
//                      {
//                                            return false;//��������༭
//                      }
//}; 
        jlabel=new JLabel("�����������Ϣ");
        button.addActionListener(this);
        JD.addActionListener(this);
        JS.addActionListener(this);
        JC.addActionListener(this);
        JS2.addActionListener(this);
        JD2.addActionListener(this);
        JS3.addActionListener(this);
        JR.addActionListener(this);
        menubar=new JMenuBar();
        menu=new JMenu("�˵�");

        itemRfresh=new JMenuItem("ˢ����Ϣ");
        itemTip=new JMenuItem("��ʾ��Ϣ");
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

        con.add(new JLabel("�޸Ļ�¼�����ݺ�,��س�ȷ��"),BorderLayout.NORTH);
//        con.add(button,BorderLayout.SOUTH);
        
//        int JPC=0;
//        String pathc="";
        JPanel j4 = new JPanel();       //�м�����
		
		JLabel l3 = new JLabel("¥��ѡ��:");
//		JTextField jt2 = new JTextField(18);
//		jt2.setBounds(150, 220, 100, 50);
		JComboBox<String> c3 = new JComboBox<String>();
		c3.addItem("-����ѡ��-");
		c3.addItem("1");
		c3.addItem("2");
		c3.addItem("3");
		c3.addItem("4");
		
		j4.add(l3);
		j4.add(c3);
		c3.addItemListener(new ItemListener()
        {        
                //��ʼitemStateChanged�������÷�����ѡ��һ����ɫʱ�Զ�����
                public void itemStateChanged(ItemEvent e) {
                //���Ȼ��ѡ����б��������

                	table.repaint();
                        int index = c3.getSelectedIndex();          
                        JPC=index;
                        switch(JPC){
                        case 0:break;
                        case 1:pathc = "Z:/��ѧ/JAVA/ѧ���������ϵͳ/mateinfo/1";break;
                        case 2:pathc = "Z:/��ѧ/JAVA/ѧ���������ϵͳ/mateinfo/2";break;
                        case 3:pathc = "Z:/��ѧ/JAVA/ѧ���������ϵͳ/mateinfo/3";break;
                        case 4:pathc = "Z:/��ѧ/JAVA/ѧ���������ϵͳ/mateinfo/4";break;
                        case 5:break;
                        	
                        }

                } 
        }); // �¼����������� 
        
        JPanel j2 = new JPanel();       //�м�����		
		JLabel l1 = new JLabel("�����б�:");
		JTextField jt1 = new JTextField(18);
		jt1.setBounds(150, 220, 100, 50);
		JComboBox<String> c1 = new JComboBox<String>();
		c1.addItem("-����ѡ��-");
		c1.addItem("00001");
		c1.addItem("00002");
		c1.addItem("00003");
		c1.addItem("00004");
		
		j2.add(l1);
		j2.add(c1);
		c1.addItemListener(new ItemListener()
        {        
                //��ʼitemStateChanged�������÷�����ѡ��һ����ɫʱ�Զ�����
                public void itemStateChanged(ItemEvent e) {
                //���Ȼ��ѡ����б��������
                
                	int i,j;
                	
                	for(i=0;i<6;i++){//���ˢ�±����Ϣ
                		for(j=0;j<8;j++)
                		a[i][j]=null;
                	}

                        int index = c1.getSelectedIndex();                    
                        //�ж���ѡ������
                        JPC2=index;
                        switch(JPC2){
                        case 0:break;
                        case 1:pathc2 = "/00001.txt";break;
                        case 2:pathc2 = "/00002.txt";break;
                        case 3:pathc2 = "/00003.txt";break;
                        case 4:pathc2 = "/00004.txt";break;
                        case 5:break;
                        	
                        }

//                		String path = "Z:/��ѧ/JAVA/ѧ���������ϵͳ/mateinfo/0000"+index+ ".txt";
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
        }); // �¼����������� 
        
		
        

        
//        Container c = getContentPane();
        tabbedPane=new JTabbedPane();	//����ѡ�������
      //������ǩ

      		label3=new JLabel("��������ǩ�����",SwingConstants.CENTER);
      		
//      		jp1 = new JPanel();
      		
      		
      	//�������
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
    		
    		//����ǩ�����뵽ѡ���������
    		tabbedPane.addTab("��������",null,panel1,"Live");
    		tabbedPane.addTab("��Ϣ��ѯ",null,panel2,"Search");
    		tabbedPane.addTab("¥����Ϣ",null,panel4,"Dormitory");
//    		this.add(button, BorderLayout.WEST);	//��ťλ���ϲ�
//    		this.add(tabbedPane, BorderLayout.CENTER);	//ѡ�����λ���в�


    		con.add(tabbedPane);
    		
    		
    		

        

    		informationFresh();
        setSize(800,600);
        setVisible(true);
        setLocationRelativeTo(null); 
        setResizable(false);	//��ֹ�ı䴰���С
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
            //�ж���ѡ������
        	
//    		String path = "Z:/��ѧ/JAVA/ѧ���������ϵͳ/mateinfo/"+a[0][4]+ ".txt";
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
        	String path = "Z:/��ѧ/JAVA/ѧ���������ϵͳ/mateinfo/Dormitory.txt";
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
        	for(i=0;i<4;i++){//���ˢ�±����Ϣ
        		for(j=0;j<5;j++)
        		dor[i][j]=null;
        	}
        	table.repaint();

        		String path = "Z:/��ѧ/JAVA/ѧ���������ϵͳ/mateinfo/Dormitory.txt";

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
     	JOptionPane.showMessageDialog(panel2,"�޴�����Ϣ��","����",2);
         jlabel.setText("�޴�����Ϣ");
        }
                                    table2.repaint();
        }

            else if(e.getSource()==itemRfresh){
            	informationFresh();
            }
            else if(e.getSource()==itemTip){
            	JOptionPane.showMessageDialog(panel2,"�ڲ鿴��������ʱ����ѡ��¥����ѡ������","��ʾ",3);
            	JOptionPane.showMessageDialog(panel2,"��ѯѧ����Ϣʱ��û�н�����Գ���ˢ��","��ʾ",3);
            	JOptionPane.showMessageDialog(panel2,"�����κα༭������Ҫ���˱���Ŷ","��ʾ",3);
            }
    }
    
    public void informationFresh(){

    	int index=1,index2=1;
        int i=0,j=0;int t=0;
        com=0;
        for(index2=1;index2<5;index2++){
    	for(index=1;index<5;index++){
    	
		String path = "Z:/��ѧ/JAVA/ѧ���������ϵͳ/mateinfo/"+index2+"/0000"+index+ ".txt";
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







