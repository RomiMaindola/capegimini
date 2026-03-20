package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.PlayListRequest;
import com.music.streaming.platform.dto.TrackRequest;
import com.music.streaming.platform.model.PlayList;
import com.music.streaming.platform.model.Track;
import com.music.streaming.platform.service.PlayListService;

import com.music.streaming.platform.service.TrackService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music/platform/v1/playlists")
public class PlayListController {

    private final PlayListService playListService;

    public PlayListController(PlayListService playListService) {
        this.playListService = playListService;
    }


    @PostMapping
    public ResponseEntity<PlayList> createPlayList(@RequestBody PlayListRequest request) {
        return ResponseEntity.ok(playListService.createPlayList(request));
    }


    @GetMapping("/{playlistId}")
    public ResponseEntity<PlayList> getPlayListById(@PathVariable Long playlistId) {
        return ResponseEntity.ok(playListService.getPlayListById(playlistId));
    }


    @DeleteMapping("/{playlistId}")
    public ResponseEntity<PlayList> deletePlayList(@PathVariable Long playlistId) {
        playListService.deletePlayList(playlistId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}

