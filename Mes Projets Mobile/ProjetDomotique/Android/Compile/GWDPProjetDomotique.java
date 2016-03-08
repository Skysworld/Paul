/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Projet
 * Classe Android : ProjetDomotique
 * Date : 08/03/2016 11:24:32
 * Version de wdjava.dll  : 20.0.139.0
 */


package com.masociete.projetdomotique.wdgen;


import com.masociete.projetdomotique.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ws.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPProjetDomotique extends WDProjet
{
/**
 * Accès au projet: ProjetDomotique
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPProjetDomotique.ms_Project
 */
public static GWDPProjetDomotique ms_Project;

 // FEN_Horodateur5
public GWDFFEN_Horodateur5 mWD_FEN_Horodateur5 = new GWDFFEN_Horodateur5();
 // accesseur de FEN_Horodateur5
public GWDFFEN_Horodateur5 getFEN_Horodateur5()
{
mWD_FEN_Horodateur5.verifierOuverte();
return mWD_FEN_Horodateur5;
}

 // FEN_Utilisateur
public GWDFFEN_Utilisateur mWD_FEN_Utilisateur = new GWDFFEN_Utilisateur();
 // accesseur de FEN_Utilisateur
public GWDFFEN_Utilisateur getFEN_Utilisateur()
{
mWD_FEN_Utilisateur.verifierOuverte();
return mWD_FEN_Utilisateur;
}

 // FEN_connexion
public GWDFFEN_connexion mWD_FEN_connexion = new GWDFFEN_connexion();
 // accesseur de FEN_connexion
public GWDFFEN_connexion getFEN_connexion()
{
mWD_FEN_connexion.verifierOuverte();
return mWD_FEN_connexion;
}

 // FEN_Horodateur4
public GWDFFEN_Horodateur4 mWD_FEN_Horodateur4 = new GWDFFEN_Horodateur4();
 // accesseur de FEN_Horodateur4
public GWDFFEN_Horodateur4 getFEN_Horodateur4()
{
mWD_FEN_Horodateur4.verifierOuverte();
return mWD_FEN_Horodateur4;
}

 // FEN_Horodateur3
public GWDFFEN_Horodateur3 mWD_FEN_Horodateur3 = new GWDFFEN_Horodateur3();
 // accesseur de FEN_Horodateur3
public GWDFFEN_Horodateur3 getFEN_Horodateur3()
{
mWD_FEN_Horodateur3.verifierOuverte();
return mWD_FEN_Horodateur3;
}

 // FEN_Horodateur2
public GWDFFEN_Horodateur2 mWD_FEN_Horodateur2 = new GWDFFEN_Horodateur2();
 // accesseur de FEN_Horodateur2
public GWDFFEN_Horodateur2 getFEN_Horodateur2()
{
mWD_FEN_Horodateur2.verifierOuverte();
return mWD_FEN_Horodateur2;
}

 // FEN_Horodateur1
public GWDFFEN_Horodateur1 mWD_FEN_Horodateur1 = new GWDFFEN_Horodateur1();
 // accesseur de FEN_Horodateur1
public GWDFFEN_Horodateur1 getFEN_Horodateur1()
{
mWD_FEN_Horodateur1.verifierOuverte();
return mWD_FEN_Horodateur1;
}

 // FEN_MonCompte
public GWDFFEN_MonCompte mWD_FEN_MonCompte = new GWDFFEN_MonCompte();
 // accesseur de FEN_MonCompte
public GWDFFEN_MonCompte getFEN_MonCompte()
{
mWD_FEN_MonCompte.verifierOuverte();
return mWD_FEN_MonCompte;
}

 // FEN_MotDePasse
public GWDFFEN_MotDePasse mWD_FEN_MotDePasse = new GWDFFEN_MotDePasse();
 // accesseur de FEN_MotDePasse
public GWDFFEN_MotDePasse getFEN_MotDePasse()
{
mWD_FEN_MotDePasse.verifierOuverte();
return mWD_FEN_MotDePasse;
}

 // FEN_Historique
public GWDFFEN_Historique mWD_FEN_Historique = new GWDFFEN_Historique();
 // accesseur de FEN_Historique
public GWDFFEN_Historique getFEN_Historique()
{
mWD_FEN_Historique.verifierOuverte();
return mWD_FEN_Historique;
}


 // Constructeur de la classe GWDPProjetDomotique
public GWDPProjetDomotique()
{
ajouterFenetre("FEN_Horodateur5", mWD_FEN_Horodateur5);
ajouterFenetre("FEN_Utilisateur", mWD_FEN_Utilisateur);
ajouterFenetre("FEN_connexion", mWD_FEN_connexion);
ajouterFenetre("FEN_Horodateur4", mWD_FEN_Horodateur4);
ajouterFenetre("FEN_Horodateur3", mWD_FEN_Horodateur3);
ajouterFenetre("FEN_Horodateur2", mWD_FEN_Horodateur2);
ajouterFenetre("FEN_Horodateur1", mWD_FEN_Horodateur1);
ajouterFenetre("FEN_MonCompte", mWD_FEN_MonCompte);
ajouterFenetre("FEN_MotDePasse", mWD_FEN_MotDePasse);
ajouterFenetre("FEN_Historique", mWD_FEN_Historique);

// Exportation des WebServices
WDWSManager.declarerWebService("GetServerService", "C:\\Users\\barrellonp\\Downloads\\array2 (1).wsdl");
}


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static
{
// Allocation de l'objet global
GWDPProjetDomotique.ms_Project = new GWDPProjetDomotique();

// Définition des langues du projet
GWDPProjetDomotique.ms_Project.setLangueProjet(new int[] {1}, new int[] {0}, 1);
GWDPProjetDomotique.ms_Project.setNomAnalyseProjet("projetdomotique");
GWDPProjetDomotique.ms_Project.setModeGestionFichier(true);
GWDPProjetDomotique.ms_Project.setCreationAutomatiqueFichierDonnees(true);
GWDPProjetDomotique.ms_Project.setNomCollectionProcedure(new String[]{});
}
public String getVersionApplication(){ return "0.0.24.0";}
public String getNomAPK(){ return "Application Android1";}
public int getIdNomApplication(){return com.masociete.projetdomotique.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.projetdomotique";}
public int getIdIconeApplication(){ return com.masociete.projetdomotique.R.drawable.i_c_o_n_e________1;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 240;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 533;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return false;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\SAISIE_MEDIACENTER.GIF?E5_3NP_2_4_2_2",com.masociete.projetdomotique.R.drawable.saisie_mediacenter_8_np3_2_4_2_2_selector, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\BTN_STD_OK.GIF?E5",com.masociete.projetdomotique.R.drawable.btn_std_ok_7_selector, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\TAB_MEDIACENTER.GIF?E2_Tabs_1NP",com.masociete.projetdomotique.R.drawable.tab_mediacenter_6_np1_selector, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\COMBO_MEDIACENTER.GIF?E5_3NP_6_6_6_6",com.masociete.projetdomotique.R.drawable.combo_mediacenter_5_np3_6_6_6_6_selector, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\BTN_MEDIACENTER_ANIM.GIF?E5_A5_2NP",com.masociete.projetdomotique.R.drawable.btn_mediacenter_anim_4_np2_selector_anim, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\BTN_MEDIACENTER_ANIM.GIF?E5_A5_2NP",com.masociete.projetdomotique.R.drawable.btn_mediacenter_anim_4_np2_selector_anim, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\BG_MEDIACENTER.JPG",com.masociete.projetdomotique.R.drawable.bg_mediacenter_3, "");
super.ajouterFichierAssocie("C:\\Users\\barrellonp\\Downloads\\array2 (1).wsdl",com.masociete.projetdomotique.R.raw.array2__1__2, "");
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////


/**
 * Appel des méthodes d'initialisation des classes / collections de procédures / projet
 */
static void GWDPProjetDomotique_InitProjet( String [] args)
{
GWDPProjetDomotique.ms_Project.initialiserProjet("ProjetDomotique", "Application Android1", args);
}

/**
 * Appel des méthodes de terminaison des projet / collections de procédures / classes
 */
static protected void GWDPProjetDomotique_TermineProjet()
{

// Terminaison des collections de procédures et des classes

// Libération de l'objet global
GWDPProjetDomotique.ms_Project = null;
}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public void init()
{
// Appel des méthodes d'initialisation
GWDPProjetDomotique_InitProjet(null);
}
public void run()
{

GWDPProjetDomotique.ms_Project.lancerProjet("FEN_connexion");
}
}
}
