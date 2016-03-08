/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_Horodateur3
 * Date : 08/03/2016 10:35:56
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



public class GWDFFEN_Horodateur3 extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Horodateur3
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Valider
 */
class GWDBTN_Valider extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Horodateur3.BTN_Valider
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800844509878535084l);

super.setChecksum("692610058");

super.setNom("BTN_Valider");

super.setType(4);

super.setLibelle("Valider");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(91, 392);

super.setTailleInitiale(160, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

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
 * SAI_Heure_de_fin
 */
class GWDSAI_Heure_de_fin extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Horodateur3.SAI_Heure_de_fin
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,182,40);
super.setRectCompPrincipal(182,2,67,40);
super.setQuid(2800844509878666156l);

super.setChecksum("692879601");

super.setNom("SAI_Heure_de_fin");

super.setType(20003);

super.setLibelle("Heure de fin");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(45, 281);

super.setTailleInitiale(249, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(3);

super.setFormatMemorise("HHMM");

super.setMasqueSaisie(new WDChaineU("HH:MM"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

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

super.setMasqueAffichage(new WDChaineU("HH:MM"));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(0);

super.setMiseABlancSiZero(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, creerPolice("Trebuchet MS", -11.000000, 0), 4);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setCadreInterne9Images(0xFFFFFF, "F:\\WX\\Gabarit\\WM\\110 Media Center\\Saisie_MediaCenter.gif?E5_3NP_2_4_2_2", new int[] {1,4,1,4,0,4,1,4,1}, new int[] {2, 2, 4, 2}, 1, 5);

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
public GWDSAI_Heure_de_fin mWD_SAI_Heure_de_fin;

/**
 * SAI_Heure_de_début
 */
class GWDSAI_Heure_de_debut extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Horodateur3.SAI_Heure_de_début
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,182,40);
super.setRectCompPrincipal(182,2,67,40);
super.setQuid(2800844509878797228l);

super.setChecksum("693010673");

super.setNom("SAI_Heure_de_début");

super.setType(20003);

super.setLibelle("Heure de début");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(45, 188);

super.setTailleInitiale(249, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(3);

super.setFormatMemorise("HHMM");

super.setMasqueSaisie(new WDChaineU("HH:MM"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

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

super.setMasqueAffichage(new WDChaineU("HH:MM"));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(0);

super.setMiseABlancSiZero(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, creerPolice("Trebuchet MS", -11.000000, 0), 4);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setCadreInterne9Images(0xFFFFFF, "F:\\WX\\Gabarit\\WM\\110 Media Center\\Saisie_MediaCenter.gif?E5_3NP_2_4_2_2", new int[] {1,4,1,4,0,4,1,4,1}, new int[] {2, 2, 4, 2}, 1, 5);

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
public GWDSAI_Heure_de_debut mWD_SAI_Heure_de_debut;

/**
 * LIB_Prise_3
 */
class GWDLIB_Prise_3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Horodateur3.LIB_Prise_3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800844509878928300l);

super.setChecksum("693002818");

super.setNom("LIB_Prise_3");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Prise 3");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(89, 104);

super.setTailleInitiale(147, 32);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice("Tahoma", -11.000000, 0), 3);

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
public GWDLIB_Prise_3 mWD_LIB_Prise_3;

/**
 * LIB_Horodateur
 */
class GWDLIB_Horodateur extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Horodateur3.LIB_Horodateur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800844509879059372l);

super.setChecksum("693133890");

super.setNom("LIB_Horodateur");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Horodateur");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(45, 34);

super.setTailleInitiale(234, 68);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

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
public GWDLIB_Horodateur mWD_LIB_Horodateur;

/**
 * Traitement: Déclarations globales de FEN_Horodateur3
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
// Création des champs de la fenêtre FEN_Horodateur3
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Valider = new GWDBTN_Valider();
mWD_SAI_Heure_de_fin = new GWDSAI_Heure_de_fin();
mWD_SAI_Heure_de_debut = new GWDSAI_Heure_de_debut();
mWD_LIB_Prise_3 = new GWDLIB_Prise_3();
mWD_LIB_Horodateur = new GWDLIB_Horodateur();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Horodateur3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2800844492698531084l);

super.setChecksum("697873423");

super.setNom("FEN_Horodateur3");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xF4800000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 508);

super.setTitre("Horodateur3");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("D:\\SN2IR2016\\barrellon\\WindevProject\\Mes Projets Mobile\\ProjetDomotique\\Bg_MediaCenter.jpg", 3, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Horodateur3
////////////////////////////////////////////////////////////////////////////
mWD_BTN_Valider.initialiserObjet();
super.ajouter("BTN_Valider", mWD_BTN_Valider);
mWD_SAI_Heure_de_fin.initialiserObjet();
super.ajouter("SAI_Heure_de_fin", mWD_SAI_Heure_de_fin);
mWD_SAI_Heure_de_debut.initialiserObjet();
super.ajouter("SAI_Heure_de_début", mWD_SAI_Heure_de_debut);
mWD_LIB_Prise_3.initialiserObjet();
super.ajouter("LIB_Prise_3", mWD_LIB_Prise_3);
mWD_LIB_Horodateur.initialiserObjet();
super.ajouter("LIB_Horodateur", mWD_LIB_Horodateur);

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
return GWDPProjetDomotique.ms_Project.mWD_FEN_Horodateur3;
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
