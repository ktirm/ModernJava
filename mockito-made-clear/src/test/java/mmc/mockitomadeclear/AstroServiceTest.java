public class AstroServiceTest {
    @Test
    void testAstroData_usingRealGateway_withHttpClient() {
    // Create an instance of AstroService using the real Gateway
        service = new AstroService(new AstroGateway());
    // Call the method under test
        Map<String, Long> astroData = service.getAstroData();
    // Print the results and check that they are reasonable
        astroData.forEach((craft, number) -> {
            System.out.println(number + " astronauts aboard " + craft);
            assertAll(
                    () -> assertThat(number).isPositive(),
                    () -> assertThat(craft).isNotBlank()
            );
        });
    }
}
