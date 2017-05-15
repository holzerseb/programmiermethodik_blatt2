_______
Blatt 2
_________
Aufgabe 1
a)
this referenziert immer auf die Instanz der Klasse, damit kann man also eindeutig festlegen,
dass auf den Member der Instanz zugegriffen werden soll.
Folglich wäre das Schlüsselwort this bei statischen Methoden (welche ohne Instanz aufrufbar sind) nicht zulässig.
In dem spezifischen Szenario in Aufgabe 1 a) würde das weglassen von this bewirken, dass wir nicht auf den Member, sondern auf den Parameter zugreifen.
Damit würden wir dem Parameter also sich selbst zuweisen - relativ sinnlos

Die Klasse 'Student' besitzt keinen expliziten Konstruktor, daher erzeugt der Compiler einen leeren Default-Konstruktor für die Klasse.
Dieser Aufruf ist daher korrekt.
'Course' hingegen besitzt einen expliziten Konstruktor, dessen Signatur mit dem Aufruf übereinstimmt - also ebenfalls ein gültiger Aufruf.
Die Klasse 'Room' allerdings besitzt einen expliziten Konstruktor mit 2 Parametern, somit ist ein Aufruf ohne Parameter ungültig.

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