Lokalisering af fejl:

1 iteration
Hypotese: medianWrong metoden er korrekt.
Eksperiment: Udfør metodekaldet medianWrong(2,1,3) med det forventede resultat 2.
Resultat: kaldet returnerer heltallet 1.
Hypotesen er forkert.

2 iteration
Hypotese: if-statement på linje 18 er korrekt.
Eksperiment: Udfør metodekaldet medianWrong(1,2,3) med det forventede resultat 2.
Resultat: kaldet returnerer heltallet 2.
Hypotese korrekt.

3 iteration
Hypotese: if-statement på linje 20 er korrekt.
Eksperiment: Udfør metodekaldet medianWrong(2,1,3) med det forventede resultat 2.
Resultat: kaldet returnerer heltallet 1.
Hypotese forkert.

4 iteration
Hypotese: if-statement på linje 24 er korrekt.
Eksperiment: Udfør metodekaldet medianWrong(3,2,1) med det forventede resultat 2.
Resultat: kaldet returnerer heltallet 2.
Hypotese korrekt.

5 iteration
Hypotese: if-statement på linje 26 er korrekt.
Eksperiment: Udfør metodekaldet medianWrong(2,3,1) med det forventede resultat 2.
Resultat: kaldet returnerer heltallet 2.
Hypotese korrekt.

Vi kan ud fra dette se at fejlen er lokeret på linje 20.
Vi kan nu se ved nærmere inspicering at se at if statementen burde blive evalueret til true
hvis:
z > x > y
Derfor burde x blive sat til medianen her.

___________________________________________________________________

Test af debugging teknikker.

Metode 1: Print sætninger

Indsættelse af print sætninger, kan hjælpe en med at lokalisere hvor fejlen er,
og kan hjælpe med at holde styr på variabler,
og se hvilke værdier/objekter som de indeholder i runtime.

Input: medianWrong(2,1,3)
Der indsættes en printsætning efter den if-sætning, som vi har fundet ud af,
at der er noget galt med. Efter kørsel af koden får vi, at den satte m til 1,
altså y værdien, selvom svaret er 2, altså x-værdien.
Den assigner altså m til y, selvom den skal assigne m til x.

Metode 2: Bluej's debugger

BlueJ's debugger giver en række muligheder for debugging,
hvis man får en syntaks fejl, så viser blueJ,
hvor fejlen er henne, men hvis det er en semantisk fejl,
så kan man bruge ting som breaks, til at se hvor fejlen
er opstået henne.

Input: medianWrong(2,1,3)
Der indsættes et breakpoint ved if-sætningen.
Vi ved, at m skal være lig 2, efter if-sætningen.
Kører vi koden, ser vi, at m bliver sat lig 3, og efter if-sætningen bliver m sat lig 1.
Den assignes til det y og ikke x.







