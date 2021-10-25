import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

import static java.lang.Math.*;

public class Calculator {

    private double first,second,result;
    private String operation,answer;

    private JPanel JavaCalc;
    private JTextField textField1;
    private JButton btnopenbracket;
    private JButton btnclosebrcacket;
    private JButton btnmc;
    private JButton btnmplus;
    private JButton btnmminus;
    private JButton btnmr;
    private JButton btnC;
    private JButton btnplusorminus;
    private JButton btnpercentage;
    private JButton btndivide;
    private JButton btn2nd;
    private JButton btnxsquared;
    private JButton btnxcubed;
    private JButton btnxpowy;
    private JButton btn10powx;
    private JButton btnno7;
    private JButton btnno8;
    private JButton btnno9;
    private JButton btnmultiply;
    private JButton btnfraction;
    private JButton btnsqroot;
    private JButton btncuberoot;
    private JButton btnyrootx;
    private JButton btnln;
    private JButton btnlogbase10;
    private JButton btnno4;
    private JButton btnno5;
    private JButton btnno6;
    private JButton btnminus;
    private JButton btnfactorial;
    private JButton btnsin;
    private JButton btncos;
    private JButton btntan;
    private JButton btnEE;
    private JButton btnexponential;
    private JButton btnepowx;
    private JButton btnno1;
    private JButton btnno2;
    private JButton btnno3;
    private JButton btnplus;
    private JButton btnrad;
    private JButton btnsinh;
    private JButton btncosh;
    private JButton btntanh;
    private JButton btnpi;
    private JButton btnrand;
    private JButton btnzero;
    private JButton btndecimal;
    private JButton btnequals;

    public Calculator() {
        btnno1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnno1.getText();
                textField1.setText(btn1Text);
            }
        });

        btnno2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnno2.getText();
                textField1.setText(btn1Text);
            }
        });

        btnno3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnno3.getText();
                textField1.setText(btn1Text);
            }
        });

        btnno4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnno4.getText();
                textField1.setText(btn1Text);
            }
        });

        btnno5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnno5.getText();
                textField1.setText(btn1Text);
            }
        });

        btnno6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnno6.getText();
                textField1.setText(btn1Text);
            }
        });

        btnno7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnno7.getText();
                textField1.setText(btn1Text);
            }
        });

        btnno8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnno8.getText();
                textField1.setText(btn1Text);
            }
        });

        btnno9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnno9.getText();
                textField1.setText(btn1Text);
            }
        });

        btnzero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnzero.getText();
                textField1.setText(btn1Text);
            }
        });

        btndecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btndecimal.getText();
                textField1.setText(btn1Text);
            }
        });

        btnplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="+";
            }
        });

        btnminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="-";
            }
        });

        btnmultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="*";
            }
        });

        btndivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="/";
            }
        });
        btnequals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second=Double.parseDouble(textField1.getText());

                if(operation=="+")
                {
                    result=first+second;
                    answer=String.format("%.2f",result);
                    textField1.setText(answer);
                }
                else if(operation=="-")
                {
                    result=first-second;
                    answer=String.format("%.2f",result);
                    textField1.setText(answer);
                }
                else if(operation=="*")
                {
                    result=first*second;
                    answer=String.format("%.2f",result);
                    textField1.setText(answer);
                }
                else if(operation=="/")
                {
                    result=first/second;
                    answer=String.format("%.2f",result);
                    textField1.setText(answer);
                }
                else if(operation=="%")
                {
                    result=first%second;
                    answer=String.format("%.2f",result);
                    textField1.setText(answer);
                }
                else if(operation=="m+")
                {
                    result=first+second;
                    answer=String.format("%.2f",result);
                    textField1.setText(answer);
                }
                else if(operation=="m-")
                {
                    result=first-second;
                    answer=String.format("%.2f",result);
                    textField1.setText(answer);
                }
                else if(operation=="X^Y")
                {
                    double result=1;
                    for(int i=0;i<second;i++){
                        result=first*result;
                    }

                    answer=String.format("%.2f",result);
                    textField1.setText(answer);
                }
            }
        });


        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer="0";
                textField1.setText("");
            }
        });
        btnpercentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="%";
            }
        });
        btnsin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= sin(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btncos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= cos(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btntan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= tan(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btnsinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= sinh(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btncosh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= cosh(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btntanh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= tanh(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btnlogbase10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= log(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btnexponential.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= exp(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btnfraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=1/(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btnplusorminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(String.valueOf(textField1.getText()));
                a=a*(-1);
                textField1.setText(String.valueOf(a));
            }
        });
        btnfactorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a =Double.parseDouble(textField1.getText());
                double fact=1;
                while(a!=0)
                {
                    fact=fact*a;
                    a--;
                }
                textField1.setText("");
                textField1.setText(textField1.getText()+fact);
            }
        });
        btnxsquared.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=(Double.parseDouble(textField1.getText()));
                a=a*a;
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btnxcubed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=(Double.parseDouble(textField1.getText()));
                a=a*a*a;
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btnsqroot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= sqrt(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
        btnxpowy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="X^Y";
            }
        });

        btnpi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= PI(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
            private double PI(double parseDouble) {
                return (3.14592654);
            }
        });
        btnepowx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double a= Math.pow(getExponent(),Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }

            private double getExponent() {
                return(2.718281828);
            }
        });

        btnrad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= Math.pow(getrad(),Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }

            private double getrad() {
                return(0.017453292);


            }
        });
        btnmplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="m+";
            }
        });
        btnmminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation="m-";
            }
        });
        btnopenbracket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnopenbracket.getText();
                textField1.setText(btn1Text);
            }
        });
        btnclosebrcacket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text= textField1.getText()+ btnclosebrcacket.getText();
                textField1.setText(btn1Text);
            }
        });
        btncuberoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= cbrt(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });

        btn10powx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Math.pow(toIntExact(10),Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);

            }
        });
        btnyrootx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                

            }

        });
        btnmc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer="0";
                textField1.setText("");
            }
        });
        btnln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a= log(Double.parseDouble(textField1.getText()));
                textField1.setText("");
                textField1.setText(textField1.getText()+a);
            }
        });
    }

 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().JavaCalc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
