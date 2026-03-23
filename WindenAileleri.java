import java.util.ArrayList;
import java.util.List;

/**
 * DARK: "Her Şey Birbiriyle Bağlantılıdır"
 * @author zehgai
 * Bu versiyon karakterleri soyisimlerine (Aile Gruplarına) göre ayırır.
 */
public class WindenAileleri {

    static class Karakter {
        String ad;
        String rol;

        public Karakter(String ad, String rol) {
            this.ad = ad;
            this.rol = rol;
        }
    }

    static class Aile {
        String aileAdi;
        List<Karakter> uyeler;

        public Aile(String aileAdi) {
            this.aileAdi = aileAdi;
            this.uyeler = new ArrayList<>();
        }

        public void uyeEkle(Karakter k) {
            uyeler.add(k);
        }

        public void aileListele() {
            System.out.println("\n--- " + aileAdi.toUpperCase() + " AİLESİ ---");
            for (Karakter k : uyeler) {
                System.out.println("- " + k.ad + " (" + k.rol + ")");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- WINDEN SOY ADI ANALİZİ | Yazar: zehgai ---\n");

        // 1. TIEDEMANN AİLESİ
        Aile tiedemann = new Aile("Tiedemann");
        tiedemann.uyeEkle(new Karakter("Claudia", "Zamanın koruyucusu (Beyaz Kurt)"));
        tiedemann.uyeEkle(new Karakter("Bartosz", "Noah ve Agnes'in babası"));
        tiedemann.uyeEkle(new Karakter("Regina", "Claudia'nın kızı"));

        // 2. NIELSEN AİLESİ
        Aile nielsen = new Aile("Nielsen");
        nielsen.uyeEkle(new Karakter("Agnes", "Tronte'nin annesi"));
        nielsen.uyeEkle(new Karakter("Mikkel", "Zaman yolcusu (Michael Kahnwald)"));
        nielsen.uyeEkle(new Karakter("Martha", "Jonas'ın karşı parçası"));

        // 3. DOPPLER AİLESİ
        Aile doppler = new Aile("Doppler");
        doppler.uyeEkle(new Karakter("Charlotte", "Elizabeth'in annesi ve kızı"));
        doppler.uyeEkle(new Karakter("Helge", "Nükleer santral bekçisi"));
        doppler.uyeEkle(new Karakter("Peter", "Charlotte'un eşi"));

        // 4. KAHNWALD AİLESİ
        Aile kahnwald = new Aile("Kahnwald");
        kahnwald.uyeEkle(new Karakter("Jonas", "Döngünün merkezindeki yolcu (Adam)"));
        kahnwald.uyeEkle(new Karakter("Hannah", "Jonas'ın annesi"));

        // TÜM AİLELERİ EKRANA YAZDIR
        tiedemann.aileListele();
        nielsen.aileListele();
        doppler.aileListele();
        kahnwald.aileListele();

        System.out.println("\n--- DÖNGÜSEL NOT ---");
        System.out.println("Zehgai Notu: Soyisimler Winden'da sadece birer etikettir, herkes birbirinin parçasıdır.");
        System.out.println("\"The end is the beginning.\"");
    }
}
