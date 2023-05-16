package com.example.tunejarapi.controllers

import com.example.tunejarapi.domain.Song
import com.example.tunejarapi.repositories.TuneJarRepository
import org.springframework.web.bind.annotation.*


@RestController
class TunejarController(private val tunejarRepository: TuneJarRepository) {
    @GetMapping("/api/songs")
    @ResponseBody
    fun allSongs(): List<Song?>? {
        return tunejarRepository.findAll()

    }
    @PostMapping("/songs")
    fun addSong(@RequestBody song: Song): Song? {
        return tunejarRepository.save(song)
    }
}