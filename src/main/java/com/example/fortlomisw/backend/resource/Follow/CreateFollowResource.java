package com.example.fortlomisw.backend.resource.Follow;


import com.example.fortlomisw.backend.resource.Artist.ArtistResource;
import com.example.fortlomisw.backend.resource.Fanatic.FanaticResource;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateFollowResource {

    private ArtistResource artist;
    private FanaticResource fanatic;
}
