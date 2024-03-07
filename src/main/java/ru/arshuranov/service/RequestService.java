package ru.arshuranov.service;

import ru.arshuranov.model.Request;

import java.util.List;

public interface RequestService {

    void addRequest(Request request);

    void updateRequest(long requestId, Request request); //здесь я полагаю при выборе Enum меняется статус, то есть отдельно отправку не надо делать

    void deleteRequest(long requestId);

    Request getRequestById(long requestId);

    List<Request> getAllRequestsFiltredByDate();

    List<Request> getAllRequestsFiltredByConsumerName(String name);





}
