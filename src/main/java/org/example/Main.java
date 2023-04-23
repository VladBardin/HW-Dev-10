package org.example;

import crud.Client;
import crud.ClientService;
import crud.Planet;
import crud.PlanetService;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        new DatabaseInitService().initDb();
        Client client = new Client();
        client.setName("Unknown");
        Planet planet=new Planet();
        planet.setId("MARS56");
        planet.setName("Vairus");
        new PlanetService().create(planet);
        new PlanetService().getById("SATURN258");
        new PlanetService().delete("SATURN258");
        System.out.println( new PlanetService().getAll().toString());
        new ClientService().create(client);
        new ClientService().delete(11);
        System.out.println(new ClientService().getById(12));
        System.out.println(new ClientService().getAll().toString());
    }
}