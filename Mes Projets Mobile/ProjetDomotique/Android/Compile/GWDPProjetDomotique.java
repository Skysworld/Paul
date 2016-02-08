/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Projet
 * Classe Android : ProjetDomotique
 * Date : 05/02/2016 08:18:34
 * Version de wdjava.dll  : 20.0.139.0
 */


package com.masociete.projetdomotique.wdgen;


import com.masociete.projetdomotique.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
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

 // FEN_Connection
public GWDFFEN_Connection mWD_FEN_Connection = new GWDFFEN_Connection();
 // accesseur de FEN_Connection
public GWDFFEN_Connection getFEN_Connection()
{
mWD_FEN_Connection.verifierOuverte();
return mWD_FEN_Connection;
}

 // FEN_Accueil
public GWDFFEN_Accueil mWD_FEN_Accueil = new GWDFFEN_Accueil();
 // accesseur de FEN_Accueil
public GWDFFEN_Accueil getFEN_Accueil()
{
mWD_FEN_Accueil.verifierOuverte();
return mWD_FEN_Accueil;
}

 // FEN_Test
public GWDFFEN_Test mWD_FEN_Test = new GWDFFEN_Test();
 // accesseur de FEN_Test
public GWDFFEN_Test getFEN_Test()
{
mWD_FEN_Test.verifierOuverte();
return mWD_FEN_Test;
}


 // Constructeur de la classe GWDPProjetDomotique
public GWDPProjetDomotique()
{
ajouterFenetre("FEN_Connection", mWD_FEN_Connection);
ajouterFenetre("FEN_Accueil", mWD_FEN_Accueil);
ajouterFenetre("FEN_Test", mWD_FEN_Test);

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
public String getVersionApplication(){ return "0.0.18.0";}
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
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\BG_MEDIACENTER.JPG",com.masociete.projetdomotique.R.drawable.bg_mediacenter_2, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\BTN_MEDIACENTER_ANIM.GIF?E5_A5_2NP",com.masociete.projetdomotique.R.drawable.btn_mediacenter_anim_3_np2_selector_anim, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\BTN_MEDIACENTER_ANIM.GIF?E5_A5_2NP",com.masociete.projetdomotique.R.drawable.btn_mediacenter_anim_3_np2_selector_anim, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\COMBO_MEDIACENTER.GIF?E5_3NP_6_6_6_6",com.masociete.projetdomotique.R.drawable.combo_mediacenter_4_np3_6_6_6_6_selector, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\TAB_MEDIACENTER.GIF?E2_Tabs_1NP",com.masociete.projetdomotique.R.drawable.tab_mediacenter_5_np1_selector, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\BTN_STD_OK.GIF?E5",com.masociete.projetdomotique.R.drawable.btn_std_ok_6_selector, "");
super.ajouterFichierAssocie("D:\\SN2IR2016\\BARRELLON\\WINDEVPROJECT\\MES PROJETS MOBILE\\PROJETDOMOTIQUE\\SAISIE_MEDIACENTER.GIF?E5_3NP_2_4_2_2",com.masociete.projetdomotique.R.drawable.saisie_mediacenter_7_np3_2_4_2_2_selector, "");
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

GWDPProjetDomotique.ms_Project.lancerProjet("FEN_Connection");
}
}
}
