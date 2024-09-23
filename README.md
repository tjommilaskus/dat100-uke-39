# dat100-uke-39 Tjommilaskus

## DAT100: Java Programmering 5 - Uke 39

## Grunnleggende oppgaver

Koden i oppgavene nedenfor skrives inn i klasse `G` med en `main`-metode som vist nedenfor.

```java
public class OppgaveG {

	public static void main(String[] args) {

    // TODO - legg til tabeller og metodekall her

	}

  // TODO - legg til deklarasjon av metoder her

}
```

Som del av oppgaven bør du videre teste at koden og metodene som implementeres fungerer. Dette kan eksempelvis gjøres ved å skrive ut verdien i konsoll-vinduet.

### Oppgave G1: Tabeller

#### a)

Legg inn en tabell med heltal `int[] tabell = {1, 3, 4, 7, 9, 10}` i main-metoden.

#### b)

Legg til kode i main-metoden som skriver ut innholdet/verdien som står på posisjon `2` i tabellen (riktig svar er 4).

#### c)

Legg til kode i main-metoden som endrer innholdet som er lagret på posisjon 2 fra verdien 4 til verdien 7.

#### d)

Legg til kode i main-metoden som skriver ut innholdet av tabellen ved bruk av en for-løkke med indeks.

#### e)

Flyt koden fra d) ut i en egen metode `public static void skrivUt(int[] tab) ` som kan skrive ut innholdet av en tabell. Kall `skrivUt`-metoden fra main-metoden.

#### f)

Modifiser metoden fra e) slik den bruker en utvidet for-løkke.

#### g)

Skriv en metode `public static void finnes(int[] tabell, int tall)` som returnerer `true` om `tall` finnes i tabellen og `false` ellers. Bruk en while-løkke.

#### h)

Skriv en metode `public static int[] skiftfortegn (int[] tabell)` som returnerer en ny tabell som er identisk med tabellen gitt med som parameteren med hvor alle verdier har fått endret fortegn.

### Oppgave G2: Flerdimensjonale tabeller

Koden i oppgavene nedenfor skrives inn i klasse `G` med en `main`-metode som vist nedenfor.

```java
public class OppgaveG {

	public static void main(String[] args) {

    double[][] obs = {
    				{1.4,1.7,1.9,2.0},
    				{5.4,7.8,9.8,7.9,3.0},
    				{-1.7,-1.7,-2.8}
    		};

    // TODO - legg til metodekall her

	}

  // TODO - legg til deklarasjon av metoder her

}
```
Som del av oppgaven bør du videre teste at koden og metodene som implementeres fungerer. Dette kan eksempelvis gjøres ved å skrive ut verdien i konsollen.

#### a)

Legg til en metode `public static void skrivUt(double[][] tabell)` som gitt en 2-dimensjonel tabellen av heltal skriver ut tabellen. Bruk metoden til å skrive ut tabellen `obs`. Prøv å implementere metoden både ved å bruke nøstete vanlige for-løkker med index og ved en bruke nøstede utvidede for-løkker.

#### b)

Legg til kode i main-metoden som skriver ut `obs.length` - forklar hvor det som skrives ut har verdien `3`.

#### c)  

Legg til kode i main-metoden som skriver ut `obs[0].length`, `obs[1].length` og `obs[2].length` - forklar resultatet som skrives ut.

#### d)

Legg til en metode `public static boolean finnes(double[][] obs, double limit)` som avgjør om der finnes en observation i tabellen som er større end `limit`.

#### e)

Skriv koden som bytter om på raden på index 0 og raden på index 2 i tabellen. Dvs. den nye tabellen blir:

```java
    {
        {-1.7,-1.7,-2.8},
        {5.4,7.8,9.8,7.9,3.0},
        {1.4,1.7,1.9,2.0}
    };
```

**Hint:** husk at en 2-dimensjonell tabell er pekere til en tabell (i dette tilfelle en tabell av flyttall). Ombytting kan gjøres med to tildelingssetninger. Bruk `skrivUt`-metoden til å sjekke at ombyttingen er gjort korrekt.

### Oppgave G3: Metoder og løkker

