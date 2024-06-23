package view;

import model.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastraLocalGUI extends JFrame {

    private JPanel cadastro = new JPanel();
    private JLabel label = new JLabel("Insira as informações do local a ser cadastrado:\n\n\n");
    private JTextField id, local, endereco;
    private JButton jButtonCadastrar;

    public CadastraLocalGUI() {

        this.setTitle("*** Alugue & Use ***");
        this.setSize(620, 480);

        cadastro.setLayout(new FlowLayout(FlowLayout.CENTER, 95, 20));
        cadastro.setBackground(new Color(177, 156, 217));
        cadastro.setForeground(Color.black);
        //  cadastro.setLayout(new GridLayout(4, 2));

        setTitle("Cadastro de Local");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cadastro.add(label);
        label.setForeground(Color.white);
        label.setFont(new Font("Serif", Font.BOLD, 18));

        cadastro.add(new JLabel("\nNome:"));
        id = new JTextField(20);
        cadastro.add(id);

        cadastro.add(new JLabel("\nLocal:"));
        local = new JTextField(20);
        cadastro.add(local);

        cadastro.add(new JLabel("\nEndereço:"));
        endereco = new JTextField(20);
        cadastro.add(endereco);

        jButtonCadastrar = new JButton("Cadastrar");

         jButtonCadastrar.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {

             cadastrarLocal();

             }

         });

         cadastro.add(jButtonCadastrar);


         add(cadastro);

         setVisible(true);

    }

    private void cadastrarLocal() {

        String nome = id.getText();
        String nomeLocal = local.getText();
        String enderecoLocal = endereco.getText();
        System.out.println("**Local cadastrado** ");
        System.out.println("Nome: " + nome);
        System.out.println("Local: " + nomeLocal);
        System.out.println("Endereço do Local: " + enderecoLocal);

    }

    public static void main(String[] args) {

        new CadastraLocalGUI();

    }

}