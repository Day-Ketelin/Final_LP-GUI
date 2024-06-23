package view;
import model.*;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastraUsuarioGUI extends JFrame {

    private JPanel usuario = new JPanel();
    private JLabel label = new JLabel("Insira os dados do usuário:\n\n\n");
    private JTextField cpf, nome, email, telefone;
    private JButton jButtonCadastUser;

    public CadastraUsuarioGUI() {

        this.setTitle("*** Alugue & Use ***");
        this.setSize(620, 480);
        usuario.setLayout(new FlowLayout(FlowLayout.CENTER, 95, 30));
        usuario.setBackground(new Color(177, 156, 217));
        usuario.setForeground(Color.black);
        //  usuario.setLayout(new GridLayout(4, 2));

        usuario.add(label);
        label.setForeground(Color.white);
        label.setFont(new Font("Serif", Font.BOLD, 18));

        setTitle("Cadastro de Usuário");

        setSize(352, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        usuario.add(new JLabel("CPF:"));
        cpf = new JTextField(11);
        usuario.add(cpf);

        usuario.add(new JLabel("Nome:"));
        nome = new JTextField(20);
        usuario.add(nome);

        usuario.add(new JLabel("E-mail:"));
        email = new JTextField(20);
        usuario.add(email);

        usuario.add(new JLabel("Telefone:"));
        telefone = new JTextField(11);
        usuario.add(telefone);

        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraTel = null;

        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraTel = new MaskFormatter("(##) #####-####");
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');

        } catch (ParseException excp) {
            System.err.println("Erro na formatação.");
            System.exit(-1);
        }

        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);

        jFormattedTextCpf.setBounds(150, 40, 100, 20);
        jFormattedTextTel.setBounds(150, 40, 100, 20);

        jButtonCadastUser = new JButton("Cadastrar Usuário");

        jButtonCadastUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                cadastrarUsuario();

            }

        });

        usuario.add(jButtonCadastUser);

        add(usuario);

        setVisible(true);

    }

    private void cadastrarUsuario() {

        String cpfUsuario = cpf.getText();
        String nomeUsuario = nome.getText();
        String emailUsuario = email.getText();
        String telefoneUsuario = telefone.getText();

        System.out.println("**Cliente cadastrado**\n");
        System.out.println("CPF: " + cpfUsuario);
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Email: " + emailUsuario);
        System.out.println("Telefone: " + telefoneUsuario);


    }

    public static void main(String[] args) {

        new CadastraUsuarioGUI();

    }

}