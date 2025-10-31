package co.edu.uniquindio.projectfedericosantiagojhoan.model;

import java.util.List;

public interface IAuditable {

   void registrarNovedad(RegistroNovedad novedad) ;
   List<RegistroNovedad> obtenerNovedad () ;



}