Se på programmet nedenfor som leser inn to tall (en høyde og en bredde) og beregner areal via metoden `private static int areal(int bredde, int hoyde)`

```java

public class InputAreal {

	public static void main(String[] args) {

		String breddeStr = showInputDialog("Bredde:");
		int bredde = parseInt(breddeStr);

		String hoydeStr = showInputDialog("Høyde:");
		int hoyde = parseInt(hoydeStr);

		int a = areal(bredde,hoyde);

		showMessageDialog(null,"Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}

```

##### a)

Utvid klassen ovenfor med en metode `private static int lesInnTall(String message)` som leser inn et tall via `showInputDialog` og returner heltallverdien. Parameteren `message` er den tekst som skal vises i dialogboksen.

##### b)

Modifiser main-metoden i programmet ovenfor slik den bruker metoden fra a) til å lese inn høyde og bredde.

##### c)

Utvid metoden `lesInnTall` fra a) slik metoden fortsetter med å lese inn et tall inntil tallet er positivt. **Hint:** bruk en do-while løkke.

### Oppgave G3: Repetisjonsløkke og matematiske funksjoner

Ved å bruke Math-klassen får du tilgang til matematiske funksjoner som sinus og cosinus ved å bruke `Math.sin(x)` og `Math.cos(x)` i koden. Når du f.eks. skal regne ut verdien `y = sin(x)`, må *x* være i *radianer*.

Omregning mellom grader og radianer gjør du ved formelen:

vinkel i radianer = (π * vinkel i grader) / 180

Verdien π finst i Math-klassen som konstanten `Math.PI`.

