package com.ibm.ph.edm.watson.assistant.controllers;

import com.ibm.ph.edm.watson.assistant.entities.MessageInput;
import com.ibm.ph.edm.watson.assistant.entities.MessageOptions;
import com.ibm.ph.edm.watson.assistant.entities.MessageResponse;
import com.ibm.ph.edm.watson.assistant.component.Assistant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/watson-assistant")
public class WatsonAssistantController {

    private static Logger LOG = LoggerFactory.getLogger(WatsonAssistantController.class);

    @Autowired
    Assistant assistant;

    @RequestMapping(value = "/", method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public String getSessionID(){
        return "hello";
    }

    @RequestMapping(value = "/talk", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<String> talk(@RequestBody String message){
        LOG.info("Method ping() in class {} was called to checked if logged in.", this.getClass().getName());

        MessageInput messageInput = new com.ibm.ph.edm.watson.assistant.entities.MessageInput();
        messageInput.setText(message);
        MessageOptions options = new MessageOptions.Builder("cc8b19f5-7f6a-41cf-9a9a-a3b9b7b8e025").input(messageInput).build();

        MessageResponse response = assistant.message(options).execute().getResult();
        LOG.info("Response is {}", response);

        return response.getOutput().getText();
    }
}
