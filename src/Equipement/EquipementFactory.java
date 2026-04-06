package Equipement;

import Shared.Enum.TypeEquipement;

public class EquipementFactory {

    public Equipement creerEquipement(TypeEquipement lTypeEquipement, String lNom){
        if (lTypeEquipement == null) {
            return null;
        }

        switch (lTypeEquipement){

            // Type d'équipement avec un ETAT
            case VOLET:
                Volet volet = new Volet();
                volet.nom = lNom;
                volet.fermeture();
                return volet;
            case PORTAIL:
                Portail portail = new Portail();
                portail.nom = lNom;
                portail.fermeture();
                return portail;
            case SERRURE:
                Serrure serrure = new Serrure();
                serrure.nom = lNom;
                serrure.fermeture();
                return serrure;

            // Type d'équipement avec un MODE
            case ALARME:
                Alarme alarme = new Alarme();
                alarme.nom = lNom;
                return alarme;
            case CAPTEUR_MOUVEMENT:
                CapteurMouvement capteurMouvement = new CapteurMouvement();
                capteurMouvement.nom = lNom;
                return capteurMouvement;
            case CAPTEUR_FUMEE:
                CapteurFumee capteurFumee = new CapteurFumee();
                capteurFumee.nom = lNom;
                return capteurFumee;
            case CAMERA:
                Camera camera = new Camera();
                camera.nom = lNom;
                return camera;
            case AMPOULE:
                Ampoule ampoule = new Ampoule();
                ampoule.nom = lNom;
                return ampoule;
            case CHAUFFAGE:
                Chauffage chauffage = new Chauffage();
                chauffage.nom = lNom;
                return chauffage;

            // Type d'équipement ROBOT
            case ROBOT_ASPIRATEUR:
                RobotAspirateur robotAspirateur = new RobotAspirateur();
                robotAspirateur.nom = lNom;
                return robotAspirateur;

            default:
                return null;
        }
    }
}
