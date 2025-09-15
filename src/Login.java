import javax.swing.*;
public interface Login
{


    public class LoginFrame extends JFrame {
        private JTextField txtUsuarioa;
        private JPasahitzaField txtPasahitza;
        private JButton btnLogin;

        public LoginFrame() {
            setTitle("Login sozidadea");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            JLabel lblUsuarioa = new JLabel("Usuarioa:");
            lblUsuarioa.setBounds(30, 30, 80, 25);
            add(lblUsuarioa);

            txtUsuarioa = new JTextField();
            txtUsuarioa.setBounds(120, 30, 120, 25);
            add(txtUsuarioa);

            JLabel lblPasahitza = new JLabel("Pasahitza:");
            lblPasahitza.setBounds(30, 70, 80, 25);
            add(lblPasahitza);

            txtPasahitza = new JPasahitzaField();
            txtPasahitza.setBounds(120, 70, 120, 25);
            add(txtPasahitza);

            btnLogin = new JButton("Sartu");
            btnLogin.setBounds(100, 110, 100, 30);
            add(btnLogin);

            btnLogin.addActionListener(e -> {
                String usuarioa = txtUsuario.getText();
                String pasahitza = new String(txtPasahitza.getPasahitza());

                UsuarioaDAO dao = new UsuarioaDAO();
                if (dao.UsuarioaBalioztatu(usuarioa, pasahitza)) {
                    JOptionPane.showMessageDialog(this, "¡Ongi etorri!");
                } else {
                    JOptionPane.showMessageDialog(this, "Usuarioa ala pasahitza ez egokia");
                }
            });
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
        }
    }

}
