package com.facecaller.server.controller;

// import org.springframework.messaging.handler.annotation.MessageMapping;
// import org.springframework.messaging.handler.annotation.Payload;
// import org.springframework.messaging.handler.annotation.SendTo;
// import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

// import com.facecaller.server.model.Message;

@Controller
public class ChatController {

    // private SimpMessagingTemplate simpMessagingTemplate;

    // @MessageMapping("/message")
    // @SendTo("/chatroom/public")
    // public Message receivePublicMessage(
    //     @Payload Message message
    // ) {
    //     return message;
    // }

    // @MessageMapping("/private-message")
    // public Message receivePrivateMessage(@Payload Message message) {
    //     simpMessagingTemplate.convertAndSendToUser(message.getReceiverName(), "/private", message);
    //     return message;
    // }
}
