// package com.apirest.webflux;

// import java.util.UUID;

// import com.apirest.webflux.documents.Playlist;
// import com.apirest.webflux.repositories.PlaylistRepository;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// import lombok.AllArgsConstructor;
// import reactor.core.publisher.Flux;

// @AllArgsConstructor
// @Component
// public class DummyData implements CommandLineRunner{

//     private final PlaylistRepository playlistRespository;

//     @Override
//     public void run(String... args) throws Exception {
//         // TODO Auto-generated method stub

//         playlistRespository.deleteAll()
//             .thenMany(
//                 Flux.just(
//                     "API REST Spring Boot",
//                     "Deploy de uma aplicação Java no IBM Cloud",
//                     "Java 8",
//                     "Github",
//                     "Spring Security",
//                     "Web Service RESTFUL",
//                     "Bean no Spring Boot")
//                 .map(name -> new Playlist(UUID.randomUUID().toString(), name))
//                 .flatMap(playlistRespository::save))
//             .subscribe(System.out::println);
//     }
// }