import javax.swing.*;

public class LoginFrame extends JFrame implements Login {
    private JTextField txtErabiltzailea;
    private JPasswordField txtPasahitza;
    private JButton btnLogin;
    private JTextField ErabiltzaileaBalioztatu;
    private JTextField ErabiltzaileaDAO;

    public LoginFrame() {
        setTitle("Login sozidadea");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblErabiltzailea = new JLabel("Erabiltzailea:");
        lblErabiltzailea.setBounds(30, 30, 80, 25);
        add(lblErabiltzailea);

        txtErabiltzailea = new JTextField();
        txtErabiltzailea.setBounds(120, 30, 120, 25);
        add(txtErabiltzailea);

        JLabel lblPasahitza = new JLabel("Pasahitza:");
        lblPasahitza.setBounds(30, 70, 80, 25);
        add(lblPasahitza);

        txtPasahitza = new JPasswordField();
        txtPasahitza.setBounds(120, 70, 120, 25);
        add(txtPasahitza);

        btnLogin = new JButton("Sartu");
        btnLogin.setBounds(100, 110, 100, 30);
        add(btnLogin);

        btnLogin.addActionListener(e -> {
            String usuarioa = txtErabiltzailea.getText();
            String pasahitza = new String(txtPasahitza.getPassword());

            ErabiltzaileaDAO dao = new ErabiltzaileaDAO();
            if (dao.ErabiltzaileaBalioztatu(usuarioa, pasahitza)) {
                JOptionPane.showMessageDialog(this, "¡Ongi etorri!");
            } else {
                JOptionPane.showMessageDialog(this, "Usuarioa ala pasahitza ez egokia");
            }
        });
    }

    // Interfazeko metodoa inplementatzen dugu
    @Override
    public void erakutsi() {
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Login login = new LoginFrame();
            login.erakutsi();
        });
    }
}