package view;

import model.*;
//import controller.*;
import javax.swing.*;

import java.awt.*;

import java.util.ArrayList;

public class NegocioGUI extends JFrame {

    private ArrayList<Local> locais;

    public NegocioGUI() {

        setTitle("Visualização de Produtos");

        setSize(450, 400);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        // Locais cadastrados
        locais = new ArrayList<Local>();

        JPanel painel = new JPanel(new GridLayout(locais.size() + 1, 3));

        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 95, 20));
        painel.setBackground(new Color(177, 156, 217));


        // Tabela de Produtos

        painel.add(new JLabel("Nome"));

        painel.add(new JLabel("Local"));

        painel.add(new JLabel("Endereço"));


        for (Local local : locais) {
            painel.add(new JLabel(local.getId()));
            painel.add(new JLabel(local.getLocal()));
          }

        JScrollPane scrollPane = new JScrollPane(painel);
        add(scrollPane);
        setVisible(true);

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                new NegocioGUI();

            }

        });

    }

}