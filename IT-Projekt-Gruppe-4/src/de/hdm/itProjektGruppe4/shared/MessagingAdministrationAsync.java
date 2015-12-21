package de.hdm.itProjektGruppe4.shared;

import java.sql.Date;
import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import de.hdm.itProjektGruppe4.shared.bo.Abonnement;
import de.hdm.itProjektGruppe4.shared.bo.Hashtag;
import de.hdm.itProjektGruppe4.shared.bo.Hashtagabonnement;
import de.hdm.itProjektGruppe4.shared.bo.Markierungsliste;
import de.hdm.itProjektGruppe4.shared.bo.Nachricht;
import de.hdm.itProjektGruppe4.shared.bo.Nutzer;
import de.hdm.itProjektGruppe4.shared.bo.Nutzerabonnement;
import de.hdm.itProjektGruppe4.shared.bo.Unterhaltung;
import de.hdm.itProjektGruppe4.shared.bo.Unterhaltungsliste;

/**
 * Das asynchrone Gegenstück des Interface {@link MessagingAdministration}. Es
 * wird semiautomatisch durch das Google Plugin erstellt und gepflegt. Daher
 * erfolgt hier keine weitere Dokumentation. Für weitere Informationen siehe das
 * synchrone Interface {@link MessagingAdministration}.
 * 
 * @author Thies
 * @author Yücel
 * @author Nguyen
 * @author Raue
 */

public interface MessagingAdministrationAsync {

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Beginn: Initialisierung
	 * ***************************************
	 * ************************************
	 */
	void init(AsyncCallback<Void> callback);

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Ende: Initialisierung
	 * *****************************************
	 * **********************************
	 */

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Beginn: Methoden für Nutzer-Objekte
	 * ***************************
	 * ************************************************
	 */

	void createNutzer(String vorname, String nachname, String email,
			String nickname, AsyncCallback<Nutzer> callback);

	void delete(Nutzer nutzer, AsyncCallback<Void> callback);

	void getNutzerById(int nutzerID, AsyncCallback<Nutzer> callback);

	void update(Nutzer nutzer, AsyncCallback<Nutzer> callback);

	void getNutzerByNickname(String nickname, AsyncCallback<Nutzer> callback);

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Ende: Methoden für Nutzer-Objekte
	 * *****************************
	 * **********************************************
	 */

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Beginn: Methoden für Nachricht-Objekte
	 * ************************
	 * ***************************************************
	 */

	void getNachrichtByID(int id, AsyncCallback<Nachricht> callback);

	void createNachricht(String text, String nickname,
			Unterhaltung unterhaltung, AsyncCallback<Nachricht> callback);

	void getAlleNachrichtenJeNutzer(Nutzer nutzer,
			AsyncCallback<ArrayList<Nachricht>> callback);

	void getAllNachrichten(AsyncCallback<ArrayList<Nachricht>> callback);

	void getNachrichtenByUnterhaltung(Unterhaltung unterhaltung,
			AsyncCallback<ArrayList<Nachricht>> callback);

	void getAlleNachrichtJeZeitraum(String von, String bis,
			AsyncCallback<ArrayList<Nachricht>> callback);

	void delete(Nachricht nachricht, AsyncCallback<Void> callback);

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Ende: Methoden für Nachricht-Objekte
	 * **************************
	 * *************************************************
	 */

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Beginn: Methoden für Unterhaltung-Objekte
	 * *********************
	 * ******************************************************
	 */

	void createUnterhaltung(Date datum, AsyncCallback<Unterhaltung> callback);

	void delete(Unterhaltung u, AsyncCallback<Void> callback);

	//void getAllUnterhaltungen(AsyncCallback<ArrayList<Unterhaltung>> callback);

	void update(Unterhaltung unterhaltung, AsyncCallback<Unterhaltung> callback);

	;

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Ende: Methoden für Unterhaltung-Objekte
	 * ***********************
	 * ****************************************************
	 */

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Beginn: Methoden für Abonnement-Objekte
	 * ***********************
	 * ****************************************************
	 */

