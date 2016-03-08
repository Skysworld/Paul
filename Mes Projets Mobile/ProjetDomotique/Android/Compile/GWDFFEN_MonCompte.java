/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Fenêtre
 * Classe Android : FEN_MonCompte
 * Date : 08/03/2016 11:24:32
 * Version de wdjava.dll  : 20.0.139.0
 */


package com.masociete.projetdomotique.wdgen;


import com.masociete.projetdomotique.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.action.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_MonCompte extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_MonCompte
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Modifier_mot_de_passe
 */
class GWDBTN_Modifier_mot_de_passe extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_MonCompte.BTN_Modifier_mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800858777822589772l);

super.setChecksum("755310756");

super.setNom("BTN_Modifier_mot_de_passe");

super.setType(4);

super.setLibelle("Modifier mot de passe");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(82, 376);

super.setTailleInitiale(160, 76);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(3);

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
 * Traitement: Clic sur BTN_Modifier_mot_de_passe
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

WDActionPredefinie.executeActionPredefinie(3, new WDObjet[]{(new WDChaineU("FEN_MotDePasse"))});
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
public GWDBTN_Modifier_mot_de_passe mWD_BTN_Modifier_mot_de_passe;

/**
 * LIB_Nom_du_compte
 */
class GWDLIB_Nom_du_compte extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_MonCompte.LIB_Nom_du_compte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800858941033940489l);

super.setChecksum("757903807");

super.setNom("LIB_Nom_du_compte");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Nom du compte");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(12, 102);

super.setTailleInitiale(172, 30);

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
public GWDLIB_Nom_du_compte mWD_LIB_Nom_du_compte;

/**
 * LIB_Mon_compte
 */
class GWDLIB_Mon_compte extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_MonCompte.LIB_Mon_compte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800859048408410134l);

super.setChecksum("758191077");

super.setNom("LIB_Mon_compte");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Mon compte");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(43, 15);

super.setTailleInitiale(252, 67);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

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
public GWDLIB_Mon_compte mWD_LIB_Mon_compte;

/**
 * LIB_Nombre_de_prises_lié
 */
class GWDLIB_Nombre_de_prises_lie extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_MonCompte.LIB_Nombre_de_prises_lié
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800859177258377031l);

super.setChecksum("759139124");

super.setNom("LIB_Nombre_de_prises_lié");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Nombre de prises lié au compte");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(12, 170);

super.setTailleInitiale(187, 66);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

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
public GWDLIB_Nombre_de_prises_lie mWD_LIB_Nombre_de_prises_lie;

/**
 * BTN_Historique
 */
class GWDBTN_Historique extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_MonCompte.BTN_Historique
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2800860418511554864l);

super.setChecksum("766769158");

super.setNom("BTN_Historique");

super.setType(4);

super.setLibelle("Historique");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(82, 292);

super.setTailleInitiale(160, 49);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(3);

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
 * Traitement: Clic sur BTN_Historique
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

WDActionPredefinie.executeActionPredefinie(3, new WDObjet[]{(new WDChaineU("FEN_Historique"))});
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
public GWDBTN_Historique mWD_BTN_Historique;

/**
 * Traitement: Déclarations globales de FEN_MonCompte
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
// Création des champs de la fenêtre FEN_MonCompte
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Modifier_mot_de_passe = new GWDBTN_Modifier_mot_de_passe();
mWD_LIB_Nom_du_compte = new GWDLIB_Nom_du_compte();
mWD_LIB_Mon_compte = new GWDLIB_Mon_compte();
mWD_LIB_Nombre_de_prises_lie = new GWDLIB_Nombre_de_prises_lie();
mWD_BTN_Historique = new GWDBTN_Historique();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_MonCompte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2800856651813086637l);

super.setChecksum("760016831");

super.setNom("FEN_MonCompte");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xF4800000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 508);

super.setTitre("MonCompte");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("D:\\SN2IR2016\\barrellon\\WindevProject\\Mes Projets Mobile\\ProjetDomotique\\Bg_MediaCenter.jpg", 3, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_MonCompte
////////////////////////////////////////////////////////////////////////////
mWD_BTN_Modifier_mot_de_passe.initialiserObjet();
super.ajouter("BTN_Modifier_mot_de_passe", mWD_BTN_Modifier_mot_de_passe);
mWD_LIB_Nom_du_compte.initialiserObjet();
super.ajouter("LIB_Nom_du_compte", mWD_LIB_Nom_du_compte);
mWD_LIB_Mon_compte.initialiserObjet();
super.ajouter("LIB_Mon_compte", mWD_LIB_Mon_compte);
mWD_LIB_Nombre_de_prises_lie.initialiserObjet();
super.ajouter("LIB_Nombre_de_prises_lié", mWD_LIB_Nombre_de_prises_lie);
mWD_BTN_Historique.initialiserObjet();
super.ajouter("BTN_Historique", mWD_BTN_Historique);

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
return GWDPProjetDomotique.ms_Project.mWD_FEN_MonCompte;
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