Alternativ kan du bruke en innebygd metode i Math-klassen for dette. Se dokumentasjonen for Math-klassen (http://docs.oracle.com/javase/8/docs/api/index.html) for å finne metoden for omregning mellom grader og radianer.

Lag en enkel klasse der du i main-metoden skriver ut en tabell over sinus og cosinus til alle vinkler mellom 0 og 180 grader, i steg på 15 grader.

Utskriften kan f. eks. se slik ut:

```
  x i grader  x i radianer    sin(x)    cos(x)
------------------------------------------------
           0         0.000     0.000     1.000
          15         0.262     0.259     0.966

          ..            ..        ..        ..

         180         3.142     0.000    -1.000
------------------------------------------------
```

Prøv å løse oppgaven både ved å bruke en for-løkke og etterfølgende ved å bruke en while-løkke.

## Basisoppgaver

### Oppgave B1 - Tabeller og decimaltall

Du skal lage et program for å lese inn temperaturen i Bergen for et bestemt klokkeslett for alle dager i en bestemt uke (dvs. 7 temperaturer).

**Temperaturer skal lagres i en tabell**.

Programmet skal videre finne og skrive ut gjennomsnittet av disse verdiene og den høyeste temperaturen for hele uken.

Skjermdialogen kan se ut som eksempelet nedenfor:

```
Analyse av temperaturer
***********************     
Skriv inn temperaturene:
1. dag: 22.2
2. dag: 21.5
3. dag: 26.5
..
7. dag: 18.3

Gjennomsnittstemperaturen var 22.1
Maksimum for denne uken var 26.5 grader
```

### Oppgave B2 - Auditorie

Se på eksemplet som blev gjennomgått på forelesningen om flerdimensjonale tabeller der en to-dimensjonal tabell blev brukt til å representere ledige plasser i et auditorie:

https://github.com/dat100hib/dat100public/blob/master/undervisning/U10FlerDimTabeller/src/no/hvl/dat100/eksempler/Auditorium.java

##### a)

Skriv kode som teller sammen hvor mange ledige plasser som er i auditoriet

##### b)

Skriv kode som finner og skriver ut hvor stor en prosentdel av plassene som er opptatt. Metoden skal virke generelt uavhengig av antall rad og antall plasser på hver rad.

##### c)

Skriv kode som finner og skriver første ledige plass (rad og posisjon). Prøv å skrive kode som begynner på rad/rekke 0 og kode som begynner på siste rad.

##### d)

Skriv en metode som bruker en dobbel for-løkke med `return` til å finne ut om der finnes en ledig plass. Skriv om til å bruke en dobbel utvidet for-løkke med `return`

##### e)

Skriv kode som sjekker om der er minimum to ledige plasser mellom personer i auditoriet (smittevern)

### Oppgave B3 - Oversvømmelse

Høyde i et terreng kan representeres som en 2-dimensjonal tabell (eks. 3x10 felter)

```java
int[][] terreng = { { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
                    { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
                    { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 } };
```

Prosjektet U10FlerDimTabeller https://github.com/dat100hib/dat100public/tree/master/undervisning/U10FlerDimTabeller i oppbevaringsplassen med eksempler fra undervisning inneholder en pakke `eksempler`.

I pakken finnes en klasse [Flooding.java](https://github.com/dat100hib/dat100public/blob/master/undervisning/U10FlerDimTabeller/src/no/hvl/dat100/flooding/Flooding.java som inneholder starten på et program som kan visualisere konsekvens av en øking av hav-høyden. Hav-høyde leses inn via dialog-boks. Dette blev introdusert på forelesning.

![](assets/markdown-img-paste-20180926181141274.png)

Implementer ferdig metoden `visualiser()` slik at felter i området/tabellen `terreng` som kommer under havets overflate tegnes med en blå sirkel, felter som er mindre en 1 meter over havet tegnes med en oransje sirkel og de felter som er mer en 1 meter over havets overflate tegnes med en lysebrun sirkel. Sirkler tegnes ved å bruke easygraphics.

Det er kun hav-høyde som skal leses inn fra brukeren, terreng er bestemt av den to-dimensjonaletabellen som allerede finnes i programmet.

## Valgfrie oppgaver

### Oppgave V1 - Grafikk og løkker

Java-boken Kap. 3 oppgave 13

### Oppgave V2 - Grafikk og løkker

Java-boken Kap. 3 oppgave 14

### Oppgave V3 - Bondesjakk

Prosjektet F13FlerDimTabeller https://github.com/dat100hib/dat100public/tree/master/undervisning/U10FlerDimTabeller i oppbevaringsplassen med eksempler fra forelesninger inneholder en pakke `no.hvl.dat100.tictactoe` som implementerer det meste av koden for et bondesjakk spill. Dette ble demonstrert på forelesning.

![](assets/markdown-img-paste-20180926174926430.png)

For å avgjøre om en spiller har vunnet spillet trenger programmet følgende følgende tre metoder i klassen [GameController.java](https://github.com/dat100hib/dat100public/blob/master/undervisning/U10FlerDimTabeller/src/no/hvl/dat100/tictactoe/GameController.java)

```java
private boolean checkHorizontal(int y, char player)

private boolean checkVertical(int x, char player)

private boolean checkDiagonals(char player)
```

Metodene skal avgjøre om karakteren gitt ved `player` (enten `´X´`eller `´O´`) finnes på alle posisjoner i en horisontal linje (gitt ved `x`), en vertikal linje (gitt ved `y`) eller på en av de to diagonaler.

Disse metoder vil (automatisk) bli kaldt av resten av programmet hver gang en spiller har gjort et trekk. Dvs. dere trenger kun å se på disse tre metodene og ikke resten av programmet.

Den aktuelle tilstand av brettet finnes i den to-dimensjonale tabellen board definert som

```java
char[][] board = new char[TicTacToe.SIZE][TicTacToe.SIZE];
```

der `TicTacToe.SIZE` angir størrelsen på brettet (i figuren ovenfor er den 3).

##### a)

Implementer de tre metoder ovenfor og test spillet. Det går fint an å implementer metodene en om gangen og teste de ved å starte spillet etter hvert. Main-metoden for programmet finnes i klassen [TicTacToe.java](https://github.com/dat100hib/dat100public/blob/master/undervisning/U10FlerDimTabeller/src/no/hvl/dat100/tictactoe/TicTacToe.java).

##### b)

Prøv å endre på verdien av `SIZE` i klassen [TicTacToe.java](https://github.com/dat100hib/dat100public/blob/master/undervisning/U10FlerDimTabeller/src/no/hvl/dat100/tictactoe/TicTacToe.java). Virker spillet fortsatt korrekt?



