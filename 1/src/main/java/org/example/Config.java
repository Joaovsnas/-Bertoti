package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    // Criando um objeto de propriedades para carregar o arquivo de configuração
    private static final Properties properties = new Properties();

    static {
        // Este bloco static é executado quando a classe é carregada, carregando o arquivo properties
        try (InputStream input = Config.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                System.out.println("Desculpe, não foi possível encontrar application.properties");
            }
            // Carrega as propriedades do arquivo
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Método para obter o token do bot do Telegram
    public static String getTelegramBotToken() {
        return properties.getProperty("telegram.bot.token");
    }

    // Método para obter a chave da API da OpenAI
    public static String getOpenAIKey() {
        return properties.getProperty("openai.api.key");
    }
}
