package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Mallservice {
@Autowired
	private Mallrepository repository;

public List<Mall>listAll()
{
  return repository.findAll();
  
}
public Mall get(Integer id)
{
	return repository.findById(id).get();
}
public void save(Mall mall) {
	repository.save(mall);
}

public void delete(Integer id)
{
	repository.deleteById(id);
}
}
