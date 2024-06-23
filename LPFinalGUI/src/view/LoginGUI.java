package view;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;


public class LoginGUI extends JFrame {

    private JPanel panel = new JPanel();
    private JLabel label = new JLabel("Insira os dados de login do usuário:\n\n\n");

    private JTextField usuario;

     private JPasswordField senha;

     private JButton jButtonLogin;



     public LoginGUI() {

        setTitle("Login de Usuário");

        setSize(300, 150);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         this.setTitle("*** Alugue & Use ***");
         this.setSize(350, 420);
         panel.setLayout(new FlowLayout(FlowLayout.CENTER, 95, 30));
         panel.setBackground(new Color(177, 156, 217));
         panel.setForeground(Color.white);

         panel.add(label);
         label.setForeground(Color.white);
         label.setFont(new Font("Serif", Font.BOLD, 20));



        panel.add(new JLabel("Usuário:"));

        usuario = new JTextField(15);

        panel.add(usuario);



        panel.add(new JLabel("Senha:"));

        senha = new JPasswordField(15);

        panel.add(senha);



        jButtonLogin = new JButton("Login");

        jButtonLogin.addActionListener(new ActionListener() {

             public void actionPerformed(ActionEvent e) {

                 realizarLogin();

             }
        });

        panel.add(jButtonLogin);

        add(panel);

        setVisible(true);

     }

      private void realizarLogin() {

        String username = usuario.getText();

        String password = new String(senha.getPassword());

        if (username.equals("user1") && password.equals("12345")) {

            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");

            new PainelMenuGUI();

        } else {

            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!");

        }

        usuario.setText("");

        senha.setText("");

        }

      public static void main(String[] args) {

         SwingUtilities.invokeLater(new Runnable() {

            public void run() {

               new LoginGUI();

            }

         });

     }
}



































