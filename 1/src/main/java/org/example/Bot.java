package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage; // Importando a classe SendMessage
import org.telegram.telegrambots.meta.exceptions.TelegramApiException; // Certificando-se de que a exceção está sendo importada

public class Bot extends TelegramLongPollingBot {

    private static final String BOT_TOKEN = "7649691237:AAE2IOIRF6zPcFMLgJ3T7kCpXo4pv-_-kbc";  // Substitua com o token real do seu bot
    private static final String BOT_USERNAME = "Ollamagw_bot"; // Substitua com o nome de usuário do seu bot

    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        // Verifica se a atualização tem uma mensagem e se ela contém texto
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            System.out.println("Mensagem recebida: " + messageText);

            // Criando a resposta usando SendMessage
            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText("Você disse: " + messageText);

            // Colocando o try-catch ao redor do código que pode lançar a exceção
            try {
                execute(message);  // Envia a mensagem de volta ao usuário
            } catch (TelegramApiException e) {
                e.printStackTrace(); // Trata a exceção se ocorrer
            }
        }
    }

    public static void main(String[] args) {
        // Aqui você pode inicializar o bot ou realizar testes
        System.out.println("Bot está rodando...");
        try {
            // Criar a instância do bot e fazer algum teste (se necessário)
            Bot bot = new Bot();
            bot.onUpdateReceived(new Update());  // Simula uma atualização para o bot (apenas exemplo)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
