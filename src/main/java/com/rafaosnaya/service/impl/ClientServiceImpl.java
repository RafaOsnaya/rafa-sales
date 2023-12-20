package com.rafaosnaya.service.impl;

import com.rafaosnaya.model.Client;
import com.rafaosnaya.repo.IClientRepo;
import com.rafaosnaya.repo.IGenericRepo;
import com.rafaosnaya.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl extends CRUDImpl<Client, Integer> implements IClientService {

    @Autowired
    private IClientRepo repo;

    @Override
    IGenericRepo<Client, Integer> getRepo() {
        return repo;
    }

/*    @Override
    public Client save(Client category) throws Exception {
        return repo.save(category);
    }

    @Override
    public Client update(Client category) throws Exception {
        return repo.save(category);
    }

    @Override
    public List<Client> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Client readById(Integer id) throws Exception {
        //return repo.findById(id).get();
        //Optional<Client> op = repo.findById(id);
        //return op.isPresent() ? op.get() : new Client();
        return repo.findById(id).orElse(new Client());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }*/
}
