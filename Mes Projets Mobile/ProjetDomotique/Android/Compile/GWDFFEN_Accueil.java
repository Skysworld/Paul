/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_Accueil
 * Date : 05/02/2016 08:18:34
 * Version de wdjava.dll  : 20.0.139.0
 */


package com.masociete.projetdomotique.wdgen;


import com.masociete.projetdomotique.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.onglet.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.action.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.html.*;
import fr.pcsoft.wdjava.ui.menu.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Accueil extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Accueil
////////////////////////////////////////////////////////////////////////////

/**
 * ONG_volet
 */
class GWDONG_volet extends WDOnglet
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Accueil.ONG_volet
////////////////////////////////////////////////////////////////////////////

/**
 * ONG_volet_Volet1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Accueil.ONG_volet
////////////////////////////////////////////////////////////////////////////

/**
 * COMBO_ListApp
 */
class GWDCOMBO_ListApp extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Accueil.ONG_volet.COMBO_ListApp
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,279,31);
super.setRectCompPrincipal(0,31,279,40);
super.setNom("COMBO_ListApp");

super.setType(10002);

super.setLibelle("Appareils");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(19, 75);

super.setTailleInitiale(279, 73);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0), 0);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setCadreInterne9Images(0xFFFFFFFF, "D:\\SN2IR2016\\barrellon\\WindevProject\\Mes Projets Mobile\\ProjetDomotique\\Combo_MediaCenter.gif?E5_3NP_6_6_6_6", new int[] {1,4,1,4,4,4,1,4,1}, new int[] {6, 6, 6, 6}, 1, 5);

super.setStyleElement(0x2D2D2D, 0xFFFFFFFF, creerPolice("Tahoma", -11.000000, 0), 30);

super.setStyleSelection(0xFFFFFF, 0xFAD3A0, creerPolice("Tahoma", -11.000000, 0));

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
public GWDCOMBO_ListApp mWD_COMBO_ListApp = new GWDCOMBO_ListApp();

/**
 * BTN_SansNom1
 */
class GWDBTN_SansNom1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Accueil.ONG_volet.BTN_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787571450300829009l);

super.setChecksum("669189608");

super.setNom("BTN_SansNom1");

super.setType(4);

super.setLibelle("Bouton");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(74, 399);

super.setTailleInitiale(160, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(4);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

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

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_SansNom1 mWD_BTN_SansNom1 = new GWDBTN_SansNom1();

/**
 * BTN_Prise_n1
 */
class GWDBTN_Prise_n1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Accueil.ONG_volet.BTN_Prise_n1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787862546009061295l);

super.setChecksum("674035974");

super.setNom("BTN_Prise_n1");

super.setType(4);

super.setLibelle("Prise n°1");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 158);

