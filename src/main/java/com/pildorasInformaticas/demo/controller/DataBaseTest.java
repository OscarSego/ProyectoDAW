package com.pildorasInformaticas.demo.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseTest implements CommandLineRunner{
	
    @Autowired
    private DataSource dataSource;
	
    @Override
    public void run(String... args) throws Exception {
        testDatabaseConnection();
    }
    
    private void testDatabaseConnection() {
        try (Connection connection = dataSource.getConnection()) {
            // Verificar si la conexión es exitosa
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");

                // Realizar una consulta de prueba
                try (Statement statement = connection.createStatement()) {
                    statement.execute("SELECT 1");
                    System.out.println("Consulta de prueba ejecutada con éxito.");
                } catch (SQLException e) {
                    System.err.println("Error al ejecutar la consulta de prueba: " + e.getMessage());
                }
            } else {
                System.err.println("No se pudo establecer la conexión a la base de datos.");
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

}