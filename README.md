## CRYPTO Jackpot - App
### Vielen Dank für die Bilder an:  <a href="https://de.freepik.com/search?format=search&last_filter=query&last_value=google&query=google&type=icon">Icon von Freepik</a>
### Dies ist eine Übungs App, in der ich mein erlerntes Wissen verfestigen möchte und mich an neuen Herausforderungen versuchen werde... Ich Werde viewBinding nutzen und versuchen nach der MVVM Architketur zu Programmieren und so gut wie möglich mein vorgehen Komentieren.

### Viel Spaß! 🤓

## MVVM - Architektur, Paketstruktur:
### ui: Enthält alle Aktivitäten und Fragmente
    * splash: Für den Splash-Screen.
    * login: Für den Login-Screen.
    * register: Für den Register-Screen.
    * viewmodel: Beherbergt alle ViewModels.
    * model: Für Datenmodelle und Datenquellen.
    * repository: Enthält den Datenzugriffscode und die Geschäftslogik.

### Implementierung, UI:
    * SplashScreen: Eine SplashActivity sollte im ui.splash Paket erstellt werden. Diese Aktivität zeigt den Splash-Screen und navigiert dann zur Hauptaktivität.
    * LoginFragment: Ein Fragment sollte im ui.login Paket erstellt werden, das die Login-Oberfläche anzeigt.
    * RegisterFragment: Ein Fragment sollte im ui.register Paket erstellt werden, das die Registrierungsoberfläche anzeigt.

### ViewModel:
    * LoginViewModel: Ein ViewModel sollte im viewmodel Paket erstellt werden. Dieses ViewModel enthält die Logik für den Login-Prozess.
    * RegisterViewModel: Ein ViewModel sollte im viewmodel Paket erstellt werden. Dieses ViewModel enthält die Logik für den Registrierungsprozess.

### Model:
    * User: Ein Datenmodell sollte im model Paket erstellt werden. Dieses Modell repräsentiert einen Benutzer mit Attributen wie E-Mail, Passwort usw.
    
### Repository:
    * UserRepository: Ein Repository sollte im repository Paket erstellt werden. Dieses Repository enthält Methoden zum Abrufen und Speichern von Benutzerdaten. In einer echten App würden hier Datenbankzugriffe oder API-Aufrufe implementiert.

### Datenfluss:
    * Die Fragmente (LoginFragment und RegisterFragment) sollten mit ihren jeweiligen ViewModels (LoginViewModel und RegisterViewModel) kommunizieren.
    * Die ViewModels sollten das UserRepository verwenden, um Daten abzurufen oder zu speichern.
    * Das UserRepository ist verantwortlich für den tatsächlichen Datenzugriff, sei es aus einer Datenbank, einer API oder einer anderen Datenquelle.

### ViewBinding:
    * ViewBinding sollte in den Aktivitäten und Fragmenten verwendet werden, um auf die UI-Elemente zuzugreifen. Dies ersetzt die herkömmliche findViewById Methode und bietet eine sicherere und effizientere Möglichkeit, auf die UI-Elemente zuzugreifen.

### LiveData:
    * LiveData sollte in den ViewModels verwendet werden, um Datenänderungen zu beobachten. Dies ermöglicht eine reaktive Benutzeroberfläche, die sich automatisch aktualisiert, wenn sich die zugrunde liegenden Daten ändern.

## Los gehts, Vorgehensweise:
### 1. viewBinding aktiviert

### 2. SplashScreen definieren und als Einstiegspunkt festlegen

        * SplashActivity als Startpunkt festlegen, im Androidmanifest den intent Filter vom MainActivity Abschnitt in den SplashActivity Abschnitt verschieben
        * Von der SplashActivity zur MainActivity navigieren, in der SplashActivity einen Handler hinzufügen um nach einer kurzen Verzögerung zur MainActivity zu navigieren
        * MainActivity als Host für Fragmente, einen FragmentContainerView hinzuzufügen, der als Host für die Fragmente dient
        * In der MainActivity, wird der LoginFragment zum FragmentContainerView hinzugefügt, wenn die Activity zum ersten Mal erstellt wird

### Mit diesen Schritten wird beim Start der App zuerst der SplashActivity angezeigt, der nach einer kurzen Verzögerung zur MainActivity navigiert, die dann den LoginFragment anzeigt.

### 3.  Login und Register Fragmente und die dazugehörigen Layouts definieren und dann die Navigation in den Fragmenten implementieren

        * fragment_login.xml definieren und in der kt die Logik zum Anmelden/Registrieren, Passwort eingabe, Email Benutzername , etc...

### 4. build.gradle (Module: app) Datei, Abhängigkeiten hinzufügen:

        * navigation fragment und ui

### 5. nav_graph in res/ erstellen

        * hier werden die aktionen zwischen den Fragmenten ertsellt

### 6. activity_main.xml und .kt aktualisieren:

        * app:navGraph="@navigation/nav_graph" in den FragmentContainerView einfügen
        * android:name="androidx.navigation.fragment.NavHostFragment"
        * den Code der das LoginFragment manuel hinzufügt entfernen, da der NavHostFragment dies bereits tut

### 7. Navigation in LoginFragment Implementieren :

        * variable vom navController erstellen
        * setOnClickListener auf die Buttons setzen 

### 8. Navigation in RegisterFragment Implementieren :

        * variable vom navController erstellen
        * setOnClickListener auf die Buttons setzen  

### 9. Welcome Fragment erstellen, Layout und Logik

        * Navigation aktualisieren, im nav_graph.xml die aktionen zwischen den Fragmenten festlegen

### 10. Theme der App und Tag/Nacht- Modus implementieren (ich werde zu Übungszwecken zwei Themes setzen, um dann zwischen Ihnen zu wechseln)

        * in der Colors.xml die Farben definieren
        * in Styles.xml das App-Theme anpassen
        * in res/values neue colors-night.xml Datei erstellen, hier werden die Farben für den Nachtmodus definiert
        * im Androidmanifest.xml die AppTheme Datei verwenden
        * um die separate Themes zu setzen, in Styles.xml die seperaten Themes definieren

### 11. Theme in der App wechseln

        * Um das Theme zu wechseln, verwendet man die setTheme() Methode vor dem setContentView() Aufruf in der MainActivity 
        * Die setTheme() Methode kann verwendet werden um dynamisch zwischen den verschiedenen Themes zu wechseln

### 12. 

        * 

### 13. 

        * 

### 14. 

        * 

### 15. 

        * 

### 16. 

        * 

### 17. 

        * 