super.setTailleInitiale(98, 39);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(3);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 1);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleCadreRepos(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setStyleCadreSurvol(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setStyleCadreEnfonce(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Prise_n1
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

WDActionPredefinie.executeActionPredefinie(3, new WDObjet[]{(new WDChaineU("FEN_Test"))});
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
public GWDBTN_Prise_n1 mWD_BTN_Prise_n1 = new GWDBTN_Prise_n1();

/**
 * BTN_Prise_n2
 */
class GWDBTN_Prise_n2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Accueil.ONG_volet.BTN_Prise_n2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787863027093548718l);

super.setChecksum("722186357");

super.setNom("BTN_Prise_n2");

super.setType(4);

super.setLibelle("Prise n°2");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 202);

super.setTailleInitiale(98, 35);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(5);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 1);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleCadreRepos(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setStyleCadreSurvol(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setStyleCadreEnfonce(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setImageFond("", 1, 0, 2, 1);

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
public GWDBTN_Prise_n2 mWD_BTN_Prise_n2 = new GWDBTN_Prise_n2();

/**
 * BTN_Prise_n3
 */
class GWDBTN_Prise_n3 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Accueil.ONG_volet.BTN_Prise_n3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787863598330754121l);

super.setChecksum("728741525");

super.setNom("BTN_Prise_n3");

super.setType(4);

super.setLibelle("Prise n°3");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 246);

super.setTailleInitiale(98, 35);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 1);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleCadreRepos(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setStyleCadreSurvol(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setStyleCadreEnfonce(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setImageFond("", 1, 0, 2, 1);

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
public GWDBTN_Prise_n3 mWD_BTN_Prise_n3 = new GWDBTN_Prise_n3();

/**
 * BTN_Prise_n4
 */
class GWDBTN_Prise_n4 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Accueil.ONG_volet.BTN_Prise_n4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787863611217166925l);

super.setChecksum("730252444");

super.setNom("BTN_Prise_n4");

super.setType(4);

super.setLibelle("Prise n°4");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 290);

super.setTailleInitiale(98, 35);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(7);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 1);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleCadreRepos(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setStyleCadreSurvol(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setStyleCadreEnfonce(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setImageFond("", 1, 0, 2, 1);

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
public GWDBTN_Prise_n4 mWD_BTN_Prise_n4 = new GWDBTN_Prise_n4();

/**
 * BTN_Prise_n5
 */
class GWDBTN_Prise_n5 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Accueil.ONG_volet.BTN_Prise_n5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787863619808610374l);

super.setChecksum("731761303");

super.setNom("BTN_Prise_n5");

super.setType(4);

super.setLibelle("Prise n°5");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 334);

super.setTailleInitiale(98, 35);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(8);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 1);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.setStyleCadreRepos(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setStyleCadreSurvol(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setStyleCadreEnfonce(1, 0xFFFFFFFF, 0xFFFFFF, 0x7F7F7F, 4, 4);

super.setImageFond("", 1, 0, 2, 1);

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
public GWDBTN_Prise_n5 mWD_BTN_Prise_n5 = new GWDBTN_Prise_n5();

/**
 * SEL_Sélecteur_2_colonnes
 */
class GWDSEL_Selecteur_2_colonnes extends WDSelecteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes
////////////////////////////////////////////////////////////////////////////

/**
 * SEL_Sélecteur_2_colonnes_Option_0
 */
class GWDSEL_Selecteur_2_colonnes_Option_0 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes.SEL_Sélecteur_2_colonnes_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("On");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Selecteur_2_colonnes_Option_0 mWD_SEL_Selecteur_2_colonnes_Option_0 = new GWDSEL_Selecteur_2_colonnes_Option_0();

/**
 * SEL_Sélecteur_2_colonnes_Option_1
 */
class GWDSEL_Selecteur_2_colonnes_Option_1 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes.SEL_Sélecteur_2_colonnes_Option_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Off");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Selecteur_2_colonnes_Option_1 mWD_SEL_Selecteur_2_colonnes_Option_1 = new GWDSEL_Selecteur_2_colonnes_Option_1();
/**
 * Initialise tous les champs de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_SEL_Selecteur_2_colonnes_Option_0);
super.ajouterOption(mWD_SEL_Selecteur_2_colonnes_Option_1);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,142,42);
super.setQuid(2787867403732564507l);

super.setChecksum("789529453");

super.setNom("SEL_Sélecteur_2_colonnes");

super.setType(6);

super.setLibelle("&Sélecteur 2 colonnes");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(139, 158);

super.setTailleInitiale(142, 42);

super.setValeurInitiale("1");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(9);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 2, false, true, false);

super.setValeurRenvoyeeParProgrammation(false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x808080, 0xFFFFFF, 4, 4);

super.setCadreInterne(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setParamAnimationChamp(18, 19, 300);
super.setParamAnimationChamp(19, 20, 300);

super.setImageCoche("F:\\WX\\Gabarit\\WM\\110 Media Center\\Selecteur_Mediacenter_Anim.gif?E12_Radio", 1);

activerEcoute();
initialiserSousObjets();
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
public GWDSEL_Selecteur_2_colonnes mWD_SEL_Selecteur_2_colonnes = new GWDSEL_Selecteur_2_colonnes();

/**
 * SEL_Sélecteur_2_colonnes1
 */
class GWDSEL_Selecteur_2_colonnes1 extends WDSelecteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes1
////////////////////////////////////////////////////////////////////////////

/**
 * SEL_Sélecteur_2_colonnes1_Option_0
 */
class GWDSEL_Selecteur_2_colonnes1_Option_0 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes1.SEL_Sélecteur_2_colonnes1_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("On");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Selecteur_2_colonnes1_Option_0 mWD_SEL_Selecteur_2_colonnes1_Option_0 = new GWDSEL_Selecteur_2_colonnes1_Option_0();

/**
 * SEL_Sélecteur_2_colonnes1_Option_1
 */
class GWDSEL_Selecteur_2_colonnes1_Option_1 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes1.SEL_Sélecteur_2_colonnes1_Option_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Off");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Selecteur_2_colonnes1_Option_1 mWD_SEL_Selecteur_2_colonnes1_Option_1 = new GWDSEL_Selecteur_2_colonnes1_Option_1();
/**
 * Initialise tous les champs de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_SEL_Selecteur_2_colonnes1_Option_0);
super.ajouterOption(mWD_SEL_Selecteur_2_colonnes1_Option_1);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,142,42);
super.setQuid(2787867773102263360l);

super.setChecksum("792040936");

super.setNom("SEL_Sélecteur_2_colonnes1");

super.setType(6);

super.setLibelle("&Sélecteur 2 colonnes");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(139, 202);

super.setTailleInitiale(142, 42);

super.setValeurInitiale("1");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(10);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 2, false, true, false);

super.setValeurRenvoyeeParProgrammation(false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x808080, 0xFFFFFF, 4, 4);

super.setCadreInterne(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setParamAnimationChamp(18, 19, 300);
super.setParamAnimationChamp(19, 20, 300);

super.setImageCoche("F:\\WX\\Gabarit\\WM\\110 Media Center\\Selecteur_Mediacenter_Anim.gif?E12_Radio", 1);

activerEcoute();
initialiserSousObjets();
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
public GWDSEL_Selecteur_2_colonnes1 mWD_SEL_Selecteur_2_colonnes1 = new GWDSEL_Selecteur_2_colonnes1();

/**
 * SEL_Sélecteur_2_colonnes2
 */
class GWDSEL_Selecteur_2_colonnes2 extends WDSelecteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes2
////////////////////////////////////////////////////////////////////////////

/**
 * SEL_Sélecteur_2_colonnes2_Option_0
 */
class GWDSEL_Selecteur_2_colonnes2_Option_0 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes2.SEL_Sélecteur_2_colonnes2_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("On");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Selecteur_2_colonnes2_Option_0 mWD_SEL_Selecteur_2_colonnes2_Option_0 = new GWDSEL_Selecteur_2_colonnes2_Option_0();

/**
 * SEL_Sélecteur_2_colonnes2_Option_1
 */
class GWDSEL_Selecteur_2_colonnes2_Option_1 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes2.SEL_Sélecteur_2_colonnes2_Option_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Off");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Selecteur_2_colonnes2_Option_1 mWD_SEL_Selecteur_2_colonnes2_Option_1 = new GWDSEL_Selecteur_2_colonnes2_Option_1();
/**
 * Initialise tous les champs de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes2
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes2
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_SEL_Selecteur_2_colonnes2_Option_0);
super.ajouterOption(mWD_SEL_Selecteur_2_colonnes2_Option_1);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,142,42);
super.setQuid(2787867785988347564l);

super.setChecksum("793223255");

super.setNom("SEL_Sélecteur_2_colonnes2");

super.setType(6);

super.setLibelle("&Sélecteur 2 colonnes");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(139, 246);

super.setTailleInitiale(142, 42);

super.setValeurInitiale("1");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(11);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 2, false, true, false);

super.setValeurRenvoyeeParProgrammation(false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x808080, 0xFFFFFF, 4, 4);

super.setCadreInterne(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setParamAnimationChamp(18, 19, 300);
super.setParamAnimationChamp(19, 20, 300);

super.setImageCoche("F:\\WX\\Gabarit\\WM\\110 Media Center\\Selecteur_Mediacenter_Anim.gif?E12_Radio", 1);

activerEcoute();
initialiserSousObjets();
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
public GWDSEL_Selecteur_2_colonnes2 mWD_SEL_Selecteur_2_colonnes2 = new GWDSEL_Selecteur_2_colonnes2();

/**
 * SEL_Sélecteur_2_colonnes3
 */
class GWDSEL_Selecteur_2_colonnes3 extends WDSelecteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes3
////////////////////////////////////////////////////////////////////////////

/**
 * SEL_Sélecteur_2_colonnes3_Option_0
 */
class GWDSEL_Selecteur_2_colonnes3_Option_0 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes3.SEL_Sélecteur_2_colonnes3_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("On");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Selecteur_2_colonnes3_Option_0 mWD_SEL_Selecteur_2_colonnes3_Option_0 = new GWDSEL_Selecteur_2_colonnes3_Option_0();

/**
 * SEL_Sélecteur_2_colonnes3_Option_1
 */
class GWDSEL_Selecteur_2_colonnes3_Option_1 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes3.SEL_Sélecteur_2_colonnes3_Option_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Off");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Selecteur_2_colonnes3_Option_1 mWD_SEL_Selecteur_2_colonnes3_Option_1 = new GWDSEL_Selecteur_2_colonnes3_Option_1();
/**
 * Initialise tous les champs de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes3
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes3
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_SEL_Selecteur_2_colonnes3_Option_0);
super.ajouterOption(mWD_SEL_Selecteur_2_colonnes3_Option_1);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,142,42);
super.setQuid(2787867807464565120l);

super.setChecksum("794604336");

super.setNom("SEL_Sélecteur_2_colonnes3");

super.setType(6);

super.setLibelle("&Sélecteur 2 colonnes");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(139, 290);

super.setTailleInitiale(142, 42);

super.setValeurInitiale("1");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(12);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 2, false, true, false);

super.setValeurRenvoyeeParProgrammation(false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x808080, 0xFFFFFF, 4, 4);

super.setCadreInterne(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setParamAnimationChamp(18, 19, 300);
super.setParamAnimationChamp(19, 20, 300);

super.setImageCoche("F:\\WX\\Gabarit\\WM\\110 Media Center\\Selecteur_Mediacenter_Anim.gif?E12_Radio", 1);

activerEcoute();
initialiserSousObjets();
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
public GWDSEL_Selecteur_2_colonnes3 mWD_SEL_Selecteur_2_colonnes3 = new GWDSEL_Selecteur_2_colonnes3();

/**
 * SEL_Sélecteur_2_colonnes4
 */
class GWDSEL_Selecteur_2_colonnes4 extends WDSelecteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes4
////////////////////////////////////////////////////////////////////////////

/**
 * SEL_Sélecteur_2_colonnes4_Option_0
 */
class GWDSEL_Selecteur_2_colonnes4_Option_0 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes4.SEL_Sélecteur_2_colonnes4_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("On");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Selecteur_2_colonnes4_Option_0 mWD_SEL_Selecteur_2_colonnes4_Option_0 = new GWDSEL_Selecteur_2_colonnes4_Option_0();

/**
 * SEL_Sélecteur_2_colonnes4_Option_1
 */
class GWDSEL_Selecteur_2_colonnes4_Option_1 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes4.SEL_Sélecteur_2_colonnes4_Option_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Off");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("")));

super.setStyleLibelleOption(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Selecteur_2_colonnes4_Option_1 mWD_SEL_Selecteur_2_colonnes4_Option_1 = new GWDSEL_Selecteur_2_colonnes4_Option_1();
/**
 * Initialise tous les champs de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes4
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Accueil.ONG_volet.SEL_Sélecteur_2_colonnes4
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_SEL_Selecteur_2_colonnes4_Option_0);
super.ajouterOption(mWD_SEL_Selecteur_2_colonnes4_Option_1);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,142,42);
super.setQuid(2787867828940980018l);

super.setChecksum("796182759");

super.setNom("SEL_Sélecteur_2_colonnes4");

super.setType(6);

super.setLibelle("&Sélecteur 2 colonnes");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(139, 334);

super.setTailleInitiale(142, 42);

super.setValeurInitiale("1");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(13);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 2, false, true, false);

super.setValeurRenvoyeeParProgrammation(false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xFFFFFF, creerPolice("Tahoma", -11.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x808080, 0xFFFFFF, 4, 4);

super.setCadreInterne(1, 0xFFFFFFFF, 0xE0E0E0, 0x808080, 4, 4);

super.setParamAnimationChamp(18, 19, 300);
super.setParamAnimationChamp(19, 20, 300);

super.setImageCoche("F:\\WX\\Gabarit\\WM\\110 Media Center\\Selecteur_Mediacenter_Anim.gif?E12_Radio", 1);

activerEcoute();
initialiserSousObjets();
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
public GWDSEL_Selecteur_2_colonnes4 mWD_SEL_Selecteur_2_colonnes4 = new GWDSEL_Selecteur_2_colonnes4();
class GWDONG_volet_Volet1 extends WDVoletOnglet
{
/**
 * Initialise tous les champs de FEN_Accueil.ONG_volet
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Accueil.ONG_volet
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_COMBO_ListApp.initialiserObjet();
super.ajouterFils("COMBO_ListApp", mWD_COMBO_ListApp);
mWD_BTN_SansNom1.initialiserObjet();
super.ajouterFils("BTN_SansNom1", mWD_BTN_SansNom1);
mWD_BTN_Prise_n1.initialiserObjet();
super.ajouterFils("BTN_Prise_n1", mWD_BTN_Prise_n1);
mWD_BTN_Prise_n2.initialiserObjet();
super.ajouterFils("BTN_Prise_n2", mWD_BTN_Prise_n2);
mWD_BTN_Prise_n3.initialiserObjet();
super.ajouterFils("BTN_Prise_n3", mWD_BTN_Prise_n3);
mWD_BTN_Prise_n4.initialiserObjet();
super.ajouterFils("BTN_Prise_n4", mWD_BTN_Prise_n4);
mWD_BTN_Prise_n5.initialiserObjet();
super.ajouterFils("BTN_Prise_n5", mWD_BTN_Prise_n5);
mWD_SEL_Selecteur_2_colonnes.initialiserObjet();
super.ajouterFils("SEL_Sélecteur_2_colonnes", mWD_SEL_Selecteur_2_colonnes);
mWD_SEL_Selecteur_2_colonnes1.initialiserObjet();
super.ajouterFils("SEL_Sélecteur_2_colonnes1", mWD_SEL_Selecteur_2_colonnes1);
mWD_SEL_Selecteur_2_colonnes2.initialiserObjet();
super.ajouterFils("SEL_Sélecteur_2_colonnes2", mWD_SEL_Selecteur_2_colonnes2);
mWD_SEL_Selecteur_2_colonnes3.initialiserObjet();
super.ajouterFils("SEL_Sélecteur_2_colonnes3", mWD_SEL_Selecteur_2_colonnes3);
mWD_SEL_Selecteur_2_colonnes4.initialiserObjet();
super.ajouterFils("SEL_Sélecteur_2_colonnes4", mWD_SEL_Selecteur_2_colonnes4);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setOnglet(getWDOngletThis());
super.setLibelle("Utilisation");

super.setEtatInitial(0);

super.setVisibleInitial(true);

super.setImage("");

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDONG_volet_Volet1 mWD_ONG_volet_Volet1 = new GWDONG_volet_Volet1();

/**
 * ONG_volet_Volet2
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Accueil.ONG_volet
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Connection
 */
class GWDBTN_Connection extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Accueil.ONG_volet.BTN_Connection
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787571450301156689l);

super.setChecksum("669517288");

super.setNom("BTN_Connection");

super.setType(4);

super.setLibelle("Connection");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(71, 93);

super.setTailleInitiale(160, 33);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(4);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

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
 * Traitement: Clic sur BTN_Connection
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// HTM_Test = "192.168.4.1"
mWD_HTM_Test.setValeur("192.168.4.1");

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
public GWDBTN_Connection mWD_BTN_Connection = new GWDBTN_Connection();

/**
 * LIB_Connection_à_la_box
 */
class GWDLIB_Connection_a_la_box extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Accueil.ONG_volet.LIB_Connection_à_la_box
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787571450301222225l);

super.setChecksum("669582368");

super.setNom("LIB_Connection_à_la_box");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Connection à la box");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(36, 61);

super.setTailleInitiale(255, 30);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

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
public GWDLIB_Connection_a_la_box mWD_LIB_Connection_a_la_box = new GWDLIB_Connection_a_la_box();

/**
 * HTM_Test
 */
class GWDHTM_Test extends WDChampHTML
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Accueil.ONG_volet.HTM_Test
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787571450301287761l);

