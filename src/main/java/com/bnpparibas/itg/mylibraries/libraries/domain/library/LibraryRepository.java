package com.bnpparibas.itg.mylibraries.libraries.domain.library;

import com.bnpparibas.itg.mylibraries.libraries.domain.ddd.DDD;

import java.util.List;

@DDD.Repository
public interface LibraryRepository {
    String save(Library library);
    Library get(String id);
    List<Library> findAll();
    void delete(String id);

    List<Library> findByType(Type type);
    List<Library> findByDirectorSurname(String surname);
    List<Library> searchByDirectorNameQuery(String surname);
    List<Library> searchByDirectorNameNativeQuery(String surname);
}
