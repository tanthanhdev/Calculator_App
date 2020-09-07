/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator_App;

import Length.ConvertCentimeters;
import Length.ConvertMeters;
import Length.QuanLyPhepToanLength;
import Speed.ConvertMeters_Speed;
import Speed.ConvertKilometers;
import Length.QuanLyPhepToanLength;
import Speed.QuanLyPhepToanSpeed;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;


/**
 *
 * @author thanh
 */
public class Calculator extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    DefaultTableModel dtm1 = new DefaultTableModel();
    DefaultTableModel dtm2 = new DefaultTableModel();
    ImageIcon imgCalculator = new ImageIcon(".\\src\\main\\java\\Image\\icon.png");
    double number, nextNumber;
    double cm, m;
    double kmPerHour, mPerSecond;
    int calculation, length, speed;
    private QuanLyPhepToan arr = new QuanLyPhepToan();
    private QuanLyPhepToanLength arr1 = new QuanLyPhepToanLength();
    private QuanLyPhepToanSpeed arr2 = new QuanLyPhepToanSpeed();
    int row, column;
    int rowLength, columnLength;
    int rowSpeed, columnSpeed;
    
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        
        this.setIconImage(imgCalculator.getImage());
        
        table_History.setModel(dtm);
        dtm.addColumn("History");
        
        tableLength.setModel(dtm1);
        dtm1.addColumn("History");
        
        tableSpeed.setModel(dtm2);
        dtm2.addColumn("History");
        
        buttonGroup1.add(rdo_ON);
        buttonGroup1.add(rdo_OFF);
        buttonGroup2.add(rdo_Centimeters);
        buttonGroup2.add(rdo_Meters);
        buttonGroup3.add(rdo_Kilometers_Speed);
        buttonGroup3.add(rdo_Meters_Speed);
        
    }
    
    public void arithmetic_operation() {
        switch(calculation) {
            case 1:
                nextNumber = Double.parseDouble(jTextField1.getText());
                Cong Addition = new Cong(number, nextNumber);
                jTextField1.setText(Double.toString(Addition.Calculation()));
                arr.add(Addition);
                dtm.addRow(new Object[]{
                    Addition.toString()
                });
                number = nextNumber;
                break;
            case 2:
                nextNumber = Double.parseDouble(jTextField1.getText());
                Tru Subtraction = new Tru(number, nextNumber);
                jTextField1.setText(Double.toString(Subtraction.Calculation()));
                arr.add(Subtraction);
                dtm.addRow(new Object[]{
                    Subtraction.toString()
                });
                number = nextNumber;
                break;
            case 3:
                nextNumber = Double.parseDouble(jTextField1.getText());
                Nhan Multiplication = new Nhan(number, nextNumber);
                jTextField1.setText(Double.toString(Multiplication.Calculation()));
                arr.add(Multiplication);
                dtm.addRow(new Object[]{
                    Multiplication.toString()
                });
                number = nextNumber;
                break;
            default:
                nextNumber = Double.parseDouble(jTextField1.getText());
                Chia Division = new Chia(number, nextNumber);
                jTextField1.setText(Double.toString(Division.Calculation()));
                arr.add(Division);
                dtm.addRow(new Object[]{
                    Division.toString()
                });
                number = nextNumber;
                break;
        }
    }
    
    public void length_operation() {
        switch(length) {
            case 1: //convert to meters
                cm = Double.parseDouble(Centimeters.getText());
                ConvertMeters meters = new ConvertMeters(cm);
                Meters.setText(Double.toString(meters.Calculation()));
                arr1.add(meters);
                dtm1.addRow(new Object[] {
                    meters.toString()
                });
                break;
            default: //convert to centimeters
                m = Double.parseDouble(Meters.getText());
                ConvertCentimeters centimeters = new ConvertCentimeters(m);
                Centimeters.setText(Double.toString(centimeters.Calculation()));
                arr1.add(centimeters);
                dtm1.addRow(new Object[] {
                    centimeters.toString()
                });
                break;
        }
    }
    
    public void speed_operation() {
        switch(speed) {
            case 1: //convert to m/s
                kmPerHour = Double.parseDouble(KilometersPerHour.getText());
                ConvertMeters_Speed metersPerSecond = new ConvertMeters_Speed(kmPerHour);
                MetersPerSecond.setText(Double.toString(metersPerSecond.Calculation()));
                arr2.add(metersPerSecond);
                dtm2.addRow(new Object[] {
                    metersPerSecond.toString()
                });
                break;
            default: //convert to km/h
                mPerSecond = Double.parseDouble(MetersPerSecond.getText());
                ConvertKilometers kilometersPerHour = new ConvertKilometers(mPerSecond);
                KilometersPerHour.setText(Double.toString(kilometersPerHour.Calculation()));
                arr2.add(kilometersPerHour);
                dtm2.addRow(new Object[] {
                    kilometersPerHour.toString()
                });
                break;
        }
    }
    
    public void enable() { 
        rdo_ON.setEnabled(false); 
        rdo_OFF.setEnabled(true);
        jTextField1.setEnabled(true);  //true is enable
        number0.setEnabled(true);
        number1.setEnabled(true);
        number2.setEnabled(true);
        number3.setEnabled(true);
        number4.setEnabled(true);
        number5.setEnabled(true);
        number6.setEnabled(true);
        number7.setEnabled(true);
        number8.setEnabled(true);
        number9.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonCong.setEnabled(true);
        buttonTru.setEnabled(true);
        buttonNhan.setEnabled(true);
        buttonChia.setEnabled(true);
        buttonPhay.setEnabled(true);
        buttonBang.setEnabled(true);
        button_Remove.setEnabled(true);
        button_Clear.setEnabled(true);
        table_History.setEnabled(true);
    }
    
    public void disable() {
        rdo_ON.setEnabled(true); 
        rdo_OFF.setEnabled(false);
        jTextField1.setEnabled(false);  //false is disable
        number0.setEnabled(false);
        number1.setEnabled(false);
        number2.setEnabled(false);
        number3.setEnabled(false);
        number4.setEnabled(false);
        number5.setEnabled(false);
        number6.setEnabled(false);
        number7.setEnabled(false);
        number8.setEnabled(false);
        number9.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonCong.setEnabled(false);
        buttonTru.setEnabled(false);
        buttonNhan.setEnabled(false);
        buttonChia.setEnabled(false);
        buttonPhay.setEnabled(false);
        buttonBang.setEnabled(false);
        button_Remove.setEnabled(false);
        button_Clear.setEnabled(false);
        table_History.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        TabbedPane = new javax.swing.JTabbedPane();
        JPane1 = new javax.swing.JPanel();
        number1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_History = new javax.swing.JTable();
        button_Remove = new javax.swing.JButton();
        button_Clear = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        buttonTru = new javax.swing.JButton();
        buttonNhan = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        buttonPhay = new javax.swing.JButton();
        buttonBang = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        buttonChia = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        rdo_ON = new javax.swing.JRadioButton();
        rdo_OFF = new javax.swing.JRadioButton();
        buttonDelete = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonCong = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        label_Show = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Centimeters = new javax.swing.JTextField();
        Meters = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rdo_Centimeters = new javax.swing.JRadioButton();
        rdo_Meters = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLength = new javax.swing.JTable();
        lengthRemove = new javax.swing.JButton();
        lengthClear = new javax.swing.JButton();
        lengthNumber0 = new javax.swing.JButton();
        lengthButtonPhay = new javax.swing.JButton();
        lengthNumber2 = new javax.swing.JButton();
        lengthNumber3 = new javax.swing.JButton();
        lengthNumber1 = new javax.swing.JButton();
        lengthNumber4 = new javax.swing.JButton();
        lengthNumber5 = new javax.swing.JButton();
        lengthNumber6 = new javax.swing.JButton();
        lengthNumber9 = new javax.swing.JButton();
        lengthNumber8 = new javax.swing.JButton();
        lengthNumber7 = new javax.swing.JButton();
        lengthButtonBang = new javax.swing.JButton();
        lengthButtonClear = new javax.swing.JButton();
        lengthButtonDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        KilometersPerHour = new javax.swing.JTextField();
        rdo_Kilometers_Speed = new javax.swing.JRadioButton();
        rdo_Meters_Speed = new javax.swing.JRadioButton();
        speedRemove = new javax.swing.JButton();
        speedClear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSpeed = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        MetersPerSecond = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        speedButtonDelete = new javax.swing.JButton();
        speedButtonClear = new javax.swing.JButton();
        speedNumber9 = new javax.swing.JButton();
        speedNumber8 = new javax.swing.JButton();
        speedNumber7 = new javax.swing.JButton();
        speedNumber4 = new javax.swing.JButton();
        speedNumber5 = new javax.swing.JButton();
        speedNumber6 = new javax.swing.JButton();
        speedNumber3 = new javax.swing.JButton();
        speedNumber2 = new javax.swing.JButton();
        speedNumber1 = new javax.swing.JButton();
        speedNumber0 = new javax.swing.JButton();
        speedButtonPhay = new javax.swing.JButton();
        speedButtonBang = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 500));

        number1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });

        table_History.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_History.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_HistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_History);

        button_Remove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_Remove.setText("Remove");
        button_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RemoveActionPerformed(evt);
            }
        });

        button_Clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_Clear.setText("Clear");
        button_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ClearActionPerformed(evt);
            }
        });

        number9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });

        buttonTru.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonTru.setText("-");
        buttonTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTruActionPerformed(evt);
            }
        });

        buttonNhan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonNhan.setText("*");
        buttonNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNhanActionPerformed(evt);
            }
        });

        number6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });

        number5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });

        number4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });

        buttonPhay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonPhay.setText(".");
        buttonPhay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPhayActionPerformed(evt);
            }
        });

        buttonBang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonBang.setText("=");
        buttonBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBangMouseClicked(evt);
            }
        });
        buttonBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBangActionPerformed(evt);
            }
        });

        number0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });

        buttonChia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonChia.setText("/");
        buttonChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChiaActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdo_ON.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rdo_ON.setText("ON");
        rdo_ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_ONActionPerformed(evt);
            }
        });

        rdo_OFF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rdo_OFF.setText("OFF");
        rdo_OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_OFFActionPerformed(evt);
            }
        });

        buttonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonDelete.setText("<-");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonClear.setText("C");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonCong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCong.setText("+");
        buttonCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCongActionPerformed(evt);
            }
        });

        number7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });

        number8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });

        number3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });

        number2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });

        label_Show.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout JPane1Layout = new javax.swing.GroupLayout(JPane1);
        JPane1.setLayout(JPane1Layout);
        JPane1Layout.setHorizontalGroup(
            JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPane1Layout.createSequentialGroup()
                                .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(buttonPhay, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonBang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPane1Layout.createSequentialGroup()
                                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPane1Layout.createSequentialGroup()
                                        .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPane1Layout.createSequentialGroup()
                                        .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPane1Layout.createSequentialGroup()
                                        .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPane1Layout.createSequentialGroup()
                                        .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdo_ON)
                                            .addComponent(rdo_OFF))
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPane1Layout.createSequentialGroup()
                                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(buttonCong, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPane1Layout.createSequentialGroup()
                                        .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonTru, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPane1Layout.createSequentialGroup()
                                        .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPane1Layout.createSequentialGroup()
                                        .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonChia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(label_Show, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPane1Layout.createSequentialGroup()
                        .addComponent(button_Remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        JPane1Layout.setVerticalGroup(
            JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPane1Layout.createSequentialGroup()
                .addComponent(label_Show, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPane1Layout.createSequentialGroup()
                        .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPane1Layout.createSequentialGroup()
                                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPane1Layout.createSequentialGroup()
                                        .addComponent(rdo_ON)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdo_OFF))
                                    .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonCong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPane1Layout.createSequentialGroup()
                                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonTru, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonChia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPhay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        TabbedPane.addTab("Standard", JPane1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Centimeters");

        Centimeters.setEditable(false);

        Meters.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Meters");

        rdo_Centimeters.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdo_Centimeters.setText("Centimeters");

        rdo_Meters.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdo_Meters.setText("Meters");

        tableLength.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableLength.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLengthMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableLength);

        lengthRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lengthRemove.setText("Remove");
        lengthRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthRemoveActionPerformed(evt);
            }
        });

        lengthClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lengthClear.setText("Clear");
        lengthClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthClearActionPerformed(evt);
            }
        });

        lengthNumber0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthNumber0.setText("0");
        lengthNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthNumber0ActionPerformed(evt);
            }
        });

        lengthButtonPhay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthButtonPhay.setText(".");
        lengthButtonPhay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthButtonPhayActionPerformed(evt);
            }
        });

        lengthNumber2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthNumber2.setText("2");
        lengthNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthNumber2ActionPerformed(evt);
            }
        });

        lengthNumber3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthNumber3.setText("3");
        lengthNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthNumber3ActionPerformed(evt);
            }
        });

        lengthNumber1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthNumber1.setText("1");
        lengthNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthNumber1ActionPerformed(evt);
            }
        });

        lengthNumber4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthNumber4.setText("4");
        lengthNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthNumber4ActionPerformed(evt);
            }
        });

        lengthNumber5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthNumber5.setText("5");
        lengthNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthNumber5ActionPerformed(evt);
            }
        });

        lengthNumber6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthNumber6.setText("6");
        lengthNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthNumber6ActionPerformed(evt);
            }
        });

        lengthNumber9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthNumber9.setText("9");
        lengthNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthNumber9ActionPerformed(evt);
            }
        });

        lengthNumber8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthNumber8.setText("8");
        lengthNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthNumber8ActionPerformed(evt);
            }
        });

        lengthNumber7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthNumber7.setText("7");
        lengthNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthNumber7ActionPerformed(evt);
            }
        });

        lengthButtonBang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthButtonBang.setText("=");
        lengthButtonBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthButtonBangActionPerformed(evt);
            }
        });

        lengthButtonClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthButtonClear.setText("C");
        lengthButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthButtonClearActionPerformed(evt);
            }
        });

        lengthButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lengthButtonDelete.setText("<-");
        lengthButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Centimeters, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Meters, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdo_Centimeters)
                            .addComponent(rdo_Meters)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lengthNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lengthNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lengthNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lengthNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lengthNumber0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lengthNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lengthNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lengthButtonPhay, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lengthButtonBang, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lengthNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lengthNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(15, 15, 15)
                                .addComponent(lengthButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lengthButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lengthNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lengthRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lengthClear))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Centimeters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdo_Centimeters)
                            .addComponent(lengthRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lengthClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(rdo_Meters))
                        .addGap(6, 6, 6)
                        .addComponent(Meters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lengthButtonClear)
                                    .addComponent(lengthButtonDelete))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lengthNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lengthNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lengthNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lengthNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lengthNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lengthNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lengthNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lengthNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lengthNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lengthNumber0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lengthButtonPhay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lengthButtonBang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        TabbedPane.addTab("Length", jPanel2);

        KilometersPerHour.setEditable(false);

        rdo_Kilometers_Speed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdo_Kilometers_Speed.setText("Kilometers");

        rdo_Meters_Speed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdo_Meters_Speed.setText("Meters");

        speedRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        speedRemove.setText("Remove");
        speedRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedRemoveActionPerformed(evt);
            }
        });

        speedClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        speedClear.setText("Clear");
        speedClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedClearActionPerformed(evt);
            }
        });

        tableSpeed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableSpeed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSpeedMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableSpeed);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Km/h");

        MetersPerSecond.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("m/s");

        speedButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedButtonDelete.setText("<-");
        speedButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedButtonDeleteActionPerformed(evt);
            }
        });

        speedButtonClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedButtonClear.setText("C");
        speedButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedButtonClearActionPerformed(evt);
            }
        });

        speedNumber9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedNumber9.setText("9");
        speedNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedNumber9ActionPerformed(evt);
            }
        });

        speedNumber8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedNumber8.setText("8");
        speedNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedNumber8ActionPerformed(evt);
            }
        });

        speedNumber7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedNumber7.setText("7");
        speedNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedNumber7ActionPerformed(evt);
            }
        });

        speedNumber4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedNumber4.setText("4");
        speedNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedNumber4ActionPerformed(evt);
            }
        });

        speedNumber5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedNumber5.setText("5");
        speedNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedNumber5ActionPerformed(evt);
            }
        });

        speedNumber6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedNumber6.setText("6");
        speedNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedNumber6ActionPerformed(evt);
            }
        });

        speedNumber3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedNumber3.setText("3");
        speedNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedNumber3ActionPerformed(evt);
            }
        });

        speedNumber2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedNumber2.setText("2");
        speedNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedNumber2ActionPerformed(evt);
            }
        });

        speedNumber1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedNumber1.setText("1");
        speedNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedNumber1ActionPerformed(evt);
            }
        });

        speedNumber0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedNumber0.setText("0");
        speedNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedNumber0ActionPerformed(evt);
            }
        });

        speedButtonPhay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedButtonPhay.setText(".");
        speedButtonPhay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedButtonPhayActionPerformed(evt);
            }
        });

        speedButtonBang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        speedButtonBang.setText("=");
        speedButtonBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedButtonBangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KilometersPerHour, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MetersPerSecond, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdo_Kilometers_Speed)
                            .addComponent(rdo_Meters_Speed)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(speedNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(speedNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(speedNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speedNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedNumber0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(speedNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speedNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(speedButtonPhay, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speedButtonBang, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(speedNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speedNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(15, 15, 15)
                                .addComponent(speedButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speedButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(speedRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(speedClear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KilometersPerHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdo_Kilometers_Speed)
                            .addComponent(speedRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(speedClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rdo_Meters_Speed))
                        .addGap(6, 6, 6)
                        .addComponent(MetersPerSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(speedButtonClear)
                                    .addComponent(speedButtonDelete))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speedNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speedNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speedNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speedNumber0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedButtonPhay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedButtonBang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        TabbedPane.addTab("Speed", jPanel1);

        menuFile.setText("File");

        menuItemExit.setText("Exit");
        menuFile.add(menuItemExit);

        jMenuBar1.add(menuFile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_number1ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_number2ActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_number3ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
        jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_number4ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_number5ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
        jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_number6ActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_number7ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_number8ActionPerformed

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_number9ActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
        jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_number0ActionPerformed

    private void buttonPhayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPhayActionPerformed
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_buttonPhayActionPerformed

    private void buttonBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBangActionPerformed
        arithmetic_operation();
        label_Show.setText("");
    }//GEN-LAST:event_buttonBangActionPerformed

    private void buttonChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChiaActionPerformed
        if(!jTextField1.getText().isEmpty()) //not empty
            number = Double.parseDouble(jTextField1.getText());
        calculation = 4;
        jTextField1.setText("");
        label_Show.setText(number + "/");
    }//GEN-LAST:event_buttonChiaActionPerformed

    private void buttonNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNhanActionPerformed
        if(!jTextField1.getText().isEmpty()) //not empty
            number = Double.parseDouble(jTextField1.getText());
        calculation = 3;
        jTextField1.setText("");
        label_Show.setText(number + "*");
    }//GEN-LAST:event_buttonNhanActionPerformed

    private void buttonTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTruActionPerformed
        if(!jTextField1.getText().isEmpty()) //not empty
            number = Double.parseDouble(jTextField1.getText());
        calculation = 2;
        jTextField1.setText("");
        label_Show.setText(number + "-");
    }//GEN-LAST:event_buttonTruActionPerformed

    private void buttonCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCongActionPerformed
        if(!jTextField1.getText().isEmpty()) //not empty
            number = Double.parseDouble(jTextField1.getText());
        calculation = 1;
        jTextField1.setText("");
        label_Show.setText(number + "+");
    }//GEN-LAST:event_buttonCongActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void rdo_OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_OFFActionPerformed
        disable(); //call disable method
    }//GEN-LAST:event_rdo_OFFActionPerformed

    private void rdo_ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_ONActionPerformed
        enable(); //call enable method
    }//GEN-LAST:event_rdo_ONActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int length = jTextField1.getText().length();
        int number = length - 1; //width of new number then delete
        String str;
        
        if(length > 0) {
            StringBuilder backup = new StringBuilder(jTextField1.getText());
            backup.deleteCharAt(number);
            str = backup.toString(); //convert backup into String
            jTextField1.setText(str);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBangMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buttonBangMouseClicked

    private void table_HistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_HistoryMouseClicked
        row = table_History.getSelectedRow();
    }//GEN-LAST:event_table_HistoryMouseClicked

    private void button_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RemoveActionPerformed
        arr.remove(row);
        dtm = new DefaultTableModel();
        table_History.setModel(dtm);
        dtm.addColumn("History");
        for(int i = 0; i < arr.size(); i++) {
            PhepToan x = arr.get(i);
            dtm.addRow(new Object[]{
                x.toString()
            });
        }
    }//GEN-LAST:event_button_RemoveActionPerformed

    private void button_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ClearActionPerformed
        dtm = new DefaultTableModel();
        table_History.setModel(dtm);
        dtm.addColumn("History");
    }//GEN-LAST:event_button_ClearActionPerformed

    private void lengthNumber0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthNumber0ActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText(Centimeters.getText() + "0");
        else
            Meters.setText(Meters.getText() + "0");
    }//GEN-LAST:event_lengthNumber0ActionPerformed

    private void lengthButtonPhayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthButtonPhayActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText(Centimeters.getText() + ".");
        else
            Meters.setText(Meters.getText() + ".");
    }//GEN-LAST:event_lengthButtonPhayActionPerformed

    private void lengthNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthNumber2ActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText(Centimeters.getText() + "2");
        else
            Meters.setText(Meters.getText() + "2");
    }//GEN-LAST:event_lengthNumber2ActionPerformed

    private void lengthNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthNumber3ActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText(Centimeters.getText() + "3");
        else
            Meters.setText(Meters.getText() + "3");
    }//GEN-LAST:event_lengthNumber3ActionPerformed

    private void lengthNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthNumber1ActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText(Centimeters.getText() + "1");
        else
            Meters.setText(Meters.getText() + "1");
    }//GEN-LAST:event_lengthNumber1ActionPerformed

    private void lengthNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthNumber4ActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText(Centimeters.getText() + "4");
        else
            Meters.setText(Meters.getText() + "4");
    }//GEN-LAST:event_lengthNumber4ActionPerformed

    private void lengthNumber5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthNumber5ActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText(Centimeters.getText() + "5");
        else
            Meters.setText(Meters.getText() + "5");
    }//GEN-LAST:event_lengthNumber5ActionPerformed

    private void lengthNumber6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthNumber6ActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText(Centimeters.getText() + "6");
        else
            Meters.setText(Meters.getText() + "6");
    }//GEN-LAST:event_lengthNumber6ActionPerformed

    private void lengthNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthNumber9ActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText(Centimeters.getText() + "9");
        else
            Meters.setText(Meters.getText() + "9");
    }//GEN-LAST:event_lengthNumber9ActionPerformed

    private void lengthNumber8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthNumber8ActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText(Centimeters.getText() + "8");
        else
            Meters.setText(Meters.getText() + "8");
    }//GEN-LAST:event_lengthNumber8ActionPerformed

    private void lengthNumber7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthNumber7ActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText(Centimeters.getText() + "7");
        else
            Meters.setText(Meters.getText() + "7");
    }//GEN-LAST:event_lengthNumber7ActionPerformed

    private void lengthButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthButtonClearActionPerformed
        if(rdo_Centimeters.isSelected())
            Centimeters.setText("");
        else
            Meters.setText("");
    }//GEN-LAST:event_lengthButtonClearActionPerformed

    private void lengthButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthButtonDeleteActionPerformed
        if(rdo_Centimeters.isSelected()) {
            int length1 = Centimeters.getText().length();
            int number1 = length1 - 1; //width of new number then delete
            String str1;
        
            if(length1 > 0) {
                StringBuilder backup = new StringBuilder(Centimeters.getText());
                backup.deleteCharAt(number1);
                str1 = backup.toString(); //convert backup into String
                Centimeters.setText(str1);
            }
        }
        else {
            int length2 = Meters.getText().length();
            int number2 = length2 - 1; //width of new number then delete
            String str2;
        
            if(length2 > 0) {
                StringBuilder backup = new StringBuilder(Meters.getText());
                backup.deleteCharAt(number2);
                str2 = backup.toString(); //convert backup into String
                Meters.setText(str2);
            }
        }
    }//GEN-LAST:event_lengthButtonDeleteActionPerformed

    private void lengthButtonBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthButtonBangActionPerformed
        if(rdo_Centimeters.isSelected()) {
            length = 1;
            length_operation();
        }
        else {
            length = 2;
            length_operation();
        }
    }//GEN-LAST:event_lengthButtonBangActionPerformed

    private void lengthRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthRemoveActionPerformed
        arr1.remove(rowLength);
        dtm1 = new DefaultTableModel();
        tableLength.setModel(dtm1);
        dtm1.addColumn("History");
        for(int i = 0; i < arr1.size(); i++) {
            Length.PhepToan x = arr1.get(i);
            dtm1.addRow(new Object[]{
                x.toString()
            });
        }
    }//GEN-LAST:event_lengthRemoveActionPerformed

    private void tableLengthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLengthMouseClicked
        rowLength = tableLength.getSelectedRow();
    }//GEN-LAST:event_tableLengthMouseClicked

    private void lengthClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthClearActionPerformed
        dtm1 = new DefaultTableModel();
        tableLength.setModel(dtm1);
        dtm1.addColumn("History");
    }//GEN-LAST:event_lengthClearActionPerformed

    private void speedRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedRemoveActionPerformed
        arr2.remove(rowSpeed);
        dtm2 = new DefaultTableModel();
        tableSpeed.setModel(dtm2);
        dtm2.addColumn("History");
        for(int i = 0; i < arr2.size(); i++) {
            Speed.PhepToan x = arr2.get(i);
            dtm2.addRow(new Object[]{
                x.toString()
            });
        }
    }//GEN-LAST:event_speedRemoveActionPerformed

    private void speedClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedClearActionPerformed
        dtm2 = new DefaultTableModel();
        tableSpeed.setModel(dtm2);
        dtm2.addColumn("History");
    }//GEN-LAST:event_speedClearActionPerformed

    private void tableSpeedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSpeedMouseClicked
        rowSpeed = tableSpeed.getSelectedRow();
    }//GEN-LAST:event_tableSpeedMouseClicked

    private void speedButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedButtonDeleteActionPerformed
        if(rdo_Kilometers_Speed.isSelected()) {
            int length1 = KilometersPerHour.getText().length();
            int number1 = length1 - 1; //width of new number then delete
            String str1;
        
            if(length1 > 0) {
                StringBuilder backup = new StringBuilder(KilometersPerHour.getText());
                backup.deleteCharAt(number1);
                str1 = backup.toString(); //convert backup into String
                KilometersPerHour.setText(str1);
            }
        }
        else {
            int length2 = MetersPerSecond.getText().length();
            int number2 = length2 - 1; //width of new number then delete
            String str2;
        
            if(length2 > 0) {
                StringBuilder backup = new StringBuilder(MetersPerSecond.getText());
                backup.deleteCharAt(number2);
                str2 = backup.toString(); //convert backup into String
                MetersPerSecond.setText(str2);
            }
        }
    }//GEN-LAST:event_speedButtonDeleteActionPerformed

    private void speedButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedButtonClearActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText("");
        else
            MetersPerSecond.setText("");
    }//GEN-LAST:event_speedButtonClearActionPerformed

    private void speedNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedNumber9ActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText(KilometersPerHour.getText() + "9");
        else
            MetersPerSecond.setText(MetersPerSecond.getText() + "9");
    }//GEN-LAST:event_speedNumber9ActionPerformed

    private void speedNumber8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedNumber8ActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText(KilometersPerHour.getText() + "8");
        else
            MetersPerSecond.setText(MetersPerSecond.getText() + "8");
    }//GEN-LAST:event_speedNumber8ActionPerformed

    private void speedNumber7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedNumber7ActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText(KilometersPerHour.getText() + "7");
        else
            MetersPerSecond.setText(MetersPerSecond.getText() + "7");
    }//GEN-LAST:event_speedNumber7ActionPerformed

    private void speedNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedNumber4ActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText(KilometersPerHour.getText() + "4");
        else
            MetersPerSecond.setText(MetersPerSecond.getText() + "4");
    }//GEN-LAST:event_speedNumber4ActionPerformed

    private void speedNumber5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedNumber5ActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText(KilometersPerHour.getText() + "5");
        else
            MetersPerSecond.setText(MetersPerSecond.getText() + "5");
    }//GEN-LAST:event_speedNumber5ActionPerformed

    private void speedNumber6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedNumber6ActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText(KilometersPerHour.getText() + "6");
        else
            MetersPerSecond.setText(MetersPerSecond.getText() + "6");
    }//GEN-LAST:event_speedNumber6ActionPerformed

    private void speedNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedNumber3ActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText(KilometersPerHour.getText() + "3");
        else
            MetersPerSecond.setText(MetersPerSecond.getText() + "3");
    }//GEN-LAST:event_speedNumber3ActionPerformed

    private void speedNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedNumber2ActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText(KilometersPerHour.getText() + "2");
        else
            MetersPerSecond.setText(MetersPerSecond.getText() + "2");
    }//GEN-LAST:event_speedNumber2ActionPerformed

    private void speedNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedNumber1ActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText(KilometersPerHour.getText() + "1");
        else
            MetersPerSecond.setText(MetersPerSecond.getText() + "1");
    }//GEN-LAST:event_speedNumber1ActionPerformed

    private void speedNumber0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedNumber0ActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText(KilometersPerHour.getText() + "0");
        else
            MetersPerSecond.setText(MetersPerSecond.getText() + "0");
    }//GEN-LAST:event_speedNumber0ActionPerformed

    private void speedButtonPhayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedButtonPhayActionPerformed
        if(rdo_Kilometers_Speed.isSelected())
            KilometersPerHour.setText(KilometersPerHour.getText() + ".");
        else
            MetersPerSecond.setText(MetersPerSecond.getText() + ".");
    }//GEN-LAST:event_speedButtonPhayActionPerformed

    private void speedButtonBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedButtonBangActionPerformed
        if(rdo_Kilometers_Speed.isSelected()) {
            speed = 1;
            speed_operation();
        }
        else {
            speed = 2;
            speed_operation();
        }
    }//GEN-LAST:event_speedButtonBangActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Centimeters;
    private javax.swing.JPanel JPane1;
    private javax.swing.JTextField KilometersPerHour;
    private javax.swing.JTextField Meters;
    private javax.swing.JTextField MetersPerSecond;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton buttonBang;
    private javax.swing.JButton buttonChia;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonCong;
    private javax.swing.JButton buttonDelete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton buttonNhan;
    private javax.swing.JButton buttonPhay;
    private javax.swing.JButton buttonTru;
    private javax.swing.JButton button_Clear;
    private javax.swing.JButton button_Remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_Show;
    private javax.swing.JButton lengthButtonBang;
    private javax.swing.JButton lengthButtonClear;
    private javax.swing.JButton lengthButtonDelete;
    private javax.swing.JButton lengthButtonPhay;
    private javax.swing.JButton lengthClear;
    private javax.swing.JButton lengthNumber0;
    private javax.swing.JButton lengthNumber1;
    private javax.swing.JButton lengthNumber2;
    private javax.swing.JButton lengthNumber3;
    private javax.swing.JButton lengthNumber4;
    private javax.swing.JButton lengthNumber5;
    private javax.swing.JButton lengthNumber6;
    private javax.swing.JButton lengthNumber7;
    private javax.swing.JButton lengthNumber8;
    private javax.swing.JButton lengthNumber9;
    private javax.swing.JButton lengthRemove;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JRadioButton rdo_Centimeters;
    private javax.swing.JRadioButton rdo_Kilometers_Speed;
    private javax.swing.JRadioButton rdo_Meters;
    private javax.swing.JRadioButton rdo_Meters_Speed;
    private javax.swing.JRadioButton rdo_OFF;
    private javax.swing.JRadioButton rdo_ON;
    private javax.swing.JButton speedButtonBang;
    private javax.swing.JButton speedButtonClear;
    private javax.swing.JButton speedButtonDelete;
    private javax.swing.JButton speedButtonPhay;
    private javax.swing.JButton speedClear;
    private javax.swing.JButton speedNumber0;
    private javax.swing.JButton speedNumber1;
    private javax.swing.JButton speedNumber2;
    private javax.swing.JButton speedNumber3;
    private javax.swing.JButton speedNumber4;
    private javax.swing.JButton speedNumber5;
    private javax.swing.JButton speedNumber6;
    private javax.swing.JButton speedNumber7;
    private javax.swing.JButton speedNumber8;
    private javax.swing.JButton speedNumber9;
    private javax.swing.JButton speedRemove;
    private javax.swing.JTable tableLength;
    private javax.swing.JTable tableSpeed;
    private javax.swing.JTable table_History;
    // End of variables declaration//GEN-END:variables
}
