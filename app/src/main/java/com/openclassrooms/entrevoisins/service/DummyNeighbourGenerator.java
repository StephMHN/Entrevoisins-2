package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DummyNeighbourGenerator {

    public static List<Neighbour> DUMMY_NEIGHBOURS = Arrays.asList(
            new Neighbour(1, "Caroline", "http://i.pravatar.cc/150?u=a042581f4e29026704d", "Saint Pierre du mont à 5km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true),
            new Neighbour(2, "Jack", "http://i.pravatar.cc/150?u=a042581f4e29026704e","Saint Pierre du mont à 6km", "+33 6 86 57 90 15", "www.facebook.fr/jack", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true),
            new Neighbour(3, "Chloé", "http://i.pravatar.cc/150?u=a042581f4e29026704f","Saint Pierre du mont à 7km", "+33 6 86 57 42 21", "www.facebook.fr/chloé", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true),
            new Neighbour(4, "Vincent", "http://i.pravatar.cc/150?u=a042581f4e29026704a","Saint Pierre du mont à 8km", "+33 6 86 64 77 29", "www.facebook.fr/vincent", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true),
            new Neighbour(5, "Elodie", "http://i.pravatar.cc/150?u=a042581f4e29026704b", "Saint Pierre du mont à 9km", "+33 6 44 21 33 57", "www.facebook.fr/elodie", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true),
            new Neighbour(6, "Sylvain", "http://i.pravatar.cc/150?u=a042581f4e29026704c", "Saint Pierre du mont à 10km", "+33 6 67 54 95 11", "www.facebook.fr/sylvain", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true),
            new Neighbour(7, "Laetitia", "http://i.pravatar.cc/150?u=a042581f4e29026703d", "Saint Pierre du mont à 11km", "+33 6 46 52 30 24", "www.facebook.fr/laetitia", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true),
            new Neighbour(8, "Dan", "http://i.pravatar.cc/150?u=a042581f4e29026703b", "Saint Pierre du mont à 12km", "+33 6 86 52 92 11", "www.facebook.fr/dan", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true),
            new Neighbour(9, "Joseph", "http://i.pravatar.cc/150?u=a042581f4e29026704d", "Saint Pierre du mont à 13km", "+33 6 46 53 92 10", "www.facebook.fr/joseph", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true),
            new Neighbour(10, "Emma", "http://i.pravatar.cc/150?u=a042581f4e29026706d", "Saint Pierre du mont à 14km", "+33 6 86 17 94 18", "www.facebook.fr/emma", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true),
            new Neighbour(11, "Patrick", "http://i.pravatar.cc/150?u=a042581f4e29026702d", "Saint Pierre du mont à 15km", "+33 6 84 54 91 12", "www.facebook.fr/patrick", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true),
            new Neighbour(12, "Ludovic", "http://i.pravatar.cc/150?u=a042581f3e39026702d","Saint Pierre du mont à 16km", "+33 6 89 54 10 13", "www.facebook.fr/ludovic", "Bonjour!Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes suceptibles de m'accompagner !J'aime les jeux de cartes tel la belote et le tarot", true)
    );

    static List<Neighbour> generateNeighbours() {
        return new ArrayList<>(DUMMY_NEIGHBOURS);
    }

    public static List<Neighbour> DUMMY_NEIGHBOURS_RANDOM = Arrays.asList(
            new Neighbour(13, "François", "http://i.pravatar.cc/150?u=a042581f4e29026704d"),
            new Neighbour(14, "Marco", "http://i.pravatar.cc/150?u=a042581f4e29026706d"),
            new Neighbour(15, "Simon", "http://i.pravatar.cc/150?u=a042581f4e29026702d"),
            new Neighbour(16, "Stéphane", "http://i.pravatar.cc/150?u=a042581f3e39026702d")
    );
}
