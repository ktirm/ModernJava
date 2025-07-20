/**
 * Notes from the book:
 * The concrete class implementing the Gateway interface will be AstroGateway. You’ll
 * implement it using either the HttpClient API.
 */
public interface Gateway<T> {
    T getResponse();
}