	void getAbonnementById(int id, AsyncCallback<Abonnement> callback);

	void createAbonnement(int id, Date erstellungsZeitpunkt,
			AsyncCallback<Abonnement> callback);

	void updateAbonnement(Abonnement abonnement,
			AsyncCallback<Abonnement> callback);

	void getAllAbonnements(AsyncCallback<ArrayList<Abonnement>> callback);

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Ende: Methoden für Abonnement-Objekte
	 * *************************
	 * **************************************************
	 */

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Beginn: Methoden für Hashtag-Objekte
	 * **************************
	 * *************************************************
	 */
	void createHashtag(String bezeichnung, AsyncCallback<Hashtag> callback);

	void update(Hashtag hashtag, AsyncCallback<Hashtag> callback);

	void delete(Hashtag hashtag, AsyncCallback<Void> callback);

	void getAllHashtags(AsyncCallback<ArrayList<Hashtag>> callback);

	void getHashtagById(int id, AsyncCallback<Hashtag> callback);

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Ende: Methoden für Hashtag-Objekte
	 * ****************************
	 * ***********************************************
	 */

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Beginn: Methoden für NutzerAbo-Objekte
	 * ************************
	 * ***************************************************
	 */
	void createNutzerabonnement(Nutzer derBeobachteteId, Nutzer follower,
			AsyncCallback<Nutzerabonnement> callback);

	void delete(Nutzerabonnement nutzerAbo, AsyncCallback<Void> callback);

	void getAllNutzerabonnements(
			AsyncCallback<ArrayList<Nutzerabonnement>> callback);

	void getNutzerabonnemntById(int id, AsyncCallback<Nutzerabonnement> callback);

	void getNutzerAbonnementByNutzer(Nutzer nutzer,
			AsyncCallback<ArrayList<Nutzerabonnement>> callback);

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Ende: Methoden für NutzerAbo-Objekte
	 * **************************
	 * *************************************************
	 */

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Beginn: Methoden für HashtagAbo-Objekte
	 * ***********************
	 * ****************************************************
	 */

	void createHashtagAbonnement(Hashtag bezeichnung,
			AsyncCallback<Hashtagabonnement> callback);

	void delete(Hashtagabonnement hashtagAbo, AsyncCallback<Void> callback);

	void getHashtagAboById(int id, AsyncCallback<Hashtagabonnement> callback);

	void getHashtagabonnementByNutzer(int id,
			AsyncCallback<ArrayList<Hashtagabonnement>> callback);

	void getAllHashtagabonnements(int id,
			AsyncCallback<ArrayList<Hashtagabonnement>> callback);

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Ende: Methoden für HashtagAbo-Objekte
	 * *************************
	 * **************************************************
	 */

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Beginn: Methoden für Markierungsliste-Objekte
	 * *****************
	 * **********************************************************
	 */

	void getAllNutzer(AsyncCallback<ArrayList<Nutzer>> callback);

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Ende: Methoden für Markierungsliste-Objekte
	 * *******************
	 * ********************************************************
	 */

	void createMarkierungsliste(String text, String hashtag,
			AsyncCallback<Markierungsliste> callback);

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Beginn: Methoden für Unterhaltungssliste-Objekte
	 * **************
	 * *************************************************************
	 */

	void getByEmpfaenger(Nutzer nutzer,
			AsyncCallback<Unterhaltungsliste> callback);

	void createUnterhaltungsliste(Unterhaltung u, String sender, String empf,
			AsyncCallback<Unterhaltungsliste> callback);

	void getByUnterhaltung(Unterhaltung unterhaltung,
			AsyncCallback<Unterhaltungsliste> callback);

	void getByAbsender(Nutzer nutzer, AsyncCallback<Unterhaltungsliste> callback);

	/*
	 * ***************************************************************************
	 * ABSCHNITT, Ende: Methoden für Unterhaltungssliste-Objekte
	 * ****************
	 * ***********************************************************
	 */

}