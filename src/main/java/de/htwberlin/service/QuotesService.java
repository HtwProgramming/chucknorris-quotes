package de.htwberlin.service;

import java.util.List;

public interface QuotesService {

  /**
   * The method returns a selected Chuck Norris quote from the QUOTES list.
   * @param index - Determines which quote to choose from the list.
   * @throws IllegalArgumentException - Throws IllegalArgumentException if index is out of range.
   * @return The chosen Chuck Norris quote.
   */
  String getQuote(int index);

  List<String> QUOTES = List.of(
    "Chuck Norris dreht nicht die Dusche auf. Er starrt sie an, bis sie zu weinen anfängt.",
    "Chuck Norris trägt keine Uhr. Er entscheidet wie spät es ist!",
    "Sido hat mal gefragt, wer eigentlich dieser Chuck Norris ist. Seitdem trägt Sido eine Maske.",
    "Chuck Norris geht ohne Angel fischen. Er stellt sich ans Ufer und sagt: 'Du, du und der Dicke da hinten – raus!'",
    "Chuck Norris braucht zum Autofahren kein Benzin. Sein Auto fährt aus Angst vor ihm.",
    "Chuck Norris bekommt bei Burger King einen Big Mac.",
    "Chuck Norris wirft keinen Schatten – die Wand will nur so aussehen wie er.",
    "Chuck Norris bekommt bei Praktiker 20% auf alles – auch auf Tiernahrung.",
    "Wenn Chuck Norris schwimmen geht, wird er nicht nass – das Wasser wird Chuck Norris.",
    "Wissenschaftler sind sich sicher: Der Urknall war nur die Folge eines Roundhousekicks von Chuck Norris.",
    "Monster gucken unterm Bett nach, ob sich Chuck Norris darunter befindet.",
    "Was Chuck Norris nicht umbringt, macht ihn stärker. Was ihn umbringt, macht ihn noch stärker.",
    "Chuck Norris hat bis Unendlich gezählt – zwei mal.",
    "Chuck Norris bewegt sich niemals, das sieht nur so aus: In Wirklichkeit dreht sich die Erde, so wie er es will.",
    "Chuck Norris starb schon vor 20 Jahren – der Tod traut sich nur nicht, ihm das zu sagen.",
    "Als Chuck Norris an einem Sonntag langweilig war, hat er sich die Zeit vertrieben – und baute die Pyramiden.",
    "In seinen jungen Jahren zündete Chuck Norris einmal seinen Furz an – so entstand die Sonne.",
    "Vor langer Zeit flog ein riesiger Asteroid auf die Erde zu und drohte, sie zu zerstören. Doch als er merkte, dass Chuck Norris auf dem Planeten lebt, schwenkte er in die Umlaufbahn ein – und wurde zum Mond.",
    "Das Universum breitet sich immer weiter aus – weil es versucht, Chuck Norris aus dem Weg zu gehen.",
    "Chuck Norris fängt sich schon mal Viren ein, doch er wird niemals krank: Er lässt sie nur bei sich wohnen.",
    "Unter Seeräubern geht die Geschichte um, dass ein Pirat Chuck Norris besiegt hätte. Das ist natürlich nicht wahr: Chuck Norris hat diese Idee in die Welt gesetzt, um noch mehr Piraten anzulocken.",
    "Chuck Norris zieht niemals um – sein neuer Wohnort zieht immer zu ihm.",
    "Regen entsteht, wenn Chuck Norris in den Himmel schaut: Die Wolken fangen vor Nervosität an zu schwitzen.",
    "Wenn Chuck Norris Liegestützen macht, drückt er sich nicht vom Boden ab – er drückt die Erde nach unten.",
    "Chuck Norris trinkt gerne auf Ex – am liebsten aus dem Wasserhahn.",
    "Das Apple-Logo war ursprünglich ein ganzer Apfel – bis Chuck Norris in der Firmenzentrale zu Besuch kam.",
    "In einem Kino wurde der Chuck-Norris-Klassiker „Missing in Action\" vor Kurzem in 3D gezeigt – im Saal gab es keine Überlebenden.",
    "Chuck Norris zählt keine Schafe, wenn er einschlafen will – er bringt die Schafe dazu, ihn zu zählen.",
    "Das Tote Meer hieß ursprünglich Lebenssee – bis Chuck Norris darin baden ging.",
    "Als Alexander Bell das Telefon erfand, war er überrascht: Er hatte drei entgangene Anrufe von Chuck Norris.",
    "Taucherkäfige zum Tauchen mit Haien wurden erfunden, damit sich die Haie sicherer fühlen, wenn Chuck Norris im Meer schwimmt.",
    "Chuck Norris braucht keinen Regenschirm – die Regentropfen trauen sich nicht, auf ihm zu landen.",
    "Die Tränen von Chuck Norris können alle Krankheiten heilen – doch er weint niemals. (Der gläubige Christ Chuck Norris kommentierte diesen Witz übrigens einmal so: \"Es gab einen Mann, dessen Tränen Krebs und jede andere Krankheit heilen konnten, auch den Grund für alle Krankheiten – die Sünde. Sein Blut tat es. Sein Name war Jesus, nicht Chuck Norris.\")",
    "Chuck Norris muss nie putzen – er sagt dem Schmutz, dass er sein Haus verlassen soll.",
    "Chuck Norris würzt sein Steak mit Pfefferspray.",
    "Chuck Norris verwählt sich niemals – du gehst dort ans Telefon, wo er anruft.",
    "Chuck Norris hat einem frechen Pferd einmal einen Roundhousekick unters Kinn verpasst – so entstanden die Giraffen.",
    "Chuck Norris glaubt nicht an die Evolutionstheorie und das ist nachvollziehbar: Er entscheidet, welche Art leben darf und welche nicht.",
    "Es gibt außerirdisches Leben in unserem Sonnensystem – die Aliens trauen sich nur nicht, Kontakt aufzunehmen, weil Chuck Norris auf der Erde lebt.",
    "Chuck Norris braucht keine Grippe-Impfung. Grippe braucht eine Chuck-Norris-Impfung.",
    "Viele Menschen haben Chuck Norris fliegen sehen, doch wirklich fliegen kann er eigentlich nicht. Die Luft trägt ihn nur aus Respekt.",
    "Chuck Norris isst keinen Honig, er kaut Bienen.",
    "Chuck Norris hat früher als Holzfäller in Nordafrika gearbeitet – so entstand die Sahara-Wüste.",
    "Chuck Norris ist absolut kugelsicher, doch es gibt keine Kugel, die Chuck-Norris-sicher ist.",
    "Superman trägt einen Chuck-Norris-Schlafanzug.",
    "Wenn der Tod seine Frau erschrecken will, verkleidet er sich als Chuck Norris.",
    "Die globale Erderwärmung ist ein Missverständnis: Die Temperaturen steigen zwar, aber nur weil Chuck Norris die Sonne höher gedreht hat.",
    "Chuck Norris geht nicht jagen – er geht töten.",
    "Chuck Norris trägt Cowboy-Stiefel aus Cowboys.",
    "Chuck Norris entführt Aliens.",
    "Chuck Norris sucht nicht die Nadel im Heuhaufen – er sucht den Strohhalm im Nadelhaufen.",
    "Chuck Norris wollte in der Schule kein Latein lernen – seitdem gilt die Sprache als tote Sprache.",
    "Chuck Norris Spiegelbild traut sich nicht, ihm in die Augen zu sehen.",
    "Chuck Norris kann Feuer machen, indem er Eisbrocken gegeneinander schlägt.",
    "Chuck Norris‘ Handy vibriert nicht – es zittert vor Angst.",
    "Wenn Sternschnuppen Chuck Norris sehen, wünschen sie sich was.",
    "Chuck Norris hat noch keinen Oscar gewonnen, weil er nicht schauspielert – er wird nur gefilmt und dabei untertreibt er auch noch.",
    "Chuck Norris hört die Telefonate der NSA mit.",
    "Chuck Norris lag einmal in seinem Leben falsch: Als er dachte, er hätte sich geirrt.",
    "Wenn Chuck Norris in eine Verkehrskontrolle gerät, schickt er die Polizisten mit einer mündlichen Verwarnung weiter.",
    "Als ein Fan Chuck Norris auf seiner Facebook-Seite anstupste, stupste er zurück – der Fan landete auf der Intensivstation.",
    "Wenn Chuck Norris sein Konto überzieht, bekommt er Zinsen von der Bank – es seien schließlich Überziehungszinsen, sagt er.",
    "Chuck Norris berührt keine Hochspannungsleitungen, weil sie nur bis 1000 kV ausgelegt sind.",
    "Nach dem Bart schneiden, muss die Polizei Chuck Norris Barthaare entsorgen – sie fallen unter das Waffengesetz.",
    "Es gibt einen Stoff, der härter ist als Diamant – die Barthaare von Chuck Norris.",
    "Chuck Norris schneidet sich nicht die Haare: Er schärft die Schere an seinen Haaren.",
    "Chuck Norris bringt das Sandmännchen ins Bett.",
    "Chuck Norris bringt dem Weihnachtsmann Geschenke.",
    "Chuck Norris trinkt Espresso zum Einschlafen.",
    "Wenn Chuck Norris sein Marmeladenbrot vom Tisch fällt, fällt es nicht auf die Marmeladenseite, es fällt wieder zurück auf seinen Teller.",
    "Chuck Norris Schnuller waren Kakteen.",
    "Unter seinem Brusthaar hat Chuck Norris ein Muttermal, in Form des Datums, an dem die Welt untergeht. Er würde ja nachschauen, doch es gibt keine Klinge, die hart genug ist, um seinen Brustpelz zu schneiden.",
    "Die Sowjetunion hat sich aufgelöst, weil Chuck Norris das so wollte.",
    "Chuck Norris hat mehr Kreditkarten als Max Mustermann.",
    "Hätte Chuck Norris im Film \"300\" einen Spartaner gespielt, dann würde der Filmtitel \"1\" lauten.",
    "Chuck Norris lacht über alle Chuck-Norris-Witze, weil sie so unglaublich untertreiben.",
    "Als Chuck Norris einmal in Australien war, hat ihn eine Inlandtaipan – die giftigste Schlange der Welt – gebissen. Zwölf mit unglaublichen Schmerzen angefüllte Stunden später war die Schlange tot.",
    "Chuck Norris ist der klügste Mann der Welt, obwohl er noch nie ein Buch gelesen hat – sobald er eines aus dem Regal nimmt, sagt es ihm freiwillig, was drin steht.",
    "Chuck Norris schläft ausschließlich bei Licht. Nicht weil er Angst vor der Dunkelheit hat, sondern weil die Dunkelheit Angst vor ihm hat."
  );
}

