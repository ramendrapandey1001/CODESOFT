import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Currency;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.println("Enter base currency:");
         * String baseCurrency = scanner.nextLine();
         * 
         * System.out.println("Enter target currency:");
         * String targetCurrency = scanner.nextLine();
         * 
         * System.out.println("Enter amount:");
         * double amount = scanner.nextDouble();
         * 
         * double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);
         * double convertedAmount = amount * exchangeRate;
         * 
         * System.out.println("Converted amount in " + targetCurrency + ": " +
         * convertedAmount);
         */

    }

    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        try {
            URI uri = new URI("https", "v6.exchangerate-api.com", "/v6/YOUR-API-KEY/latest/USD");
            HttpURLConnection connection = (HttpURLConnection) uri.toURL().openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println(response.toString());
                // TODO: Parse the response to get the exchange rate
                // This depends on the structure of your API response
                double exchangeRate = 0.0;

                return exchangeRate;
            } else {
                System.out.println("GET request not worked");
            }
        } catch (URISyntaxException | IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        return 0.0;
    }

}