super.setChecksum("669657024");

super.setNom("HTM_Test");

super.setType(23);

super.setLibelle("HTML");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(19, 128);

super.setTailleInitiale(288, 319);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setSecuriteHTML(true);

super.setParamZoom(true);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice("MS Shell Dlg", -11.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xF1000000, 0xF3000000, 4, 4);

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
public GWDHTM_Test mWD_HTM_Test = new GWDHTM_Test();
class GWDONG_volet_Volet2 extends WDVoletOnglet
{
/**
 * Initialise tous les champs de FEN_Accueil.ONG_volet
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Accueil.ONG_volet
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_Connection.initialiserObjet();
super.ajouterFils("BTN_Connection", mWD_BTN_Connection);
mWD_LIB_Connection_a_la_box.initialiserObjet();
super.ajouterFils("LIB_Connection_à_la_box", mWD_LIB_Connection_a_la_box);
mWD_HTM_Test.initialiserObjet();
super.ajouterFils("HTM_Test", mWD_HTM_Test);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setOnglet(getWDOngletThis());
super.setLibelle("Configuration");

super.setEtatInitial(0);

super.setVisibleInitial(true);

super.setImage("");

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDONG_volet_Volet2 mWD_ONG_volet_Volet2 = new GWDONG_volet_Volet2();
/**
 * Initialise tous les champs de FEN_Accueil.ONG_volet
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Accueil.ONG_volet
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ONG_volet_Volet1.initialiserObjet();
super.ajouterVolet(mWD_ONG_volet_Volet1);
mWD_ONG_volet_Volet2.initialiserObjet();
super.ajouterVolet(mWD_ONG_volet_Volet2);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787571450300501329l);

super.setChecksum("668867400");

super.setNom("ONG_volet");

super.setType(16);

super.setLibelle("Onglet");

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleurFond(0xFFFFFFFF);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 460);

super.setValeurInitiale(1);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setPersistant(true);

super.setScrollAuDoigt(true);

super.setParamTabs(48, 0, 0);

super.setStyleVoletActif(0x2D2D2D, 0xC0C0C0, creerPolice("Tahoma", -11.000000, 0), 1, 0, 0);

super.setStyleVoletInactif(0xF4000000, 0xC0C0C0, creerPolice("Tahoma", -11.000000, 0), 1, 0, 0);

super.setImage("D:\\SN2IR2016\\barrellon\\WindevProject\\Mes Projets Mobile\\ProjetDomotique\\Tab_MediaCenter.gif?E2_Tabs_1NP", true);

super.setCadreExterieur(29, 0xA36801, 0x0, 0xC0C0C0, 4, 4);

activerEcoute();
initialiserSousObjets();
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
public GWDONG_volet mWD_ONG_volet;

class GWDMMENU_SansNom1 extends WDMenuContextuel
{

class GWDMOPT_SansNom1 extends WDOptionMenu
{
public GWDMOPT_SansNom1(boolean b)
{
super(b);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDMMENU_SansNom1.this);
super.setQuid(2787571450301418833l);

super.setNom("OPT_SansNom1");

super.setType(40001);

super.setLibelle("Option de menu");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(3);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
}
}
public GWDMOPT_SansNom1 mWD_OPT_SansNom1 = new GWDMOPT_SansNom1(true);

public void initialiserSousObjets()
{
mWD_OPT_SansNom1.initialiserObjet();
super.ajouterMenu(mWD_OPT_SansNom1);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787571450301353297l);

super.setNom("MENU_SansNom1");

super.setType(40001);

super.setTitreMenu("Menu");

super.setStyleOptionRepos(0xFF000001, 0xFF000001, creerPolice("Segoe UI", -12.000000, 0));
super.setStyleOptionSurvol(0xFF000001, 0xFF000001, creerPolice("Segoe UI", -12.000000, 0));
activerEcoute();
initialiserSousObjets();
}
public boolean isModeActionBar()
{
return true;
}
}
public GWDMMENU_SansNom1 mWD_MENU_SansNom1;



class GWDMCTXMenu extends WDMenuContextuel
{

class GWDMOption1 extends WDOptionMenu
{
public GWDMOption1(boolean b)
{
super(b);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDMCTXMenu.this);
super.setQuid(2787571450301549905l);

super.setNom("Option1");

super.setType(40001);

super.setLibelle("Option1");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(4);

super.setAffichageDansActionBar(false);

super.setIconePredefinie(-1);

activerEcoute();
}
}
public GWDMOption1 mWD_Option1 = new GWDMOption1(true);


class GWDMOption2 extends WDOptionMenu
{
public GWDMOption2(boolean b)
{
super(b);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDMCTXMenu.this);
super.setQuid(2787571450301615441l);

super.setNom("Option2");

super.setType(40001);

super.setLibelle("Option2");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(5);

super.setAffichageDansActionBar(false);

super.setIconePredefinie(-1);

activerEcoute();
}
}
public GWDMOption2 mWD_Option2 = new GWDMOption2(true);

public void initialiserSousObjets()
{
mWD_Option1.initialiserObjet();
super.ajouterMenu(mWD_Option1);
mWD_Option2.initialiserObjet();
super.ajouterMenu(mWD_Option2);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2787571450301484369l);

super.setNom("CTXMenu");

super.setType(40001);

super.setTitreMenu("");

super.setStyleOptionRepos(0xF7000000, 0xFF000001, creerPolice("Tahoma", -11.000000, 0));
super.setStyleOptionSurvol(0xF7000000, 0xFF000001, creerPolice("Tahoma", -11.000000, 0));
activerEcoute();
initialiserSousObjets();
}
public boolean isModeActionBar()
{
return false;
}
}
public GWDMCTXMenu mWD_CTXMenu;



/**
 * Traitement: Déclarations globales de FEN_Accueil
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
// Création des champs de la fenêtre FEN_Accueil
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ONG_volet = new GWDONG_volet();
mWD_MENU_SansNom1 = new GWDMMENU_SansNom1();
mWD_CTXMenu = new GWDMCTXMenu();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Accueil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2787571450300108113l);

super.setChecksum("673386897");

super.setNom("FEN_Accueil");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xF4800000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 460);

super.setTitre("FEN_Accueilutilisateur");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("D:\\SN2IR2016\\barrellon\\WindevProject\\Mes Projets Mobile\\ProjetDomotique\\Bg_MediaCenter.jpg", 3, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Accueil
////////////////////////////////////////////////////////////////////////////
mWD_ONG_volet.initialiserObjet();
super.ajouter("ONG_volet", mWD_ONG_volet);
mWD_MENU_SansNom1.initialiserObjet();
ajouterMenuContextuel(mWD_MENU_SansNom1);
mWD_CTXMenu.initialiserObjet();
ajouterMenuContextuel(mWD_CTXMenu);

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
return true;
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
return GWDPProjetDomotique.ms_Project.mWD_FEN_Accueil;
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
