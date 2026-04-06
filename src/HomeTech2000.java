import Equipement.Alarme;
import Equipement.Ampoule;
import Equipement.Camera;
import Equipement.CapteurFumee;
import Equipement.CapteurMouvement;
import Equipement.Chauffage;
import Equipement.EquipementFactory;
import Equipement.Portail;
import Equipement.RobotAspirateur;
import Equipement.Serrure;
import Equipement.Volet;
import LieuBuilder.Directeur;
import Shared.Enum.Mode;
import Shared.Enum.TypeEquipement;
import Shared.Enum.TypePiece;
import Shared.Lieu;
import Shared.Piece;
import Shared.Utilisateur;

public class HomeTech2000 {

    public static HomeTech2000 instance;
    public Utilisateur utilisateur;

    public HomeTech2000() {
        this.utilisateur = new Utilisateur("Fabrice", "Boudo", "Fabrice.boudo@hometech2000.com");
    }

    public static void main(String[] args) throws InterruptedException {
        HomeTech2000 app = new HomeTech2000();
        instance = app;
        EquipementFactory ef = new EquipementFactory();
        Directeur directeur = new Directeur();

        System.out.println("----------------------------------------------------");
        System.out.println("--------- INITIALISATION : Builder de lieu ---------");
        System.out.println("----------------------------------------------------");

        directeur.makeStudio();
        Lieu studio = directeur.builder.getLieu();
        app.utilisateur.lieux.add(studio);

        Piece salon = studio.getPieces(TypePiece.SALON).getFirst();
        Piece salleDeBain = studio.getPieces(TypePiece.SDB).getFirst();
        Piece toilette = studio.getPieces(TypePiece.TOILETTE).getFirst();

        Portail portail = (Portail) ef.creerEquipement(TypeEquipement.PORTAIL, "Portail principal");
        Ampoule ampoule = (Ampoule) ef.creerEquipement(TypeEquipement.AMPOULE, "Ampoule du salon");
        Chauffage chauffage = (Chauffage) ef.creerEquipement(TypeEquipement.CHAUFFAGE, "Chauffage du salon");
        Camera camera = (Camera) ef.creerEquipement(TypeEquipement.CAMERA, "Camera d entree");
        CapteurFumee capteurFumee = (CapteurFumee) ef.creerEquipement(TypeEquipement.CAPTEUR_FUMEE, "Capteur fumee cuisine");
        CapteurMouvement capteurMouvement = (CapteurMouvement) ef.creerEquipement(TypeEquipement.CAPTEUR_MOUVEMENT, "Capteur mouvement salon");
        RobotAspirateur robotAspirateur = (RobotAspirateur) ef.creerEquipement(TypeEquipement.ROBOT_ASPIRATEUR, "Robot aspirateur");
        Serrure serrure = (Serrure) ef.creerEquipement(TypeEquipement.SERRURE, "Serrure porte entree");
        Alarme alarme = (Alarme) ef.creerEquipement(TypeEquipement.ALARME, "Alarme generale");
        Volet volet = (Volet) ef.creerEquipement(TypeEquipement.VOLET, "Volet salon");

        System.out.println("----------------------------------------------------");
        System.out.println("------ INITIALISATION : Ajout des equipements ------");
        System.out.println("----------------------------------------------------");

        salon.equipements.add(portail);
        salon.equipements.add(ampoule);
        salon.equipements.add(chauffage);
        salon.equipements.add(capteurMouvement);
        salon.equipements.add(robotAspirateur);
        salon.equipements.add(volet);
        salleDeBain.equipements.add(camera);
        salleDeBain.equipements.add(capteurFumee);
        toilette.equipements.add(serrure);
        toilette.equipements.add(alarme);

        System.out.println("Lieu simule : studio avec " + studio.pieces.size() + " categories de pieces.");
        System.out.println("Salon : " + salon.equipements.size() + " equipements.");
        System.out.println("Salle de bain : " + salleDeBain.equipements.size() + " equipements.");
        System.out.println("Toilette : " + toilette.equipements.size() + " equipements.");

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("---------- SIMULATION D UNE JOURNEE EN THREADS -----");
        System.out.println("----------------------------------------------------");

        // ============================================================
        System.out.println();
        System.out.println("06:00 - Fabrice se reveille.");
        alarme.changeMode();
        System.out.println("Alarme desactivee.");

        ampoule.intencite = 3;
        Thread threadAmpoule0 = new Thread(ampoule, "Thread-Ampoule");
        threadAmpoule0.start();
        threadAmpoule0.join();

        // ============================================================
        System.out.println();
        System.out.println("06:15 - Fabrice prend sa douche.");
        System.out.println("Verification du capteur fumee : " + capteurFumee.nom + " -> OK");

        // ============================================================
        System.out.println();
        System.out.println("06:30 - Petit dejeuner, montee en temperature du salon.");

        chauffage.temperature = 20;
        Thread threadChauffage = new Thread(chauffage, "Thread-Chauffage");
        threadChauffage.start();

        Thread threadPortailOuverture1 = new Thread(portail, "Thread-Portail");
        threadPortailOuverture1.start();

        threadChauffage.join();
        threadPortailOuverture1.join();

        serrure.ouverture();
        System.out.println("Serrure -> ouverte");

        // ============================================================
        System.out.println();
        System.out.println("07:00 - Fabrice quitte la maison.");

        ampoule.intencite = 0;
        Thread threadAmpoule1 = new Thread(ampoule, "Thread-Ampoule");
        threadAmpoule1.start();
        threadAmpoule1.join();

        // ============================================================
        System.out.println();
        System.out.println("07:15 - Fabrice ferme la maison derriere lui.");

        Thread threadPortailFermeture1 = new Thread(portail, "Thread-Portail");
        threadPortailFermeture1.start();
        threadPortailFermeture1.join();

        serrure.fermeture();
        System.out.println("Serrure -> verrouillee");

        // ============================================================
        System.out.println();
        System.out.println("07:30 - Fermeture des volets.");

        Thread threadVoletFermeture = new Thread(volet, "Thread-Volet");
        threadVoletFermeture.start();
        threadVoletFermeture.join();

        // ============================================================
        System.out.println();
        System.out.println("08:00 - Maison vide, lancement du menage automatique.");

        Thread threadRobot = new Thread(robotAspirateur, "Thread-Robot");
        threadRobot.start();
        threadRobot.join();

        // ============================================================
        System.out.println();
        System.out.println("12:00 - Fabrice fait un check securite a distance.");

        camera.isModeNuit = false;
        System.out.println("Camera en mode jour -> verification OK");

        // ============================================================
        System.out.println();
        System.out.println("17:45 - Fabrice rentre du travail.");

        Thread threadPortailOuverture2 = new Thread(portail, "Thread-Portail");
        threadPortailOuverture2.start();
        threadPortailOuverture2.join();

        serrure.ouverture();
        System.out.println("Serrure -> ouverte");

        // ============================================================
        System.out.println();
        System.out.println("18:00 - Debut de soiree, surveillance renforcee.");

        camera.isModeNuit = true;
        System.out.println("Camera -> mode nuit active");

        capteurMouvement.mode = Mode.ACTIF;
        System.out.println("Capteur de mouvement -> actif");

        // ============================================================
        System.out.println();
        System.out.println("19:30 - Soiree detente au salon.");

        ampoule.intencite = 2;
        Thread threadAmpoule2 = new Thread(ampoule, "Thread-Ampoule");
        threadAmpoule2.start();
        threadAmpoule2.join();

        // ============================================================
        System.out.println();
        System.out.println("21:45 - Fabrice prepare la maison pour la nuit.");

        Thread threadPortailFermeture2 = new Thread(portail, "Thread-Portail");
        threadPortailFermeture2.start();
        threadPortailFermeture2.join();

        serrure.fermeture();
        System.out.println("Serrure -> verrouillee");

        // ============================================================
        System.out.println();
        System.out.println("22:00 - Fabrice va se coucher.");

        alarme.changeMode();
        System.out.println("Alarme -> armee pour la nuit");

        // ============================================================
        System.out.println();
        System.out.println("22:15 - Aeration nocturne, ouverture legere des volets.");

        Thread threadVoletOuverture = new Thread(volet, "Thread-Volet");
        threadVoletOuverture.start();
        threadVoletOuverture.join();

        // ============================================================
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("--------------- FIN DE LA SIMULATION ---------------");
        System.out.println("----------------------------------------------------");
    }
}
