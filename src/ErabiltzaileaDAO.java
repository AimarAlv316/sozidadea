public class ErabiltzaileaDAO {

    // Metodo honek erabiltzailea eta pasahitza egiaztatzen ditu
    public boolean ErabiltzaileaBalioztatu(String erabiltzailea, String pasahitza) {
        // Hemen jar dezakezu zure logika benetakoa (DB kontsulta, fitxeroa, etab.)
        // Orain, adibide sinple bat:
        if ("admin".equals(erabiltzailea) && "1234".equals(pasahitza)) {
            return true;
        }
        return false;
    }
}