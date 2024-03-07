package ru.arshuranov.service;

import ru.arshuranov.model.Consumer;

import java.util.List;

public interface ConsumerService {

    void getAllConsumersInAlpha(List<Consumer> consumerList);

    void setRole(long consumerId);

}
