/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_connexion
 * Date : 07/03/2016 16:48:57
 * Version de wdjava.dll  : 20.0.139.0
 */


package com.masociete.projetdomotique.wdgen;


import com.masociete.projetdomotique.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.action.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_connexion extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_connexion
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Connexion
 */
class GWDBTN_Connexion extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_connexion.BTN_Connexion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800544484927547824l);

super.setChecksum("682015023");

super.setNom("BTN_Connexion");

super.setType(4);

super.setLibelle("Connexion");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(70, 345);

super.setTailleInitiale(188, 60);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(1);

super.setTypeActionPredefinie(3);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(4);

super.setPresenceLibelle(true);

super.setImage("D:\\SN2IR2016\\barrellon\\WindevProject\\Mes Projets Mobile\\ProjetDomotique\\Btn_Std_ok.gif?E5", 0, 1);

super.setStyleLibelleRepos(0x996633, creerPolice("Tahoma", -13.000000, 0));

super.setStyleLibelleSurvol(0x996633, creerPolice("Tahoma", -13.000000, 0));

super.setStyleLibelleEnfonce(0x996633, creerPolice("Tahoma", -13.000000, 0));

super.setStyleCadreRepos(1, 0xFFFFFFFF, 0xC56A31, 0x450000, 4, 4);

super.setStyleCadreSurvol(1, 0xFFFFFFFF, 0xC56A31, 0x450000, 4, 4);

super.setStyleCadreEnfonce(1, 0xFFFFFFFF, 0xC56A31, 0x450000, 4, 4);

super.setImageFond9Images();

super.setImageFond("D:\\SN2IR2016\\barrellon\\WindevProject\\Mes Projets Mobile\\ProjetDomotique\\Btn_MediaCenter_anim.gif?E5_A5_2NP", 1, 0, 2, 5);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Connexion
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

WDActionPredefinie.executeActionPredefinie(3, new WDObjet[]{(new WDChaineU("FEN_Utilisateur"))});
}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Connexion mWD_BTN_Connexion;

/**
 * SAI_Mot_de_passe
 */
class GWDSAI_Mot_de_passe extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_connexion.SAI_Mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,176,40);
super.setRectCompPrincipal(176,2,119,40);
super.setQuid(2800544484927613360l);

super.setChecksum("682079647");

super.setNom("SAI_Mot_de_passe");

super.setType(20001);

super.setLibelle("Mot de passe");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(13, 235);

super.setTailleInitiale(295, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(0);

super.setMiseABlancSiZero(true);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, creerPolice("Trebuchet MS", -13.000000, 0), 4);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setCadreInterne9Images(0xFFFFFF, "D:\\SN2IR2016\\barrellon\\WindevProject\\Mes Projets Mobile\\ProjetDomotique\\Saisie_MediaCenter.gif?E5_3NP_2_4_2_2", new int[] {1,4,1,4,0,4,1,4,1}, new int[] {2, 2, 4, 2}, 1, 5);

super.setStyleSaisie(0x2D2D2D, creerPolice("Trebuchet MS", -11.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Mot_de_passe mWD_SAI_Mot_de_passe;

/**
 * SAI_Identifiant
 */
class GWDSAI_Identifiant extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_connexion.SAI_Identifiant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,160,39);
super.setRectCompPrincipal(160,2,119,39);
super.setQuid(2800544484927678896l);

super.setChecksum("682145183");

super.setNom("SAI_Identifiant");

super.setType(20001);

super.setLibelle("Identifiant");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(29, 164);

super.setTailleInitiale(279, 43);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(0);

super.setMiseABlancSiZero(true);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, creerPolice("Trebuchet MS", -13.000000, 0), 4);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setCadreInterne9Images(0xFFFFFF, "D:\\SN2IR2016\\barrellon\\WindevProject\\Mes Projets Mobile\\ProjetDomotique\\Saisie_MediaCenter.gif?E5_3NP_2_4_2_2", new int[] {1,4,1,4,0,4,1,4,1}, new int[] {2, 2, 4, 2}, 1, 5);

super.setStyleSaisie(0x2D2D2D, creerPolice("Trebuchet MS", -11.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Identifiant mWD_SAI_Identifiant;

/**
 * LIB_Titre_de_fenêtre
 */
class GWDLIB_Titre_de_fenetre extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_connexion.LIB_Titre_de_fenêtre
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800544484927744432l);

super.setChecksum("682211175");

super.setNom("LIB_Titre_de_fenêtre");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Bienvenue");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(62, 33);

super.setTailleInitiale(212, 57);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice("Tahoma", -21.000000, 0), 3);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Titre_de_fenetre mWD_LIB_Titre_de_fenetre;

/**
 * Traitement: Déclarations globales de FEN_connexion
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_connexion
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Connexion = new GWDBTN_Connexion();
mWD_SAI_Mot_de_passe = new GWDSAI_Mot_de_passe();
mWD_SAI_Identifiant = new GWDSAI_Identifiant();
mWD_LIB_Titre_de_fenetre = new GWDLIB_Titre_de_fenetre();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_connexion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2800544484927482288l);

super.setChecksum("687347672");

super.setNom("FEN_connexion");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xF4800000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 508);

super.setTitre("connexion");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("D:\\SN2IR2016\\barrellon\\WindevProject\\Mes Projets Mobile\\ProjetDomotique\\Bg_MediaCenter.jpg", 3, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_connexion
////////////////////////////////////////////////////////////////////////////
mWD_BTN_Connexion.initialiserObjet();
super.ajouter("BTN_Connexion", mWD_BTN_Connexion);
mWD_SAI_Mot_de_passe.initialiserObjet();
super.ajouter("SAI_Mot_de_passe", mWD_SAI_Mot_de_passe);
mWD_SAI_Identifiant.initialiserObjet();
super.ajouter("SAI_Identifiant", mWD_SAI_Identifiant);
mWD_LIB_Titre_de_fenetre.initialiserObjet();
super.ajouter("LIB_Titre_de_fenêtre", mWD_LIB_Titre_de_fenetre);

super.terminerInitialisation();
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return false;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return false;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return true;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPProjetDomotique.ms_Project.mWD_FEN_connexion;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "110 Media Center";
}
}
