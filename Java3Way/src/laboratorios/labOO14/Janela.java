/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios.labOO14;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author suporte
 */
public final class Janela extends javax.swing.JFrame {

    private JLabel jlAgencia;
    private JTextField jtfAgencia;
    private JLabel jlConta;
    private JTextField jtfConta;
    private JSeparator jSeparator01;
    private JLabel jlNome;
    private JTextField jtfNome;
    private JLabel jlEndereco;
    private JTextField jtfEndereco;
    private JLabel jlTelefone;
    private JTextField jtfTelefone;
    private JLabel jlCpf;
    private JTextField jtfCpf;
    private JRadioButton jrbCorrente;
    private JRadioButton jrbPoupanca;
    private ButtonGroup bgContas;
    private JSeparator jSeparator02;
    private JButton jbConsultar;
    private JButton jbAtualizar;
    private JButton jbFechar;

    /**
     * Creates new form Janela
     */
    public Janela() {
        initComponents();
        setSize(400, 255);
        setTitle("Linguagem de Programação II");
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlAgencia = new JLabel("Cód. da Agência:");
        jlAgencia.setBounds(10, 10, 120, 22);
        add(jlAgencia);
        jtfAgencia = new JTextField();
        try {
            jtfAgencia = new JFormattedTextField(new MaskFormatter("####-#"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        jtfAgencia.setBounds(120, 10, 60, 25);
        jtfAgencia.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jtfAgencia.setBackground(Color.YELLOW);
            }

            @Override
            public void focusLost(FocusEvent evt) {
                jtfAgencia.setBackground(Color.WHITE);
            }
        });
        add(jtfAgencia);

        jlConta = new JLabel("Nª da Conta:");
        jlConta.setBounds(230, 10, 105, 22);
        add(jlConta);
        jtfConta = new JTextField();
        try {
            jtfConta = new JFormattedTextField(new MaskFormatter("#####-#"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        jtfConta.setBounds(315, 10, 60, 25);
        jtfConta.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jtfConta.setBackground(Color.YELLOW);
            }

            @Override
            public void focusLost(FocusEvent evt) {
                jtfConta.setBackground(Color.WHITE);
            }
        });
        add(jtfConta);

        jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        add(jSeparator01);

        jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 60, 22);
        jlNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(jlNome);
        jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 25);
        jtfNome.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jtfNome.setBackground(Color.YELLOW);
            }

            @Override
            public void focusLost(FocusEvent evt) {
                jtfNome.setBackground(Color.WHITE);
            }
        });
        add(jtfNome);

        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 22);
        jlEndereco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(jlEndereco);
        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 25);
        jtfEndereco.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jtfEndereco.setBackground(Color.YELLOW);
            }

            @Override
            public void focusLost(FocusEvent evt) {
                jtfEndereco.setBackground(Color.WHITE);
            }
        });
        add(jtfEndereco);

        jlTelefone = new JLabel("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 22);
        jlTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(jlTelefone);
        jtfTelefone = new JTextField();
        try {
            jtfTelefone = new JFormattedTextField(new MaskFormatter("(0xx##)####-####"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        jtfTelefone.setBounds(75, 100, 300, 25);
        jtfTelefone.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jtfTelefone.setBackground(Color.YELLOW);
            }

            @Override
            public void focusLost(FocusEvent evt) {
                jtfTelefone.setBackground(Color.WHITE);
            }
        });
        add(jtfTelefone);

        jlCpf = new JLabel("CPF:");
        jlCpf.setBounds(10, 125, 60, 22);
        jlCpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(jlCpf);
        jtfCpf = new JTextField();
        try {
            jtfCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        jtfCpf.setBounds(75, 125, 300, 25);
        jtfCpf.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                jtfCpf.setBackground(Color.YELLOW);
            }

            @Override
            public void focusLost(FocusEvent evt) {
                jtfCpf.setBackground(Color.WHITE);
            }
        });
        add(jtfCpf);

        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(75, 150, 120, 20);
        jrbCorrente.setMnemonic('C');
        jrbCorrente.setSelected(true);
        add(jrbCorrente);

        jrbPoupanca = new JRadioButton("Conta Poupança");
        jrbPoupanca.setBounds(220, 150, 130, 20);
        jrbPoupanca.setMnemonic('P');
        add(jrbPoupanca);

        bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        add(jSeparator02);

        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(35, 190, 100, 30);
        jbConsultar.setMnemonic('S');
        jbConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jtfAgencia.getText().equals("    - ") || jtfConta.getText().equals("     - ")) {
                    JOptionPane.showMessageDialog(null, "É necessário informar a agência e a conta", "3Way NetWorks", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        add(jbConsultar);

        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 30);
        jbAtualizar.setMnemonic('A');
        jbAtualizar.setEnabled(false);
        add(jbAtualizar);

        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(255, 190, 100, 30);
        jbFechar.setMnemonic('F');
        jbFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(jbFechar);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent evt) {
                JOptionPane.showMessageDialog(null, "Programação Java OO", "3Way Networks", JOptionPane.INFORMATION_MESSAGE);
            }

            public void windowClosing() {
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema.", "3Way Networks", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();

        if (janela.height > screen.height) {
            setSize(janela.width, screen.height);
        }

        if (janela.width > screen.width) {
            setSize(screen.width, janela.height);
        }
        setLocation((screen.width - janela.width) / 2, (screen.height - janela.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Janela janela = new Janela();
        janela.setVisible(true);

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Janela().setVisible(true);
//            }
//        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
