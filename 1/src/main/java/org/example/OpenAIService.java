package org.example;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class OpenAIService {

    private static final String OPENAI_API_URL = "https://api.openai.com/v1/completions";
    private final String apiKey;

    public OpenAIService(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getResponseFromOpenAI(String prompt) {
        try {
            // Criação de um HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Montagem do corpo da requisição em formato JSON
            String jsonBody = "{"
                    + "\"model\": \"text-davinci-003\","
                    + "\"prompt\": \"" + prompt + "\","
                    + "\"max_tokens\": 100"
                    + "}";

            // Criação da requisição HTTP POST
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(OPENAI_API_URL))
                    .header("Authorization", "Bearer " + apiKey)
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                    .build();

            // Envio da requisição e captura da resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parsing da resposta JSON
            if (response.statusCode() == 200) {
                Gson gson = new Gson();
                OpenAIResponse openAIResponse = gson.fromJson(response.body(), OpenAIResponse.class);
                return openAIResponse.choices[0].text.trim();
            } else {
                return "Erro ao acessar a API da OpenAI: " + response.statusCode();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Ocorreu um erro ao processar a resposta.";
        }
    }

    // Classe interna para mapear a resposta JSON da OpenAI
    static class OpenAIResponse {
        Choice[] choices;

        static class Choice {
            String text;
        }
    }
}
