# Like Hero To Zero

## Projektbeschreibung

„Like Hero To Zero“ ist eine Webanwendung zur Darstellung weltweiter CO₂-Emissionsdaten.
Das Projekt wurde im Rahmen der Fallstudie „Programmieren von industriellen Informationssystemen“ entwickelt.

Die Anwendung ermöglicht Bürger:innen den öffentlichen Zugriff auf aktuelle CO₂-Daten verschiedener Länder. Zusätzlich steht registrierten Wissenschaftler:innen ein geschützter Backend-Bereich zur Verfügung, in dem neue Datensätze ergänzt oder bestehende Daten korrigiert werden können.

---

## Funktionen

### Öffentlicher Bereich

* Anzeige weltweiter CO₂-Emissionsdaten
* Dynamische Länderauswahl
* Anzeige des aktuellsten CO₂-Wertes eines Landes
* Tabellenansicht aller Emissionsdaten
* Diagrammdarstellung der CO₂-Werte

### Wissenschaftlerbereich

* Login für Wissenschaftler:innen
* Hinzufügen neuer CO₂-Datensätze
* Korrigieren bestehender Daten
* Persistente Speicherung in relationaler Datenbank

---

## Verwendete Technologien

* Java 21
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate
* Thymeleaf
* H2-Datenbank
* Bootstrap 5
* Chart.js

---

## Softwarearchitektur

Das Projekt basiert auf dem MVC-Architekturmuster:

* **Model:** Entity-Klassen (`EmissionRecord`, `Country`)
* **View:** Thymeleaf-Templates (`index.html`, `scientist.html`, usw.)
* **Controller:** Spring Boot Controller (`HomeController`, `ScientistController`, usw.)

Die Datenhaltung erfolgt über Spring Data JPA und Hibernate.

---

## Datenquelle

Die verwendeten CO₂-Daten basieren auf öffentlich verfügbaren Datensätzen der World Bank / Rearc:

Rearc (2022). *CO2 Emissions (kt) | World Bank Open Data*.
https://aws.amazon.com/marketplace/pp/prodview-qf3r4b6jpivte

---

## Projekt starten

### Voraussetzungen

* Java 21
* Maven
* IntelliJ IDEA

### Anwendung starten

bash
mvn spring-boot:run


Danach ist die Anwendung erreichbar unter:

http://localhost:8080

---

## Autorin

Petra Gawellek

## Fallstudie

Dieses Projekt entstand im Rahmen der Hochschule/Fallstudie:

**Programmieren von industriellen Informationssystemen**
