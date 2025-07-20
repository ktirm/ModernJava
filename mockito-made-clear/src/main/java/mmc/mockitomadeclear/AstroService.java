/**
 * Notes from the book:
 * The AstroService class uses the gateway to access the remote web service. The
 * gateway retrieves the remote data and turns it into either a Success instance
 * containing an AstroResponse or a Failure instance containing any thrown exception
 * if not. Assuming it’s successful, the service then extracts the data we want
 * and converts it to a map, where the keys are spacecraft names and the values
 * are the number of astronauts aboard each one.
 * Nifty M. Fowler link on Gateway Pattern: https://martinfowler.com/articles/gateway-pattern.html
 */
public class AstroService {
    public Map<String,Long> getAstroData();
}