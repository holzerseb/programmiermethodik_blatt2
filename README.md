_______
Blatt 2
_________
Aufgabe 1
a)
this referenziert immer auf die Instanz der Klasse, damit kann man also eindeutig festlegen,
dass auf den Member der Instanz zugegriffen werden soll.
Folglich w�re das Schl�sselwort this bei statischen Methoden (welche ohne Instanz aufrufbar sind) nicht zul�ssig.
In dem spezifischen Szenario in Aufgabe 1 a) w�rde das weglassen von this bewirken, dass wir nicht auf den Member, sondern auf den Parameter zugreifen.
Damit w�rden wir dem Parameter also sich selbst zuweisen - relativ sinnlos

Die Klasse 'Student' besitzt keinen expliziten Konstruktor, daher erzeugt der Compiler einen leeren Default-Konstruktor f�r die Klasse.
Dieser Aufruf ist daher korrekt.
'Course' hingegen besitzt einen expliziten Konstruktor, dessen Signatur mit dem Aufruf �bereinstimmt - also ebenfalls ein g�ltiger Aufruf.
Die Klasse 'Room' allerdings besitzt einen expliziten Konstruktor mit 2 Parametern, somit ist ein Aufruf ohne Parameter ung�ltig.

b)
c)
siehe Professor.java

_______
Blatt 2
_________
Aufgabe 2
a)
b)
c)
d)
siehe *.java