import org.example.*;


static void main(String[] args) {

    FlottaService flotta = new FlottaService();

    try {
        //Creiamo un veicolo con

        Veicolo v1 = new Bici("MN-01", true, 12.0, 6);
        flotta.registraVeicolo(v1);

        // 3. Creiamo e registriamo un utente di prova
        // (Assicurati di usare un codice fiscale formalmente valido per il test)
        Utente u1 = new Utente("U001", "Mario Rossi", "mario@email.com", "RSSMRA80A01H501U", 1.50);
        flotta.registraUtente(u1);

        System.out.println("\nRegistrazioni completate con successo. Tentativo di sblocco in corso...");

        // 4. Tentiamo di sbloccare il veicolo
        // (Questo genererà un'eccezione perché l'utente ha solo 0.50€ di credito)
        flotta.sbloccaVeicolo("MN-01", "U001");

    } catch (CodiceFiscaleNonValidoException e) {
        System.out.println("\nErrore di registrazione: " + e.getMessage());

    } catch (CreditoInsufficienteException e) {
        System.out.println("\nBlocco operazione: " + e.getMessage());

    } catch (BatteriaScaricaException e) {
        System.out.println("\nBlocco operazione: " + e.getMessage());

    } catch (VeicoloNonDisponibileException e) {
        System.out.println("\nBlocco operazione: " + e.getMessage());

    } catch (Exception e) {
        // Cattura generica per qualsiasi altro imprevisto
        System.out.println("Errore imprevisto: " + e.getMessage());
    }
}
