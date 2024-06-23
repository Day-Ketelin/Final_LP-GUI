package view;
//import controller.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PainelMenuGUI extends JFrame {

    private JPanel menu = new JPanel();
    private JLabel label = new JLabel("O que deseja fazer?");
    private JButton jBotton1 = new JButton("Ver Opções de Local");
    private JButton jButton2 = new JButton("Alugar Local");
    private JButton jButton3 = new JButton("Cadastrar Usuário");
    private JButton jButton4 = new JButton("Cadastrar Local");

    public  PainelMenuGUI() {
        this.setTitle("*** Alugue & Use ***");
        this.setSize(620, 600);
        menu.setLayout(new FlowLayout(FlowLayout.CENTER, 95, 20));
        menu.setBackground(Color.white);
        menu.setForeground(Color.black);

        label.setForeground(Color.DARK_GRAY);
        label.setVisible(true);
        label.setFont(new Font("Serif", Font.BOLD, 21));

        jBotton1.setBackground(new Color(75, 25, 168));
        jBotton1.setForeground(Color.pink);
        jBotton1.setFont(new Font("Serif", Font.BOLD, 18));

        jButton2.setBackground(new Color(75, 25, 168));
        jButton2.setForeground(Color.pink);
        jButton2.setFont(new Font("Serif", Font.BOLD, 18));

        jButton3.setBackground(new Color(75, 25, 168));
        jButton3.setForeground(Color.pink);
        jButton3.setFont(new Font("Serif", Font.BOLD, 18));

        jButton4.setBackground(new Color(75, 25, 168));
        jButton4.setForeground(Color.pink);
        jButton4.setFont(new Font("Serif", Font.BOLD, 18));

        jBotton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tela1();
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tela2();
            }
        });

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tela3();
            }
        });

        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tela4();
            }
        });

        jBotton1.setPreferredSize(new Dimension(400, 100));
        jButton2.setPreferredSize(new Dimension(400, 100));
        jButton3.setPreferredSize(new Dimension(400, 100));
        jButton4.setPreferredSize(new Dimension(400, 100));

        menu.add(label);
        menu.add(jBotton1);
        menu.add(jButton2);
        menu.add(jButton3);
        menu.add(jButton4);

        this.getContentPane().add(menu);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void tela1() {
        new NegocioGUI();
    }

    private void tela2() {
        new CarrinhoGUI();
    }

    private void tela3() {
        new CadastraUsuarioGUI();
    }

    private void tela4() {

        new CadastraLocalGUI();
    }

    public static void main(String[] args) {
        new PainelMenuGUI();
    }
}

