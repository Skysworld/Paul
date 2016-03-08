/**
 * Code généré par WinDev Mobile - NE PAS MODIFIER !
 * Objet WinDev Mobile : Splash Screen
 * Classe Android : ProjetDomotique
 * Date : 08/03/2016 11:24:32
 * Version de wdjava.dll  : 20.0.139.0
 */


package com.masociete.projetdomotique.wdgen;


import com.masociete.projetdomotique.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.style.degrade.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class WDSplashScreenGen implements IWDSplashScreen
{
public int getIdImageFond(){return 0;}
public int getModeAffichageImageFond(){return 0;}
public int getIdNomApplication(){return com.masociete.projetdomotique.R.string.splashscreen_title;}
public int getIdInfoVersion(){return com.masociete.projetdomotique.R.string.splashscreen_version;}
public int getIdLogo(){return 0;}
public boolean isAvecAnimationChargement(){return true;}
public int getIdMessageChargement(){return com.masociete.projetdomotique.R.string.splashscreen_message;}
public int getCouleurLibelle(){return 0x656565;}
public int getCouleurFond(){return 0;}
public IWDDegrade getFondDegrade(){return WDDegradeFactory.creerDegrade_GEN(new int[]{0xB4B4B4, 0xFFFFFF, 0xB4B4B4}, 90, new int[]{50});}
}
