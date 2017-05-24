package com.theironyard.charlotte;

import javax.persistence.*;

/**
 * Created by BUBBABAIRD on 5/9/17.
 */
@Entity
@Table(name = "messages")
public class Message {
    // specifies ID is the primary key of the database
    // and will be dynamically generated
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String platform;

    @Column(nullable = false)
    String messageText;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Message() {
    }

    public Message(String name, String platform, String messageText) {
        this.name = name;
        this.platform = platform;
        this.messageText = messageText;
    }
}



