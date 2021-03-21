package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.HashSet;
import java.util.Set;

public class WeatherTestSuite {
    Weather weather = new Weather();
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location2 = Mockito.mock(Location.class);
    Location location1 = Mockito.mock(Location.class);
    Set<Client> clients = new HashSet<>();
    Set<Location> locations = new HashSet<>();

    @Test
    public void subscriberShouldReceiveNotificationFromSubscribedLocations() {
        for(Location location: locations) {
            weather.sendNotificationToClientInLocation(notification, location);
        }
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
    }

    @Test
    public void subscriberShouldBeAbleToCancelSubscriptionFromLocation() {
        weather.removeSubscriptionFromLocation(client1, location1);
        for(Location location: locations) {
            weather.sendNotificationToClientInLocation(notification, location);
        }
        Mockito.verify(client1, Mockito.times(0)).receive(notification);
    }

    @Test
    public void shouldRemoveAllSubscriptions() {
        weather.removeAllSubscriptions(client1);

        for(Location location: locations) {
            weather.sendNotificationToClientInLocation(notification, location);
        }
        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSendNotificationOnlyToSubscribedToLocation() {
        weather.addSubscriberToLocation(client1, location1);
        weather.addSubscriberToLocation(client2, location1);
        weather.addSubscriberToLocation(client3, location2);
        for(Location location: locations) {
            weather.sendNotificationToClientInLocation(notification, location);
        }
        for(Client client : this.clients){
            Mockito.verify(client1, Mockito.times(1)).receive(notification);
        }
    }

    @Test
    public void shouldSendNotificationToAllSubscribers() {
        weather.addSubscriberToLocation(client1, location1);
        weather.addSubscriberToLocation(client2, location1);
        weather.addSubscriberToLocation(client3, location2);
        weather.sendNotificationToAll(notification);
        for(Client client : this.clients){
            Mockito.verify(client, Mockito.times(1)).receive(notification);
        }
    }

    @Test
    public void shouldRemoveLocationsForAllSubscribers() {
        for (Client client : clients) {
            weather.addSubscriberToLocation(client,location1);
        }
        weather.removeLocation(location1);
        for(Client client : this.clients){
            Mockito.verify(client, Mockito.never()).receive(notification);
        }
    }

    @BeforeEach
    public void dataPreparation() {
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        locations.add(location1);
        locations.add(location1);
        for (Location location : locations) {
            weather.addSubscriberToLocation(client1,location);
        }
    }
}