/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_MotDePasse
 * Date : 08/03/2016 11:24:32
 * Version de wdjava.dll  : 20.0.139.0
 */


package com.masociete.projetdomotique.wdgen;


import com.masociete.projetdomotique.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.action.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_MotDePasse extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_MotDePasse
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_Ancien_mot_de_passe
 */
class GWDSAI_Ancien_mot_de_passe extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_MotDePasse.SAI_Ancien_mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,283,31);
super.setRectCompPrincipal(0,31,283,40);
super.setQuid(2800859559515470886l);

super.setChecksum("764143268");

super.setNom("SAI_Ancien_mot_de_passe");

super.setType(20001);

super.setLibelle("Ancien mot de passe");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(16, 85);

super.setTailleInitiale(283, 73);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

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

super.setStyleLibelle(0xFFFFFF, creerPolice("Trebuchet MS", -11.000000, 0), 2);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setCadreInterne9Images(0xE0E0E0, "F:\\WX\\Gabarit\\WM\\110 Media Center\\SaisieAffichage_MediaCenter.gif?_3NP_2_2_2_2", new int[] {1,4,1,4,0,4,1,4,1}, new int[] {2, 2, 2, 2}, 1, 1);

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
public GWDSAI_Ancien_mot_de_passe mWD_SAI_Ancien_mot_de_passe;

/**
 * SAI_Nouveau_mot_de_passe
 */
class GWDSAI_Nouveau_mot_de_passe extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_MotDePasse.SAI_Nouveau_mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,283,31);
super.setRectCompPrincipal(0,31,283,40);
super.setQuid(2800859666890071088l);

super.setChecksum("764561095");

super.setNom("SAI_Nouveau_mot_de_passe");

super.setType(20001);

super.setLibelle("Nouveau mot de passe");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(16, 183);

super.setTailleInitiale(283, 73);

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

super.setStyleLibelle(0xFFFFFF, creerPolice("Trebuchet MS", -11.000000, 0), 2);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setCadreInterne9Images(0xE0E0E0, "F:\\WX\\Gabarit\\WM\\110 Media Center\\SaisieAffichage_MediaCenter.gif?_3NP_2_2_2_2", new int[] {1,4,1,4,0,4,1,4,1}, new int[] {2, 2, 2, 2}, 1, 1);

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
public GWDSAI_Nouveau_mot_de_passe mWD_SAI_Nouveau_mot_de_passe;

/**
 * SAI_Confimer_le_mot_de_passe
 */
class GWDSAI_Confimer_le_mot_de_passe extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_MotDePasse.SAI_Confimer_le_mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,283,31);
super.setRectCompPrincipal(0,31,283,40);
super.setQuid(2800859752789568079l);

super.setChecksum("764712186");

super.setNom("SAI_Confimer_le_mot_de_passe");

super.setType(20001);

super.setLibelle("Confimer le mot de passe");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(16, 288);

super.setTailleInitiale(283, 73);

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

super.setNumTab(3);

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

super.setStyleLibelle(0xFFFFFF, creerPolice("Trebuchet MS", -11.000000, 0), 2);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setCadreInterne9Images(0xE0E0E0, "F:\\WX\\Gabarit\\WM\\110 Media Center\\SaisieAffichage_MediaCenter.gif?_3NP_2_2_2_2", new int[] {1,4,1,4,0,4,1,4,1}, new int[] {2, 2, 2, 2}, 1, 1);

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
public GWDSAI_Confimer_le_mot_de_passe mWD_SAI_Confimer_le_mot_de_passe;

/**
 * BTN_Valider
 */
class GWDBTN_Valider extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_MotDePasse.BTN_Valider
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800859885933977938l);

super.setChecksum("765136812");

super.setNom("BTN_Valider");

super.setType(4);

super.setLibelle("Valider");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(84, 407);

super.setTailleInitiale(160, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(1);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(4);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice("Tahoma", -13.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice("Tahoma", -13.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("Tahoma", -13.000000, 0));

super.setStyleCadreRepos(1, 0xA36801, 0xC56A31, 0x450000, 4, 4);

super.setStyleCadreSurvol(1, 0xA36801, 0xC56A31, 0x450000, 4, 4);

super.setStyleCadreEnfonce(1, 0xA36801, 0xC56A31, 0x450000, 4, 4);

super.setImageFond9Images();

super.setImageFond("F:\\WX\\Gabarit\\WM\\110 Media Center\\Btn_MediaCenter_anim.gif?E5_A6_2NP", 1, 0, 2, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Valider
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

WDActionPredefinie.executeActionPredefinie(1, null);
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
public GWDBTN_Valider mWD_BTN_Valider;

/**
 * LIB_Modification
 */
class GWDLIB_Modification extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_MotDePasse.LIB_Modification
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800859980423477304l);

super.setChecksum("765355232");

super.setNom("LIB_Modification");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Modification");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(33, 19);

super.setTailleInitiale(249, 52);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

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
public GWDLIB_Modification mWD_LIB_Modification;

/**
 * Traitement: Déclarations globales de FEN_MotDePasse
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
// Création des champs de la fenêtre FEN_MotDePasse
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SAI_Ancien_mot_de_passe = new GWDSAI_Ancien_mot_de_passe();
mWD_SAI_Nouveau_mot_de_passe = new GWDSAI_Nouveau_mot_de_passe();
mWD_SAI_Confimer_le_mot_de_passe = new GWDSAI_Confimer_le_mot_de_passe();
mWD_BTN_Valider = new GWDBTN_Valider();
mWD_LIB_Modification = new GWDLIB_Modification();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_MotDePasse
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2800859520858724464l);

super.setChecksum("767501598");

super.setNom("FEN_MotDePasse");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xF4800000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 508);

super.setTitre("MotDePasse");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("D:\\SN2IR2016\\barrellon\\WindevProject\\Mes Projets Mobile\\ProjetDomotique\\Bg_MediaCenter.jpg", 3, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_MotDePasse
////////////////////////////////////////////////////////////////////////////
mWD_SAI_Ancien_mot_de_passe.initialiserObjet();
super.ajouter("SAI_Ancien_mot_de_passe", mWD_SAI_Ancien_mot_de_passe);
mWD_SAI_Nouveau_mot_de_passe.initialiserObjet();
super.ajouter("SAI_Nouveau_mot_de_passe", mWD_SAI_Nouveau_mot_de_passe);
mWD_SAI_Confimer_le_mot_de_passe.initialiserObjet();
super.ajouter("SAI_Confimer_le_mot_de_passe", mWD_SAI_Confimer_le_mot_de_passe);
mWD_BTN_Valider.initialiserObjet();
super.ajouter("BTN_Valider", mWD_BTN_Valider);
mWD_LIB_Modification.initialiserObjet();
super.ajouter("LIB_Modification", mWD_LIB_Modification);

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
return true;
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
return GWDPProjetDomotique.ms_Project.mWD_FEN_MotDePasse;
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
