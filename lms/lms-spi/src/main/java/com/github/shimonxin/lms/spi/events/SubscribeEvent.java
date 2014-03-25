package com.github.shimonxin.lms.spi.events;

import com.github.shimonxin.lms.spi.subscriptions.Subscription;


/**
 *
 * @author andrea
 */
public class SubscribeEvent extends MessagingEvent {

    Subscription m_subscription;

    int m_messageID;
    
    public SubscribeEvent(Subscription subscription, int messageID) {
        m_subscription = subscription;
        m_messageID = messageID;
    }

    public Subscription getSubscription() {
        return m_subscription;
    }

    public int getMessageID() {
        return m_messageID;
    }
}
