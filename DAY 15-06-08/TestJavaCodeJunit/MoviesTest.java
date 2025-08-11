package test.java;

import main.java.Movies;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MoviesTest {

    private Movies moviestest;

    @BeforeEach
    public void setUp() throws Exception {
        moviestest = new Movies();
        moviestest.connect();
        System.out.println("Connection established.");
    }

    @Test
    @DisplayName("Insert Movie Test - Awara")
    public void testInsertMovie() throws Exception {
        int result = moviestest.insertMovie("Awara", "LinguSwamy", "Action", 20010);
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Update Movie Title Test - Interstellar to Tenet")
    public void testUpdateMovieTitle() throws Exception {
        moviestest.insertMovie("Interstellar", "Christopher Nolan", "Sci-Fi", 2014);
        int result = moviestest.updateMovieTitle("Interstellar", "Christopher Nolan", "Tenet");
        System.out.println("Update result: " + result);
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Delete Movie Test - Parasite")
    public void testDeleteMovie() throws Exception {
        moviestest.insertMovie("Parasite", "Bong Joon-ho", "Thriller", 2019);
        int result = moviestest.deleteMovieByYear(2019);
        assertEquals(1, result);
    }

    @AfterEach
    public void closing() throws Exception {
        moviestest.close();
        System.out.println("Connection closed.");
    }
}