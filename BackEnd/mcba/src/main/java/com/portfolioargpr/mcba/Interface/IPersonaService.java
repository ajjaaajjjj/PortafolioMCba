package com.portfolioargpr.mcba.Interface;

import com.portfolioargpr.mcba.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer personas (lista)
    public List<Persona> getPersona();
    
    //guardar objeto tipo persona
    public void savePersona(Persona persona);
    
    //eliminar objeto(usuario) por id
    public void deletePersona(Long id);
    
    //buscar persona por id
    public Persona findPersona(Long id);
}
