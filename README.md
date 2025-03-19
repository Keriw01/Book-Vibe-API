# Book Vibe

## Wymagania wstępne

Aby uruchomić projekt, upewnij się, że masz zainstalowane następujące narzędzia:

1. **Java Development Kit (JDK)** - Wersja 17 lub nowsza (Spring Boot 3.x wymaga JDK 17+).
   - Pobierz z [oficjalnej strony Oracle](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) lub użyj OpenJDK.
2. **Maven** - Narzędzie do zarządzania zależnościami (zwykle wbudowane w projekt, ale możesz zainstalować je ręcznie).
   - Pobierz z [oficjalnej strony Maven](https://maven.apache.org/download.cgi).
3. **Visual Studio Code** - Edytor kodu.
   - Pobierz z [oficjalnej strony VS Code](https://code.visualstudio.com/).
4. **Rozszerzenia VS Code**:
   - **Java Extension Pack** - Zawiera zestaw narzędzi do pracy z Javą (np. IntelliSense, debugowanie).
   - **Spring Boot Extension Pack** - Dodaje wsparcie dla Spring Boot (np. podgląd konfiguracji, uruchamianie).

## Kroki do uruchomienia projektu

### 1. Sklonuj repozytorium
Sklonuj projekt za pomocą Git:
```bash
git clone <URL_REPOZYTORIUM>
```

### 2. Otwórz projekt w Visual Studio Code

### 3. Zainstaluj zależności
Projekt używa Mavena, więc otwórz terminal w VS Code (`Terminal > New Terminal`) i wykonaj:
```bash
mvn clean install
```
To pobierze wszystkie zależności określone w pliku `pom.xml`.

### 4. Skonfiguruj środowisko
Upewnij się, że zmienna środowiskowa `JAVA_HOME` jest ustawiona na katalog instalacyjny JDK. W terminalu możesz sprawdzić to poleceniem:
- Windows: `echo %JAVA_HOME%`
- Linux/Mac: `echo $JAVA_HOME`

Jeśli nie jest ustawiona, dodaj ją ręcznie w ustawieniach systemowych.

### 5. Uruchom aplikację
W VS Code możesz uruchomić projekt na kilka sposobów:
- **Z terminalu**: W folderze projektu wpisz:
  ```bash
  mvn spring-boot:run
  ```
- **Z poziomu kodu**: 
  1. Otwórz plik główny aplikacji (np. `src/main/java/com/example/demo/DemoApplication.java`).
  2. Kliknij prawym przyciskiem myszy i wybierz `Run Java` lub użyj przycisku "Run" (zielony trójkąt) w górnym rogu.

### 6. Sprawdź działanie
Po uruchomieniu aplikacja domyślnie działa na porcie `8080`.
Endpointy, można przetestować za pomocą Postmana. http://localhost:8080/api/books

## Dodatkowe informacje
- Wersja Java: 21.0.6
- Wersja Maven: 3.9.9
- Wersja Spring Boot: 3.4.3