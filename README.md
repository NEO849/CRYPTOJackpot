## CRYPTO Jackpot - App 
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

### 2. 

        * 

### 3.

        * 

### 4.

        * 

### 5.

        * 

### 6.

        * 

### 7.

        * 

### 8.

        * 

### 9.

        * 

### 10.

        * 