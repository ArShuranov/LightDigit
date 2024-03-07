package ru.arshuranov.service.impl;

import org.springframework.stereotype.Service;
import ru.arshuranov.model.Request;
import ru.arshuranov.service.RequestService;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {
    @Override
    public void addRequest(Request request) {

    }

    @Override
    public void updateRequest(long id, Request request) {

    }

    @Override
    public void deleteRequest(long id) {

    }

    @Override
    public Request getRequestById(long id) {
        return null;
    }

    @Override
    public List<Request> getAllRequestsFiltredByDate() {
        return null;
    }

    @Override
    public List<Request> getAllRequestsFiltredByConsumerName(String name) {
        return null;
    }
}
