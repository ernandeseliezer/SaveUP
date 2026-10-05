package com.example.saveUP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.saveUP.entities.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {

}
