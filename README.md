# Like Hero To Zero

## Projektbeschreibung

„Like Hero To Zero“ ist eine Webanwendung zur Darstellung von weltweiten CO₂-Emissionsdaten.
Das Projekt wurde im Rahmen der Fallstudie „Programmieren von industriellen Informationssystemen“ für den Bachelorstudiengang Wirtschaftsinformatik entwickelt.

Die Anwendung ermöglicht Bürger und Bürgerinnen den öffentlichen Zugriff auf die aktuellen CO₂-Daten verschiedener Länder. Zusätzlich steht für registrierte Wissenschaftler und Wissenschaftlerinnen ein geschützter Bereich zur Verfügung, in dem neue Datensätze ergänzt werden können.

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

* **Model:**
  Entity-Klassen (`EmissionRecord`, `Country`)
* **View:**
  Thymeleaf-Templates (`index.html`, `scientist.html`, usw.)
* **Controller:**
  Spring Boot Controller (`HomeController`, `ScientistController`, usw.)

Die Datenhaltung erfolgt über Spring Data JPA und Hibernate.

---

## Datenquelle

Die verwendeten CO₂-Daten basieren auf öffentlich verfügbaren Datensätzen der World Bank und wurden als Verlinkung zur Verfügung gestellt:

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

Dieses Projekt entstand im Rahmen der IU-Hochschule / Fallstudie:

**Programmieren von industriellen Informationssystemen**
