package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class CarrinhoGUI extends JFrame {
    private DefaultListModel<String> listaCarrinho;
    private JList<String> carrinho;
    private JButton jButtonAlugar;
    private JComboBox<String> locaisCadastrados;

    // Exemplo de dados dos locais cadastrados
    private List<String> locais = new ArrayList<>();

    public CarrinhoGUI() {
        setTitle("Carrinho - Alugue & Use");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Locais cadastrados
        locais.add("Salão das Flores - Rua das Abelhas nº 2000 - Bairro Colméia - BH/MG");
        locais.add("Salão das Colméias - Rua das Folhas nº 205 - Bairro Árvore - BH/MG");
        locais.add("Chácara com Piscina - Rua Fazenda Azul s/ nº - Bairro das Fazendas - BH/MG");
        locais.add("Salão Azul - Rua das Águas nº 350 - Bairro das Águas - Contagem/MG");
        locais.add("Fazenta Santa Lilas - Rua das orboletas nº 658 - Bairro Lagoa - BH/MG");
        locais.add("Sítio com Piscina e sauna - Rua Souza nº985 - Bairro das Chácaras - Contagem/MG");

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);

        // Lista de aluguel no carrinho
        listaCarrinho = new DefaultListModel<>();
        carrinho = new JList<>(listaCarrinho);
        JScrollPane scrollPane = new JScrollPane(carrinho);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Painel para adicionar locais ao aluguel
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());

        this.setSize(800, 420);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 95, 30));
        panel.setBackground(new Color(177, 156, 217));
        panel.setForeground(Color.white);

        JLabel label = new JLabel("Selecione o local desejado:");
        locaisCadastrados = new JComboBox<>(locais.toArray(new String[0]));
        locaisCadastrados.setPreferredSize(new Dimension(450, locaisCadastrados.getPreferredSize().height));
        jButtonAlugar = new JButton("Alugar Local");

        jButtonAlugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String localSelecionado = (String) locaisCadastrados.getSelectedItem();
                listaCarrinho.addElement(localSelecionado);
            }
        });

        painel.add(label);
        painel.add(locaisCadastrados);
        painel.add(jButtonAlugar);

        panel.add(painel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CarrinhoGUI();
            }
        });
    }
}
