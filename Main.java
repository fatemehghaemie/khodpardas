//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.event.*;
import java.awt.* ;
public class Main extends JFrame   {
    public static void main(String[] args) {
        JFrame ATM =new JFrame("ATM");
        ATM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ATM.setLayout(null);

        JPanel A = new JPanel();
        ATM.setSize(1300  ,860   );
        JButton English =new JButton("ٍٍEnglish");
        JButton farsi  =new JButton("فارسی");
        English.setBounds( 0, 430 , 105  ,35);
        farsi.setBounds( 1100, 430  , 105  , 35 );
        ATM.add(English);
        ATM.add(farsi);
        JLabel l1,l2;
        l1=new JLabel("choose Language  ");
        l1.setBounds(400,430, 200,35);
        l2=new JLabel(" زبان خود را انتخاب کنید .");
        l2.setBounds(900,430,300 ,35);
        ATM.add(l1);
        ATM.add(l2);
        //تا اینجا سعی کردم که صفحه ی مربوط به انتخاب زبان رو ایجاد کنم

        English.addActionListener(new ActionListener (){// و بعد در این قسمت دارم میگم که اگه دکمه English رو بزنی چه اتفاقی می افته
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame M = new JFrame("ATM");
                M.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                M.setLayout(null);
                JPanel B = new JPanel();

                M.setSize(1300, 860);
                JLabel rams = new JLabel ( " رمز خود را وارد کنید .") ;
                rams.setBounds( 700,300 ,350 ,40 );
                M.add(rams);

                JTextField ragham = new JTextField();
                ragham.setBounds( 600 , 430, 350 , 40);
                M.add(ragham);
                M.setVisible(true);

                JButton sabt = new JButton("ثبت");
                sabt.setBounds( 700 ,600 , 109,50 );
                M.add(sabt);
                //و بعد در قسمت پایین گفتم که اگه دکمه ی ثبت رو بزنی چه اتفاقی می افته
                sabt.addActionListener(new ActionListener (){
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JFrame asly = new JFrame("ATM");
                        asly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        asly.setLayout(null);
                        JPanel k= new JPanel();

                        asly.setSize(1300, 860);
                        JButton taghirramz = new JButton(" تغییر رمز");
                        JButton bardasht = new JButton(" برداشت موجودی ");
                        JButton cart = new JButton(" کارت به کارت");
                        JButton mojody = new JButton("اعلام موجودی");
                        taghirramz.setBounds(100, 300, 100, 50);
                        bardasht.setBounds(100, 600, 150, 50);
                        cart.setBounds(1100, 300, 100, 50);
                        mojody.setBounds(1100, 600, 100, 50);

                        asly.add(taghirramz);
                        asly.add(bardasht);
                        asly.add(cart);
                        asly.add(mojody)   ;
                        asly.setVisible(true);

                        taghirramz. addActionListener(new ActionListener (){//و بعد در این قسمت گفتم که اگه دکمه ی تغییر رمز رو بزنی چه اتفاقی می افته
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JFrame  ramsdovom =new JFrame("ATM");
                                ramsdovom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                ramsdovom.setLayout(null);
                                ramsdovom.setSize(1300 ,860 );
                                JPanel r= new JPanel();

                                JLabel l3= new JLabel("رمز جدید را وارد کنید .");
                                l3.setBounds( 700,370, 200,35);

                                JTextField f1 =  new JTextField();
                                f1.setBounds(600 , 430, 350 , 40);

                                JButton rams2 =new JButton("تایید") ;
                                rams2.setBounds(700 ,600 , 90,50 );

                                ramsdovom.add(rams2);
                                ramsdovom.add(l3);
                                ramsdovom.add(f1);

                                ramsdovom.setVisible(true);

                                rams2. addActionListener(new ActionListener (){// و بعد وقتی رمزمون رو تغییر می دهیم تو کدوم قسمت میره
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();

                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);

                                        result.add(amaliat);

                                        result.setVisible(true);


                                    }});

                            }});
                        mojody. addActionListener(new ActionListener (){// و بعد اینجا گفتم که اگر دکمه ی اعلام موجودی رو بزنی چه اتفاقی می افته

                            @Override
                            public void actionPerformed(ActionEvent e) {

                                JFrame mojod= new JFrame("ATM");
                                mojod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                mojod.setLayout(null);
                                mojod.setSize(1300 ,860 );
                                JPanel c = new JPanel();

                                JLabel pol= new JLabel("موجودی حساب شما :10000000000000 ریال ");
                                pol.setBounds( 650,430 ,500 ,50 );

                                mojod.add(pol);

                                mojod.setVisible(true);

                            }});

                        cart. addActionListener(new ActionListener (){// و بعد اینجا گفتم که اگر دکمه ی کارت به کارت رو بزنی چه اتفاقی می افته
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JFrame cart2= new JFrame("ATM");
                                cart2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                cart2.setLayout(null);
                                cart2.setSize(1300 ,860 );
                                JPanel c = new JPanel();

                                JLabel shomare =new JLabel("مبلغ مورد نظر را وارد کنید:    ");
                                shomare.setBounds( 650 ,300 ,200 ,40 );

                                JLabel mablagh=new   JLabel("شماره کارت مقصد رو وارد کنید:    ");
                                mablagh.setBounds(650  ,500 ,200 ,40 );

                                JTextField Shomare=new JTextField();
                                Shomare.setBounds( 650 ,380 ,200 ,40 );

                                JTextField Mablagh=new JTextField();
                                Mablagh.setBounds(650  ,580 ,200 ,40 );

                                JButton Sabt =new JButton("ثبت");
                                Sabt.setBounds( 650 ,680 ,200 ,40 );


                                cart2.add( Sabt);
                                cart2.add( Shomare);
                                cart2.add(Mablagh);
                                cart2.add(shomare);
                                cart2.add(mablagh);
                                cart2.setVisible(true);

                                Sabt. addActionListener(new ActionListener (){//و بعد اینجا گفتم که بعد از واریز حساب چه اتفاقی می افته
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();

                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);

                                        result.add(amaliat);

                                        result.setVisible(true);

                                    }});

                            }});

                        bardasht. addActionListener(new ActionListener (){// و اینجا گفتم که اگر دکمه ی برداشت موجودی را بزنیم چه اتفاقی می افته
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JFrame g =new JFrame("ATM");
                                g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                g.setLayout(null);
                                g.setSize(1300 ,860 );
                                JPanel k = new JPanel();

                                JButton money1 =new JButton(" 1000000");
                                money1.setBounds( 0,300 , 150,40);

                                JButton  money2 =new JButton(" 2000000");
                                money1.setBounds(1150,300 ,150 ,40);

                                JButton money3 =new JButton(" 1500000");
                                money1.setBounds( 1150,400 ,150 ,40);

                                JButton  money4 =new JButton(" 500000 ");
                                money1.setBounds( 0, 400,150 ,40);

                                g.add( money1);
                                g.add( money2);
                                g.add( money3);
                                g.add( money4);

                                g.setVisible(true);
                                money1. addActionListener(new ActionListener (){// و بعد اینجا گفتم که اگر این مقدار پول1000000رو بزنم چه اتفاقی می افته

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();
                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);
                                        result.add(amaliat);
                                        result.setVisible(true);


                                    }});
                                money2. addActionListener(new ActionListener (){ //و بعد اینجا گفتم که اگر این مقدار پول 2000000رو بزنم چه اتفاقی می افته

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();
                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);
                                        result.add(amaliat);
                                        result.setVisible(true);


                                    }});
                                money3. addActionListener(new ActionListener (){//و بعد اینجا گفتم که اگر این مقدار پول  1500000رو بزنم چه اتفاقی می افته

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();
                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);
                                        result.add(amaliat);
                                        result.setVisible(true);


                                    }});
                                money4. addActionListener(new ActionListener (){//و بعد اینجا گفتم که اگر این مقدار پول   500000رو بزنم چه اتفاقی می افته

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();
                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);
                                        result.add(amaliat);
                                        result.setVisible(true);


                                    }});


                            }});


                    }});


            }});

        farsi.addActionListener(new ActionListener (){// اینجا گفتم که اگر در صفحه ی انتخاب زبان , زبان فارسی رو انتخاب کنم چه اتفاقی می افته

            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame s = new JFrame("ATM");
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                s.setLayout(null);
                JPanel B = new JPanel();
                s.setSize(1300, 860);

                JLabel rams = new JLabel ( " رمز خود را وارد کنید .") ;
                rams.setBounds( 700,300 ,350 ,40 );
                s.add(rams);

                JTextField ragham = new JTextField();
                ragham.setBounds( 600 , 430, 350 , 40);
                s.add(ragham);

                JButton sabt = new JButton("ثبت");
                sabt.setBounds( 700 ,600 , 109,50 );
                s.add(sabt);

                s.setVisible(true);
                sabt.addActionListener(new ActionListener (){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame asly = new JFrame("ATM");
                        asly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        asly.setLayout(null);
                        JPanel k= new JPanel();
                        asly.setSize(1300, 860);

                        JButton taghirramz = new JButton(" تغییر رمز");
                        JButton bardasht = new JButton(" برداشت موجودی ");
                        JButton cart = new JButton(" کارت به کارت");
                        JButton mojody = new JButton("اعلام موجودی");

                        taghirramz.setBounds(100, 300, 100, 50);
                        bardasht.setBounds(100, 600, 150, 50);
                        cart.setBounds(1100, 300, 100, 50);
                        mojody.setBounds(1100, 600, 100, 50);

                        asly.add(taghirramz);
                        asly.add(bardasht);
                        asly.add(cart);
                        asly.add(mojody)   ;

                        asly.setVisible(true);

                        taghirramz. addActionListener(new ActionListener (){// اینجا هم گفتم که اگه دکمه ی تغییر رمز رو بزنم چه اتفاقی می افته
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JFrame  ramsdovom =new JFrame("ATM");
                                ramsdovom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                ramsdovom.setLayout(null);
                                ramsdovom.setSize(1300 ,860 );
                                JPanel r= new JPanel();

                                JLabel l3= new JLabel("رمز جدید را وارد کنید .");
                                l3.setBounds( 700,370, 200,35);

                                JTextField f1 =  new JTextField();
                                f1.setBounds(600 , 430, 350 , 40);

                                JButton rams2 =new JButton("تایید") ;
                                rams2.setBounds(700 ,600 , 90,50 );

                                ramsdovom.add(rams2);
                                ramsdovom.add(l3);
                                ramsdovom.add(f1);

                                ramsdovom.setVisible(true);

                                rams2. addActionListener(new ActionListener (){ //و بعد وقتی رمزمون رو تغییر می دهیم تو کدوم قسمت میره

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();
                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);
                                        result.add(amaliat);
                                        result.setVisible(true);


                                    }});
                            }});
                        mojody. addActionListener(new ActionListener (){//و بعد اینجا گفتم که اگر دکمه ی اعلام موجودی رو بزنی چه اتفاقی می افته

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JFrame mojod= new JFrame("ATM");
                                mojod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                mojod.setLayout(null);
                                mojod.setSize(1300 ,860 );
                                JPanel c = new JPanel();
                                JLabel pol= new JLabel("موجودی حساب شما :296000000000000000 ریال ");
                                pol.setBounds( 650,430 ,500 ,50 );


                                mojod.add(pol);



                                mojod.setVisible(true);


                            }});


                        cart. addActionListener(new ActionListener (){//و بعد اینجا گفتم که اگر دکمه ی کارت به کارت رو بزنی چه اتفاقی می افته

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JFrame cart2= new JFrame("ATM");
                                cart2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                cart2.setLayout(null);
                                cart2.setSize(1300 ,860 );
                                JPanel c = new JPanel();

                                JLabel shomare =new JLabel("مبلغ مورد نظر را وارد کنید:    ");
                                shomare.setBounds( 650 ,300 ,200 ,40 );

                                JLabel mablagh=new   JLabel("شماره کارت مقصد رو وارد کنید:    ");
                                mablagh.setBounds(650  ,500 ,200 ,40 );

                                JTextField Shomare=new JTextField();
                                Shomare.setBounds( 650 ,380 ,200 ,40 );

                                JTextField Mablagh=new JTextField();
                                Mablagh.setBounds(650  ,580 ,200 ,40 );

                                JButton Sabt =new JButton("ثبت");
                                Sabt.setBounds( 650 ,680 ,200 ,40 );


                                cart2.add( Sabt);
                                cart2.add( Shomare);
                                cart2.add(Mablagh);
                                cart2.add(shomare);
                                cart2.add(mablagh);
                                cart2.setVisible(true);

                                Sabt. addActionListener(new ActionListener (){//و بعد اینجا گفتم که بعد از واریز حساب چه اتفاقی می افته

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();

                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);

                                        result.add(amaliat);

                                        result.setVisible(true);

                                    }});

                            }});
                        bardasht. addActionListener(new ActionListener (){//و بعد اینجا گفتم که بعد از واریز حساب چه اتفاقی می افته
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JFrame g =new JFrame("ATM");
                                g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                g.setLayout(null);
                                g.setSize(1300 ,860 );
                                JPanel k = new JPanel();

                                JButton   money1 =new JButton(" 1000000");
                                money1.setBounds( 0,300 , 150,40);

                                JButton  money2 =new JButton(" 2000000");
                                money1.setBounds(1150,300 ,150 ,40);

                                JButton   money3 =new JButton(" 1500000");
                                money1.setBounds( 1150,400 ,150 ,40);

                                JButton   money4 =new JButton(" 500000 ");
                                money1.setBounds( 0, 400,150 ,40);

                                g.add(money1);
                                g.add(money2);
                                g.add(money3);
                                g.add(money4);

                                g.setVisible(true);
                                money1. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();

                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);

                                        result.add(amaliat);

                                        result.setVisible(true);

                                    }});
                                money2. addActionListener(new ActionListener (){
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();

                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);

                                        result.add(amaliat);

                                        result.setVisible(true);

                                    }});
                                money3. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();

                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);

                                        result.add(amaliat);

                                        result.setVisible(true);

                                    }});
                                money4. addActionListener(new ActionListener (){
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JPanel H = new JPanel();

                                        JLabel amaliat = new JLabel(" عملیات با موفقیت انجام شد ");
                                        amaliat.setBounds(650, 430, 200, 40);

                                        result.add(amaliat);

                                        result.setVisible(true);

                                    }});

                            }});

                    }});

            }});


        ATM.setVisible(true);

    }
}

